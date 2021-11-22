package com.docusign.click.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.click.model.ClickwrapVersionDeleteResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClickwrapVersionsDeleteResponse.
 *
 */

public class ClickwrapVersionsDeleteResponse {
  @JsonProperty("clickwrapId")
  private String clickwrapId = null;

  @JsonProperty("clickwrapName")
  private String clickwrapName = null;

  @JsonProperty("versions")
  private java.util.List<ClickwrapVersionDeleteResponse> versions = null;


  /**
   * clickwrapId.
   *
   * @return ClickwrapVersionsDeleteResponse
   **/
  public ClickwrapVersionsDeleteResponse clickwrapId(String clickwrapId) {
    this.clickwrapId = clickwrapId;
    return this;
  }

  /**
   * .
   * @return clickwrapId
   **/
  @ApiModelProperty(value = "")
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
   * @return ClickwrapVersionsDeleteResponse
   **/
  public ClickwrapVersionsDeleteResponse clickwrapName(String clickwrapName) {
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
   * versions.
   *
   * @return ClickwrapVersionsDeleteResponse
   **/
  public ClickwrapVersionsDeleteResponse versions(java.util.List<ClickwrapVersionDeleteResponse> versions) {
    this.versions = versions;
    return this;
  }
  
  /**
   * addVersionsItem.
   *
   * @return ClickwrapVersionsDeleteResponse
   **/
  public ClickwrapVersionsDeleteResponse addVersionsItem(ClickwrapVersionDeleteResponse versionsItem) {
    if (this.versions == null) {
      this.versions = new java.util.ArrayList<ClickwrapVersionDeleteResponse>();
    }
    this.versions.add(versionsItem);
    return this;
  }

  /**
   * .
   * @return versions
   **/
  @ApiModelProperty(value = "")
  public java.util.List<ClickwrapVersionDeleteResponse> getVersions() {
    return versions;
  }

  /**
   * setVersions.
   **/
  public void setVersions(java.util.List<ClickwrapVersionDeleteResponse> versions) {
    this.versions = versions;
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
    ClickwrapVersionsDeleteResponse clickwrapVersionsDeleteResponse = (ClickwrapVersionsDeleteResponse) o;
    return Objects.equals(this.clickwrapId, clickwrapVersionsDeleteResponse.clickwrapId) &&
        Objects.equals(this.clickwrapName, clickwrapVersionsDeleteResponse.clickwrapName) &&
        Objects.equals(this.versions, clickwrapVersionsDeleteResponse.versions);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(clickwrapId, clickwrapName, versions);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClickwrapVersionsDeleteResponse {\n");
    
    sb.append("    clickwrapId: ").append(toIndentedString(clickwrapId)).append("\n");
    sb.append("    clickwrapName: ").append(toIndentedString(clickwrapName)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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

