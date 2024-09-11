package com.voluespark.energycoordination.partnerapi.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;

/** Gets or Sets PriceArea */
@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    comments = "Generator version: 7.9.0-SNAPSHOT")
public enum PriceArea {
  UNKNOWN("Unknown"),

  NO1("NO1"),

  NO2("NO2"),

  NO3("NO3"),

  NO4("NO4"),

  NO5("NO5"),

  FI("FI"),

  DK1("DK1"),

  DK2("DK2"),

  SE1("SE1"),

  SE2("SE2"),

  SE3("SE3"),

  SE4("SE4");

  private String value;

  PriceArea(String value) {
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
  public static PriceArea fromValue(String value) {
    for (PriceArea b : PriceArea.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
