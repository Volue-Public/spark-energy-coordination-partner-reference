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
  PostReportRequestPayloadsInner.JSON_PROPERTY_DECLINED_TARGETS,
  PostReportRequestPayloadsInner.JSON_PROPERTY_BASELINE,
  PostReportRequestPayloadsInner.JSON_PROPERTY_FLEXIBILITY
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
@JsonSubTypes({
  @JsonSubTypes.Type(value = EnergyUsageReportPayload.class, name = "EnergyUsage"),
  @JsonSubTypes.Type(value = LocationEnergyUsageReportPayload.class, name = "LocationEnergyUsage"),
  @JsonSubTypes.Type(
      value = LocationEnergyUsagePlanReportPayload.class,
      name = "LocationEnergyUsagePlan"),
  @JsonSubTypes.Type(
      value = LocationLPCAcknowledgmentReportPayload.class,
      name = "LocationLPCAcknowledgement"),
  @JsonSubTypes.Type(
      value = ResourceLPCAcknowledgmentReportPayload.class,
      name = "ResourceLPCAcknowledgement"),
  @JsonSubTypes.Type(value = EnergyUsageReportPayload.class, name = "EnergyUsageReportPayload"),
  @JsonSubTypes.Type(
      value = LocationEnergyUsagePlanReportPayload.class,
      name = "LocationEnergyUsagePlanReportPayload"),
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
  @jakarta.annotation.Nonnull private String locationId;

  public static final String JSON_PROPERTY_METER_POINT_ID = "meterPointId";
  @jakarta.annotation.Nonnull private String meterPointId;

  public static final String JSON_PROPERTY_POINTS = "points";
  @jakarta.annotation.Nullable private List<EnergyCurvePoint> points = new ArrayList<>();

  public static final String JSON_PROPERTY_RESOLUTION = "resolution";
  @jakarta.annotation.Nonnull private String resolution;

  public static final String JSON_PROPERTY_PAYLOAD_TYPE = "payloadType";
  @jakarta.annotation.Nullable private SparkReportPayloadType payloadType;

  public static final String JSON_PROPERTY_ACKNOWLEDGED_TARGETS = "acknowledgedTargets";
  @jakarta.annotation.Nullable private List<LPCLocation> acknowledgedTargets = new ArrayList<>();

  public static final String JSON_PROPERTY_DECLINED_TARGETS = "declinedTargets";
  @jakarta.annotation.Nullable private List<LPCLocation> declinedTargets = new ArrayList<>();

  public static final String JSON_PROPERTY_BASELINE = "baseline";
  @jakarta.annotation.Nonnull private List<EnergyCurvePoint> baseline = new ArrayList<>();

  public static final String JSON_PROPERTY_FLEXIBILITY = "flexibility";
  @jakarta.annotation.Nonnull private List<EnergyCurvePoint> flexibility = new ArrayList<>();

  public PostReportRequestPayloadsInner() {}

  public PostReportRequestPayloadsInner locationId(@jakarta.annotation.Nonnull String locationId) {

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
  public void setLocationId(@jakarta.annotation.Nonnull String locationId) {
    this.locationId = locationId;
  }

  public PostReportRequestPayloadsInner meterPointId(
      @jakarta.annotation.Nonnull String meterPointId) {

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
  public void setMeterPointId(@jakarta.annotation.Nonnull String meterPointId) {
    this.meterPointId = meterPointId;
  }

  public PostReportRequestPayloadsInner points(
      @jakarta.annotation.Nullable List<EnergyCurvePoint> points) {

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
  public void setPoints(@jakarta.annotation.Nullable List<EnergyCurvePoint> points) {
    this.points = points;
  }

  public PostReportRequestPayloadsInner resolution(@jakarta.annotation.Nonnull String resolution) {

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

  public PostReportRequestPayloadsInner payloadType(
      @jakarta.annotation.Nullable SparkReportPayloadType payloadType) {

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
  public void setPayloadType(@jakarta.annotation.Nullable SparkReportPayloadType payloadType) {
    this.payloadType = payloadType;
  }

  public PostReportRequestPayloadsInner acknowledgedTargets(
      @jakarta.annotation.Nullable List<LPCLocation> acknowledgedTargets) {

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
  public void setAcknowledgedTargets(
      @jakarta.annotation.Nullable List<LPCLocation> acknowledgedTargets) {
    this.acknowledgedTargets = acknowledgedTargets;
  }

  public PostReportRequestPayloadsInner declinedTargets(
      @jakarta.annotation.Nullable List<LPCLocation> declinedTargets) {

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
  public void setDeclinedTargets(@jakarta.annotation.Nullable List<LPCLocation> declinedTargets) {
    this.declinedTargets = declinedTargets;
  }

  public PostReportRequestPayloadsInner baseline(
      @jakarta.annotation.Nonnull List<EnergyCurvePoint> baseline) {

    this.baseline = baseline;
    return this;
  }

  public PostReportRequestPayloadsInner addBaselineItem(EnergyCurvePoint baselineItem) {
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
  public void setBaseline(@jakarta.annotation.Nonnull List<EnergyCurvePoint> baseline) {
    this.baseline = baseline;
  }

  public PostReportRequestPayloadsInner flexibility(
      @jakarta.annotation.Nonnull List<EnergyCurvePoint> flexibility) {

    this.flexibility = flexibility;
    return this;
  }

  public PostReportRequestPayloadsInner addFlexibilityItem(EnergyCurvePoint flexibilityItem) {
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
  public void setFlexibility(@jakarta.annotation.Nonnull List<EnergyCurvePoint> flexibility) {
    this.flexibility = flexibility;
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
        && Objects.equals(this.declinedTargets, postReportRequestPayloadsInner.declinedTargets)
        && Objects.equals(this.baseline, postReportRequestPayloadsInner.baseline)
        && Objects.equals(this.flexibility, postReportRequestPayloadsInner.flexibility);
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
        declinedTargets,
        baseline,
        flexibility);
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
