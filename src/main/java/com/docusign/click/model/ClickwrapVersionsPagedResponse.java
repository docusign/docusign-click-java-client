package com.docusign.click.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.click.model.ClickwrapVersion;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClickwrapVersionsPagedResponse.
 *
 */

public class ClickwrapVersionsPagedResponse {
  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("clickwrapId")
  private String clickwrapId = null;

  @JsonProperty("clickwrapName")
  private String clickwrapName = null;

  @JsonProperty("minimumPagesRemaining")
  private Integer minimumPagesRemaining = null;

  @JsonProperty("page")
  private Integer page = null;

  @JsonProperty("pageSize")
  private Integer pageSize = null;

  @JsonProperty("versions")
  private java.util.List<ClickwrapVersion> versions = null;


  /**
   * accountId.
   *
   * @return ClickwrapVersionsPagedResponse
   **/
  public ClickwrapVersionsPagedResponse accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * .
   * @return accountId
   **/
  @ApiModelProperty(value = "")
  public String getAccountId() {
    return accountId;
  }

  /**
   * setAccountId.
   **/
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  /**
   * clickwrapId.
   *
   * @return ClickwrapVersionsPagedResponse
   **/
  public ClickwrapVersionsPagedResponse clickwrapId(String clickwrapId) {
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
   * @return ClickwrapVersionsPagedResponse
   **/
  public ClickwrapVersionsPagedResponse clickwrapName(String clickwrapName) {
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
   * minimumPagesRemaining.
   *
   * @return ClickwrapVersionsPagedResponse
   **/
  public ClickwrapVersionsPagedResponse minimumPagesRemaining(Integer minimumPagesRemaining) {
    this.minimumPagesRemaining = minimumPagesRemaining;
    return this;
  }

  /**
   * .
   * @return minimumPagesRemaining
   **/
  @ApiModelProperty(value = "")
  public Integer getMinimumPagesRemaining() {
    return minimumPagesRemaining;
  }

  /**
   * setMinimumPagesRemaining.
   **/
  public void setMinimumPagesRemaining(Integer minimumPagesRemaining) {
    this.minimumPagesRemaining = minimumPagesRemaining;
  }


  /**
   * page.
   *
   * @return ClickwrapVersionsPagedResponse
   **/
  public ClickwrapVersionsPagedResponse page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * .
   * @return page
   **/
  @ApiModelProperty(value = "")
  public Integer getPage() {
    return page;
  }

  /**
   * setPage.
   **/
  public void setPage(Integer page) {
    this.page = page;
  }


  /**
   * pageSize.
   *
   * @return ClickwrapVersionsPagedResponse
   **/
  public ClickwrapVersionsPagedResponse pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * .
   * @return pageSize
   **/
  @ApiModelProperty(value = "")
  public Integer getPageSize() {
    return pageSize;
  }

  /**
   * setPageSize.
   **/
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  /**
   * versions.
   *
   * @return ClickwrapVersionsPagedResponse
   **/
  public ClickwrapVersionsPagedResponse versions(java.util.List<ClickwrapVersion> versions) {
    this.versions = versions;
    return this;
  }
  
  /**
   * addVersionsItem.
   *
   * @return ClickwrapVersionsPagedResponse
   **/
  public ClickwrapVersionsPagedResponse addVersionsItem(ClickwrapVersion versionsItem) {
    if (this.versions == null) {
      this.versions = new java.util.ArrayList<>();
    }
    this.versions.add(versionsItem);
    return this;
  }

  /**
   * .
   * @return versions
   **/
  @ApiModelProperty(value = "")
  public java.util.List<ClickwrapVersion> getVersions() {
    return versions;
  }

  /**
   * setVersions.
   **/
  public void setVersions(java.util.List<ClickwrapVersion> versions) {
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
    ClickwrapVersionsPagedResponse clickwrapVersionsPagedResponse = (ClickwrapVersionsPagedResponse) o;
    return Objects.equals(this.accountId, clickwrapVersionsPagedResponse.accountId) &&
        Objects.equals(this.clickwrapId, clickwrapVersionsPagedResponse.clickwrapId) &&
        Objects.equals(this.clickwrapName, clickwrapVersionsPagedResponse.clickwrapName) &&
        Objects.equals(this.minimumPagesRemaining, clickwrapVersionsPagedResponse.minimumPagesRemaining) &&
        Objects.equals(this.page, clickwrapVersionsPagedResponse.page) &&
        Objects.equals(this.pageSize, clickwrapVersionsPagedResponse.pageSize) &&
        Objects.equals(this.versions, clickwrapVersionsPagedResponse.versions);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(accountId, clickwrapId, clickwrapName, minimumPagesRemaining, page, pageSize, versions);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClickwrapVersionsPagedResponse {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    clickwrapId: ").append(toIndentedString(clickwrapId)).append("\n");
    sb.append("    clickwrapName: ").append(toIndentedString(clickwrapName)).append("\n");
    sb.append("    minimumPagesRemaining: ").append(toIndentedString(minimumPagesRemaining)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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

