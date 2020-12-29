package com.docusign.click.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Document
 */

public class Document {
  @JsonProperty("documentBase64")
  private String documentBase64 = null;

  @JsonProperty("documentHtml")
  private String documentHtml = null;

  @JsonProperty("documentName")
  private String documentName = null;

  @JsonProperty("fileExtension")
  private String fileExtension = null;

  @JsonProperty("order")
  private Integer order = null;

  public Document documentBase64(String documentBase64) {
    this.documentBase64 = documentBase64;
    return this;
  }

   /**
   * 
   * @return documentBase64
  **/
  @ApiModelProperty(value = "")
  public String getDocumentBase64() {
    return documentBase64;
  }

  public void setDocumentBase64(String documentBase64) {
    this.documentBase64 = documentBase64;
  }

  public Document documentHtml(String documentHtml) {
    this.documentHtml = documentHtml;
    return this;
  }

   /**
   * 
   * @return documentHtml
  **/
  @ApiModelProperty(value = "")
  public String getDocumentHtml() {
    return documentHtml;
  }

  public void setDocumentHtml(String documentHtml) {
    this.documentHtml = documentHtml;
  }

  public Document documentName(String documentName) {
    this.documentName = documentName;
    return this;
  }

   /**
   * 
   * @return documentName
  **/
  @ApiModelProperty(value = "")
  public String getDocumentName() {
    return documentName;
  }

  public void setDocumentName(String documentName) {
    this.documentName = documentName;
  }

  public Document fileExtension(String fileExtension) {
    this.fileExtension = fileExtension;
    return this;
  }

   /**
   * 
   * @return fileExtension
  **/
  @ApiModelProperty(value = "")
  public String getFileExtension() {
    return fileExtension;
  }

  public void setFileExtension(String fileExtension) {
    this.fileExtension = fileExtension;
  }

  public Document order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * 
   * @return order
  **/
  @ApiModelProperty(value = "")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Document document = (Document) o;
    return Objects.equals(this.documentBase64, document.documentBase64) &&
        Objects.equals(this.documentHtml, document.documentHtml) &&
        Objects.equals(this.documentName, document.documentName) &&
        Objects.equals(this.fileExtension, document.fileExtension) &&
        Objects.equals(this.order, document.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentBase64, documentHtml, documentName, fileExtension, order);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    
    sb.append("    documentBase64: ").append(toIndentedString(documentBase64)).append("\n");
    sb.append("    documentHtml: ").append(toIndentedString(documentHtml)).append("\n");
    sb.append("    documentName: ").append(toIndentedString(documentName)).append("\n");
    sb.append("    fileExtension: ").append(toIndentedString(fileExtension)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

