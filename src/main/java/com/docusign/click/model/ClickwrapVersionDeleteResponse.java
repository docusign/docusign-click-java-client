package com.docusign.click.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.click.model.ClickwrapScheduledReacceptance;
import com.docusign.click.model.DataField;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ClickwrapVersionDeleteResponse.
 *
 */

public class ClickwrapVersionDeleteResponse {
  @JsonProperty("clickwrapVersionId")
  private String clickwrapVersionId = null;

  @JsonProperty("createdTime")
  private Object createdTime = null;

  @JsonProperty("dataFields")
  private java.util.List<DataField> dataFields = null;

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


  /**
   * clickwrapVersionId.
   *
   * @return ClickwrapVersionDeleteResponse
   **/
  public ClickwrapVersionDeleteResponse clickwrapVersionId(String clickwrapVersionId) {
    this.clickwrapVersionId = clickwrapVersionId;
    return this;
  }

  /**
   * The unique version ID, a GUID, of this clickwrap version..
   * @return clickwrapVersionId
   **/
  @Schema(description = "The unique version ID, a GUID, of this clickwrap version.")
  public String getClickwrapVersionId() {
    return clickwrapVersionId;
  }

  /**
   * setClickwrapVersionId.
   **/
  public void setClickwrapVersionId(String clickwrapVersionId) {
    this.clickwrapVersionId = clickwrapVersionId;
  }


  /**
   * createdTime.
   *
   * @return ClickwrapVersionDeleteResponse
   **/
  public ClickwrapVersionDeleteResponse createdTime(Object createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * The time that the clickwrap was created..
   * @return createdTime
   **/
  @Schema(description = "The time that the clickwrap was created.")
  public Object getCreatedTime() {
    return createdTime;
  }

  /**
   * setCreatedTime.
   **/
  public void setCreatedTime(Object createdTime) {
    this.createdTime = createdTime;
  }


  /**
   * dataFields.
   *
   * @return ClickwrapVersionDeleteResponse
   **/
  public ClickwrapVersionDeleteResponse dataFields(java.util.List<DataField> dataFields) {
    this.dataFields = dataFields;
    return this;
  }
  
  /**
   * addDataFieldsItem.
   *
   * @return ClickwrapVersionDeleteResponse
   **/
  public ClickwrapVersionDeleteResponse addDataFieldsItem(DataField dataFieldsItem) {
    if (this.dataFields == null) {
      this.dataFields = new java.util.ArrayList<>();
    }
    this.dataFields.add(dataFieldsItem);
    return this;
  }

  /**
   * The list of all the data fields available for the clickwrap (custom fields and standard fields)..
   * @return dataFields
   **/
  @Schema(description = "The list of all the data fields available for the clickwrap (custom fields and standard fields).")
  public java.util.List<DataField> getDataFields() {
    return dataFields;
  }

  /**
   * setDataFields.
   **/
  public void setDataFields(java.util.List<DataField> dataFields) {
    this.dataFields = dataFields;
  }


  /**
   * deletionMessage.
   *
   * @return ClickwrapVersionDeleteResponse
   **/
  public ClickwrapVersionDeleteResponse deletionMessage(String deletionMessage) {
    this.deletionMessage = deletionMessage;
    return this;
  }

  /**
   * A message describing the result of deletion request. One of:  - `alreadyDeleted`: Clickwrap is already deleted. - `deletionSuccess`: Successfully deleted the clickwrap. - `deletionFailure`: Failed to delete the clickwrap. - `cannotDelete`: Active clickwrap version cannot be deleted..
   * @return deletionMessage
   **/
  @Schema(description = "A message describing the result of deletion request. One of:  - `alreadyDeleted`: Clickwrap is already deleted. - `deletionSuccess`: Successfully deleted the clickwrap. - `deletionFailure`: Failed to delete the clickwrap. - `cannotDelete`: Active clickwrap version cannot be deleted.")
  public String getDeletionMessage() {
    return deletionMessage;
  }

  /**
   * setDeletionMessage.
   **/
  public void setDeletionMessage(String deletionMessage) {
    this.deletionMessage = deletionMessage;
  }


  /**
   * deletionSuccess.
   *
   * @return ClickwrapVersionDeleteResponse
   **/
  public ClickwrapVersionDeleteResponse deletionSuccess(Boolean deletionSuccess) {
    this.deletionSuccess = deletionSuccess;
    return this;
  }

  /**
   * **True** if the clickwrap was deleted successfully. **False** otherwise..
   * @return deletionSuccess
   **/
  @Schema(description = "**True** if the clickwrap was deleted successfully. **False** otherwise.")
  public Boolean isDeletionSuccess() {
    return deletionSuccess;
  }

  /**
   * setDeletionSuccess.
   **/
  public void setDeletionSuccess(Boolean deletionSuccess) {
    this.deletionSuccess = deletionSuccess;
  }


  /**
   * lastModified.
   *
   * @return ClickwrapVersionDeleteResponse
   **/
  public ClickwrapVersionDeleteResponse lastModified(Object lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  /**
   * The time that the clickwrap was last modified..
   * @return lastModified
   **/
  @Schema(description = "The time that the clickwrap was last modified.")
  public Object getLastModified() {
    return lastModified;
  }

  /**
   * setLastModified.
   **/
  public void setLastModified(Object lastModified) {
    this.lastModified = lastModified;
  }


  /**
   * lastModifiedBy.
   *
   * @return ClickwrapVersionDeleteResponse
   **/
  public ClickwrapVersionDeleteResponse lastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

  /**
   * The user ID of the last user who modified this clickwrap..
   * @return lastModifiedBy
   **/
  @Schema(description = "The user ID of the last user who modified this clickwrap.")
  public String getLastModifiedBy() {
    return lastModifiedBy;
  }

  /**
   * setLastModifiedBy.
   **/
  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }


  /**
   * ownerUserId.
   *
   * @return ClickwrapVersionDeleteResponse
   **/
  public ClickwrapVersionDeleteResponse ownerUserId(String ownerUserId) {
    this.ownerUserId = ownerUserId;
    return this;
  }

  /**
   * The user ID of the owner of this clickwrap..
   * @return ownerUserId
   **/
  @Schema(description = "The user ID of the owner of this clickwrap.")
  public String getOwnerUserId() {
    return ownerUserId;
  }

  /**
   * setOwnerUserId.
   **/
  public void setOwnerUserId(String ownerUserId) {
    this.ownerUserId = ownerUserId;
  }


  /**
   * requireReacceptance.
   *
   * @return ClickwrapVersionDeleteResponse
   **/
  public ClickwrapVersionDeleteResponse requireReacceptance(Boolean requireReacceptance) {
    this.requireReacceptance = requireReacceptance;
    return this;
  }

  /**
   * When **true,** requires signers who have previously agreed to this clickwrap to sign again. The version number is incremented..
   * @return requireReacceptance
   **/
  @Schema(description = "When **true,** requires signers who have previously agreed to this clickwrap to sign again. The version number is incremented.")
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
   * @return ClickwrapVersionDeleteResponse
   **/
  public ClickwrapVersionDeleteResponse scheduledDate(Object scheduledDate) {
    this.scheduledDate = scheduledDate;
    return this;
  }

  /**
   * The time and date when this clickwrap is activated..
   * @return scheduledDate
   **/
  @Schema(description = "The time and date when this clickwrap is activated.")
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
   * @return ClickwrapVersionDeleteResponse
   **/
  public ClickwrapVersionDeleteResponse scheduledReacceptance(ClickwrapScheduledReacceptance scheduledReacceptance) {
    this.scheduledReacceptance = scheduledReacceptance;
    return this;
  }

  /**
   * Specifies the interval between reacceptances in days, weeks, months, or years..
   * @return scheduledReacceptance
   **/
  @Schema(description = "Specifies the interval between reacceptances in days, weeks, months, or years.")
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
   * @return ClickwrapVersionDeleteResponse
   **/
  public ClickwrapVersionDeleteResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Clickwrap status. Possible values:  - `active` - `inactive` - `deleted`.
   * @return status
   **/
  @Schema(description = "Clickwrap status. Possible values:  - `active` - `inactive` - `deleted`")
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
   * versionId.
   *
   * @return ClickwrapVersionDeleteResponse
   **/
  public ClickwrapVersionDeleteResponse versionId(String versionId) {
    this.versionId = versionId;
    return this;
  }

  /**
   * The ID of the version..
   * @return versionId
   **/
  @Schema(description = "The ID of the version.")
  public String getVersionId() {
    return versionId;
  }

  /**
   * setVersionId.
   **/
  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }


