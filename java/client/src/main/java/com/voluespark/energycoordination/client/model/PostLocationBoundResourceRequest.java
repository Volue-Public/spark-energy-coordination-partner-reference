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

/** PostLocationBoundResourceRequest */
@JsonPropertyOrder({
  PostLocationBoundResourceRequest.JSON_PROPERTY_RESOURCE_ID,
  PostLocationBoundResourceRequest.JSON_PROPERTY_RESOURCE_TYPE,
  PostLocationBoundResourceRequest.JSON_PROPERTY_METER_POINT_ID
})
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.9.0-SNAPSHOT")
public class PostLocationBoundResourceRequest {
  public static final String JSON_PROPERTY_RESOURCE_ID = "resourceId";
  private String resourceId;

  public static final String JSON_PROPERTY_RESOURCE_TYPE = "resourceType";
  private ResourceType resourceType;

  public static final String JSON_PROPERTY_METER_POINT_ID = "meterPointId";
  private JsonNullable<String> meterPointId = JsonNullable.<String>undefined();

  public PostLocationBoundResourceRequest() {}

  public PostLocationBoundResourceRequest resourceId(String resourceId) {

    this.resourceId = resourceId;
    return this;
  }

  /**
   * Get resourceId
   *
   * @return resourceId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getResourceId() {
    return resourceId;
  }

  @JsonProperty(JSON_PROPERTY_RESOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  public PostLocationBoundResourceRequest resourceType(ResourceType resourceType) {

    this.resourceType = resourceType;
    return this;
  }

  /**
   * Get resourceType
   *
   * @return resourceType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ResourceType getResourceType() {
    return resourceType;
  }

  @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResourceType(ResourceType resourceType) {
    this.resourceType = resourceType;
  }

  public PostLocationBoundResourceRequest meterPointId(String meterPointId) {
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

  public void setMeterPointId(String meterPointId) {
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
    PostLocationBoundResourceRequest postLocationBoundResourceRequest =
        (PostLocationBoundResourceRequest) o;
    return Objects.equals(this.resourceId, postLocationBoundResourceRequest.resourceId)
        && Objects.equals(this.resourceType, postLocationBoundResourceRequest.resourceType)
        && equalsNullable(this.meterPointId, postLocationBoundResourceRequest.meterPointId);
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
    return Objects.hash(resourceId, resourceType, hashCodeNullable(meterPointId));
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
    sb.append("class PostLocationBoundResourceRequest {\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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
