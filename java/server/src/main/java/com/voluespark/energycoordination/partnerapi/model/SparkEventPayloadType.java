package com.voluespark.energycoordination.partnerapi.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;

/** Gets or Sets SparkEventPayloadType */
@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    comments = "Generator version: 7.12.0")
public enum SparkEventPayloadType {
  UNKNOWN("Unknown"),

  USER_ELIGIBILITY("UserEligibility"),

  PRICE_CURVE("PriceCurve"),

  LOCATION_LPC("LocationLPC"),

  RESOURCE_LPC("ResourceLPC"),

  LPC_RESERVATION("LPCReservation");

  private String value;

  SparkEventPayloadType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SparkEventPayloadType fromValue(String value) {
    for (SparkEventPayloadType b : SparkEventPayloadType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
