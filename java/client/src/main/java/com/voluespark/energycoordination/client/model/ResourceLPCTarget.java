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

/** ResourceLPCTarget */
@JsonPropertyOrder({
  ResourceLPCTarget.JSON_PROPERTY_METER_POINT_ID,
  ResourceLPCTarget.JSON_PROPERTY_LOCATION_ID,
  ResourceLPCTarget.JSON_PROPERTY_RESOURCE_ID,
  ResourceLPCTarget.JSON_PROPERTY_RESOLUTION,
  ResourceLPCTarget.JSON_PROPERTY_POINTS
})
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.9.0-SNAPSHOT")
public class ResourceLPCTarget {
  public static final String JSON_PROPERTY_METER_POINT_ID = "meterPointId";
  private String meterPointId;

  public static final String JSON_PROPERTY_LOCATION_ID = "locationId";
  private String locationId;

  public static final String JSON_PROPERTY_RESOURCE_ID = "resourceId";
  private String resourceId;

  public static final String JSON_PROPERTY_RESOLUTION = "resolution";
  private String resolution;

  public static final String JSON_PROPERTY_POINTS = "points";
  private List<LPCDataPoint> points = new ArrayList<>();

  public ResourceLPCTarget() {}

  public ResourceLPCTarget meterPointId(String meterPointId) {

    this.meterPointId = meterPointId;
    return this;
  }

  /**
   * Get meterPointId
   *
   * @return meterPointId
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_METER_POINT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMeterPointId() {
    return meterPointId;
  }

  @JsonProperty(JSON_PROPERTY_METER_POINT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMeterPointId(String meterPointId) {
    this.meterPointId = meterPointId;
  }

  public ResourceLPCTarget locationId(String locationId) {

    this.locationId = locationId;
    return this;
  }

  /**
   * Get locationId
   *
   * @return locationId
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getLocationId() {
    return locationId;
  }

  @JsonProperty(JSON_PROPERTY_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  public ResourceLPCTarget resourceId(String resourceId) {

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
  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  public ResourceLPCTarget resolution(String resolution) {

    this.resolution = resolution;
    return this;
  }

  /**
   * Get resolution
   *
   * @return resolution
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_RESOLUTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getResolution() {
    return resolution;
  }

  @JsonProperty(JSON_PROPERTY_RESOLUTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResolution(String resolution) {
    this.resolution = resolution;
  }

  public ResourceLPCTarget points(List<LPCDataPoint> points) {

    this.points = points;
    return this;
  }

  public ResourceLPCTarget addPointsItem(LPCDataPoint pointsItem) {
    if (this.points == null) {
      this.points = new ArrayList<>();
    }
    this.points.add(pointsItem);
    return this;
  }

  /**
   * Get points
   *
   * @return points
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_POINTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<LPCDataPoint> getPoints() {
    return points;
  }

  @JsonProperty(JSON_PROPERTY_POINTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPoints(List<LPCDataPoint> points) {
    this.points = points;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceLPCTarget resourceLPCTarget = (ResourceLPCTarget) o;
    return Objects.equals(this.meterPointId, resourceLPCTarget.meterPointId)
        && Objects.equals(this.locationId, resourceLPCTarget.locationId)
        && Objects.equals(this.resourceId, resourceLPCTarget.resourceId)
        && Objects.equals(this.resolution, resourceLPCTarget.resolution)
        && Objects.equals(this.points, resourceLPCTarget.points);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meterPointId, locationId, resourceId, resolution, points);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceLPCTarget {\n");
    sb.append("    meterPointId: ").append(toIndentedString(meterPointId)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
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
