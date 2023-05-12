package com.docusign.click.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.click.model.ClickwrapScheduledReacceptance;
import com.docusign.click.model.DisplaySettings;
import com.docusign.click.model.Document;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ClickwrapResponse
 */

public class ClickwrapResponse {
  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("clickwrapId")
  private String clickwrapId = null;

  @JsonProperty("clickwrapName")
  private String clickwrapName = null;

  @JsonProperty("createdTime")
  private Object createdTime = null;

  @JsonProperty("displaySettings")
  private DisplaySettings displaySettings = null;

  @JsonProperty("documents")
  private java.util.List<Document> documents = null;

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

  public ClickwrapResponse accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * 
   * @return accountId
  **/
  @Schema(description = "")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public ClickwrapResponse clickwrapId(String clickwrapId) {
    this.clickwrapId = clickwrapId;
    return this;
  }

   /**
   * 
   * @return clickwrapId
  **/
  @Schema(description = "")
  public String getClickwrapId() {
    return clickwrapId;
  }

  public void setClickwrapId(String clickwrapId) {
    this.clickwrapId = clickwrapId;
  }

  public ClickwrapResponse clickwrapName(String clickwrapName) {
    this.clickwrapName = clickwrapName;
    return this;
  }

   /**
   * 
   * @return clickwrapName
  **/
  @Schema(description = "")
  public String getClickwrapName() {
    return clickwrapName;
  }

  public void setClickwrapName(String clickwrapName) {
    this.clickwrapName = clickwrapName;
  }

  public ClickwrapResponse createdTime(Object createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * 
   * @return createdTime
  **/
  @Schema(description = "")
  public Object getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Object createdTime) {
    this.createdTime = createdTime;
  }

  public ClickwrapResponse displaySettings(DisplaySettings displaySettings) {
    this.displaySettings = displaySettings;
    return this;
  }

   /**
   * Get displaySettings
   * @return displaySettings
  **/
  @Schema(description = "")
  public DisplaySettings getDisplaySettings() {
    return displaySettings;
  }

  public void setDisplaySettings(DisplaySettings displaySettings) {
    this.displaySettings = displaySettings;
  }

  public ClickwrapResponse documents(java.util.List<Document> documents) {
    this.documents = documents;
    return this;
  }

  public ClickwrapResponse addDocumentsItem(Document documentsItem) {
    if (this.documents == null) {
      this.documents = new java.util.ArrayList<Document>();
    }
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * 
   * @return documents
  **/
  @Schema(description = "")
  public java.util.List<Document> getDocuments() {
    return documents;
  }

  public void setDocuments(java.util.List<Document> documents) {
    this.documents = documents;
  }

  public ClickwrapResponse lastModified(Object lastModified) {
    this.lastModified = lastModified;
    return this;
  }

   /**
   * 
   * @return lastModified
  **/
  @Schema(description = "")
  public Object getLastModified() {
    return lastModified;
  }

  public void setLastModified(Object lastModified) {
    this.lastModified = lastModified;
  }

  public ClickwrapResponse lastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

   /**
   * 
   * @return lastModifiedBy
  **/
  @Schema(description = "")
  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public ClickwrapResponse ownerUserId(String ownerUserId) {
    this.ownerUserId = ownerUserId;
    return this;
  }

   /**
   * 
   * @return ownerUserId
  **/
  @Schema(description = "")
  public String getOwnerUserId() {
    return ownerUserId;
  }

  public void setOwnerUserId(String ownerUserId) {
    this.ownerUserId = ownerUserId;
  }

  public ClickwrapResponse requireReacceptance(Boolean requireReacceptance) {
    this.requireReacceptance = requireReacceptance;
    return this;
  }

   /**
   * 
   * @return requireReacceptance
  **/
  @Schema(description = "")
  public Boolean isRequireReacceptance() {
    return requireReacceptance;
  }

  public void setRequireReacceptance(Boolean requireReacceptance) {
    this.requireReacceptance = requireReacceptance;
  }

  public ClickwrapResponse scheduledDate(Object scheduledDate) {
    this.scheduledDate = scheduledDate;
    return this;
  }

   /**
   * 
   * @return scheduledDate
  **/
  @Schema(description = "")
  public Object getScheduledDate() {
    return scheduledDate;
  }

  public void setScheduledDate(Object scheduledDate) {
    this.scheduledDate = scheduledDate;
  }

  public ClickwrapResponse scheduledReacceptance(ClickwrapScheduledReacceptance scheduledReacceptance) {
    this.scheduledReacceptance = scheduledReacceptance;
    return this;
  }

   /**
   * Get scheduledReacceptance
   * @return scheduledReacceptance
  **/
  @Schema(description = "")
  public ClickwrapScheduledReacceptance getScheduledReacceptance() {
    return scheduledReacceptance;
  }

  public void setScheduledReacceptance(ClickwrapScheduledReacceptance scheduledReacceptance) {
    this.scheduledReacceptance = scheduledReacceptance;
  }

  public ClickwrapResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * 
   * @return status
  **/
  @Schema(description = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ClickwrapResponse versionId(String versionId) {
    this.versionId = versionId;
    return this;
  }

   /**
   * 
   * @return versionId
  **/
  @Schema(description = "")
  public String getVersionId() {
    return versionId;
  }

  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }

  public ClickwrapResponse versionNumber(Integer versionNumber) {
    this.versionNumber = versionNumber;
    return this;
  }

   /**
   * 
   * @return versionNumber
  **/
  @Schema(description = "")
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
    ClickwrapResponse clickwrapResponse = (ClickwrapResponse) o;
    return Objects.equals(this.accountId, clickwrapResponse.accountId) &&
        Objects.equals(this.clickwrapId, clickwrapResponse.clickwrapId) &&
        Objects.equals(this.clickwrapName, clickwrapResponse.clickwrapName) &&
        Objects.equals(this.createdTime, clickwrapResponse.createdTime) &&
        Objects.equals(this.displaySettings, clickwrapResponse.displaySettings) &&
        Objects.equals(this.documents, clickwrapResponse.documents) &&
        Objects.equals(this.lastModified, clickwrapResponse.lastModified) &&
        Objects.equals(this.lastModifiedBy, clickwrapResponse.lastModifiedBy) &&
        Objects.equals(this.ownerUserId, clickwrapResponse.ownerUserId) &&
        Objects.equals(this.requireReacceptance, clickwrapResponse.requireReacceptance) &&
        Objects.equals(this.scheduledDate, clickwrapResponse.scheduledDate) &&
        Objects.equals(this.scheduledReacceptance, clickwrapResponse.scheduledReacceptance) &&
        Objects.equals(this.status, clickwrapResponse.status) &&
        Objects.equals(this.versionId, clickwrapResponse.versionId) &&
        Objects.equals(this.versionNumber, clickwrapResponse.versionNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, clickwrapId, clickwrapName, createdTime, displaySettings, documents, lastModified, lastModifiedBy, ownerUserId, requireReacceptance, scheduledDate, scheduledReacceptance, status, versionId, versionNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClickwrapResponse {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    clickwrapId: ").append(toIndentedString(clickwrapId)).append("\n");
    sb.append("    clickwrapName: ").append(toIndentedString(clickwrapName)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    displaySettings: ").append(toIndentedString(displaySettings)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
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

