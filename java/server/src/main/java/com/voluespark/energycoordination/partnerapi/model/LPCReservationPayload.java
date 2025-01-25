package com.voluespark.energycoordination.partnerapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** LPCReservationPayload */
@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    comments = "Generator version: 7.9.0-SNAPSHOT")
public class LPCReservationPayload extends SparkEventPayload {

  @Valid private List<@Valid LocationLPCTarget> targets = new ArrayList<>();

  public LPCReservationPayload() {
    super();
  }

  /** Constructor with only required parameters */
  public LPCReservationPayload(
      List<@Valid LocationLPCTarget> targets, SparkEventPayloadType payloadType) {
    super(payloadType);
    this.targets = targets;
  }

  public LPCReservationPayload targets(List<@Valid LocationLPCTarget> targets) {
    this.targets = targets;
    return this;
  }

  public LPCReservationPayload addTargetsItem(LocationLPCTarget targetsItem) {
    if (this.targets == null) {
      this.targets = new ArrayList<>();
    }
    this.targets.add(targetsItem);
    return this;
  }

  /**
   * Get targets
   *
   * @return targets
   */
  @NotNull
  @Valid
  @Schema(name = "targets", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("targets")
  public List<@Valid LocationLPCTarget> getTargets() {
    return targets;
  }

  public void setTargets(List<@Valid LocationLPCTarget> targets) {
    this.targets = targets;
  }

  public LPCReservationPayload payloadType(SparkEventPayloadType payloadType) {
    super.payloadType(payloadType);
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LPCReservationPayload lpCReservationPayload = (LPCReservationPayload) o;
    return Objects.equals(this.targets, lpCReservationPayload.targets) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targets, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LPCReservationPayload {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
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
