package com.voluespark.energycoordination.partnerapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/** PriceCurveTarget */
@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    comments = "Generator version: 7.17.0")
public class PriceCurveTarget {

  private String resourceId;

  private String locationId;

  public PriceCurveTarget() {
    super();
  }

  /** Constructor with only required parameters */
  public PriceCurveTarget(String resourceId, String locationId) {
    this.resourceId = resourceId;
    this.locationId = locationId;
  }

  public PriceCurveTarget resourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * Get resourceId
   *
   * @return resourceId
   */
  @NotNull
  @Schema(name = "resourceId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("resourceId")
  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  public PriceCurveTarget locationId(String locationId) {
    this.locationId = locationId;
    return this;
  }

  /**
   * Get locationId
   *
   * @return locationId
   */
  @NotNull
  @Schema(name = "locationId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("locationId")
  public String getLocationId() {
    return locationId;
  }

  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PriceCurveTarget priceCurveTarget = (PriceCurveTarget) o;
    return Objects.equals(this.resourceId, priceCurveTarget.resourceId)
        && Objects.equals(this.locationId, priceCurveTarget.locationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId, locationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceCurveTarget {\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
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
