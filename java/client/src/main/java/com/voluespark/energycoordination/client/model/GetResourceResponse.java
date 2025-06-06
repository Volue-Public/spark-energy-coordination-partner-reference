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
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** GetResourceResponse */
@JsonPropertyOrder({
  GetResourceResponse.JSON_PROPERTY_RESOURCE_ID,
  GetResourceResponse.JSON_PROPERTY_RESOURCE_TYPE,
  GetResourceResponse.JSON_PROPERTY_USER_ID,
  GetResourceResponse.JSON_PROPERTY_LOCATION_ID,
  GetResourceResponse.JSON_PROPERTY_METER_POINT_ID
})
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.12.0")
public class GetResourceResponse {
  public static final String JSON_PROPERTY_RESOURCE_ID = "resourceId";
  @jakarta.annotation.Nonnull private String resourceId;

  public static final String JSON_PROPERTY_RESOURCE_TYPE = "resourceType";
  @jakarta.annotation.Nonnull private ResourceType resourceType;

  public static final String JSON_PROPERTY_USER_ID = "userId";
  @jakarta.annotation.Nonnull private String userId;

  public static final String JSON_PROPERTY_LOCATION_ID = "locationId";

  @jakarta.annotation.Nullable
  private JsonNullable<String> locationId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_METER_POINT_ID = "meterPointId";

  @jakarta.annotation.Nullable
  private JsonNullable<String> meterPointId = JsonNullable.<String>undefined();

  public GetResourceResponse() {}

  public GetResourceResponse resourceId(@jakarta.annotation.Nonnull String resourceId) {

    this.resourceId = resourceId;
    return this;
  }

  /**
   * Get resourceId
   *
   * @return resourceId
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RESOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getResourceId() {
    return resourceId;
  }

  @JsonProperty(JSON_PROPERTY_RESOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResourceId(@jakarta.annotation.Nonnull String resourceId) {
    this.resourceId = resourceId;
  }

  public GetResourceResponse resourceType(@jakarta.annotation.Nonnull ResourceType resourceType) {

    this.resourceType = resourceType;
    return this;
  }

  /**
   * Get resourceType
   *
   * @return resourceType
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ResourceType getResourceType() {
    return resourceType;
  }

  @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResourceType(@jakarta.annotation.Nonnull ResourceType resourceType) {
    this.resourceType = resourceType;
  }

  public GetResourceResponse userId(@jakarta.annotation.Nonnull String userId) {

    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   *
   * @return userId
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUserId() {
    return userId;
  }

  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserId(@jakarta.annotation.Nonnull String userId) {
    this.userId = userId;
  }

  public GetResourceResponse locationId(@jakarta.annotation.Nullable String locationId) {
    this.locationId = JsonNullable.<String>of(locationId);

    return this;
  }

  /**
   * Get locationId
   *
   * @return locationId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getLocationId() {
    return locationId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getLocationId_JsonNullable() {
    return locationId;
  }

  @JsonProperty(JSON_PROPERTY_LOCATION_ID)
  public void setLocationId_JsonNullable(JsonNullable<String> locationId) {
    this.locationId = locationId;
  }

  public void setLocationId(@jakarta.annotation.Nullable String locationId) {
    this.locationId = JsonNullable.<String>of(locationId);
  }

  public GetResourceResponse meterPointId(@jakarta.annotation.Nullable String meterPointId) {
    this.meterPointId = JsonNullable.<String>of(meterPointId);

    return this;
  }

  /**
   * Get meterPointId
   *
   * @return meterPointId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getMeterPointId() {
    return meterPointId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_METER_POINT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getMeterPointId_JsonNullable() {
    return meterPointId;
  }

  @JsonProperty(JSON_PROPERTY_METER_POINT_ID)
  public void setMeterPointId_JsonNullable(JsonNullable<String> meterPointId) {
    this.meterPointId = meterPointId;
  }

  public void setMeterPointId(@jakarta.annotation.Nullable String meterPointId) {
    this.meterPointId = JsonNullable.<String>of(meterPointId);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetResourceResponse getResourceResponse = (GetResourceResponse) o;
    return Objects.equals(this.resourceId, getResourceResponse.resourceId)
        && Objects.equals(this.resourceType, getResourceResponse.resourceType)
        && Objects.equals(this.userId, getResourceResponse.userId)
        && equalsNullable(this.locationId, getResourceResponse.locationId)
        && equalsNullable(this.meterPointId, getResourceResponse.meterPointId);
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
        resourceId,
        resourceType,
        userId,
        hashCodeNullable(locationId),
        hashCodeNullable(meterPointId));
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
    sb.append("class GetResourceResponse {\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    meterPointId: ").append(toIndentedString(meterPointId)).append("\n");
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
