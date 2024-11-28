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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** GetEventResponsePayload */
@JsonPropertyOrder({
  GetEventResponsePayload.JSON_PROPERTY_LAST_UPDATED,
  GetEventResponsePayload.JSON_PROPERTY_ADDED_USERS,
  GetEventResponsePayload.JSON_PROPERTY_REMOVED_USERS,
  GetEventResponsePayload.JSON_PROPERTY_PAYLOAD_TYPE
})
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.9.0-SNAPSHOT")
@JsonIgnoreProperties(
    value =
        "payloadType", // ignore manually set payloadType, it will be automatically generated by
                       // Jackson during serialization
    allowSetters = true // allows the payloadType to be set during deserialization
    )
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "payloadType",
    visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = PriceCurvePayload.class, name = "PriceCurve"),
  @JsonSubTypes.Type(value = UserEligibilityPayload.class, name = "UserEligibility"),
  @JsonSubTypes.Type(value = PriceCurvePayload.class, name = "PriceCurvePayload"),
  @JsonSubTypes.Type(value = UserEligibilityPayload.class, name = "UserEligibilityPayload"),
})
public class GetEventResponsePayload {
  public static final String JSON_PROPERTY_LAST_UPDATED = "lastUpdated";
  private OffsetDateTime lastUpdated;

  public static final String JSON_PROPERTY_ADDED_USERS = "addedUsers";
  private List<String> addedUsers = new ArrayList<>();

  public static final String JSON_PROPERTY_REMOVED_USERS = "removedUsers";
  private List<String> removedUsers = new ArrayList<>();

  public static final String JSON_PROPERTY_PAYLOAD_TYPE = "payloadType";
  private SparkEventPayloadType payloadType;

  public GetEventResponsePayload() {}

  public GetEventResponsePayload lastUpdated(OffsetDateTime lastUpdated) {

    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * Get lastUpdated
   *
   * @return lastUpdated
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_UPDATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }

  @JsonProperty(JSON_PROPERTY_LAST_UPDATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public GetEventResponsePayload addedUsers(List<String> addedUsers) {

    this.addedUsers = addedUsers;
    return this;
  }

  public GetEventResponsePayload addAddedUsersItem(String addedUsersItem) {
    if (this.addedUsers == null) {
      this.addedUsers = new ArrayList<>();
    }
    this.addedUsers.add(addedUsersItem);
    return this;
  }

  /**
   * Get addedUsers
   *
   * @return addedUsers
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDED_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getAddedUsers() {
    return addedUsers;
  }

  @JsonProperty(JSON_PROPERTY_ADDED_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddedUsers(List<String> addedUsers) {
    this.addedUsers = addedUsers;
  }

  public GetEventResponsePayload removedUsers(List<String> removedUsers) {

    this.removedUsers = removedUsers;
    return this;
  }

  public GetEventResponsePayload addRemovedUsersItem(String removedUsersItem) {
    if (this.removedUsers == null) {
      this.removedUsers = new ArrayList<>();
    }
    this.removedUsers.add(removedUsersItem);
    return this;
  }

  /**
   * Get removedUsers
   *
   * @return removedUsers
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REMOVED_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getRemovedUsers() {
    return removedUsers;
  }

  @JsonProperty(JSON_PROPERTY_REMOVED_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRemovedUsers(List<String> removedUsers) {
    this.removedUsers = removedUsers;
  }

  public GetEventResponsePayload payloadType(SparkEventPayloadType payloadType) {

    this.payloadType = payloadType;
    return this;
  }

  /**
   * Get payloadType
   *
   * @return payloadType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYLOAD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SparkEventPayloadType getPayloadType() {
    return payloadType;
  }

  @JsonProperty(JSON_PROPERTY_PAYLOAD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayloadType(SparkEventPayloadType payloadType) {
    this.payloadType = payloadType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetEventResponsePayload getEventResponsePayload = (GetEventResponsePayload) o;
    return Objects.equals(this.lastUpdated, getEventResponsePayload.lastUpdated)
        && Objects.equals(this.addedUsers, getEventResponsePayload.addedUsers)
        && Objects.equals(this.removedUsers, getEventResponsePayload.removedUsers)
        && Objects.equals(this.payloadType, getEventResponsePayload.payloadType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastUpdated, addedUsers, removedUsers, payloadType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEventResponsePayload {\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    addedUsers: ").append(toIndentedString(addedUsers)).append("\n");
    sb.append("    removedUsers: ").append(toIndentedString(removedUsers)).append("\n");
    sb.append("    payloadType: ").append(toIndentedString(payloadType)).append("\n");
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