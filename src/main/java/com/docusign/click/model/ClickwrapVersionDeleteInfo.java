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
 * ClickwrapVersionDeleteInfo
 */

public class ClickwrapVersionDeleteInfo {
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
  private Integer versionNumber = null;

  public ClickwrapVersionDeleteInfo createdTime(Object createdTime) {
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

  public ClickwrapVersionDeleteInfo deletionMessage(String deletionMessage) {
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

  public ClickwrapVersionDeleteInfo deletionSuccess(Boolean deletionSuccess) {
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

  public ClickwrapVersionDeleteInfo lastModified(Object lastModified) {
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

  public ClickwrapVersionDeleteInfo lastModifiedBy(String lastModifiedBy) {
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

  public ClickwrapVersionDeleteInfo ownerUserId(String ownerUserId) {
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

  public ClickwrapVersionDeleteInfo requireReacceptance(Boolean requireReacceptance) {
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

  public ClickwrapVersionDeleteInfo scheduledDate(Object scheduledDate) {
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

  public ClickwrapVersionDeleteInfo scheduledReacceptance(ClickwrapScheduledReacceptance scheduledReacceptance) {
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

  public ClickwrapVersionDeleteInfo status(String status) {
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

  public ClickwrapVersionDeleteInfo versionId(String versionId) {
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

  public ClickwrapVersionDeleteInfo versionNumber(Integer versionNumber) {
    this.versionNumber = versionNumber;
    return this;
  }

   /**
   * 
   * @return versionNumber
  **/
  @ApiModelProperty(value = "")
  public Integer getVersionNumber() {
    return versionNumber;
  }

  public void setVersionNumber(Integer versionNumber) {
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
    ClickwrapVersionDeleteInfo clickwrapVersionDeleteInfo = (ClickwrapVersionDeleteInfo) o;
    return Objects.equals(this.createdTime, clickwrapVersionDeleteInfo.createdTime) &&
        Objects.equals(this.deletionMessage, clickwrapVersionDeleteInfo.deletionMessage) &&
        Objects.equals(this.deletionSuccess, clickwrapVersionDeleteInfo.deletionSuccess) &&
        Objects.equals(this.lastModified, clickwrapVersionDeleteInfo.lastModified) &&
        Objects.equals(this.lastModifiedBy, clickwrapVersionDeleteInfo.lastModifiedBy) &&
        Objects.equals(this.ownerUserId, clickwrapVersionDeleteInfo.ownerUserId) &&
        Objects.equals(this.requireReacceptance, clickwrapVersionDeleteInfo.requireReacceptance) &&
        Objects.equals(this.scheduledDate, clickwrapVersionDeleteInfo.scheduledDate) &&
        Objects.equals(this.scheduledReacceptance, clickwrapVersionDeleteInfo.scheduledReacceptance) &&
        Objects.equals(this.status, clickwrapVersionDeleteInfo.status) &&
        Objects.equals(this.versionId, clickwrapVersionDeleteInfo.versionId) &&
        Objects.equals(this.versionNumber, clickwrapVersionDeleteInfo.versionNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdTime, deletionMessage, deletionSuccess, lastModified, lastModifiedBy, ownerUserId, requireReacceptance, scheduledDate, scheduledReacceptance, status, versionId, versionNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClickwrapVersionDeleteInfo {\n");
    
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

