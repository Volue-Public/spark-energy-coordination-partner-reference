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

/** PostReportRequest */
@JsonPropertyOrder({
  PostReportRequest.JSON_PROPERTY_EVENT_ID,
  PostReportRequest.JSON_PROPERTY_PAYLOADS
})
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.12.0")
public class PostReportRequest {
  public static final String JSON_PROPERTY_EVENT_ID = "eventId";

  @jakarta.annotation.Nullable
  private JsonNullable<String> eventId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PAYLOADS = "payloads";

  @jakarta.annotation.Nullable
  private List<PostReportRequestPayloadsInner> payloads = new ArrayList<>();

  public PostReportRequest() {}

  public PostReportRequest eventId(@jakarta.annotation.Nullable String eventId) {
    this.eventId = JsonNullable.<String>of(eventId);

    return this;
  }

  /**
   * Get eventId
   *
   * @return eventId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getEventId() {
    return eventId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EVENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getEventId_JsonNullable() {
    return eventId;
  }

  @JsonProperty(JSON_PROPERTY_EVENT_ID)
  public void setEventId_JsonNullable(JsonNullable<String> eventId) {
    this.eventId = eventId;
  }

  public void setEventId(@jakarta.annotation.Nullable String eventId) {
    this.eventId = JsonNullable.<String>of(eventId);
  }

  public PostReportRequest payloads(
      @jakarta.annotation.Nullable List<PostReportRequestPayloadsInner> payloads) {

    this.payloads = payloads;
    return this;
  }

  public PostReportRequest addPayloadsItem(PostReportRequestPayloadsInner payloadsItem) {
    if (this.payloads == null) {
      this.payloads = new ArrayList<>();
    }
    this.payloads.add(payloadsItem);
    return this;
  }

  /**
   * Get payloads
   *
   * @return payloads
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYLOADS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<PostReportRequestPayloadsInner> getPayloads() {
    return payloads;
  }

  @JsonProperty(JSON_PROPERTY_PAYLOADS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayloads(
      @jakarta.annotation.Nullable List<PostReportRequestPayloadsInner> payloads) {
    this.payloads = payloads;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostReportRequest postReportRequest = (PostReportRequest) o;
    return equalsNullable(this.eventId, postReportRequest.eventId)
        && Objects.equals(this.payloads, postReportRequest.payloads);
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
    return Objects.hash(hashCodeNullable(eventId), payloads);
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
    sb.append("class PostReportRequest {\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    payloads: ").append(toIndentedString(payloads)).append("\n");
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
