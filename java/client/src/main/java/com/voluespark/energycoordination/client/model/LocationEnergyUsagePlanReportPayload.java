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

/** LocationEnergyUsagePlanReportPayload */
@JsonPropertyOrder({
  LocationEnergyUsagePlanReportPayload.JSON_PROPERTY_LOCATION_ID,
  LocationEnergyUsagePlanReportPayload.JSON_PROPERTY_METER_POINT_ID,
  LocationEnergyUsagePlanReportPayload.JSON_PROPERTY_RESOLUTION,
  LocationEnergyUsagePlanReportPayload.JSON_PROPERTY_BASELINE,
  LocationEnergyUsagePlanReportPayload.JSON_PROPERTY_FLEXIBILITY
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
public class LocationEnergyUsagePlanReportPayload extends SparkReportPayload {
  public static final String JSON_PROPERTY_LOCATION_ID = "locationId";
  private String locationId;

  public static final String JSON_PROPERTY_METER_POINT_ID = "meterPointId";
  private String meterPointId;

  public static final String JSON_PROPERTY_RESOLUTION = "resolution";
  private String resolution;

  public static final String JSON_PROPERTY_BASELINE = "baseline";
  private List<EnergyCurvePoint> baseline = new ArrayList<>();

  public static final String JSON_PROPERTY_FLEXIBILITY = "flexibility";
  private List<EnergyCurvePoint> flexibility = new ArrayList<>();

  public LocationEnergyUsagePlanReportPayload() {}

  public LocationEnergyUsagePlanReportPayload locationId(String locationId) {

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

  public LocationEnergyUsagePlanReportPayload meterPointId(String meterPointId) {

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

  public LocationEnergyUsagePlanReportPayload resolution(String resolution) {

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

  public LocationEnergyUsagePlanReportPayload baseline(List<EnergyCurvePoint> baseline) {

    this.baseline = baseline;
    return this;
  }

  public LocationEnergyUsagePlanReportPayload addBaselineItem(EnergyCurvePoint baselineItem) {
    if (this.baseline == null) {
      this.baseline = new ArrayList<>();
    }
    this.baseline.add(baselineItem);
    return this;
  }

  /**
   * Get baseline
   *
   * @return baseline
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BASELINE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<EnergyCurvePoint> getBaseline() {
    return baseline;
  }

  @JsonProperty(JSON_PROPERTY_BASELINE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBaseline(List<EnergyCurvePoint> baseline) {
    this.baseline = baseline;
  }

  public LocationEnergyUsagePlanReportPayload flexibility(List<EnergyCurvePoint> flexibility) {

    this.flexibility = flexibility;
    return this;
  }

  public LocationEnergyUsagePlanReportPayload addFlexibilityItem(EnergyCurvePoint flexibilityItem) {
    if (this.flexibility == null) {
      this.flexibility = new ArrayList<>();
    }
    this.flexibility.add(flexibilityItem);
    return this;
  }

  /**
   * Get flexibility
   *
   * @return flexibility
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FLEXIBILITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<EnergyCurvePoint> getFlexibility() {
    return flexibility;
  }

  @JsonProperty(JSON_PROPERTY_FLEXIBILITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFlexibility(List<EnergyCurvePoint> flexibility) {
    this.flexibility = flexibility;
  }

  @Override
  public LocationEnergyUsagePlanReportPayload payloadType(SparkReportPayloadType payloadType) {
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
    LocationEnergyUsagePlanReportPayload locationEnergyUsagePlanReportPayload =
        (LocationEnergyUsagePlanReportPayload) o;
    return Objects.equals(this.locationId, locationEnergyUsagePlanReportPayload.locationId)
        && Objects.equals(this.meterPointId, locationEnergyUsagePlanReportPayload.meterPointId)
        && Objects.equals(this.resolution, locationEnergyUsagePlanReportPayload.resolution)
        && Objects.equals(this.baseline, locationEnergyUsagePlanReportPayload.baseline)
        && Objects.equals(this.flexibility, locationEnergyUsagePlanReportPayload.flexibility)
        && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        locationId, meterPointId, resolution, baseline, flexibility, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationEnergyUsagePlanReportPayload {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    meterPointId: ").append(toIndentedString(meterPointId)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    baseline: ").append(toIndentedString(baseline)).append("\n");
    sb.append("    flexibility: ").append(toIndentedString(flexibility)).append("\n");
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
