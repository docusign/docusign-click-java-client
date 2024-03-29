package com.docusign.click.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ClickwrapScheduledReacceptance.
 *
 */

public class ClickwrapScheduledReacceptance {
  @JsonProperty("recurrenceInterval")
  private Integer recurrenceInterval = null;

  @JsonProperty("recurrenceIntervalType")
  private String recurrenceIntervalType = null;

  @JsonProperty("startDateTime")
  private Object startDateTime = null;


  /**
   * recurrenceInterval.
   *
   * @return ClickwrapScheduledReacceptance
   **/
  public ClickwrapScheduledReacceptance recurrenceInterval(Integer recurrenceInterval) {
    this.recurrenceInterval = recurrenceInterval;
    return this;
  }

  /**
   * The time between recurrences specified in `recurrenceIntervalType` units.  The minimum and maximum values depend on `recurrenceIntervalType`:  - `days`: 1 - 365 - `weeks`: 1 - 52 - `months`: 1 - 12 - `years`: 1.
   * @return recurrenceInterval
   **/
  @Schema(description = "The time between recurrences specified in `recurrenceIntervalType` units.  The minimum and maximum values depend on `recurrenceIntervalType`:  - `days`: 1 - 365 - `weeks`: 1 - 52 - `months`: 1 - 12 - `years`: 1")
  public Integer getRecurrenceInterval() {
    return recurrenceInterval;
  }

  /**
   * setRecurrenceInterval.
   **/
  public void setRecurrenceInterval(Integer recurrenceInterval) {
    this.recurrenceInterval = recurrenceInterval;
  }


  /**
   * recurrenceIntervalType.
   *
   * @return ClickwrapScheduledReacceptance
   **/
  public ClickwrapScheduledReacceptance recurrenceIntervalType(String recurrenceIntervalType) {
    this.recurrenceIntervalType = recurrenceIntervalType;
    return this;
  }

  /**
   * The units of the `recurrenceInterval`. Must be one of:  - `days` - `weeks` - `month` - `years` .
   * @return recurrenceIntervalType
   **/
  @Schema(description = "The units of the `recurrenceInterval`. Must be one of:  - `days` - `weeks` - `month` - `years` ")
  public String getRecurrenceIntervalType() {
    return recurrenceIntervalType;
  }

  /**
   * setRecurrenceIntervalType.
   **/
  public void setRecurrenceIntervalType(String recurrenceIntervalType) {
    this.recurrenceIntervalType = recurrenceIntervalType;
  }


  /**
   * startDateTime.
   *
   * @return ClickwrapScheduledReacceptance
   **/
  public ClickwrapScheduledReacceptance startDateTime(Object startDateTime) {
    this.startDateTime = startDateTime;
    return this;
  }

  /**
   * The date when the recurrence interval starts..
   * @return startDateTime
   **/
  @Schema(description = "The date when the recurrence interval starts.")
  public Object getStartDateTime() {
    return startDateTime;
  }

  /**
   * setStartDateTime.
   **/
  public void setStartDateTime(Object startDateTime) {
    this.startDateTime = startDateTime;
  }


  /**
   * Compares objects.
   *
   * @return true or false depending on comparison result.
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClickwrapScheduledReacceptance clickwrapScheduledReacceptance = (ClickwrapScheduledReacceptance) o;
    return Objects.equals(this.recurrenceInterval, clickwrapScheduledReacceptance.recurrenceInterval) &&
        Objects.equals(this.recurrenceIntervalType, clickwrapScheduledReacceptance.recurrenceIntervalType) &&
        Objects.equals(this.startDateTime, clickwrapScheduledReacceptance.startDateTime);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(recurrenceInterval, recurrenceIntervalType, startDateTime);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClickwrapScheduledReacceptance {\n");
    
    sb.append("    recurrenceInterval: ").append(toIndentedString(recurrenceInterval)).append("\n");
    sb.append("    recurrenceIntervalType: ").append(toIndentedString(recurrenceIntervalType)).append("\n");
    sb.append("    startDateTime: ").append(toIndentedString(startDateTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

