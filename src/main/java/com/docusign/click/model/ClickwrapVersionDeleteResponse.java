package com.docusign.click.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.click.model.ClickwrapScheduledReacceptance;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClickwrapVersionDeleteResponse
 */

public class ClickwrapVersionDeleteResponse {
  @JsonProperty("clickwrapVersionId")
  private String clickwrapVersionId = null;

  @JsonProperty("createdTime")
  private Object createdTime = null;

  @JsonProperty("deletionMessage")
  private String deletionMessage = null;

  @JsonProperty("deletionSuccess")
  private Boolean deletionSuccess = null;

  @JsonProperty("lastModified")
  private Object lastModified = null;

  @JsonProperty("lastModifiedBy")
  private String lastModifiedBy = null;

  @JsonProperty("ownerUserId")
  private String ownerUserId = null;

  @JsonProperty("requireReacceptance")
  private Boolean requireReacceptance = null;

  @JsonProperty("scheduledDate")
  private Object scheduledDate = null;

  @JsonProperty("scheduledReacceptance")
  private ClickwrapScheduledReacceptance scheduledReacceptance = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("versionId")
  private String versionId = null;

  @JsonProperty("versionNumber")
  private String versionNumber = null;

  public ClickwrapVersionDeleteResponse clickwrapVersionId(String clickwrapVersionId) {
    this.clickwrapVersionId = clickwrapVersionId;
    return this;
  }

   /**
   * 
   * @return clickwrapVersionId
  **/
  @ApiModelProperty(value = "")
  public String getClickwrapVersionId() {
    return clickwrapVersionId;
  }

  public void setClickwrapVersionId(String clickwrapVersionId) {
    this.clickwrapVersionId = clickwrapVersionId;
  }

  public ClickwrapVersionDeleteResponse createdTime(Object createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * 
   * @return createdTime
  **/
  @ApiModelProperty(value = "")
  public Object getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Object createdTime) {
    this.createdTime = createdTime;
  }

