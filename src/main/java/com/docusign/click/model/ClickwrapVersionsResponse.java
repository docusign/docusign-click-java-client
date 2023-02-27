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
 * The results are paginated. Use the following properties to navigate the pages. Use the &#x60;page_number&#x60; query parameter to specify a page.  - &#x60;page&#x60;: The page number of the current results. - &#x60;pageSize&#x60;: The number of results in the current page. - &#x60;minimumPagesRemaining&#x60;: The number of pages that follow this one. .
 *
 */
@ApiModel(description = "The results are paginated. Use the following properties to navigate the pages. Use the `page_number` query parameter to specify a page.  - `page`: The page number of the current results. - `pageSize`: The number of results in the current page. - `minimumPagesRemaining`: The number of pages that follow this one. ")

public class ClickwrapVersionsResponse {
  @JsonProperty("clickwraps")
  private java.util.List<ClickwrapVersionSummaryResponse> clickwraps = null;

  @JsonProperty("minimumPagesRemaining")
  private Integer minimumPagesRemaining = null;

  @JsonProperty("page")
  private Integer page = null;

  @JsonProperty("pageSize")
  private Integer pageSize = null;


  /**
   * clickwraps.
   *
   * @return ClickwrapVersionsResponse
   **/
  public ClickwrapVersionsResponse clickwraps(java.util.List<ClickwrapVersionSummaryResponse> clickwraps) {
    this.clickwraps = clickwraps;
    return this;
  }
  
  /**
   * addClickwrapsItem.
   *
   * @return ClickwrapVersionsResponse
   **/
  public ClickwrapVersionsResponse addClickwrapsItem(ClickwrapVersionSummaryResponse clickwrapsItem) {
    if (this.clickwraps == null) {
      this.clickwraps = new java.util.ArrayList<>();
    }
    this.clickwraps.add(clickwrapsItem);
    return this;
  }

  /**
   * An array of `clickwrapVersionSummaryResponse` objects..
   * @return clickwraps
   **/
  @ApiModelProperty(value = "An array of `clickwrapVersionSummaryResponse` objects.")
  public java.util.List<ClickwrapVersionSummaryResponse> getClickwraps() {
    return clickwraps;
  }

  /**
   * setClickwraps.
   **/
  public void setClickwraps(java.util.List<ClickwrapVersionSummaryResponse> clickwraps) {
    this.clickwraps = clickwraps;
  }


  /**
   * minimumPagesRemaining.
   *
   * @return ClickwrapVersionsResponse
   **/
  public ClickwrapVersionsResponse minimumPagesRemaining(Integer minimumPagesRemaining) {
    this.minimumPagesRemaining = minimumPagesRemaining;
    return this;
  }

  /**
   * Number of pages remaining in the response..
   * @return minimumPagesRemaining
   **/
  @ApiModelProperty(value = "Number of pages remaining in the response.")
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
   * @return ClickwrapVersionsResponse
   **/
  public ClickwrapVersionsResponse page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * The number of the current page..
   * @return page
   **/
  @ApiModelProperty(value = "The number of the current page.")
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
   * @return ClickwrapVersionsResponse
   **/
  public ClickwrapVersionsResponse pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * The number of items per page..
   * @return pageSize
   **/
  @ApiModelProperty(value = "The number of items per page.")
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
    ClickwrapVersionsResponse clickwrapVersionsResponse = (ClickwrapVersionsResponse) o;
    return Objects.equals(this.clickwraps, clickwrapVersionsResponse.clickwraps) &&
        Objects.equals(this.minimumPagesRemaining, clickwrapVersionsResponse.minimumPagesRemaining) &&
        Objects.equals(this.page, clickwrapVersionsResponse.page) &&
        Objects.equals(this.pageSize, clickwrapVersionsResponse.pageSize);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(clickwraps, minimumPagesRemaining, page, pageSize);
  }


  /**
   * Converts the given object to string.
   */
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

