package com.voluespark.energycoordination.partnerapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/** SparkEventPayload */
@JsonIgnoreProperties(
    value =
        "payloadType", // ignore manually set payloadType, it will be automatically generated by
                       // Jackson during serialization
    allowSetters = true // allows the payloadType to be set during deserialization
    )
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "payloadType",
    visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = LPCReservationPayload.class, name = "LPCReservation"),
  @JsonSubTypes.Type(value = LocationLPCPayload.class, name = "LocationLPC"),
  @JsonSubTypes.Type(value = PriceCurvePayload.class, name = "PriceCurve"),
  @JsonSubTypes.Type(value = ResourceLPCPayload.class, name = "ResourceLPC"),
  @JsonSubTypes.Type(value = UserEligibilityPayload.class, name = "UserEligibility")
})
@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    comments = "Generator version: 7.12.0")
public class SparkEventPayload {

  private SparkEventPayloadType payloadType;

  public SparkEventPayload() {
    super();
  }

  /** Constructor with only required parameters */
  public SparkEventPayload(SparkEventPayloadType payloadType) {
    this.payloadType = payloadType;
  }

  public SparkEventPayload payloadType(SparkEventPayloadType payloadType) {
    this.payloadType = payloadType;
    return this;
  }

  /**
   * Get payloadType
   *
   * @return payloadType
   */
  @NotNull
  @Valid
  @Schema(name = "payloadType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("payloadType")
  public SparkEventPayloadType getPayloadType() {
    return payloadType;
  }

  public void setPayloadType(SparkEventPayloadType payloadType) {
    this.payloadType = payloadType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SparkEventPayload sparkEventPayload = (SparkEventPayload) o;
    return Objects.equals(this.payloadType, sparkEventPayload.payloadType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payloadType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SparkEventPayload {\n");
    sb.append("    payloadType: ").append(toIndentedString(payloadType)).append("\n");
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
