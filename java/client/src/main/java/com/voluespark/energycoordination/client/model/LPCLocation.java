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
import java.util.Objects;

/** LPCLocation */
@JsonPropertyOrder({
  LPCLocation.JSON_PROPERTY_LOCATION_ID,
  LPCLocation.JSON_PROPERTY_METER_POINT_ID
})
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.12.0")
public class LPCLocation {
  public static final String JSON_PROPERTY_LOCATION_ID = "locationId";
  @jakarta.annotation.Nonnull private String locationId;

  public static final String JSON_PROPERTY_METER_POINT_ID = "meterPointId";
  @jakarta.annotation.Nonnull private String meterPointId;

  public LPCLocation() {}

  public LPCLocation locationId(@jakarta.annotation.Nonnull String locationId) {

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

  public LPCLocation meterPointId(@jakarta.annotation.Nonnull String meterPointId) {

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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LPCLocation lpCLocation = (LPCLocation) o;
    return Objects.equals(this.locationId, lpCLocation.locationId)
        && Objects.equals(this.meterPointId, lpCLocation.meterPointId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locationId, meterPointId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LPCLocation {\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    meterPointId: ").append(toIndentedString(meterPointId)).append("\n");
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
