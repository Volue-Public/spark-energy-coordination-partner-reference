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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** EnergyUsageReportPayload */
@JsonPropertyOrder({
  EnergyUsageReportPayload.JSON_PROPERTY_RESOURCE_ID,
  EnergyUsageReportPayload.JSON_PROPERTY_LOCATION_ID,
  EnergyUsageReportPayload.JSON_PROPERTY_METER_POINT_ID,
  EnergyUsageReportPayload.JSON_PROPERTY_POINTS,
  EnergyUsageReportPayload.JSON_PROPERTY_RESOLUTION,
  EnergyUsageReportPayload.JSON_PROPERTY_CURVE_POINTS
})
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.12.0")
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
public class EnergyUsageReportPayload extends SparkReportPayload {
  public static final String JSON_PROPERTY_RESOURCE_ID = "resourceId";
  @jakarta.annotation.Nonnull private String resourceId;

  public static final String JSON_PROPERTY_LOCATION_ID = "locationId";

  @jakarta.annotation.Nullable
  private JsonNullable<String> locationId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_METER_POINT_ID = "meterPointId";

  @jakarta.annotation.Nullable
  private JsonNullable<String> meterPointId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_POINTS = "points";
  @jakarta.annotation.Nullable private List<EnergyCurvePoint> points = new ArrayList<>();

  public static final String JSON_PROPERTY_RESOLUTION = "resolution";
  @jakarta.annotation.Nonnull private String resolution;

  public static final String JSON_PROPERTY_CURVE_POINTS = "curvePoints";

  @jakarta.annotation.Nullable
  private JsonNullable<List<EnergyCurvePoint>> curvePoints =
      JsonNullable.<List<EnergyCurvePoint>>undefined();

  public EnergyUsageReportPayload() {}

  public EnergyUsageReportPayload resourceId(@jakarta.annotation.Nonnull String resourceId) {

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

  public EnergyUsageReportPayload locationId(@jakarta.annotation.Nullable String locationId) {
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

  public EnergyUsageReportPayload meterPointId(@jakarta.annotation.Nullable String meterPointId) {
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

  public EnergyUsageReportPayload points(
      @jakarta.annotation.Nullable List<EnergyCurvePoint> points) {

    this.points = points;
    return this;
  }

  public EnergyUsageReportPayload addPointsItem(EnergyCurvePoint pointsItem) {
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
  public void setPoints(@jakarta.annotation.Nullable List<EnergyCurvePoint> points) {
    this.points = points;
  }

  public EnergyUsageReportPayload resolution(@jakarta.annotation.Nonnull String resolution) {

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
  public void setResolution(@jakarta.annotation.Nonnull String resolution) {
    this.resolution = resolution;
  }

  public EnergyUsageReportPayload curvePoints(
      @jakarta.annotation.Nullable List<EnergyCurvePoint> curvePoints) {
    this.curvePoints = JsonNullable.<List<EnergyCurvePoint>>of(curvePoints);

    return this;
  }

  public EnergyUsageReportPayload addCurvePointsItem(EnergyCurvePoint curvePointsItem) {
    if (this.curvePoints == null || !this.curvePoints.isPresent()) {
      this.curvePoints = JsonNullable.<List<EnergyCurvePoint>>of(new ArrayList<>());
    }
    try {
      this.curvePoints.get().add(curvePointsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Get curvePoints
   *
   * @return curvePoints
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<EnergyCurvePoint> getCurvePoints() {
    return curvePoints.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CURVE_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<EnergyCurvePoint>> getCurvePoints_JsonNullable() {
    return curvePoints;
  }

  @JsonProperty(JSON_PROPERTY_CURVE_POINTS)
  public void setCurvePoints_JsonNullable(JsonNullable<List<EnergyCurvePoint>> curvePoints) {
    this.curvePoints = curvePoints;
  }

  public void setCurvePoints(@jakarta.annotation.Nullable List<EnergyCurvePoint> curvePoints) {
    this.curvePoints = JsonNullable.<List<EnergyCurvePoint>>of(curvePoints);
  }

  @Override
  public EnergyUsageReportPayload payloadType(
      @jakarta.annotation.Nullable SparkReportPayloadType payloadType) {
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
    EnergyUsageReportPayload energyUsageReportPayload = (EnergyUsageReportPayload) o;
    return Objects.equals(this.resourceId, energyUsageReportPayload.resourceId)
        && equalsNullable(this.locationId, energyUsageReportPayload.locationId)
        && equalsNullable(this.meterPointId, energyUsageReportPayload.meterPointId)
        && Objects.equals(this.points, energyUsageReportPayload.points)
        && Objects.equals(this.resolution, energyUsageReportPayload.resolution)
        && equalsNullable(this.curvePoints, energyUsageReportPayload.curvePoints)
        && super.equals(o);
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
        hashCodeNullable(locationId),
        hashCodeNullable(meterPointId),
        points,
        resolution,
        hashCodeNullable(curvePoints),
        super.hashCode());
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
    sb.append("class EnergyUsageReportPayload {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    meterPointId: ").append(toIndentedString(meterPointId)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    curvePoints: ").append(toIndentedString(curvePoints)).append("\n");
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
