package com.voluespark.energycoordination.partnerapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;

/** LPCDataPoint */
@Generated(
    value = "org.openapitools.codegen.languages.SpringCodegen",
    comments = "Generator version: 7.12.0")
public class LPCDataPoint {

  private @Nullable Double maxPowerInKiloWatts;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime timestamp;

  public LPCDataPoint maxPowerInKiloWatts(Double maxPowerInKiloWatts) {
    this.maxPowerInKiloWatts = maxPowerInKiloWatts;
    return this;
  }

  /**
   * Get maxPowerInKiloWatts
   *
   * @return maxPowerInKiloWatts
   */
  @Schema(name = "maxPowerInKiloWatts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxPowerInKiloWatts")
  public Double getMaxPowerInKiloWatts() {
    return maxPowerInKiloWatts;
  }

  public void setMaxPowerInKiloWatts(Double maxPowerInKiloWatts) {
    this.maxPowerInKiloWatts = maxPowerInKiloWatts;
  }

  public LPCDataPoint timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   *
   * @return timestamp
   */
  @Valid
  @Schema(name = "timestamp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timestamp")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LPCDataPoint lpCDataPoint = (LPCDataPoint) o;
    return Objects.equals(this.maxPowerInKiloWatts, lpCDataPoint.maxPowerInKiloWatts)
        && Objects.equals(this.timestamp, lpCDataPoint.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxPowerInKiloWatts, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LPCDataPoint {\n");
    sb.append("    maxPowerInKiloWatts: ")
        .append(toIndentedString(maxPowerInKiloWatts))
        .append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
