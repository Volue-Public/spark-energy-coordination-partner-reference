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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** PriceCurve */
@JsonPropertyOrder({
  PriceCurve.JSON_PROPERTY_POINTS,
  PriceCurve.JSON_PROPERTY_ENERGY_UNIT,
  PriceCurve.JSON_PROPERTY_CURRENCY,
  PriceCurve.JSON_PROPERTY_RESOLUTION
})
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.12.0")
public class PriceCurve {
  public static final String JSON_PROPERTY_POINTS = "points";
  @jakarta.annotation.Nullable private List<PriceCurvePoint> points = new ArrayList<>();

  public static final String JSON_PROPERTY_ENERGY_UNIT = "energyUnit";
  @jakarta.annotation.Nullable private EnergyUnit energyUnit;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  @jakarta.annotation.Nullable private Currency currency;

  public static final String JSON_PROPERTY_RESOLUTION = "resolution";
  @jakarta.annotation.Nullable private String resolution;

  public PriceCurve() {}

  public PriceCurve points(@jakarta.annotation.Nullable List<PriceCurvePoint> points) {

    this.points = points;
    return this;
  }

  public PriceCurve addPointsItem(PriceCurvePoint pointsItem) {
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
  public List<PriceCurvePoint> getPoints() {
    return points;
  }

  @JsonProperty(JSON_PROPERTY_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPoints(@jakarta.annotation.Nullable List<PriceCurvePoint> points) {
    this.points = points;
  }

  public PriceCurve energyUnit(@jakarta.annotation.Nullable EnergyUnit energyUnit) {

    this.energyUnit = energyUnit;
    return this;
  }

  /**
   * Get energyUnit
   *
   * @return energyUnit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENERGY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EnergyUnit getEnergyUnit() {
    return energyUnit;
  }

  @JsonProperty(JSON_PROPERTY_ENERGY_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnergyUnit(@jakarta.annotation.Nullable EnergyUnit energyUnit) {
    this.energyUnit = energyUnit;
  }

  public PriceCurve currency(@jakarta.annotation.Nullable Currency currency) {

    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   *
   * @return currency
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Currency getCurrency() {
    return currency;
  }

  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(@jakarta.annotation.Nullable Currency currency) {
    this.currency = currency;
  }

  public PriceCurve resolution(@jakarta.annotation.Nullable String resolution) {

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
  public void setResolution(@jakarta.annotation.Nullable String resolution) {
    this.resolution = resolution;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceCurve priceCurve = (PriceCurve) o;
    return Objects.equals(this.points, priceCurve.points)
        && Objects.equals(this.energyUnit, priceCurve.energyUnit)
        && Objects.equals(this.currency, priceCurve.currency)
        && Objects.equals(this.resolution, priceCurve.resolution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(points, energyUnit, currency, resolution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceCurve {\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    energyUnit: ").append(toIndentedString(energyUnit)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
