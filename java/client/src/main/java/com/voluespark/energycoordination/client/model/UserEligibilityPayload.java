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
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** UserEligibilityPayload */
@JsonPropertyOrder({
  UserEligibilityPayload.JSON_PROPERTY_LAST_UPDATED,
  UserEligibilityPayload.JSON_PROPERTY_ADDED_USERS,
  UserEligibilityPayload.JSON_PROPERTY_REMOVED_USERS
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
public class UserEligibilityPayload extends SparkEventPayload {
  public static final String JSON_PROPERTY_LAST_UPDATED = "lastUpdated";
  private OffsetDateTime lastUpdated;

  public static final String JSON_PROPERTY_ADDED_USERS = "addedUsers";
  private List<String> addedUsers = new ArrayList<>();

  public static final String JSON_PROPERTY_REMOVED_USERS = "removedUsers";
  private List<String> removedUsers = new ArrayList<>();

  public UserEligibilityPayload() {}

  public UserEligibilityPayload lastUpdated(OffsetDateTime lastUpdated) {

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

  public UserEligibilityPayload addedUsers(List<String> addedUsers) {

    this.addedUsers = addedUsers;
    return this;
  }

  public UserEligibilityPayload addAddedUsersItem(String addedUsersItem) {
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

  public UserEligibilityPayload removedUsers(List<String> removedUsers) {

    this.removedUsers = removedUsers;
    return this;
  }

  public UserEligibilityPayload addRemovedUsersItem(String removedUsersItem) {
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

  @Override
  public UserEligibilityPayload payloadType(SparkEventPayloadType payloadType) {
    this.setPayloadType(payloadType);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserEligibilityPayload userEligibilityPayload = (UserEligibilityPayload) o;
    return Objects.equals(this.lastUpdated, userEligibilityPayload.lastUpdated)
        && Objects.equals(this.addedUsers, userEligibilityPayload.addedUsers)
        && Objects.equals(this.removedUsers, userEligibilityPayload.removedUsers)
        && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastUpdated, addedUsers, removedUsers, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserEligibilityPayload {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    addedUsers: ").append(toIndentedString(addedUsers)).append("\n");
    sb.append("    removedUsers: ").append(toIndentedString(removedUsers)).append("\n");
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
