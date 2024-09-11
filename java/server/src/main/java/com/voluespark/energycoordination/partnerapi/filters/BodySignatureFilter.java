package com.voluespark.energycoordination.partnerapi.filters;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ReadListener;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.util.ContentCachingRequestWrapper;

@Component
public class BodySignatureFilter implements Filter {

  public static final String REQUEST_ATTRIBUTE_KEY = "HmacSha256Signature";
  public static final String SIGNING_KEY_CONFIG_KEY = "SIGNING_KEY";

  private static final Logger LOGGER = LoggerFactory.getLogger(BodySignatureFilter.class);

  private final Mac mac;

  public BodySignatureFilter(@Value("${" + SIGNING_KEY_CONFIG_KEY + "}") String signingKey) {
    String algorithm = "HmacSHA256";
    var secretKeySpec = new SecretKeySpec(signingKey.getBytes(StandardCharsets.UTF_8), algorithm);
    Mac mac;
    try {
      mac = Mac.getInstance(algorithm);
      mac.init(secretKeySpec);
    } catch (NoSuchAlgorithmException | InvalidKeyException e) {
      LOGGER.warn("Unable to initialize HMAC SHA256 algorithm", e);
      mac = null;
    }
    this.mac = mac;
  }

  @Override
  public void doFilter(
      ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {
    ServletRequest requestWrapper = new ContentCachingRequest((HttpServletRequest) request);
    if (mac != null) {
      byte[] bodyBytes = requestWrapper.getInputStream().readAllBytes();
      String signature = Base64.getEncoder().encodeToString(mac.doFinal(bodyBytes));
      request.setAttribute(REQUEST_ATTRIBUTE_KEY, signature);
    }
    chain.doFilter(requestWrapper, response);
  }

  // Spring really doesn't make this easy :(
  // https://stackoverflow.com/questions/10210645/http-servlet-request-lose-params-from-post-body-after-read-it-once
  public static class ContentCachingRequest extends ContentCachingRequestWrapper {

    private ByteArrayOutputStream cachedBytes;

    public ContentCachingRequest(HttpServletRequest request) {
      super(request);
    }

    @Override
    public ServletInputStream getInputStream() throws IOException {
      if (cachedBytes == null) {
        cachedBytes = new ByteArrayOutputStream();
        super.getInputStream().transferTo(cachedBytes);
      }
      return new CachedServletInputStream(cachedBytes.toByteArray());
    }

    private static class CachedServletInputStream extends ServletInputStream {

      private final ByteArrayInputStream buffer;

      public CachedServletInputStream(byte[] contents) {
        this.buffer = new ByteArrayInputStream(contents);
      }

      @Override
      public int read() {
        return buffer.read();
      }

      @Override
      public boolean isFinished() {
        return buffer.available() == 0;
      }

      @Override
      public boolean isReady() {
        return true;
      }

      @Override
      public void setReadListener(ReadListener listener) {
        throw new UnsupportedOperationException("Not implemented");
      }
    }
  }
}
