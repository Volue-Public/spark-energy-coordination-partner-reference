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

/** ResourceLPCAcknowledgmentReportPayload */
@JsonPropertyOrder({
  ResourceLPCAcknowledgmentReportPayload.JSON_PROPERTY_ACKNOWLEDGED_TARGETS,
  ResourceLPCAcknowledgmentReportPayload.JSON_PROPERTY_DECLINED_TARGETS
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
public class ResourceLPCAcknowledgmentReportPayload extends SparkReportPayload {
  public static final String JSON_PROPERTY_ACKNOWLEDGED_TARGETS = "acknowledgedTargets";
  @jakarta.annotation.Nullable private List<LPCResource> acknowledgedTargets = new ArrayList<>();

  public static final String JSON_PROPERTY_DECLINED_TARGETS = "declinedTargets";
  @jakarta.annotation.Nullable private List<LPCResource> declinedTargets = new ArrayList<>();

  public ResourceLPCAcknowledgmentReportPayload() {}

  public ResourceLPCAcknowledgmentReportPayload acknowledgedTargets(
      @jakarta.annotation.Nullable List<LPCResource> acknowledgedTargets) {

    this.acknowledgedTargets = acknowledgedTargets;
    return this;
  }

  public ResourceLPCAcknowledgmentReportPayload addAcknowledgedTargetsItem(
      LPCResource acknowledgedTargetsItem) {
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
  public List<LPCResource> getAcknowledgedTargets() {
    return acknowledgedTargets;
  }

  @JsonProperty(JSON_PROPERTY_ACKNOWLEDGED_TARGETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAcknowledgedTargets(
      @jakarta.annotation.Nullable List<LPCResource> acknowledgedTargets) {
    this.acknowledgedTargets = acknowledgedTargets;
  }

  public ResourceLPCAcknowledgmentReportPayload declinedTargets(
      @jakarta.annotation.Nullable List<LPCResource> declinedTargets) {

    this.declinedTargets = declinedTargets;
    return this;
  }

  public ResourceLPCAcknowledgmentReportPayload addDeclinedTargetsItem(
      LPCResource declinedTargetsItem) {
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
  public List<LPCResource> getDeclinedTargets() {
    return declinedTargets;
  }

  @JsonProperty(JSON_PROPERTY_DECLINED_TARGETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeclinedTargets(@jakarta.annotation.Nullable List<LPCResource> declinedTargets) {
    this.declinedTargets = declinedTargets;
  }

  @Override
  public ResourceLPCAcknowledgmentReportPayload payloadType(
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
    ResourceLPCAcknowledgmentReportPayload resourceLPCAcknowledgmentReportPayload =
        (ResourceLPCAcknowledgmentReportPayload) o;
    return Objects.equals(
            this.acknowledgedTargets, resourceLPCAcknowledgmentReportPayload.acknowledgedTargets)
        && Objects.equals(
            this.declinedTargets, resourceLPCAcknowledgmentReportPayload.declinedTargets)
        && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acknowledgedTargets, declinedTargets, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceLPCAcknowledgmentReportPayload {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
