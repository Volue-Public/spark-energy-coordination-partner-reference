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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** SimulatePriceCurveEventRequest */
@JsonPropertyOrder({
  SimulatePriceCurveEventRequest.JSON_PROPERTY_TARGETS,
  SimulatePriceCurveEventRequest.JSON_PROPERTY_PRICE_CURVE_DELTA,
  SimulatePriceCurveEventRequest.JSON_PROPERTY_PRICE_AREA
})
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.9.0-SNAPSHOT")
public class SimulatePriceCurveEventRequest {
  public static final String JSON_PROPERTY_TARGETS = "targets";
  private JsonNullable<List<PriceCurveTarget>> targets =
      JsonNullable.<List<PriceCurveTarget>>undefined();

  public static final String JSON_PROPERTY_PRICE_CURVE_DELTA = "priceCurveDelta";
  private PriceCurve priceCurveDelta;

  public static final String JSON_PROPERTY_PRICE_AREA = "priceArea";
  private PriceArea priceArea;

  public SimulatePriceCurveEventRequest() {}

  public SimulatePriceCurveEventRequest targets(List<PriceCurveTarget> targets) {
    this.targets = JsonNullable.<List<PriceCurveTarget>>of(targets);

    return this;
  }

  public SimulatePriceCurveEventRequest addTargetsItem(PriceCurveTarget targetsItem) {
    if (this.targets == null || !this.targets.isPresent()) {
      this.targets = JsonNullable.<List<PriceCurveTarget>>of(new ArrayList<>());
    }
    try {
      this.targets.get().add(targetsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Get targets
   *
   * @return targets
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<PriceCurveTarget> getTargets() {
    return targets.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TARGETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<PriceCurveTarget>> getTargets_JsonNullable() {
    return targets;
  }

  @JsonProperty(JSON_PROPERTY_TARGETS)
  public void setTargets_JsonNullable(JsonNullable<List<PriceCurveTarget>> targets) {
    this.targets = targets;
  }

  public void setTargets(List<PriceCurveTarget> targets) {
    this.targets = JsonNullable.<List<PriceCurveTarget>>of(targets);
  }

  public SimulatePriceCurveEventRequest priceCurveDelta(PriceCurve priceCurveDelta) {

    this.priceCurveDelta = priceCurveDelta;
    return this;
  }

  /**
   * Get priceCurveDelta
   *
   * @return priceCurveDelta
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRICE_CURVE_DELTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public PriceCurve getPriceCurveDelta() {
    return priceCurveDelta;
  }

  @JsonProperty(JSON_PROPERTY_PRICE_CURVE_DELTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceCurveDelta(PriceCurve priceCurveDelta) {
    this.priceCurveDelta = priceCurveDelta;
  }

  public SimulatePriceCurveEventRequest priceArea(PriceArea priceArea) {

    this.priceArea = priceArea;
    return this;
  }

  /**
   * Get priceArea
   *
   * @return priceArea
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRICE_AREA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public PriceArea getPriceArea() {
    return priceArea;
  }

  @JsonProperty(JSON_PROPERTY_PRICE_AREA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceArea(PriceArea priceArea) {
    this.priceArea = priceArea;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimulatePriceCurveEventRequest simulatePriceCurveEventRequest =
        (SimulatePriceCurveEventRequest) o;
    return equalsNullable(this.targets, simulatePriceCurveEventRequest.targets)
        && Objects.equals(this.priceCurveDelta, simulatePriceCurveEventRequest.priceCurveDelta)
        && Objects.equals(this.priceArea, simulatePriceCurveEventRequest.priceArea);
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
    return Objects.hash(hashCodeNullable(targets), priceCurveDelta, priceArea);
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
    sb.append("class SimulatePriceCurveEventRequest {\n");
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
