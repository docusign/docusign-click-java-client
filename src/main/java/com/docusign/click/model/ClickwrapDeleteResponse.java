package com.docusign.click.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClickwrapDeleteResponse
 */

public class ClickwrapDeleteResponse {
  @JsonProperty("clickwrapId")
  private String clickwrapId = null;

  @JsonProperty("clickwrapName")
  private String clickwrapName = null;

  @JsonProperty("deletionMessage")
  private String deletionMessage = null;

  @JsonProperty("deletionSuccess")
  private Boolean deletionSuccess = null;

  @JsonProperty("status")
  private String status = null;

  public ClickwrapDeleteResponse clickwrapId(String clickwrapId) {
    this.clickwrapId = clickwrapId;
    return this;
  }

   /**
   * 
   * @return clickwrapId
  **/
  @ApiModelProperty(value = "")
  public String getClickwrapId() {
    return clickwrapId;
  }

  public void setClickwrapId(String clickwrapId) {
    this.clickwrapId = clickwrapId;
  }

  public ClickwrapDeleteResponse clickwrapName(String clickwrapName) {
    this.clickwrapName = clickwrapName;
    return this;
  }

   /**
   * 
   * @return clickwrapName
  **/
  @ApiModelProperty(value = "")
  public String getClickwrapName() {
    return clickwrapName;
  }

  public void setClickwrapName(String clickwrapName) {
    this.clickwrapName = clickwrapName;
  }

  public ClickwrapDeleteResponse deletionMessage(String deletionMessage) {
    this.deletionMessage = deletionMessage;
    return this;
  }

   /**
   * 
   * @return deletionMessage
  **/
  @ApiModelProperty(value = "")
  public String getDeletionMessage() {
    return deletionMessage;
  }

  public void setDeletionMessage(String deletionMessage) {
    this.deletionMessage = deletionMessage;
  }

  public ClickwrapDeleteResponse deletionSuccess(Boolean deletionSuccess) {
    this.deletionSuccess = deletionSuccess;
    return this;
  }

   /**
   * 
   * @return deletionSuccess
  **/
  @ApiModelProperty(value = "")
  public Boolean isDeletionSuccess() {
    return deletionSuccess;
  }

  public void setDeletionSuccess(Boolean deletionSuccess) {
    this.deletionSuccess = deletionSuccess;
  }

  public ClickwrapDeleteResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * 
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClickwrapDeleteResponse clickwrapDeleteResponse = (ClickwrapDeleteResponse) o;
    return Objects.equals(this.clickwrapId, clickwrapDeleteResponse.clickwrapId) &&
        Objects.equals(this.clickwrapName, clickwrapDeleteResponse.clickwrapName) &&
        Objects.equals(this.deletionMessage, clickwrapDeleteResponse.deletionMessage) &&
        Objects.equals(this.deletionSuccess, clickwrapDeleteResponse.deletionSuccess) &&
        Objects.equals(this.status, clickwrapDeleteResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clickwrapId, clickwrapName, deletionMessage, deletionSuccess, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClickwrapDeleteResponse {\n");
    
    sb.append("    clickwrapId: ").append(toIndentedString(clickwrapId)).append("\n");
    sb.append("    clickwrapName: ").append(toIndentedString(clickwrapName)).append("\n");
    sb.append("    deletionMessage: ").append(toIndentedString(deletionMessage)).append("\n");
    sb.append("    deletionSuccess: ").append(toIndentedString(deletionSuccess)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

