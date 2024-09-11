package com.voluespark.energycoordination.partnerapi.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;

/** Gets or Sets NotificationType */
@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    comments = "Generator version: 7.9.0-SNAPSHOT")
public enum NotificationType {
  UNKNOWN("Unknown"),

  PRICE_CURVE_CREATED("PriceCurveCreated"),

  USER_ELIGIBILITY_UPDATED("UserEligibilityUpdated"),

  LOCATION_LPC_REQUESTED("LocationLPCRequested"),

  RESOURCE_LPC_REQUESTED("ResourceLPCRequested");

  private String value;

  NotificationType(String value) {
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
  public static NotificationType fromValue(String value) {
    for (NotificationType b : NotificationType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
