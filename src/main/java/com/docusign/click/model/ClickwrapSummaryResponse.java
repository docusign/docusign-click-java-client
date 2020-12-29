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
 * ClickwrapSummaryResponse
 */

public class ClickwrapSummaryResponse {
  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("clickwrapId")
  private String clickwrapId = null;

  @JsonProperty("clickwrapName")
  private String clickwrapName = null;

  @JsonProperty("createdTime")
  private Object createdTime = null;

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

  public ClickwrapSummaryResponse accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * 
   * @return accountId
  **/
  @ApiModelProperty(value = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public ClickwrapSummaryResponse clickwrapId(String clickwrapId) {
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

  public ClickwrapSummaryResponse clickwrapName(String clickwrapName) {
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

  public ClickwrapSummaryResponse createdTime(Object createdTime) {
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

  public ClickwrapSummaryResponse lastModified(Object lastModified) {
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

  public ClickwrapSummaryResponse lastModifiedBy(String lastModifiedBy) {
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

  public ClickwrapSummaryResponse ownerUserId(String ownerUserId) {
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

  public ClickwrapSummaryResponse requireReacceptance(Boolean requireReacceptance) {
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

  public ClickwrapSummaryResponse scheduledDate(Object scheduledDate) {
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

  public ClickwrapSummaryResponse scheduledReacceptance(ClickwrapScheduledReacceptance scheduledReacceptance) {
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

  public ClickwrapSummaryResponse status(String status) {
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

  public ClickwrapSummaryResponse versionId(String versionId) {
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

  public ClickwrapSummaryResponse versionNumber(Integer versionNumber) {
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
    ClickwrapSummaryResponse clickwrapSummaryResponse = (ClickwrapSummaryResponse) o;
    return Objects.equals(this.accountId, clickwrapSummaryResponse.accountId) &&
        Objects.equals(this.clickwrapId, clickwrapSummaryResponse.clickwrapId) &&
        Objects.equals(this.clickwrapName, clickwrapSummaryResponse.clickwrapName) &&
        Objects.equals(this.createdTime, clickwrapSummaryResponse.createdTime) &&
        Objects.equals(this.lastModified, clickwrapSummaryResponse.lastModified) &&
        Objects.equals(this.lastModifiedBy, clickwrapSummaryResponse.lastModifiedBy) &&
        Objects.equals(this.ownerUserId, clickwrapSummaryResponse.ownerUserId) &&
        Objects.equals(this.requireReacceptance, clickwrapSummaryResponse.requireReacceptance) &&
        Objects.equals(this.scheduledDate, clickwrapSummaryResponse.scheduledDate) &&
        Objects.equals(this.scheduledReacceptance, clickwrapSummaryResponse.scheduledReacceptance) &&
        Objects.equals(this.status, clickwrapSummaryResponse.status) &&
        Objects.equals(this.versionId, clickwrapSummaryResponse.versionId) &&
        Objects.equals(this.versionNumber, clickwrapSummaryResponse.versionNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, clickwrapId, clickwrapName, createdTime, lastModified, lastModifiedBy, ownerUserId, requireReacceptance, scheduledDate, scheduledReacceptance, status, versionId, versionNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClickwrapSummaryResponse {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    clickwrapId: ").append(toIndentedString(clickwrapId)).append("\n");
    sb.append("    clickwrapName: ").append(toIndentedString(clickwrapName)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
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