  public ClickwrapVersionDeleteResponse deletionMessage(String deletionMessage) {
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

  public ClickwrapVersionDeleteResponse deletionSuccess(Boolean deletionSuccess) {
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

  public ClickwrapVersionDeleteResponse lastModified(Object lastModified) {
    this.lastModified = lastModified;
    return this;
  }

   /**
   * 
   * @return lastModified
  **/
  @ApiModelProperty(value = "")
  public Object getLastModified() {
    return lastModified;
  }

  public void setLastModified(Object lastModified) {
    this.lastModified = lastModified;
  }

  public ClickwrapVersionDeleteResponse lastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

   /**
   * 
   * @return lastModifiedBy
  **/
  @ApiModelProperty(value = "")
  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public ClickwrapVersionDeleteResponse ownerUserId(String ownerUserId) {
    this.ownerUserId = ownerUserId;
    return this;
  }

   /**
   * 
   * @return ownerUserId
  **/
  @ApiModelProperty(value = "")
  public String getOwnerUserId() {
    return ownerUserId;
  }

  public void setOwnerUserId(String ownerUserId) {
    this.ownerUserId = ownerUserId;
  }

  public ClickwrapVersionDeleteResponse requireReacceptance(Boolean requireReacceptance) {
    this.requireReacceptance = requireReacceptance;
    return this;
  }

   /**
   * 
   * @return requireReacceptance
  **/
  @ApiModelProperty(value = "")
  public Boolean isRequireReacceptance() {
    return requireReacceptance;
  }

  public void setRequireReacceptance(Boolean requireReacceptance) {
    this.requireReacceptance = requireReacceptance;
  }

  public ClickwrapVersionDeleteResponse scheduledDate(Object scheduledDate) {
    this.scheduledDate = scheduledDate;
    return this;
  }

   /**
   * 
   * @return scheduledDate
  **/
  @ApiModelProperty(value = "")
  public Object getScheduledDate() {
    return scheduledDate;
  }

  public void setScheduledDate(Object scheduledDate) {
    this.scheduledDate = scheduledDate;
  }

  public ClickwrapVersionDeleteResponse scheduledReacceptance(ClickwrapScheduledReacceptance scheduledReacceptance) {
    this.scheduledReacceptance = scheduledReacceptance;
    return this;
  }

   /**
   * Get scheduledReacceptance
   * @return scheduledReacceptance
  **/
  @ApiModelProperty(value = "")
  public ClickwrapScheduledReacceptance getScheduledReacceptance() {
    return scheduledReacceptance;
  }

  public void setScheduledReacceptance(ClickwrapScheduledReacceptance scheduledReacceptance) {
    this.scheduledReacceptance = scheduledReacceptance;
  }

  public ClickwrapVersionDeleteResponse status(String status) {
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

  public ClickwrapVersionDeleteResponse versionId(String versionId) {
    this.versionId = versionId;
    return this;
  }

   /**
   * 
   * @return versionId
  **/
  @ApiModelProperty(value = "")
  public String getVersionId() {
    return versionId;
  }

  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }

  public ClickwrapVersionDeleteResponse versionNumber(String versionNumber) {
    this.versionNumber = versionNumber;
    return this;
  }

   /**
   * 
   * @return versionNumber
  **/
  @ApiModelProperty(value = "")
  public String getVersionNumber() {
    return versionNumber;
  }

  public void setVersionNumber(String versionNumber) {
    this.versionNumber = versionNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClickwrapVersionDeleteResponse clickwrapVersionDeleteResponse = (ClickwrapVersionDeleteResponse) o;
    return Objects.equals(this.clickwrapVersionId, clickwrapVersionDeleteResponse.clickwrapVersionId) &&
        Objects.equals(this.createdTime, clickwrapVersionDeleteResponse.createdTime) &&
        Objects.equals(this.deletionMessage, clickwrapVersionDeleteResponse.deletionMessage) &&
        Objects.equals(this.deletionSuccess, clickwrapVersionDeleteResponse.deletionSuccess) &&
        Objects.equals(this.lastModified, clickwrapVersionDeleteResponse.lastModified) &&
        Objects.equals(this.lastModifiedBy, clickwrapVersionDeleteResponse.lastModifiedBy) &&
        Objects.equals(this.ownerUserId, clickwrapVersionDeleteResponse.ownerUserId) &&
        Objects.equals(this.requireReacceptance, clickwrapVersionDeleteResponse.requireReacceptance) &&
        Objects.equals(this.scheduledDate, clickwrapVersionDeleteResponse.scheduledDate) &&
        Objects.equals(this.scheduledReacceptance, clickwrapVersionDeleteResponse.scheduledReacceptance) &&
        Objects.equals(this.status, clickwrapVersionDeleteResponse.status) &&
        Objects.equals(this.versionId, clickwrapVersionDeleteResponse.versionId) &&
        Objects.equals(this.versionNumber, clickwrapVersionDeleteResponse.versionNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clickwrapVersionId, createdTime, deletionMessage, deletionSuccess, lastModified, lastModifiedBy, ownerUserId, requireReacceptance, scheduledDate, scheduledReacceptance, status, versionId, versionNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClickwrapVersionDeleteResponse {\n");
    
    sb.append("    clickwrapVersionId: ").append(toIndentedString(clickwrapVersionId)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    deletionMessage: ").append(toIndentedString(deletionMessage)).append("\n");
    sb.append("    deletionSuccess: ").append(toIndentedString(deletionSuccess)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    ownerUserId: ").append(toIndentedString(ownerUserId)).append("\n");
    sb.append("    requireReacceptance: ").append(toIndentedString(requireReacceptance)).append("\n");
    sb.append("    scheduledDate: ").append(toIndentedString(scheduledDate)).append("\n");
    sb.append("    scheduledReacceptance: ").append(toIndentedString(scheduledReacceptance)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
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

