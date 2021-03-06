package com.docusign.click.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.click.model.ClickwrapVersionSummaryResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClickwrapVersionsResponse
 */

public class ClickwrapVersionsResponse {
  @JsonProperty("clickwraps")
  private java.util.List<ClickwrapVersionSummaryResponse> clickwraps = null;

  @JsonProperty("minimumPagesRemaining")
  private Integer minimumPagesRemaining = null;

  @JsonProperty("page")
  private Integer page = null;

  @JsonProperty("pageSize")
  private Integer pageSize = null;

  public ClickwrapVersionsResponse clickwraps(java.util.List<ClickwrapVersionSummaryResponse> clickwraps) {
    this.clickwraps = clickwraps;
    return this;
  }

  public ClickwrapVersionsResponse addClickwrapsItem(ClickwrapVersionSummaryResponse clickwrapsItem) {
    if (this.clickwraps == null) {
      this.clickwraps = new java.util.ArrayList<ClickwrapVersionSummaryResponse>();
    }
    this.clickwraps.add(clickwrapsItem);
    return this;
  }

   /**
   * 
   * @return clickwraps
  **/
  @ApiModelProperty(value = "")
  public java.util.List<ClickwrapVersionSummaryResponse> getClickwraps() {
    return clickwraps;
  }

  public void setClickwraps(java.util.List<ClickwrapVersionSummaryResponse> clickwraps) {
    this.clickwraps = clickwraps;
  }

  public ClickwrapVersionsResponse minimumPagesRemaining(Integer minimumPagesRemaining) {
    this.minimumPagesRemaining = minimumPagesRemaining;
    return this;
  }

   /**
   * 
   * @return minimumPagesRemaining
  **/
  @ApiModelProperty(value = "")
  public Integer getMinimumPagesRemaining() {
    return minimumPagesRemaining;
  }

  public void setMinimumPagesRemaining(Integer minimumPagesRemaining) {
    this.minimumPagesRemaining = minimumPagesRemaining;
  }

  public ClickwrapVersionsResponse page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * 
   * @return page
  **/
  @ApiModelProperty(value = "")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public ClickwrapVersionsResponse pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 
   * @return pageSize
  **/
  @ApiModelProperty(value = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClickwrapVersionsResponse clickwrapVersionsResponse = (ClickwrapVersionsResponse) o;
    return Objects.equals(this.clickwraps, clickwrapVersionsResponse.clickwraps) &&
        Objects.equals(this.minimumPagesRemaining, clickwrapVersionsResponse.minimumPagesRemaining) &&
        Objects.equals(this.page, clickwrapVersionsResponse.page) &&
        Objects.equals(this.pageSize, clickwrapVersionsResponse.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clickwraps, minimumPagesRemaining, page, pageSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClickwrapVersionsResponse {\n");
    
    sb.append("    clickwraps: ").append(toIndentedString(clickwraps)).append("\n");
    sb.append("    minimumPagesRemaining: ").append(toIndentedString(minimumPagesRemaining)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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

