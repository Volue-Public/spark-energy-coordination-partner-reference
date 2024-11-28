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


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Gets or Sets NotificationType */
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