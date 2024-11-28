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

/** GetEventResponse */
@JsonPropertyOrder({
  GetEventResponse.JSON_PROPERTY_PAYLOAD,
  GetEventResponse.JSON_PROPERTY_ID,
  GetEventResponse.JSON_PROPERTY_CREATED_AT
})
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.9.0-SNAPSHOT")
public class GetEventResponse {
  public static final String JSON_PROPERTY_PAYLOAD = "payload";
  private GetEventResponsePayload payload;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private OffsetDateTime createdAt;

  public GetEventResponse() {}

  public GetEventResponse payload(GetEventResponsePayload payload) {

    this.payload = payload;
    return this;
  }

  /**
   * Get payload
   *
   * @return payload
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GetEventResponsePayload getPayload() {
    return payload;
  }

  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayload(GetEventResponsePayload payload) {
    this.payload = payload;
  }

  public GetEventResponse id(String id) {

    this.id = id;
    return this;
  }

  /**
   * Get id
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }

  public GetEventResponse createdAt(OffsetDateTime createdAt) {

    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetEventResponse getEventResponse = (GetEventResponse) o;
    return Objects.equals(this.payload, getEventResponse.payload)
        && Objects.equals(this.id, getEventResponse.id)
        && Objects.equals(this.createdAt, getEventResponse.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, id, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEventResponse {\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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