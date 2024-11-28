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

/** PostLocationRequest */
@JsonPropertyOrder({
  PostLocationRequest.JSON_PROPERTY_LOCATION_ID,
  PostLocationRequest.JSON_PROPERTY_LOCATION_TYPE,
  PostLocationRequest.JSON_PROPERTY_COORDINATES,
  PostLocationRequest.JSON_PROPERTY_METER_POINT_ID,
  PostLocationRequest.JSON_PROPERTY_METER_POINT_IDS
})
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.9.0-SNAPSHOT")
public class PostLocationRequest {
  public static final String JSON_PROPERTY_LOCATION_ID = "locationId";
  private String locationId;

  public static final String JSON_PROPERTY_LOCATION_TYPE = "locationType";
  private LocationType locationType;

  public static final String JSON_PROPERTY_COORDINATES = "coordinates";
  private Coordinate coordinates;

  public static final String JSON_PROPERTY_METER_POINT_ID = "meterPointId";
  private JsonNullable<String> meterPointId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_METER_POINT_IDS = "meterPointIds";
  private JsonNullable<List<String>> meterPointIds = JsonNullable.<List<String>>undefined();

  public PostLocationRequest() {}

  public PostLocationRequest locationId(String locationId) {

    this.locationId = locationId;
    return this;
  }

  /**
   * Get locationId
   *
   * @return locationId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLocationId() {
    return locationId;
  }

  @JsonProperty(JSON_PROPERTY_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocationId(String locationId) {
    this.locationId = locationId;
  }

  public PostLocationRequest locationType(LocationType locationType) {

    this.locationType = locationType;
    return this;
  }

  /**
   * Get locationType
   *
   * @return locationType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOCATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LocationType getLocationType() {
    return locationType;
  }

  @JsonProperty(JSON_PROPERTY_LOCATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocationType(LocationType locationType) {
    this.locationType = locationType;
  }

  public PostLocationRequest coordinates(Coordinate coordinates) {

    this.coordinates = coordinates;
    return this;
  }

  /**
   * Get coordinates
   *
   * @return coordinates
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COORDINATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Coordinate getCoordinates() {
    return coordinates;
  }

  @JsonProperty(JSON_PROPERTY_COORDINATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCoordinates(Coordinate coordinates) {
    this.coordinates = coordinates;
  }

  public PostLocationRequest meterPointId(String meterPointId) {
    this.meterPointId = JsonNullable.<String>of(meterPointId);

    return this;
  }

  /**
   * Get meterPointId
   *
   * @return meterPointId
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getMeterPointId() {
    return meterPointId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_METER_POINT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getMeterPointId_JsonNullable() {
    return meterPointId;
  }

  @JsonProperty(JSON_PROPERTY_METER_POINT_ID)
  public void setMeterPointId_JsonNullable(JsonNullable<String> meterPointId) {
    this.meterPointId = meterPointId;
  }

  public void setMeterPointId(String meterPointId) {
    this.meterPointId = JsonNullable.<String>of(meterPointId);
  }

  public PostLocationRequest meterPointIds(List<String> meterPointIds) {
    this.meterPointIds = JsonNullable.<List<String>>of(meterPointIds);

    return this;
  }

  public PostLocationRequest addMeterPointIdsItem(String meterPointIdsItem) {
    if (this.meterPointIds == null || !this.meterPointIds.isPresent()) {
      this.meterPointIds = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.meterPointIds.get().add(meterPointIdsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Get meterPointIds
   *
   * @return meterPointIds
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<String> getMeterPointIds() {
    return meterPointIds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_METER_POINT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getMeterPointIds_JsonNullable() {
    return meterPointIds;
  }

  @JsonProperty(JSON_PROPERTY_METER_POINT_IDS)
  public void setMeterPointIds_JsonNullable(JsonNullable<List<String>> meterPointIds) {
    this.meterPointIds = meterPointIds;
  }

  public void setMeterPointIds(List<String> meterPointIds) {
    this.meterPointIds = JsonNullable.<List<String>>of(meterPointIds);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostLocationRequest postLocationRequest = (PostLocationRequest) o;
    return Objects.equals(this.locationId, postLocationRequest.locationId)
        && Objects.equals(this.locationType, postLocationRequest.locationType)
        && Objects.equals(this.coordinates, postLocationRequest.coordinates)
        && equalsNullable(this.meterPointId, postLocationRequest.meterPointId)
        && equalsNullable(this.meterPointIds, postLocationRequest.meterPointIds);
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
    return Objects.hash(
        locationId,
        locationType,
        coordinates,
        hashCodeNullable(meterPointId),
        hashCodeNullable(meterPointIds));
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
    sb.append("class PostLocationRequest {\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    meterPointId: ").append(toIndentedString(meterPointId)).append("\n");
    sb.append("    meterPointIds: ").append(toIndentedString(meterPointIds)).append("\n");
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