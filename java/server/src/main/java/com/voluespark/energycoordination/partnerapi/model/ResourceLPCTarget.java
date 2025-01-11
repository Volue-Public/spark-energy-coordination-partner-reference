package com.voluespark.energycoordination.partnerapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** ResourceLPCTarget */
@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    comments = "Generator version: 7.9.0-SNAPSHOT")
public class ResourceLPCTarget {

  private String locationId;

  private String resourceId;

  private String meterPointId;

  private String resolution;

  @Valid private List<@Valid LPCDataPoint> points = new ArrayList<>();

  public ResourceLPCTarget locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

  /**
   * Get locationId
   *
   * @return locationId
   */
  @Schema(name = "locationId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locationId")
  public String getLocationId() {
    return locationId;
  }

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
  @Schema(name = "resourceId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resourceId")
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  public ResourceLPCTarget meterPointId(String meterPointId) {
    this.meterPointId = meterPointId;
    return this;
  }

  /**
   * Get meterPointId
   *
   * @return meterPointId
   */
  @Schema(name = "meterPointId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("meterPointId")
  public String getMeterPointId() {
    return meterPointId;
  }

  public void setMeterPointId(String meterPointId) {
    this.meterPointId = meterPointId;
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
  @Schema(
      name = "resolution",
      example = "02:00:00",
      requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resolution")
  public String getResolution() {
    return resolution;
  }

  public void setResolution(String resolution) {
    this.resolution = resolution;
  }

  public ResourceLPCTarget points(List<@Valid LPCDataPoint> points) {
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
  @Valid
  @Schema(name = "points", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("points")
  public List<@Valid LPCDataPoint> getPoints() {
    return points;
  }

  public void setPoints(List<@Valid LPCDataPoint> points) {
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
    return Objects.equals(this.locationId, resourceLPCTarget.locationId)
        && Objects.equals(this.resourceId, resourceLPCTarget.resourceId)
        && Objects.equals(this.meterPointId, resourceLPCTarget.meterPointId)
        && Objects.equals(this.resolution, resourceLPCTarget.resolution)
        && Objects.equals(this.points, resourceLPCTarget.points);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationId, resourceId, meterPointId, resolution, points);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceLPCTarget {\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    meterPointId: ").append(toIndentedString(meterPointId)).append("\n");
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