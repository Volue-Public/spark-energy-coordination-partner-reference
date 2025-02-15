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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** GetWebhookResponse */
@JsonPropertyOrder({
  GetWebhookResponse.JSON_PROPERTY_WEBHOOK_ID,
  GetWebhookResponse.JSON_PROPERTY_WEBHOOK_URL,
  GetWebhookResponse.JSON_PROPERTY_NAME,
  GetWebhookResponse.JSON_PROPERTY_NOTIFICATION_TYPES,
  GetWebhookResponse.JSON_PROPERTY_ENABLED,
  GetWebhookResponse.JSON_PROPERTY_STATUS,
  GetWebhookResponse.JSON_PROPERTY_MODIFIED_DATE,
  GetWebhookResponse.JSON_PROPERTY_CREATED_DATE,
  GetWebhookResponse.JSON_PROPERTY_LAST_ANALYZED_TIMESTAMP
})
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.9.0-SNAPSHOT")
public class GetWebhookResponse {
  public static final String JSON_PROPERTY_WEBHOOK_ID = "webhookId";
  private String webhookId;

  public static final String JSON_PROPERTY_WEBHOOK_URL = "webhookUrl";
  private String webhookUrl;

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NOTIFICATION_TYPES = "notificationTypes";
  private List<NotificationType> notificationTypes = new ArrayList<>();

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_STATUS = "status";
  private WebhookStatus status;

  public static final String JSON_PROPERTY_MODIFIED_DATE = "modifiedDate";
  private OffsetDateTime modifiedDate;

  public static final String JSON_PROPERTY_CREATED_DATE = "createdDate";
  private OffsetDateTime createdDate;

  public static final String JSON_PROPERTY_LAST_ANALYZED_TIMESTAMP = "lastAnalyzedTimestamp";
  private OffsetDateTime lastAnalyzedTimestamp;

  public GetWebhookResponse() {}

  public GetWebhookResponse webhookId(String webhookId) {

    this.webhookId = webhookId;
    return this;
  }

  /**
   * Get webhookId
   *
   * @return webhookId
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_WEBHOOK_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getWebhookId() {
    return webhookId;
  }

  @JsonProperty(JSON_PROPERTY_WEBHOOK_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWebhookId(String webhookId) {
    this.webhookId = webhookId;
  }

  public GetWebhookResponse webhookUrl(String webhookUrl) {

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

  public GetWebhookResponse name(String name) {
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

  public GetWebhookResponse notificationTypes(List<NotificationType> notificationTypes) {

    this.notificationTypes = notificationTypes;
    return this;
  }

  public GetWebhookResponse addNotificationTypesItem(NotificationType notificationTypesItem) {
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

  public GetWebhookResponse enabled(Boolean enabled) {

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

  public GetWebhookResponse status(WebhookStatus status) {

    this.status = status;
    return this;
  }

  /**
   * Get status
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WebhookStatus getStatus() {
    return status;
  }

  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(WebhookStatus status) {
    this.status = status;
  }

  public GetWebhookResponse modifiedDate(OffsetDateTime modifiedDate) {

    this.modifiedDate = modifiedDate;
    return this;
  }

  /**
   * Get modifiedDate
   *
   * @return modifiedDate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODIFIED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }

  @JsonProperty(JSON_PROPERTY_MODIFIED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  public GetWebhookResponse createdDate(OffsetDateTime createdDate) {

    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   *
   * @return createdDate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }

  @JsonProperty(JSON_PROPERTY_CREATED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public GetWebhookResponse lastAnalyzedTimestamp(OffsetDateTime lastAnalyzedTimestamp) {

    this.lastAnalyzedTimestamp = lastAnalyzedTimestamp;
    return this;
  }

  /**
   * Get lastAnalyzedTimestamp
   *
   * @return lastAnalyzedTimestamp
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_ANALYZED_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getLastAnalyzedTimestamp() {
    return lastAnalyzedTimestamp;
  }

  @JsonProperty(JSON_PROPERTY_LAST_ANALYZED_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastAnalyzedTimestamp(OffsetDateTime lastAnalyzedTimestamp) {
    this.lastAnalyzedTimestamp = lastAnalyzedTimestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetWebhookResponse getWebhookResponse = (GetWebhookResponse) o;
    return Objects.equals(this.webhookId, getWebhookResponse.webhookId)
        && Objects.equals(this.webhookUrl, getWebhookResponse.webhookUrl)
        && equalsNullable(this.name, getWebhookResponse.name)
        && Objects.equals(this.notificationTypes, getWebhookResponse.notificationTypes)
        && Objects.equals(this.enabled, getWebhookResponse.enabled)
        && Objects.equals(this.status, getWebhookResponse.status)
        && Objects.equals(this.modifiedDate, getWebhookResponse.modifiedDate)
        && Objects.equals(this.createdDate, getWebhookResponse.createdDate)
        && Objects.equals(this.lastAnalyzedTimestamp, getWebhookResponse.lastAnalyzedTimestamp);
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
        webhookId,
        webhookUrl,
        hashCodeNullable(name),
        notificationTypes,
        enabled,
        status,
        modifiedDate,
        createdDate,
        lastAnalyzedTimestamp);
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
    sb.append("class GetWebhookResponse {\n");
    sb.append("    webhookId: ").append(toIndentedString(webhookId)).append("\n");
    sb.append("    webhookUrl: ").append(toIndentedString(webhookUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notificationTypes: ").append(toIndentedString(notificationTypes)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    lastAnalyzedTimestamp: ")
        .append(toIndentedString(lastAnalyzedTimestamp))
        .append("\n");
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
