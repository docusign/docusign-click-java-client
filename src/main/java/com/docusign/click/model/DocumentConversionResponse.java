package com.docusign.click.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.click.model.HtmlResult;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DocumentConversionResponse
 */

public class DocumentConversionResponse {
  @JsonProperty("htmlResults")
  private java.util.List<HtmlResult> htmlResults = null;

  public DocumentConversionResponse htmlResults(java.util.List<HtmlResult> htmlResults) {
    this.htmlResults = htmlResults;
    return this;
  }

  public DocumentConversionResponse addHtmlResultsItem(HtmlResult htmlResultsItem) {
    if (this.htmlResults == null) {
      this.htmlResults = new java.util.ArrayList<HtmlResult>();
    }
    this.htmlResults.add(htmlResultsItem);
    return this;
  }

   /**
   * 
   * @return htmlResults
  **/
  @Schema(description = "")
  public java.util.List<HtmlResult> getHtmlResults() {
    return htmlResults;
  }

  public void setHtmlResults(java.util.List<HtmlResult> htmlResults) {
    this.htmlResults = htmlResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentConversionResponse documentConversionResponse = (DocumentConversionResponse) o;
    return Objects.equals(this.htmlResults, documentConversionResponse.htmlResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(htmlResults);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentConversionResponse {\n");
    
    sb.append("    htmlResults: ").append(toIndentedString(htmlResults)).append("\n");
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

