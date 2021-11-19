package com.docusign.click.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.click.model.ClickwrapScheduledReacceptance;
import com.docusign.click.model.DisplaySettings;
import com.docusign.click.model.Document;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClickwrapRequest.
 *
 */

public class ClickwrapRequest {
  @JsonProperty("clickwrapName")
  private String clickwrapName = null;

  @JsonProperty("displaySettings")
  private DisplaySettings displaySettings = null;

  @JsonProperty("documents")
  private java.util.List<Document> documents = null;

  @JsonProperty("fieldsToNull")
  private String fieldsToNull = null;

  @JsonProperty("isMajorVersion")
  private Boolean isMajorVersion = null;

  @JsonProperty("isShared")
  private Boolean isShared = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("requireReacceptance")
  private Boolean requireReacceptance = null;

  @JsonProperty("scheduledDate")
  private Object scheduledDate = null;

  @JsonProperty("scheduledReacceptance")
  private ClickwrapScheduledReacceptance scheduledReacceptance = null;

  @JsonProperty("status")
  private Object status = null;

  @JsonProperty("transferFromUserId")
  private String transferFromUserId = null;

  @JsonProperty("transferToUserId")
  private String transferToUserId = null;


  /**
   * clickwrapName.
   *
   * @return ClickwrapRequest
   **/
  public ClickwrapRequest clickwrapName(String clickwrapName) {
    this.clickwrapName = clickwrapName;
    return this;
  }

  /**
   * .
   * @return clickwrapName
   **/
  @ApiModelProperty(value = "")
  public String getClickwrapName() {
    return clickwrapName;
  }

  /**
   * setClickwrapName.
   **/
  public void setClickwrapName(String clickwrapName) {
    this.clickwrapName = clickwrapName;
  }


  /**
   * displaySettings.
   *
   * @return ClickwrapRequest
   **/
  public ClickwrapRequest displaySettings(DisplaySettings displaySettings) {
    this.displaySettings = displaySettings;
    return this;
  }

  /**
   * Get displaySettings.
   * @return displaySettings
   **/
  @ApiModelProperty(value = "")
  public DisplaySettings getDisplaySettings() {
    return displaySettings;
  }

  /**
   * setDisplaySettings.
   **/
  public void setDisplaySettings(DisplaySettings displaySettings) {
    this.displaySettings = displaySettings;
  }


  /**
   * documents.
   *
   * @return ClickwrapRequest
   **/
  public ClickwrapRequest documents(java.util.List<Document> documents) {
    this.documents = documents;
    return this;
  }
  
  /**
   * addDocumentsItem.
   *
   * @return ClickwrapRequest
   **/
  public ClickwrapRequest addDocumentsItem(Document documentsItem) {
    if (this.documents == null) {
      this.documents = new java.util.ArrayList<Document>();
    }
    this.documents.add(documentsItem);
    return this;
  }

  /**
   * .
   * @return documents
   **/
  @ApiModelProperty(value = "")
  public java.util.List<Document> getDocuments() {
    return documents;
  }

  /**
   * setDocuments.
   **/
  public void setDocuments(java.util.List<Document> documents) {
    this.documents = documents;
  }


  /**
   * fieldsToNull.
   *
   * @return ClickwrapRequest
   **/
  public ClickwrapRequest fieldsToNull(String fieldsToNull) {
    this.fieldsToNull = fieldsToNull;
    return this;
  }

  /**
   * .
   * @return fieldsToNull
   **/
  @ApiModelProperty(value = "")
  public String getFieldsToNull() {
    return fieldsToNull;
  }

  /**
   * setFieldsToNull.
   **/
  public void setFieldsToNull(String fieldsToNull) {
    this.fieldsToNull = fieldsToNull;
  }


  /**
   * isMajorVersion.
   *
   * @return ClickwrapRequest
   **/
  public ClickwrapRequest isMajorVersion(Boolean isMajorVersion) {
    this.isMajorVersion = isMajorVersion;
    return this;
  }

  /**
   * .
   * @return isMajorVersion
   **/
  @ApiModelProperty(value = "")
  public Boolean isIsMajorVersion() {
    return isMajorVersion;
  }

  /**
   * setIsMajorVersion.
   **/
  public void setIsMajorVersion(Boolean isMajorVersion) {
    this.isMajorVersion = isMajorVersion;
  }


  /**
   * isShared.
   *
   * @return ClickwrapRequest
   **/
  public ClickwrapRequest isShared(Boolean isShared) {
    this.isShared = isShared;
    return this;
  }

  /**
   * .
   * @return isShared
   **/
  @ApiModelProperty(value = "")
  public Boolean isIsShared() {
    return isShared;
  }

  /**
   * setIsShared.
   **/
  public void setIsShared(Boolean isShared) {
    this.isShared = isShared;
  }


