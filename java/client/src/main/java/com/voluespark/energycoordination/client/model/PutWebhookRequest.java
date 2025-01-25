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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** PutWebhookRequest */
@JsonPropertyOrder({
  PutWebhookRequest.JSON_PROPERTY_WEBHOOK_SECRET,
  PutWebhookRequest.JSON_PROPERTY_WEBHOOK_URL,
  PutWebhookRequest.JSON_PROPERTY_NOTIFICATION_TYPES,
  PutWebhookRequest.JSON_PROPERTY_ENABLED,
  PutWebhookRequest.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.9.0-SNAPSHOT")
public class PutWebhookRequest {
  public static final String JSON_PROPERTY_WEBHOOK_SECRET = "webhookSecret";
  private JsonNullable<String> webhookSecret = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_WEBHOOK_URL = "webhookUrl";
  private String webhookUrl;

  public static final String JSON_PROPERTY_NOTIFICATION_TYPES = "notificationTypes";
  private List<NotificationType> notificationTypes = new ArrayList<>();

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public PutWebhookRequest() {}

  public PutWebhookRequest webhookSecret(String webhookSecret) {
    this.webhookSecret = JsonNullable.<String>of(webhookSecret);

    return this;
  }

  /**
   * Get webhookSecret
   *
   * @return webhookSecret
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getWebhookSecret() {
    return webhookSecret.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WEBHOOK_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getWebhookSecret_JsonNullable() {
    return webhookSecret;
  }

  @JsonProperty(JSON_PROPERTY_WEBHOOK_SECRET)
  public void setWebhookSecret_JsonNullable(JsonNullable<String> webhookSecret) {
    this.webhookSecret = webhookSecret;
  }

  public void setWebhookSecret(String webhookSecret) {
    this.webhookSecret = JsonNullable.<String>of(webhookSecret);
  }

  public PutWebhookRequest webhookUrl(String webhookUrl) {

    this.webhookUrl = webhookUrl;
    return this;
  }

  /**
   * Get webhookUrl
   *
   * @return webhookUrl
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_WEBHOOK_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getWebhookUrl() {
    return webhookUrl;
  }

  @JsonProperty(JSON_PROPERTY_WEBHOOK_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWebhookUrl(String webhookUrl) {
    this.webhookUrl = webhookUrl;
  }

  public PutWebhookRequest notificationTypes(List<NotificationType> notificationTypes) {

    this.notificationTypes = notificationTypes;
    return this;
  }

  public PutWebhookRequest addNotificationTypesItem(NotificationType notificationTypesItem) {
    if (this.notificationTypes == null) {
      this.notificationTypes = new ArrayList<>();
    }
    this.notificationTypes.add(notificationTypesItem);
    return this;
  }

  /**
   * Get notificationTypes
   *
   * @return notificationTypes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOTIFICATION_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<NotificationType> getNotificationTypes() {
    return notificationTypes;
  }

  @JsonProperty(JSON_PROPERTY_NOTIFICATION_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotificationTypes(List<NotificationType> notificationTypes) {
    this.notificationTypes = notificationTypes;
  }

  public PutWebhookRequest enabled(Boolean enabled) {

    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   *
   * @return enabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnabled() {
    return enabled;
  }

  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public PutWebhookRequest name(String name) {
    this.name = JsonNullable.<String>of(name);

    return this;
  }

  /**
   * Get name
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getName() {
    return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutWebhookRequest putWebhookRequest = (PutWebhookRequest) o;
    return equalsNullable(this.webhookSecret, putWebhookRequest.webhookSecret)
        && Objects.equals(this.webhookUrl, putWebhookRequest.webhookUrl)
        && Objects.equals(this.notificationTypes, putWebhookRequest.notificationTypes)
        && Objects.equals(this.enabled, putWebhookRequest.enabled)
        && equalsNullable(this.name, putWebhookRequest.name);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b
        || (a != null
            && b != null
            && a.isPresent()
            && b.isPresent()
            && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        hashCodeNullable(webhookSecret),
        webhookUrl,
        notificationTypes,
        enabled,
        hashCodeNullable(name));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutWebhookRequest {\n");
    sb.append("    webhookSecret: ").append(toIndentedString(webhookSecret)).append("\n");
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
    sb.append("    notificationTypes: ").append(toIndentedString(notificationTypes)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
