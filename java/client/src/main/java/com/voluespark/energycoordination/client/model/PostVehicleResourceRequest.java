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
import java.util.Objects;

/** PostVehicleResourceRequest */
@JsonPropertyOrder({
  PostVehicleResourceRequest.JSON_PROPERTY_RESOURCE_ID,
  PostVehicleResourceRequest.JSON_PROPERTY_RESOURCE_TYPE
})
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.12.0")
public class PostVehicleResourceRequest {
  public static final String JSON_PROPERTY_RESOURCE_ID = "resourceId";
  @jakarta.annotation.Nonnull private String resourceId;

  public static final String JSON_PROPERTY_RESOURCE_TYPE = "resourceType";
  @jakarta.annotation.Nonnull private ResourceType resourceType;

  public PostVehicleResourceRequest() {}

  public PostVehicleResourceRequest resourceId(@jakarta.annotation.Nonnull String resourceId) {

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

  public PostVehicleResourceRequest resourceType(
      @jakarta.annotation.Nonnull ResourceType resourceType) {

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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostVehicleResourceRequest postVehicleResourceRequest = (PostVehicleResourceRequest) o;
    return Objects.equals(this.resourceId, postVehicleResourceRequest.resourceId)
        && Objects.equals(this.resourceType, postVehicleResourceRequest.resourceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId, resourceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostVehicleResourceRequest {\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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
