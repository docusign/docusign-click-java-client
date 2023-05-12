package com.docusign.click.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Data used to start a bulk agreements export..
 *
 */
@Schema(description = "Data used to start a bulk agreements export.")

public class BulkClickwrapRequest {
  @JsonProperty("fromDate")
  private Object fromDate = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("toDate")
  private Object toDate = null;


  /**
   * fromDate.
   *
   * @return BulkClickwrapRequest
   **/
  public BulkClickwrapRequest fromDate(Object fromDate) {
    this.fromDate = fromDate;
    return this;
  }

  /**
   * The earliest date to return agreements from..
   * @return fromDate
   **/
  @Schema(description = "The earliest date to return agreements from.")
  public Object getFromDate() {
    return fromDate;
  }

  /**
   * setFromDate.
   **/
  public void setFromDate(Object fromDate) {
    this.fromDate = fromDate;
  }


  /**
   * status.
   *
   * @return BulkClickwrapRequest
   **/
  public BulkClickwrapRequest status(String status) {
    this.status = status;
    return this;
  }

  /**
   * User agreement status. One of:  - `agreed` - `declined`.
   * @return status
   **/
  @Schema(description = "User agreement status. One of:  - `agreed` - `declined`")
  public String getStatus() {
    return status;
  }

  /**
   * setStatus.
   **/
  public void setStatus(String status) {
    this.status = status;
  }


  /**
   * toDate.
   *
   * @return BulkClickwrapRequest
   **/
  public BulkClickwrapRequest toDate(Object toDate) {
    this.toDate = toDate;
    return this;
  }

  /**
   * The latest date to return agreements from..
   * @return toDate
   **/
  @Schema(description = "The latest date to return agreements from.")
  public Object getToDate() {
    return toDate;
  }

  /**
   * setToDate.
   **/
  public void setToDate(Object toDate) {
    this.toDate = toDate;
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
    BulkClickwrapRequest bulkClickwrapRequest = (BulkClickwrapRequest) o;
    return Objects.equals(this.fromDate, bulkClickwrapRequest.fromDate) &&
        Objects.equals(this.status, bulkClickwrapRequest.status) &&
        Objects.equals(this.toDate, bulkClickwrapRequest.toDate);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(fromDate, status, toDate);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkClickwrapRequest {\n");
    
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
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

