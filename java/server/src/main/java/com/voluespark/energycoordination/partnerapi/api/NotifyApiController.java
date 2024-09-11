package com.voluespark.energycoordination.partnerapi.api;

import com.voluespark.energycoordination.partnerapi.filters.BodySignatureFilter;
import com.voluespark.energycoordination.partnerapi.model.EventNotification;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.RequestAttributes;

@Controller
@RequestMapping("${openapi.partnerWebhook.base-path:}")
public class NotifyApiController implements NotifyApi {

  private static final Logger LOGGER = LoggerFactory.getLogger(NotifyApiController.class);

  @Autowired
  private NativeWebRequest request;

  @Override
  public Optional<NativeWebRequest> getRequest() {
    return Optional.ofNullable(request);
  }

  @Override
  public ResponseEntity<Void> notifyPost(
      String xPayloadSignature, EventNotification eventNotification) {
    String computedHash = (String) request
        .getAttribute(BodySignatureFilter.REQUEST_ATTRIBUTE_KEY, RequestAttributes.SCOPE_REQUEST);

    if (computedHash == null) {
      LOGGER.warn("Unable to compute hash for incoming request");
      return ResponseEntity.internalServerError().build();
    }
    if (!computedHash.equals(xPayloadSignature)) {
      return ResponseEntity.badRequest().build();
    }

    // Do not perform long processing before returning a 200 OK response
    saveEventForLaterProcessing(eventNotification);

    // It is important to return a 200 OK response to acknowledge receipt of event
    return ResponseEntity.ok().build();
  }

  private void saveEventForLaterProcessing(EventNotification ignoredEventNotification) {
    // Save the event to a queue or database for later processing
    // For example, you can save the event to a database for later processing
    // or enqueue the event to a message broker like Azure Service Bus or RabbitMQ
  }
}
