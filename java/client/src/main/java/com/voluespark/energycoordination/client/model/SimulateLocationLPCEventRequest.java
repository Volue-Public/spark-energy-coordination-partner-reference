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

/** SimulateLocationLPCEventRequest */
@JsonPropertyOrder({SimulateLocationLPCEventRequest.JSON_PROPERTY_LOCATIONS})
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.12.0")
public class SimulateLocationLPCEventRequest {
  public static final String JSON_PROPERTY_LOCATIONS = "locations";

  @jakarta.annotation.Nullable
  private JsonNullable<List<LPCLocationTarget>> locations =
      JsonNullable.<List<LPCLocationTarget>>undefined();

  public SimulateLocationLPCEventRequest() {}

  public SimulateLocationLPCEventRequest locations(
      @jakarta.annotation.Nullable List<LPCLocationTarget> locations) {
    this.locations = JsonNullable.<List<LPCLocationTarget>>of(locations);

    return this;
  }

  public SimulateLocationLPCEventRequest addLocationsItem(LPCLocationTarget locationsItem) {
    if (this.locations == null || !this.locations.isPresent()) {
      this.locations = JsonNullable.<List<LPCLocationTarget>>of(new ArrayList<>());
    }
    try {
      this.locations.get().add(locationsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Get locations
   *
   * @return locations
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<LPCLocationTarget> getLocations() {
    return locations.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<LPCLocationTarget>> getLocations_JsonNullable() {
    return locations;
  }

  @JsonProperty(JSON_PROPERTY_LOCATIONS)
  public void setLocations_JsonNullable(JsonNullable<List<LPCLocationTarget>> locations) {
    this.locations = locations;
  }

  public void setLocations(@jakarta.annotation.Nullable List<LPCLocationTarget> locations) {
    this.locations = JsonNullable.<List<LPCLocationTarget>>of(locations);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimulateLocationLPCEventRequest simulateLocationLPCEventRequest =
        (SimulateLocationLPCEventRequest) o;
    return equalsNullable(this.locations, simulateLocationLPCEventRequest.locations);
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
    return Objects.hash(hashCodeNullable(locations));
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
    sb.append("class SimulateLocationLPCEventRequest {\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
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
