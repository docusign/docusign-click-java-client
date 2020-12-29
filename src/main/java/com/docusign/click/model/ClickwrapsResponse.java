package com.docusign.click.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.click.model.ClickwrapSummaryResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClickwrapsResponse
 */

public class ClickwrapsResponse {
  @JsonProperty("clickwraps")
  private java.util.List<ClickwrapSummaryResponse> clickwraps = null;

  @JsonProperty("minimumPagesRemaining")
  private Integer minimumPagesRemaining = null;

  @JsonProperty("page")
  private Integer page = null;

  @JsonProperty("pageSize")
  private Integer pageSize = null;

  public ClickwrapsResponse clickwraps(java.util.List<ClickwrapSummaryResponse> clickwraps) {
    this.clickwraps = clickwraps;
    return this;
  }

  public ClickwrapsResponse addClickwrapsItem(ClickwrapSummaryResponse clickwrapsItem) {
    if (this.clickwraps == null) {
      this.clickwraps = new java.util.ArrayList<ClickwrapSummaryResponse>();
    }
    this.clickwraps.add(clickwrapsItem);
    return this;
  }

   /**
   * 
   * @return clickwraps
  **/
  @ApiModelProperty(value = "")
  public java.util.List<ClickwrapSummaryResponse> getClickwraps() {
    return clickwraps;
  }

  public void setClickwraps(java.util.List<ClickwrapSummaryResponse> clickwraps) {
    this.clickwraps = clickwraps;
  }

  public ClickwrapsResponse minimumPagesRemaining(Integer minimumPagesRemaining) {
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

  public ClickwrapsResponse page(Integer page) {
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

  public ClickwrapsResponse pageSize(Integer pageSize) {
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
    ClickwrapsResponse clickwrapsResponse = (ClickwrapsResponse) o;
    return Objects.equals(this.clickwraps, clickwrapsResponse.clickwraps) &&
        Objects.equals(this.minimumPagesRemaining, clickwrapsResponse.minimumPagesRemaining) &&
        Objects.equals(this.page, clickwrapsResponse.page) &&
        Objects.equals(this.pageSize, clickwrapsResponse.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clickwraps, minimumPagesRemaining, page, pageSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClickwrapsResponse {\n");
    
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

