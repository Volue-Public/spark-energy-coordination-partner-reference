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

/** PostLocationsBatchRequest */
@JsonPropertyOrder({PostLocationsBatchRequest.JSON_PROPERTY_LOCATIONS})
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.12.0")
public class PostLocationsBatchRequest {
  public static final String JSON_PROPERTY_LOCATIONS = "locations";

  @jakarta.annotation.Nonnull
  private List<PostLocationWithUserRequest> locations = new ArrayList<>();

  public PostLocationsBatchRequest() {}

  public PostLocationsBatchRequest locations(
      @jakarta.annotation.Nonnull List<PostLocationWithUserRequest> locations) {

    this.locations = locations;
    return this;
  }

  public PostLocationsBatchRequest addLocationsItem(PostLocationWithUserRequest locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<>();
    }
    this.locations.add(locationsItem);
    return this;
  }

  /**
   * Get locations
   *
   * @return locations
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<PostLocationWithUserRequest> getLocations() {
    return locations;
  }

  @JsonProperty(JSON_PROPERTY_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLocations(
      @jakarta.annotation.Nonnull List<PostLocationWithUserRequest> locations) {
    this.locations = locations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostLocationsBatchRequest postLocationsBatchRequest = (PostLocationsBatchRequest) o;
    return Objects.equals(this.locations, postLocationsBatchRequest.locations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostLocationsBatchRequest {\n");
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
