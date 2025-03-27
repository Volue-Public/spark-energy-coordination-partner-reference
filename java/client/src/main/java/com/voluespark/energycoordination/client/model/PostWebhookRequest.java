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

/** PostWebhookRequest */
@JsonPropertyOrder({
  PostWebhookRequest.JSON_PROPERTY_NAME,
  PostWebhookRequest.JSON_PROPERTY_WEBHOOK_SECRET,
  PostWebhookRequest.JSON_PROPERTY_WEBHOOK_URL,
  PostWebhookRequest.JSON_PROPERTY_NOTIFICATION_TYPES
})
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.12.0")
public class PostWebhookRequest {
  public static final String JSON_PROPERTY_NAME = "name";
  @jakarta.annotation.Nullable private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_WEBHOOK_SECRET = "webhookSecret";

  @jakarta.annotation.Nullable
  private JsonNullable<String> webhookSecret = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_WEBHOOK_URL = "webhookUrl";
  @jakarta.annotation.Nonnull private String webhookUrl;

  public static final String JSON_PROPERTY_NOTIFICATION_TYPES = "notificationTypes";
  @jakarta.annotation.Nullable private List<NotificationType> notificationTypes = new ArrayList<>();

  public PostWebhookRequest() {}

  public PostWebhookRequest name(@jakarta.annotation.Nullable String name) {
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

  public void setName(@jakarta.annotation.Nullable String name) {
    this.name = JsonNullable.<String>of(name);
  }

  public PostWebhookRequest webhookSecret(@jakarta.annotation.Nullable String webhookSecret) {
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

  public void setWebhookSecret(@jakarta.annotation.Nullable String webhookSecret) {
    this.webhookSecret = JsonNullable.<String>of(webhookSecret);
  }

  public PostWebhookRequest webhookUrl(@jakarta.annotation.Nonnull String webhookUrl) {

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
  public void setWebhookUrl(@jakarta.annotation.Nonnull String webhookUrl) {
    this.webhookUrl = webhookUrl;
  }

  public PostWebhookRequest notificationTypes(
      @jakarta.annotation.Nullable List<NotificationType> notificationTypes) {

    this.notificationTypes = notificationTypes;
    return this;
  }

  public PostWebhookRequest addNotificationTypesItem(NotificationType notificationTypesItem) {
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
  public void setNotificationTypes(
      @jakarta.annotation.Nullable List<NotificationType> notificationTypes) {
    this.notificationTypes = notificationTypes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostWebhookRequest postWebhookRequest = (PostWebhookRequest) o;
    return equalsNullable(this.name, postWebhookRequest.name)
        && equalsNullable(this.webhookSecret, postWebhookRequest.webhookSecret)
        && Objects.equals(this.webhookUrl, postWebhookRequest.webhookUrl)
        && Objects.equals(this.notificationTypes, postWebhookRequest.notificationTypes);
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
        hashCodeNullable(name), hashCodeNullable(webhookSecret), webhookUrl, notificationTypes);
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
    sb.append("class PostWebhookRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    webhookSecret: ").append(toIndentedString(webhookSecret)).append("\n");
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
    sb.append("    notificationTypes: ").append(toIndentedString(notificationTypes)).append("\n");
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
