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

/** LocationLPCTarget */
@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    comments = "Generator version: 7.9.0-SNAPSHOT")
public class LocationLPCTarget {

  private String locationId;

  private String meterPointId;

  private String resolution;

  @Valid private List<@Valid LPCDataPoint> points = new ArrayList<>();

  public LocationLPCTarget locationId(String locationId) {
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

  public LocationLPCTarget meterPointId(String meterPointId) {
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

  public LocationLPCTarget resolution(String resolution) {
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

  public LocationLPCTarget points(List<@Valid LPCDataPoint> points) {
    this.points = points;
    return this;
  }

  public LocationLPCTarget addPointsItem(LPCDataPoint pointsItem) {
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
    LocationLPCTarget locationLPCTarget = (LocationLPCTarget) o;
    return Objects.equals(this.locationId, locationLPCTarget.locationId)
        && Objects.equals(this.meterPointId, locationLPCTarget.meterPointId)
        && Objects.equals(this.resolution, locationLPCTarget.resolution)
        && Objects.equals(this.points, locationLPCTarget.points);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationId, meterPointId, resolution, points);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationLPCTarget {\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
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