  /**
   * versionNumber.
   *
   * @return ClickwrapVersionDeleteResponse
   **/
  public ClickwrapVersionDeleteResponse versionNumber(String versionNumber) {
    this.versionNumber = versionNumber;
    return this;
  }

  /**
   * Version of the clickwrap..
   * @return versionNumber
   **/
  @Schema(description = "Version of the clickwrap.")
  public String getVersionNumber() {
    return versionNumber;
  }

  /**
   * setVersionNumber.
   **/
  public void setVersionNumber(String versionNumber) {
    this.versionNumber = versionNumber;
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
    ClickwrapVersionDeleteResponse clickwrapVersionDeleteResponse = (ClickwrapVersionDeleteResponse) o;
    return Objects.equals(this.clickwrapVersionId, clickwrapVersionDeleteResponse.clickwrapVersionId) &&
        Objects.equals(this.createdTime, clickwrapVersionDeleteResponse.createdTime) &&
        Objects.equals(this.dataFields, clickwrapVersionDeleteResponse.dataFields) &&
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

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(clickwrapVersionId, createdTime, dataFields, deletionMessage, deletionSuccess, lastModified, lastModifiedBy, ownerUserId, requireReacceptance, scheduledDate, scheduledReacceptance, status, versionId, versionNumber);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClickwrapVersionDeleteResponse {\n");
    
    sb.append("    clickwrapVersionId: ").append(toIndentedString(clickwrapVersionId)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    dataFields: ").append(toIndentedString(dataFields)).append("\n");
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

