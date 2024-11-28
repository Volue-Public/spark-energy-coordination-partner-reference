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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** GetWebhookNotificationLogsResponse */
@JsonPropertyOrder({
  GetWebhookNotificationLogsResponse.JSON_PROPERTY_WEBHOOK_NOTIFICATION_LOGS,
  GetWebhookNotificationLogsResponse.JSON_PROPERTY_PAGINATION
})
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.9.0-SNAPSHOT")
public class GetWebhookNotificationLogsResponse {
  public static final String JSON_PROPERTY_WEBHOOK_NOTIFICATION_LOGS = "webhookNotificationLogs";
  private List<WebhookNotificationLog> webhookNotificationLogs = new ArrayList<>();

  public static final String JSON_PROPERTY_PAGINATION = "pagination";
  private ApiPagination pagination;

  public GetWebhookNotificationLogsResponse() {}

  public GetWebhookNotificationLogsResponse webhookNotificationLogs(
      List<WebhookNotificationLog> webhookNotificationLogs) {

    this.webhookNotificationLogs = webhookNotificationLogs;
    return this;
  }

  public GetWebhookNotificationLogsResponse addWebhookNotificationLogsItem(
      WebhookNotificationLog webhookNotificationLogsItem) {
    if (this.webhookNotificationLogs == null) {
      this.webhookNotificationLogs = new ArrayList<>();
    }
    this.webhookNotificationLogs.add(webhookNotificationLogsItem);
    return this;
  }

  /**
   * Get webhookNotificationLogs
   *
   * @return webhookNotificationLogs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEBHOOK_NOTIFICATION_LOGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<WebhookNotificationLog> getWebhookNotificationLogs() {
    return webhookNotificationLogs;
  }

  @JsonProperty(JSON_PROPERTY_WEBHOOK_NOTIFICATION_LOGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebhookNotificationLogs(List<WebhookNotificationLog> webhookNotificationLogs) {
    this.webhookNotificationLogs = webhookNotificationLogs;
  }

  public GetWebhookNotificationLogsResponse pagination(ApiPagination pagination) {

    this.pagination = pagination;
    return this;
  }

  /**
   * Get pagination
   *
   * @return pagination
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ApiPagination getPagination() {
    return pagination;
  }

  @JsonProperty(JSON_PROPERTY_PAGINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPagination(ApiPagination pagination) {
    this.pagination = pagination;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetWebhookNotificationLogsResponse getWebhookNotificationLogsResponse =
        (GetWebhookNotificationLogsResponse) o;
    return Objects.equals(
            this.webhookNotificationLogs,
            getWebhookNotificationLogsResponse.webhookNotificationLogs)
        && Objects.equals(this.pagination, getWebhookNotificationLogsResponse.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookNotificationLogs, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetWebhookNotificationLogsResponse {\n");
    sb.append("    webhookNotificationLogs: ")
        .append(toIndentedString(webhookNotificationLogs))
        .append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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