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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** PostReportRequestPayloadsInner */
@JsonPropertyOrder({
  PostReportRequestPayloadsInner.JSON_PROPERTY_LOCATION_ID,
  PostReportRequestPayloadsInner.JSON_PROPERTY_METER_POINT_ID,
  PostReportRequestPayloadsInner.JSON_PROPERTY_POINTS,
  PostReportRequestPayloadsInner.JSON_PROPERTY_RESOLUTION,
  PostReportRequestPayloadsInner.JSON_PROPERTY_PAYLOAD_TYPE,
  PostReportRequestPayloadsInner.JSON_PROPERTY_ACKNOWLEDGED_TARGETS,
  PostReportRequestPayloadsInner.JSON_PROPERTY_DECLINED_TARGETS
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
@JsonSubTypes({
  @JsonSubTypes.Type(value = EnergyUsageReportPayload.class, name = "EnergyUsage"),
  @JsonSubTypes.Type(value = LocationEnergyUsageReportPayload.class, name = "LocationEnergyUsage"),
  @JsonSubTypes.Type(
      value = LocationLPCAcknowledgmentReportPayload.class,
      name = "LocationLPCAcknowledgement"),
  @JsonSubTypes.Type(
      value = ResourceLPCAcknowledgmentReportPayload.class,
      name = "ResourceLPCAcknowledgement"),
  @JsonSubTypes.Type(value = EnergyUsageReportPayload.class, name = "EnergyUsageReportPayload"),
  @JsonSubTypes.Type(
      value = LocationEnergyUsageReportPayload.class,
      name = "LocationEnergyUsageReportPayload"),
  @JsonSubTypes.Type(
      value = LocationLPCAcknowledgmentReportPayload.class,
      name = "LocationLPCAcknowledgmentReportPayload"),
  @JsonSubTypes.Type(
      value = ResourceLPCAcknowledgmentReportPayload.class,
      name = "ResourceLPCAcknowledgmentReportPayload"),
})
public class PostReportRequestPayloadsInner {
  public static final String JSON_PROPERTY_LOCATION_ID = "locationId";
  private String locationId;

  public static final String JSON_PROPERTY_METER_POINT_ID = "meterPointId";
  private String meterPointId;

  public static final String JSON_PROPERTY_POINTS = "points";
  private List<EnergyCurvePoint> points = new ArrayList<>();

  public static final String JSON_PROPERTY_RESOLUTION = "resolution";
  private String resolution;

  public static final String JSON_PROPERTY_PAYLOAD_TYPE = "payloadType";
  private SparkReportPayloadType payloadType;

  public static final String JSON_PROPERTY_ACKNOWLEDGED_TARGETS = "acknowledgedTargets";
  private List<LPCLocation> acknowledgedTargets = new ArrayList<>();

  public static final String JSON_PROPERTY_DECLINED_TARGETS = "declinedTargets";
  private List<LPCLocation> declinedTargets = new ArrayList<>();

  public PostReportRequestPayloadsInner() {}

  public PostReportRequestPayloadsInner locationId(String locationId) {

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

  public PostReportRequestPayloadsInner meterPointId(String meterPointId) {

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

  public PostReportRequestPayloadsInner points(List<EnergyCurvePoint> points) {

    this.points = points;
    return this;
  }

  public PostReportRequestPayloadsInner addPointsItem(EnergyCurvePoint pointsItem) {
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

  public PostReportRequestPayloadsInner resolution(String resolution) {

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

  public PostReportRequestPayloadsInner payloadType(SparkReportPayloadType payloadType) {

    this.payloadType = payloadType;
    return this;
  }

  /**
   * Get payloadType
   *
   * @return payloadType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYLOAD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SparkReportPayloadType getPayloadType() {
    return payloadType;
  }

  @JsonProperty(JSON_PROPERTY_PAYLOAD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayloadType(SparkReportPayloadType payloadType) {
    this.payloadType = payloadType;
  }

  public PostReportRequestPayloadsInner acknowledgedTargets(List<LPCLocation> acknowledgedTargets) {

    this.acknowledgedTargets = acknowledgedTargets;
    return this;
  }

  public PostReportRequestPayloadsInner addAcknowledgedTargetsItem(
      LPCLocation acknowledgedTargetsItem) {
    if (this.acknowledgedTargets == null) {
      this.acknowledgedTargets = new ArrayList<>();
    }
    this.acknowledgedTargets.add(acknowledgedTargetsItem);
    return this;
  }

  /**
   * Get acknowledgedTargets
   *
   * @return acknowledgedTargets
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACKNOWLEDGED_TARGETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LPCLocation> getAcknowledgedTargets() {
    return acknowledgedTargets;
  }

  @JsonProperty(JSON_PROPERTY_ACKNOWLEDGED_TARGETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAcknowledgedTargets(List<LPCLocation> acknowledgedTargets) {
    this.acknowledgedTargets = acknowledgedTargets;
  }

  public PostReportRequestPayloadsInner declinedTargets(List<LPCLocation> declinedTargets) {

    this.declinedTargets = declinedTargets;
    return this;
  }

  public PostReportRequestPayloadsInner addDeclinedTargetsItem(LPCLocation declinedTargetsItem) {
    if (this.declinedTargets == null) {
      this.declinedTargets = new ArrayList<>();
    }
    this.declinedTargets.add(declinedTargetsItem);
    return this;
  }

  /**
   * Get declinedTargets
   *
   * @return declinedTargets
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DECLINED_TARGETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LPCLocation> getDeclinedTargets() {
    return declinedTargets;
  }

  @JsonProperty(JSON_PROPERTY_DECLINED_TARGETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeclinedTargets(List<LPCLocation> declinedTargets) {
    this.declinedTargets = declinedTargets;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostReportRequestPayloadsInner postReportRequestPayloadsInner =
        (PostReportRequestPayloadsInner) o;
    return Objects.equals(this.locationId, postReportRequestPayloadsInner.locationId)
        && Objects.equals(this.meterPointId, postReportRequestPayloadsInner.meterPointId)
        && Objects.equals(this.points, postReportRequestPayloadsInner.points)
        && Objects.equals(this.resolution, postReportRequestPayloadsInner.resolution)
        && Objects.equals(this.payloadType, postReportRequestPayloadsInner.payloadType)
        && Objects.equals(
            this.acknowledgedTargets, postReportRequestPayloadsInner.acknowledgedTargets)
        && Objects.equals(this.declinedTargets, postReportRequestPayloadsInner.declinedTargets);
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
        locationId,
        meterPointId,
        points,
        resolution,
        payloadType,
        acknowledgedTargets,
        declinedTargets);
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
    sb.append("class PostReportRequestPayloadsInner {\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    meterPointId: ").append(toIndentedString(meterPointId)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    payloadType: ").append(toIndentedString(payloadType)).append("\n");
    sb.append("    acknowledgedTargets: ")
        .append(toIndentedString(acknowledgedTargets))
        .append("\n");
    sb.append("    declinedTargets: ").append(toIndentedString(declinedTargets)).append("\n");
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