  /**
   * name.
   *
   * @return ClickwrapRequest
   **/
  public ClickwrapRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * .
   * @return name
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  /**
   * setName.
   **/
  public void setName(String name) {
    this.name = name;
  }


  /**
   * requireReacceptance.
   *
   * @return ClickwrapRequest
   **/
  public ClickwrapRequest requireReacceptance(Boolean requireReacceptance) {
    this.requireReacceptance = requireReacceptance;
    return this;
  }

  /**
   * .
   * @return requireReacceptance
   **/
  @ApiModelProperty(value = "")
  public Boolean isRequireReacceptance() {
    return requireReacceptance;
  }

  /**
   * setRequireReacceptance.
   **/
  public void setRequireReacceptance(Boolean requireReacceptance) {
    this.requireReacceptance = requireReacceptance;
  }


  /**
   * scheduledDate.
   *
   * @return ClickwrapRequest
   **/
  public ClickwrapRequest scheduledDate(Object scheduledDate) {
    this.scheduledDate = scheduledDate;
    return this;
  }

  /**
   * .
   * @return scheduledDate
   **/
  @ApiModelProperty(value = "")
  public Object getScheduledDate() {
    return scheduledDate;
  }

  /**
   * setScheduledDate.
   **/
  public void setScheduledDate(Object scheduledDate) {
    this.scheduledDate = scheduledDate;
  }


  /**
   * scheduledReacceptance.
   *
   * @return ClickwrapRequest
   **/
  public ClickwrapRequest scheduledReacceptance(ClickwrapScheduledReacceptance scheduledReacceptance) {
    this.scheduledReacceptance = scheduledReacceptance;
    return this;
  }

  /**
   * Get scheduledReacceptance.
   * @return scheduledReacceptance
   **/
  @ApiModelProperty(value = "")
  public ClickwrapScheduledReacceptance getScheduledReacceptance() {
    return scheduledReacceptance;
  }

  /**
   * setScheduledReacceptance.
   **/
  public void setScheduledReacceptance(ClickwrapScheduledReacceptance scheduledReacceptance) {
    this.scheduledReacceptance = scheduledReacceptance;
  }


  /**
   * status.
   *
   * @return ClickwrapRequest
   **/
  public ClickwrapRequest status(Object status) {
    this.status = status;
    return this;
  }

  /**
   * .
   * @return status
   **/
  @ApiModelProperty(value = "")
  public Object getStatus() {
    return status;
  }

  /**
   * setStatus.
   **/
  public void setStatus(Object status) {
    this.status = status;
  }


  /**
   * transferFromUserId.
   *
   * @return ClickwrapRequest
   **/
  public ClickwrapRequest transferFromUserId(String transferFromUserId) {
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
   * @return ClickwrapRequest
   **/
  public ClickwrapRequest transferToUserId(String transferToUserId) {
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
    ClickwrapRequest clickwrapRequest = (ClickwrapRequest) o;
    return Objects.equals(this.clickwrapName, clickwrapRequest.clickwrapName) &&
        Objects.equals(this.displaySettings, clickwrapRequest.displaySettings) &&
        Objects.equals(this.documents, clickwrapRequest.documents) &&
        Objects.equals(this.fieldsToNull, clickwrapRequest.fieldsToNull) &&
        Objects.equals(this.isMajorVersion, clickwrapRequest.isMajorVersion) &&
        Objects.equals(this.isShared, clickwrapRequest.isShared) &&
        Objects.equals(this.name, clickwrapRequest.name) &&
        Objects.equals(this.requireReacceptance, clickwrapRequest.requireReacceptance) &&
        Objects.equals(this.scheduledDate, clickwrapRequest.scheduledDate) &&
        Objects.equals(this.scheduledReacceptance, clickwrapRequest.scheduledReacceptance) &&
        Objects.equals(this.status, clickwrapRequest.status) &&
        Objects.equals(this.transferFromUserId, clickwrapRequest.transferFromUserId) &&
        Objects.equals(this.transferToUserId, clickwrapRequest.transferToUserId);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(clickwrapName, displaySettings, documents, fieldsToNull, isMajorVersion, isShared, name, requireReacceptance, scheduledDate, scheduledReacceptance, status, transferFromUserId, transferToUserId);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClickwrapRequest {\n");
    
    sb.append("    clickwrapName: ").append(toIndentedString(clickwrapName)).append("\n");
    sb.append("    displaySettings: ").append(toIndentedString(displaySettings)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    fieldsToNull: ").append(toIndentedString(fieldsToNull)).append("\n");
    sb.append("    isMajorVersion: ").append(toIndentedString(isMajorVersion)).append("\n");
    sb.append("    isShared: ").append(toIndentedString(isShared)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    requireReacceptance: ").append(toIndentedString(requireReacceptance)).append("\n");
    sb.append("    scheduledDate: ").append(toIndentedString(scheduledDate)).append("\n");
    sb.append("    scheduledReacceptance: ").append(toIndentedString(scheduledReacceptance)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

