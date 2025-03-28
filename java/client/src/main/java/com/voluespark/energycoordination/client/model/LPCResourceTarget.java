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

/** LPCResourceTarget */
@JsonPropertyOrder({
  LPCResourceTarget.JSON_PROPERTY_RESOURCE,
  LPCResourceTarget.JSON_PROPERTY_POINTS
})
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.12.0")
public class LPCResourceTarget {
  public static final String JSON_PROPERTY_RESOURCE = "resource";
  @jakarta.annotation.Nullable private ResourceTarget resource;

  public static final String JSON_PROPERTY_POINTS = "points";

  @jakarta.annotation.Nullable
  private JsonNullable<List<LPCDataPoint>> points = JsonNullable.<List<LPCDataPoint>>undefined();

  public LPCResourceTarget() {}

  public LPCResourceTarget resource(@jakarta.annotation.Nullable ResourceTarget resource) {

    this.resource = resource;
    return this;
  }

  /**
   * Get resource
   *
   * @return resource
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ResourceTarget getResource() {
    return resource;
  }

  @JsonProperty(JSON_PROPERTY_RESOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResource(@jakarta.annotation.Nullable ResourceTarget resource) {
    this.resource = resource;
  }

  public LPCResourceTarget points(@jakarta.annotation.Nullable List<LPCDataPoint> points) {
    this.points = JsonNullable.<List<LPCDataPoint>>of(points);

    return this;
  }

  public LPCResourceTarget addPointsItem(LPCDataPoint pointsItem) {
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
    LPCResourceTarget lpCResourceTarget = (LPCResourceTarget) o;
    return Objects.equals(this.resource, lpCResourceTarget.resource)
        && equalsNullable(this.points, lpCResourceTarget.points);
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
    return Objects.hash(resource, hashCodeNullable(points));
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
    sb.append("class LPCResourceTarget {\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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
