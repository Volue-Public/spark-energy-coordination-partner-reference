package com.voluespark.energycoordination.partnerapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/** UserEligibilityPayload */
@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    comments = "Generator version: 7.9.0-SNAPSHOT")
public class UserEligibilityPayload extends SparkEventPayload {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastUpdated;

  @Valid private List<String> addedUsers = new ArrayList<>();

  @Valid private List<String> removedUsers = new ArrayList<>();

  public UserEligibilityPayload lastUpdated(OffsetDateTime lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * Get lastUpdated
   *
   * @return lastUpdated
   */
  @Valid
  @Schema(name = "lastUpdated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastUpdated")
  public OffsetDateTime getLastUpdated() {
    return lastUpdated;
  }

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
  @Schema(name = "addedUsers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("addedUsers")
  public List<String> getAddedUsers() {
    return addedUsers;
  }

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
  @Schema(name = "removedUsers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("removedUsers")
  public List<String> getRemovedUsers() {
    return removedUsers;
  }

  public void setRemovedUsers(List<String> removedUsers) {
    this.removedUsers = removedUsers;
  }

  public UserEligibilityPayload payloadType(SparkEventPayloadType payloadType) {
    super.payloadType(payloadType);
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
