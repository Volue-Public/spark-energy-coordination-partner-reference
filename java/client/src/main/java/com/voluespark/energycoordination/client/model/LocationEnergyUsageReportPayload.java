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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** LocationEnergyUsageReportPayload */
@JsonPropertyOrder({
  LocationEnergyUsageReportPayload.JSON_PROPERTY_LOCATION_ID,
  LocationEnergyUsageReportPayload.JSON_PROPERTY_METER_POINT_ID,
  LocationEnergyUsageReportPayload.JSON_PROPERTY_POINTS,
  LocationEnergyUsageReportPayload.JSON_PROPERTY_RESOLUTION
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
public class LocationEnergyUsageReportPayload extends SparkReportPayload {
  public static final String JSON_PROPERTY_LOCATION_ID = "locationId";
  private String locationId;

  public static final String JSON_PROPERTY_METER_POINT_ID = "meterPointId";
  private String meterPointId;

  public static final String JSON_PROPERTY_POINTS = "points";
  private List<EnergyCurvePoint> points = new ArrayList<>();

  public static final String JSON_PROPERTY_RESOLUTION = "resolution";
  private String resolution;

  public LocationEnergyUsageReportPayload() {}

  public LocationEnergyUsageReportPayload locationId(String locationId) {

    this.locationId = locationId;
    return this;
  }

  /**
   * Get locationId
   *
   * @return locationId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLocationId() {
    return locationId;
  }

  @JsonProperty(JSON_PROPERTY_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  public LocationEnergyUsageReportPayload meterPointId(String meterPointId) {

    this.meterPointId = meterPointId;
    return this;
  }

  /**
   * Get meterPointId
   *
   * @return meterPointId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METER_POINT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMeterPointId() {
    return meterPointId;
  }

  @JsonProperty(JSON_PROPERTY_METER_POINT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeterPointId(String meterPointId) {
    this.meterPointId = meterPointId;
  }

  public LocationEnergyUsageReportPayload points(List<EnergyCurvePoint> points) {

    this.points = points;
    return this;
  }

  public LocationEnergyUsageReportPayload addPointsItem(EnergyCurvePoint pointsItem) {
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<EnergyCurvePoint> getPoints() {
    return points;
  }

  @JsonProperty(JSON_PROPERTY_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPoints(List<EnergyCurvePoint> points) {
    this.points = points;
  }

  public LocationEnergyUsageReportPayload resolution(String resolution) {

    this.resolution = resolution;
    return this;
  }

  /**
   * Get resolution
   *
   * @return resolution
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOLUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getResolution() {
    return resolution;
  }

  @JsonProperty(JSON_PROPERTY_RESOLUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResolution(String resolution) {
    this.resolution = resolution;
  }

  @Override
  public LocationEnergyUsageReportPayload payloadType(SparkReportPayloadType payloadType) {
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
    LocationEnergyUsageReportPayload locationEnergyUsageReportPayload =
        (LocationEnergyUsageReportPayload) o;
    return Objects.equals(this.locationId, locationEnergyUsageReportPayload.locationId)
        && Objects.equals(this.meterPointId, locationEnergyUsageReportPayload.meterPointId)
        && Objects.equals(this.points, locationEnergyUsageReportPayload.points)
        && Objects.equals(this.resolution, locationEnergyUsageReportPayload.resolution)
        && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationId, meterPointId, points, resolution, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationEnergyUsageReportPayload {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    meterPointId: ").append(toIndentedString(meterPointId)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
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
