package com.docusign.click.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * HtmlResult
 */

public class HtmlResult {
  @JsonProperty("fileName")
  private String fileName = null;

  @JsonProperty("html")
  private String html = null;

  public HtmlResult fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * 
   * @return fileName
  **/
  @Schema(description = "")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public HtmlResult html(String html) {
    this.html = html;
    return this;
  }

   /**
   * 
   * @return html
  **/
  @Schema(description = "")
  public String getHtml() {
    return html;
  }

  public void setHtml(String html) {
    this.html = html;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HtmlResult htmlResult = (HtmlResult) o;
    return Objects.equals(this.fileName, htmlResult.fileName) &&
        Objects.equals(this.html, htmlResult.html);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, html);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HtmlResult {\n");
    
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
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

