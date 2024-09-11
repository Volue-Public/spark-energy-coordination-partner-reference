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

/** PriceCurvePayload */
@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    comments = "Generator version: 7.9.0-SNAPSHOT")
public class PriceCurvePayload extends SparkEventPayload {

  @Valid private List<@Valid PriceCurveTarget> targets = new ArrayList<>();

  private PriceCurve priceCurveDelta;

  private PriceArea priceArea;

  public PriceCurvePayload targets(List<@Valid PriceCurveTarget> targets) {
    this.targets = targets;
    return this;
  }

  public PriceCurvePayload addTargetsItem(PriceCurveTarget targetsItem) {
    if (this.targets == null) {
      this.targets = new ArrayList<>();
    }
    this.targets.add(targetsItem);
    return this;
  }

  /**
   * Get targets
   *
   * @return targets
   */
  @Valid
  @Schema(name = "targets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targets")
  public List<@Valid PriceCurveTarget> getTargets() {
    return targets;
  }

  public void setTargets(List<@Valid PriceCurveTarget> targets) {
    this.targets = targets;
  }

  public PriceCurvePayload priceCurveDelta(PriceCurve priceCurveDelta) {
    this.priceCurveDelta = priceCurveDelta;
    return this;
  }

  /**
   * Get priceCurveDelta
   *
   * @return priceCurveDelta
   */
  @Valid
  @Schema(name = "priceCurveDelta", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priceCurveDelta")
  public PriceCurve getPriceCurveDelta() {
    return priceCurveDelta;
  }

  public void setPriceCurveDelta(PriceCurve priceCurveDelta) {
    this.priceCurveDelta = priceCurveDelta;
  }

  public PriceCurvePayload priceArea(PriceArea priceArea) {
    this.priceArea = priceArea;
    return this;
  }

  /**
   * Get priceArea
   *
   * @return priceArea
   */
  @Valid
  @Schema(name = "priceArea", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priceArea")
  public PriceArea getPriceArea() {
    return priceArea;
  }

  public void setPriceArea(PriceArea priceArea) {
    this.priceArea = priceArea;
  }

  public PriceCurvePayload payloadType(SparkEventPayloadType payloadType) {
    super.payloadType(payloadType);
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
    PriceCurvePayload priceCurvePayload = (PriceCurvePayload) o;
    return Objects.equals(this.targets, priceCurvePayload.targets)
        && Objects.equals(this.priceCurveDelta, priceCurvePayload.priceCurveDelta)
        && Objects.equals(this.priceArea, priceCurvePayload.priceArea)
        && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targets, priceCurveDelta, priceArea, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceCurvePayload {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
    sb.append("    priceCurveDelta: ").append(toIndentedString(priceCurveDelta)).append("\n");
    sb.append("    priceArea: ").append(toIndentedString(priceArea)).append("\n");
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
