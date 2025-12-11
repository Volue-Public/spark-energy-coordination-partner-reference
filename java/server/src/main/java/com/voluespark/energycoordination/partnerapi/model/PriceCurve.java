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
import org.springframework.lang.Nullable;

/** PriceCurve */
@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    comments = "Generator version: 7.17.0")
public class PriceCurve {

  @Valid private List<@Valid PriceCurvePoint> points = new ArrayList<>();

  private @Nullable EnergyUnit energyUnit;

  private @Nullable Currency currency;

  private @Nullable String resolution;

  public PriceCurve points(List<@Valid PriceCurvePoint> points) {
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
  @Valid
  @Schema(name = "points", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("points")
  public List<@Valid PriceCurvePoint> getPoints() {
    return points;
  }

  public void setPoints(List<@Valid PriceCurvePoint> points) {
    this.points = points;
  }

  public PriceCurve energyUnit(@Nullable EnergyUnit energyUnit) {
    this.energyUnit = energyUnit;
    return this;
  }

  /**
   * Get energyUnit
   *
   * @return energyUnit
   */
  @Valid
  @Schema(name = "energyUnit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("energyUnit")
  public @Nullable EnergyUnit getEnergyUnit() {
    return energyUnit;
  }

  public void setEnergyUnit(@Nullable EnergyUnit energyUnit) {
    this.energyUnit = energyUnit;
  }

  public PriceCurve currency(@Nullable Currency currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   *
   * @return currency
   */
  @Valid
  @Schema(name = "currency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currency")
  public @Nullable Currency getCurrency() {
    return currency;
  }

  public void setCurrency(@Nullable Currency currency) {
    this.currency = currency;
  }

  public PriceCurve resolution(@Nullable String resolution) {
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
  public @Nullable String getResolution() {
    return resolution;
  }

  public void setResolution(@Nullable String resolution) {
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
