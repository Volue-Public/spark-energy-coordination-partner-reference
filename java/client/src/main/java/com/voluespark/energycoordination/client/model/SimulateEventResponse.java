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

/** SimulateEventResponse */
@JsonPropertyOrder({SimulateEventResponse.JSON_PROPERTY_SIMULATED_EVENT})
@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.12.0")
public class SimulateEventResponse {
  public static final String JSON_PROPERTY_SIMULATED_EVENT = "simulatedEvent";
  @jakarta.annotation.Nullable private GetEventResponse simulatedEvent;

  public SimulateEventResponse() {}

  public SimulateEventResponse simulatedEvent(
      @jakarta.annotation.Nullable GetEventResponse simulatedEvent) {

    this.simulatedEvent = simulatedEvent;
    return this;
  }

  /**
   * Get simulatedEvent
   *
   * @return simulatedEvent
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIMULATED_EVENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public GetEventResponse getSimulatedEvent() {
    return simulatedEvent;
  }

  @JsonProperty(JSON_PROPERTY_SIMULATED_EVENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSimulatedEvent(@jakarta.annotation.Nullable GetEventResponse simulatedEvent) {
    this.simulatedEvent = simulatedEvent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimulateEventResponse simulateEventResponse = (SimulateEventResponse) o;
    return Objects.equals(this.simulatedEvent, simulateEventResponse.simulatedEvent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(simulatedEvent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimulateEventResponse {\n");
    sb.append("    simulatedEvent: ").append(toIndentedString(simulatedEvent)).append("\n");
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
