package com.voluespark.energycoordination.partnerapi.api;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.voluespark.energycoordination.partnerapi.api.NotifyApiControllerTest.SigningKeyTestConfig;
import com.voluespark.energycoordination.partnerapi.filters.BodySignatureFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Base64;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
@ContextConfiguration(classes = SigningKeyTestConfig.class)
public class NotifyApiControllerTest {

  private static final Path TEST_DIR = Path.of("../../_tests/webhook-test-data");

  @TestConfiguration
  public static class SigningKeyTestConfig {

    public SigningKeyTestConfig(ConfigurableEnvironment env) throws IOException {
      var signingKey = Files.readString(TEST_DIR.resolve("signing-key.txt"));
      env.getSystemProperties().put(BodySignatureFilter.SIGNING_KEY_CONFIG_KEY, signingKey);
    }
  }

  @Autowired
  private MockMvc mockMvc;

  @ParameterizedTest
  @MethodSource("jsonPayloadProvider")
  public void testNotifyPostSuccess(String jsonPayload, String signature) throws Exception {
    mockMvc.perform(MockMvcRequestBuilders.post("/notify")
            .header("x-payload-signature", signature)
            .content(jsonPayload)
            .contentType(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());
  }

  @ParameterizedTest
  @MethodSource("jsonPayloadProvider")
  public void testNotifyPostBadRequest(String jsonPayload, String ignoredSignature)
      throws Exception {
    mockMvc.perform(MockMvcRequestBuilders.post("/notify")
            .header("x-payload-signature", Base64.getEncoder().encodeToString("bad".getBytes()))
            .content(jsonPayload)
            .contentType(MediaType.APPLICATION_JSON))
        .andExpect(status().isBadRequest());
  }

  private static Stream<Arguments> jsonPayloadProvider() throws IOException {
    try (Stream<Path> pathStream = Files.list(TEST_DIR)) {
      var jsonFiles = pathStream.filter(p -> p.getFileName().toString().endsWith("json")).toList();
      var arguments = new ArrayList<Arguments>();
      for (Path path : jsonFiles) {
        var jsonPayload = new String(Files.readAllBytes(path));
        var signatureBytes = Files.readAllBytes(Path.of(path.toAbsolutePath() + ".hmacsha256b64"));
        var signature = new String(signatureBytes).stripTrailing();
        arguments.add(Arguments.of(jsonPayload, signature));
      }
      return arguments.stream();
    }
  }
}
