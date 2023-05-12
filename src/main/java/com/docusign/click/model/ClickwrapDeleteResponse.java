package com.docusign.click.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * The result of a clickwrap deletion request..
 *
 */
@Schema(description = "The result of a clickwrap deletion request.")

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


  /**
   * clickwrapId.
   *
   * @return ClickwrapDeleteResponse
   **/
  public ClickwrapDeleteResponse clickwrapId(String clickwrapId) {
    this.clickwrapId = clickwrapId;
    return this;
  }

  /**
   * The ID of the clickwrap..
   * @return clickwrapId
   **/
  @Schema(description = "The ID of the clickwrap.")
  public String getClickwrapId() {
    return clickwrapId;
  }

  /**
   * setClickwrapId.
   **/
  public void setClickwrapId(String clickwrapId) {
    this.clickwrapId = clickwrapId;
  }


  /**
   * clickwrapName.
   *
   * @return ClickwrapDeleteResponse
   **/
  public ClickwrapDeleteResponse clickwrapName(String clickwrapName) {
    this.clickwrapName = clickwrapName;
    return this;
  }

  /**
   * The name of the clickwrap..
   * @return clickwrapName
   **/
  @Schema(description = "The name of the clickwrap.")
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
   * deletionMessage.
   *
   * @return ClickwrapDeleteResponse
   **/
  public ClickwrapDeleteResponse deletionMessage(String deletionMessage) {
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
   * @return ClickwrapDeleteResponse
   **/
  public ClickwrapDeleteResponse deletionSuccess(Boolean deletionSuccess) {
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
   * status.
   *
   * @return ClickwrapDeleteResponse
   **/
  public ClickwrapDeleteResponse status(String status) {
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
    ClickwrapDeleteResponse clickwrapDeleteResponse = (ClickwrapDeleteResponse) o;
    return Objects.equals(this.clickwrapId, clickwrapDeleteResponse.clickwrapId) &&
        Objects.equals(this.clickwrapName, clickwrapDeleteResponse.clickwrapName) &&
        Objects.equals(this.deletionMessage, clickwrapDeleteResponse.deletionMessage) &&
        Objects.equals(this.deletionSuccess, clickwrapDeleteResponse.deletionSuccess) &&
        Objects.equals(this.status, clickwrapDeleteResponse.status);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(clickwrapId, clickwrapName, deletionMessage, deletionSuccess, status);
  }


  /**
   * Converts the given object to string.
   */
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

