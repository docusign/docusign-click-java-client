package com.docusign.click.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClickwrapTransferRequest.
 *
 */

public class ClickwrapTransferRequest {
  @JsonProperty("transferFromUserId")
  private String transferFromUserId = null;

  @JsonProperty("transferToUserId")
  private String transferToUserId = null;


  /**
   * transferFromUserId.
   *
   * @return ClickwrapTransferRequest
   **/
  public ClickwrapTransferRequest transferFromUserId(String transferFromUserId) {
    this.transferFromUserId = transferFromUserId;
    return this;
  }

  /**
   * .
   * @return transferFromUserId
   **/
  @ApiModelProperty(value = "")
  public String getTransferFromUserId() {
    return transferFromUserId;
  }

  /**
   * setTransferFromUserId.
   **/
  public void setTransferFromUserId(String transferFromUserId) {
    this.transferFromUserId = transferFromUserId;
  }


  /**
   * transferToUserId.
   *
   * @return ClickwrapTransferRequest
   **/
  public ClickwrapTransferRequest transferToUserId(String transferToUserId) {
    this.transferToUserId = transferToUserId;
    return this;
  }

  /**
   * .
   * @return transferToUserId
   **/
  @ApiModelProperty(value = "")
  public String getTransferToUserId() {
    return transferToUserId;
  }

  /**
   * setTransferToUserId.
   **/
  public void setTransferToUserId(String transferToUserId) {
    this.transferToUserId = transferToUserId;
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
    ClickwrapTransferRequest clickwrapTransferRequest = (ClickwrapTransferRequest) o;
    return Objects.equals(this.transferFromUserId, clickwrapTransferRequest.transferFromUserId) &&
        Objects.equals(this.transferToUserId, clickwrapTransferRequest.transferToUserId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(transferFromUserId, transferToUserId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClickwrapTransferRequest {\n");
    
    sb.append("    transferFromUserId: ").append(toIndentedString(transferFromUserId)).append("\n");
    sb.append("    transferToUserId: ").append(toIndentedString(transferToUserId)).append("\n");
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

