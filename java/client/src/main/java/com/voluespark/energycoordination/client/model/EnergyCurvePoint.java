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
import java.time.OffsetDateTime;
import java.util.Objects;

/** EnergyCurvePoint */
@JsonPropertyOrder({
  EnergyCurvePoint.JSON_PROPERTY_TIMESTAMP,
  EnergyCurvePoint.JSON_PROPERTY_KILO_WATT_HOURS
})
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.9.0-SNAPSHOT")
public class EnergyCurvePoint {
  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private OffsetDateTime timestamp;

  public static final String JSON_PROPERTY_KILO_WATT_HOURS = "kiloWattHours";
  private Double kiloWattHours;

  public EnergyCurvePoint() {}

  public EnergyCurvePoint timestamp(OffsetDateTime timestamp) {

    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   *
   * @return timestamp
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public EnergyCurvePoint kiloWattHours(Double kiloWattHours) {

    this.kiloWattHours = kiloWattHours;
    return this;
  }

  /**
   * Get kiloWattHours
   *
   * @return kiloWattHours
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KILO_WATT_HOURS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getKiloWattHours() {
    return kiloWattHours;
  }

  @JsonProperty(JSON_PROPERTY_KILO_WATT_HOURS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKiloWattHours(Double kiloWattHours) {
    this.kiloWattHours = kiloWattHours;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnergyCurvePoint energyCurvePoint = (EnergyCurvePoint) o;
    return Objects.equals(this.timestamp, energyCurvePoint.timestamp)
        && Objects.equals(this.kiloWattHours, energyCurvePoint.kiloWattHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, kiloWattHours);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnergyCurvePoint {\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    kiloWattHours: ").append(toIndentedString(kiloWattHours)).append("\n");
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