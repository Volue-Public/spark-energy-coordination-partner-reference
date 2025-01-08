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

/** ResourceLPCPayload */
@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    comments = "Generator version: 7.9.0-SNAPSHOT")
public class ResourceLPCPayload extends SparkEventPayload {

  @Valid private List<@Valid ResourceLPCTarget> targets = new ArrayList<>();

  public ResourceLPCPayload targets(List<@Valid ResourceLPCTarget> targets) {
    this.targets = targets;
    return this;
  }

  public ResourceLPCPayload addTargetsItem(ResourceLPCTarget targetsItem) {
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
  @Valid
  @Schema(name = "targets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targets")
  public List<@Valid ResourceLPCTarget> getTargets() {
    return targets;
  }

  public void setTargets(List<@Valid ResourceLPCTarget> targets) {
    this.targets = targets;
  }

  public ResourceLPCPayload payloadType(SparkEventPayloadType payloadType) {
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
    ResourceLPCPayload resourceLPCPayload = (ResourceLPCPayload) o;
    return Objects.equals(this.targets, resourceLPCPayload.targets) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targets, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceLPCPayload {\n");
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
