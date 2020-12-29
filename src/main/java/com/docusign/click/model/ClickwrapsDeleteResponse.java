package com.docusign.click.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.click.model.ClickwrapDeleteResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClickwrapsDeleteResponse
 */

public class ClickwrapsDeleteResponse {
  @JsonProperty("clickwraps")
  private java.util.List<ClickwrapDeleteResponse> clickwraps = null;

  public ClickwrapsDeleteResponse clickwraps(java.util.List<ClickwrapDeleteResponse> clickwraps) {
    this.clickwraps = clickwraps;
    return this;
  }

  public ClickwrapsDeleteResponse addClickwrapsItem(ClickwrapDeleteResponse clickwrapsItem) {
    if (this.clickwraps == null) {
      this.clickwraps = new java.util.ArrayList<ClickwrapDeleteResponse>();
    }
    this.clickwraps.add(clickwrapsItem);
    return this;
  }

   /**
   * 
   * @return clickwraps
  **/
  @ApiModelProperty(value = "")
  public java.util.List<ClickwrapDeleteResponse> getClickwraps() {
    return clickwraps;
  }

  public void setClickwraps(java.util.List<ClickwrapDeleteResponse> clickwraps) {
    this.clickwraps = clickwraps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClickwrapsDeleteResponse clickwrapsDeleteResponse = (ClickwrapsDeleteResponse) o;
    return Objects.equals(this.clickwraps, clickwrapsDeleteResponse.clickwraps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clickwraps);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClickwrapsDeleteResponse {\n");
    
    sb.append("    clickwraps: ").append(toIndentedString(clickwraps)).append("\n");
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

