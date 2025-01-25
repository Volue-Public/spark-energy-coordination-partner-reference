package com.voluespark.energycoordination.partnerapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/** EventNotification */
@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    comments = "Generator version: 7.9.0-SNAPSHOT")
public class EventNotification {

  private String notificationId;

  private String eventId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime eventCreatedAtUtc;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime notificationSentUtc;

  private NotificationType notificationType;

  private SparkEventPayload payload;

  public EventNotification() {
    super();
  }

  /** Constructor with only required parameters */
  public EventNotification(
      String notificationId,
      String eventId,
      OffsetDateTime eventCreatedAtUtc,
      OffsetDateTime notificationSentUtc,
      NotificationType notificationType,
      SparkEventPayload payload) {
    this.notificationId = notificationId;
    this.eventId = eventId;
    this.eventCreatedAtUtc = eventCreatedAtUtc;
    this.notificationSentUtc = notificationSentUtc;
    this.notificationType = notificationType;
    this.payload = payload;
  }

  public EventNotification notificationId(String notificationId) {
    this.notificationId = notificationId;
    return this;
  }

  /**
   * Get notificationId
   *
   * @return notificationId
   */
  @NotNull
  @Schema(name = "notificationId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("notificationId")
  public String getNotificationId() {
    return notificationId;
  }

  public void setNotificationId(String notificationId) {
    this.notificationId = notificationId;
  }

  public EventNotification eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * Get eventId
   *
   * @return eventId
   */
  @NotNull
  @Schema(name = "eventId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("eventId")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public EventNotification eventCreatedAtUtc(OffsetDateTime eventCreatedAtUtc) {
    this.eventCreatedAtUtc = eventCreatedAtUtc;
    return this;
  }

  /**
   * Get eventCreatedAtUtc
   *
   * @return eventCreatedAtUtc
   */
  @NotNull
  @Valid
  @Schema(name = "eventCreatedAtUtc", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("eventCreatedAtUtc")
  public OffsetDateTime getEventCreatedAtUtc() {
    return eventCreatedAtUtc;
  }

  public void setEventCreatedAtUtc(OffsetDateTime eventCreatedAtUtc) {
    this.eventCreatedAtUtc = eventCreatedAtUtc;
  }

  public EventNotification notificationSentUtc(OffsetDateTime notificationSentUtc) {
    this.notificationSentUtc = notificationSentUtc;
    return this;
  }

  /**
   * Get notificationSentUtc
   *
   * @return notificationSentUtc
   */
  @NotNull
  @Valid
  @Schema(name = "notificationSentUtc", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("notificationSentUtc")
  public OffsetDateTime getNotificationSentUtc() {
    return notificationSentUtc;
  }

  public void setNotificationSentUtc(OffsetDateTime notificationSentUtc) {
    this.notificationSentUtc = notificationSentUtc;
  }

  public EventNotification notificationType(NotificationType notificationType) {
    this.notificationType = notificationType;
    return this;
  }

  /**
   * Get notificationType
   *
   * @return notificationType
   */
  @NotNull
  @Valid
  @Schema(name = "notificationType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("notificationType")
  public NotificationType getNotificationType() {
    return notificationType;
  }

  public void setNotificationType(NotificationType notificationType) {
    this.notificationType = notificationType;
  }

  public EventNotification payload(SparkEventPayload payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Get payload
   *
   * @return payload
   */
  @NotNull
  @Valid
  @Schema(name = "payload", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("payload")
  public SparkEventPayload getPayload() {
    return payload;
  }

  public void setPayload(SparkEventPayload payload) {
    this.payload = payload;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventNotification eventNotification = (EventNotification) o;
    return Objects.equals(this.notificationId, eventNotification.notificationId)
        && Objects.equals(this.eventId, eventNotification.eventId)
        && Objects.equals(this.eventCreatedAtUtc, eventNotification.eventCreatedAtUtc)
        && Objects.equals(this.notificationSentUtc, eventNotification.notificationSentUtc)
        && Objects.equals(this.notificationType, eventNotification.notificationType)
        && Objects.equals(this.payload, eventNotification.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        notificationId, eventId, eventCreatedAtUtc, notificationSentUtc, notificationType, payload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventNotification {\n");
    sb.append("    notificationId: ").append(toIndentedString(notificationId)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventCreatedAtUtc: ").append(toIndentedString(eventCreatedAtUtc)).append("\n");
    sb.append("    notificationSentUtc: ")
        .append(toIndentedString(notificationSentUtc))
        .append("\n");
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
