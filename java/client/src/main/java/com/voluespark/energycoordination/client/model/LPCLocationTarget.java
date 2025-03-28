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

/** LPCLocationTarget */
@JsonPropertyOrder({
  LPCLocationTarget.JSON_PROPERTY_LOCATION,
  LPCLocationTarget.JSON_PROPERTY_POINTS
})
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.12.0")
public class LPCLocationTarget {
  public static final String JSON_PROPERTY_LOCATION = "location";
  @jakarta.annotation.Nullable private LocationTarget location;

  public static final String JSON_PROPERTY_POINTS = "points";

  @jakarta.annotation.Nullable
  private JsonNullable<List<LPCDataPoint>> points = JsonNullable.<List<LPCDataPoint>>undefined();

  public LPCLocationTarget() {}

  public LPCLocationTarget location(@jakarta.annotation.Nullable LocationTarget location) {

    this.location = location;
    return this;
  }

  /**
   * Get location
   *
   * @return location
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LocationTarget getLocation() {
    return location;
  }

  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocation(@jakarta.annotation.Nullable LocationTarget location) {
    this.location = location;
  }

  public LPCLocationTarget points(@jakarta.annotation.Nullable List<LPCDataPoint> points) {
    this.points = JsonNullable.<List<LPCDataPoint>>of(points);

    return this;
  }

  public LPCLocationTarget addPointsItem(LPCDataPoint pointsItem) {
    if (this.points == null || !this.points.isPresent()) {
      this.points = JsonNullable.<List<LPCDataPoint>>of(new ArrayList<>());
    }
    try {
      this.points.get().add(pointsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Get points
   *
   * @return points
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<LPCDataPoint> getPoints() {
    return points.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<LPCDataPoint>> getPoints_JsonNullable() {
    return points;
  }

  @JsonProperty(JSON_PROPERTY_POINTS)
  public void setPoints_JsonNullable(JsonNullable<List<LPCDataPoint>> points) {
    this.points = points;
  }

  public void setPoints(@jakarta.annotation.Nullable List<LPCDataPoint> points) {
    this.points = JsonNullable.<List<LPCDataPoint>>of(points);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LPCLocationTarget lpCLocationTarget = (LPCLocationTarget) o;
    return Objects.equals(this.location, lpCLocationTarget.location)
        && equalsNullable(this.points, lpCLocationTarget.points);
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
    return Objects.hash(location, hashCodeNullable(points));
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
    sb.append("class LPCLocationTarget {\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
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
