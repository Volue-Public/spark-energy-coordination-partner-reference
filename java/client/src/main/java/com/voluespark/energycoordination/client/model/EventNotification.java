/*
 * Energy Coordination API - Partner Endpoints
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.voluespark.energycoordination.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.time.OffsetDateTime;
import java.util.Objects;

/** EventNotification */
@JsonPropertyOrder({
  EventNotification.JSON_PROPERTY_NOTIFICATION_ID,
  EventNotification.JSON_PROPERTY_EVENT_ID,
  EventNotification.JSON_PROPERTY_EVENT_CREATED_AT_UTC,
  EventNotification.JSON_PROPERTY_NOTIFICATION_SENT_UTC,
  EventNotification.JSON_PROPERTY_NOTIFICATION_TYPE,
  EventNotification.JSON_PROPERTY_PAYLOAD
})
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.12.0")
public class EventNotification {
  public static final String JSON_PROPERTY_NOTIFICATION_ID = "notificationId";
  @jakarta.annotation.Nonnull private String notificationId;

  public static final String JSON_PROPERTY_EVENT_ID = "eventId";
  @jakarta.annotation.Nonnull private String eventId;

  public static final String JSON_PROPERTY_EVENT_CREATED_AT_UTC = "eventCreatedAtUtc";
  @jakarta.annotation.Nonnull private OffsetDateTime eventCreatedAtUtc;

  public static final String JSON_PROPERTY_NOTIFICATION_SENT_UTC = "notificationSentUtc";
  @jakarta.annotation.Nonnull private OffsetDateTime notificationSentUtc;

  public static final String JSON_PROPERTY_NOTIFICATION_TYPE = "notificationType";
  @jakarta.annotation.Nonnull private NotificationType notificationType;

  public static final String JSON_PROPERTY_PAYLOAD = "payload";
  @jakarta.annotation.Nonnull private SparkEventPayload payload;

  public EventNotification() {}

  public EventNotification notificationId(@jakarta.annotation.Nonnull String notificationId) {

    this.notificationId = notificationId;
    return this;
  }

  /**
   * Get notificationId
   *
   * @return notificationId
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NOTIFICATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getNotificationId() {
    return notificationId;
  }

  @JsonProperty(JSON_PROPERTY_NOTIFICATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNotificationId(@jakarta.annotation.Nonnull String notificationId) {
    this.notificationId = notificationId;
  }

  public EventNotification eventId(@jakarta.annotation.Nonnull String eventId) {

    this.eventId = eventId;
    return this;
  }

  /**
   * Get eventId
   *
   * @return eventId
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EVENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getEventId() {
    return eventId;
  }

  @JsonProperty(JSON_PROPERTY_EVENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEventId(@jakarta.annotation.Nonnull String eventId) {
    this.eventId = eventId;
  }

  public EventNotification eventCreatedAtUtc(
      @jakarta.annotation.Nonnull OffsetDateTime eventCreatedAtUtc) {

    this.eventCreatedAtUtc = eventCreatedAtUtc;
    return this;
  }

  /**
   * Get eventCreatedAtUtc
   *
   * @return eventCreatedAtUtc
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EVENT_CREATED_AT_UTC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getEventCreatedAtUtc() {
    return eventCreatedAtUtc;
  }

  @JsonProperty(JSON_PROPERTY_EVENT_CREATED_AT_UTC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEventCreatedAtUtc(@jakarta.annotation.Nonnull OffsetDateTime eventCreatedAtUtc) {
    this.eventCreatedAtUtc = eventCreatedAtUtc;
  }

  public EventNotification notificationSentUtc(
      @jakarta.annotation.Nonnull OffsetDateTime notificationSentUtc) {

    this.notificationSentUtc = notificationSentUtc;
    return this;
  }

  /**
   * Get notificationSentUtc
   *
   * @return notificationSentUtc
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NOTIFICATION_SENT_UTC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getNotificationSentUtc() {
    return notificationSentUtc;
  }

  @JsonProperty(JSON_PROPERTY_NOTIFICATION_SENT_UTC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNotificationSentUtc(
      @jakarta.annotation.Nonnull OffsetDateTime notificationSentUtc) {
    this.notificationSentUtc = notificationSentUtc;
  }

  public EventNotification notificationType(
      @jakarta.annotation.Nonnull NotificationType notificationType) {

    this.notificationType = notificationType;
    return this;
  }

  /**
   * Get notificationType
   *
   * @return notificationType
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NOTIFICATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public NotificationType getNotificationType() {
    return notificationType;
  }

  @JsonProperty(JSON_PROPERTY_NOTIFICATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNotificationType(@jakarta.annotation.Nonnull NotificationType notificationType) {
    this.notificationType = notificationType;
  }

  public EventNotification payload(@jakarta.annotation.Nonnull SparkEventPayload payload) {

    this.payload = payload;
    return this;
  }

  /**
   * Get payload
   *
   * @return payload
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SparkEventPayload getPayload() {
    return payload;
  }

  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPayload(@jakarta.annotation.Nonnull SparkEventPayload payload) {
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
