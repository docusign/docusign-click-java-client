package com.docusign.click.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.click.model.ConversionDocument;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DocumentConversionRequest
 */

public class DocumentConversionRequest {
  @JsonProperty("documents")
  private java.util.List<ConversionDocument> documents = null;

  public DocumentConversionRequest documents(java.util.List<ConversionDocument> documents) {
    this.documents = documents;
    return this;
  }

  public DocumentConversionRequest addDocumentsItem(ConversionDocument documentsItem) {
    if (this.documents == null) {
      this.documents = new java.util.ArrayList<ConversionDocument>();
    }
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * 
   * @return documents
  **/
  @Schema(description = "")
  public java.util.List<ConversionDocument> getDocuments() {
    return documents;
  }

  public void setDocuments(java.util.List<ConversionDocument> documents) {
    this.documents = documents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentConversionRequest documentConversionRequest = (DocumentConversionRequest) o;
    return Objects.equals(this.documents, documentConversionRequest.documents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentConversionRequest {\n");
    
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
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

