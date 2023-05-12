package com.docusign.click.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Information about a document..
 *
 */
@Schema(description = "Information about a document.")

public class Document {
  @JsonProperty("documentBase64")
  private String documentBase64 = null;

  @JsonProperty("documentDisplay")
  private String documentDisplay = null;

  @JsonProperty("documentHtml")
  private String documentHtml = null;

  @JsonProperty("documentName")
  private String documentName = null;

  @JsonProperty("fileExtension")
  private String fileExtension = null;

  @JsonProperty("mustRead")
  private Boolean mustRead = null;

  @JsonProperty("mustView")
  private Boolean mustView = null;

  @JsonProperty("order")
  private Integer order = null;


  /**
   * documentBase64.
   *
   * @return Document
   **/
  public Document documentBase64(String documentBase64) {
    this.documentBase64 = documentBase64;
    return this;
  }

  /**
   * The base64-encoded contents of the document..
   * @return documentBase64
   **/
  @Schema(description = "The base64-encoded contents of the document.")
  public String getDocumentBase64() {
    return documentBase64;
  }

  /**
   * setDocumentBase64.
   **/
  public void setDocumentBase64(String documentBase64) {
    this.documentBase64 = documentBase64;
  }


  /**
   * documentDisplay.
   *
   * @return Document
   **/
  public Document documentDisplay(String documentDisplay) {
    this.documentDisplay = documentDisplay;
    return this;
  }

  /**
   * Display type: link, document or pdf.
   * @return documentDisplay
   **/
  @Schema(description = "Display type: link, document or pdf")
  public String getDocumentDisplay() {
    return documentDisplay;
  }

  /**
   * setDocumentDisplay.
   **/
  public void setDocumentDisplay(String documentDisplay) {
    this.documentDisplay = documentDisplay;
  }


  /**
   * documentHtml.
   *
   * @return Document
   **/
  public Document documentHtml(String documentHtml) {
    this.documentHtml = documentHtml;
    return this;
  }

  /**
   * The HTML representation of the document..
   * @return documentHtml
   **/
  @Schema(description = "The HTML representation of the document.")
  public String getDocumentHtml() {
    return documentHtml;
  }

  /**
   * setDocumentHtml.
   **/
  public void setDocumentHtml(String documentHtml) {
    this.documentHtml = documentHtml;
  }


  /**
   * documentName.
   *
   * @return Document
   **/
  public Document documentName(String documentName) {
    this.documentName = documentName;
    return this;
  }

  /**
   * The name of the document..
   * @return documentName
   **/
  @Schema(description = "The name of the document.")
  public String getDocumentName() {
    return documentName;
  }

  /**
   * setDocumentName.
   **/
  public void setDocumentName(String documentName) {
    this.documentName = documentName;
  }


  /**
   * fileExtension.
   *
   * @return Document
   **/
  public Document fileExtension(String fileExtension) {
    this.fileExtension = fileExtension;
    return this;
  }

  /**
   * The file extension of the document..
   * @return fileExtension
   **/
  @Schema(description = "The file extension of the document.")
  public String getFileExtension() {
    return fileExtension;
  }

  /**
   * setFileExtension.
   **/
  public void setFileExtension(String fileExtension) {
    this.fileExtension = fileExtension;
  }


  /**
   * mustRead.
   *
   * @return Document
   **/
  public Document mustRead(Boolean mustRead) {
    this.mustRead = mustRead;
    return this;
  }

  /**
   * **True** if the user needs to scroll to the end of the document..
   * @return mustRead
   **/
  @Schema(description = "**True** if the user needs to scroll to the end of the document.")
  public Boolean isMustRead() {
    return mustRead;
  }

  /**
   * setMustRead.
   **/
  public void setMustRead(Boolean mustRead) {
    this.mustRead = mustRead;
  }


  /**
   * mustView.
   *
   * @return Document
   **/
  public Document mustView(Boolean mustView) {
    this.mustView = mustView;
    return this;
  }

  /**
   * **True** if the user must view the document..
   * @return mustView
   **/
  @Schema(description = "**True** if the user must view the document.")
  public Boolean isMustView() {
    return mustView;
  }

  /**
   * setMustView.
   **/
  public void setMustView(Boolean mustView) {
    this.mustView = mustView;
  }


  /**
   * order.
   *
   * @return Document
   **/
  public Document order(Integer order) {
    this.order = order;
    return this;
  }

  /**
   * The order of document layout..
   * @return order
   **/
  @Schema(description = "The order of document layout.")
  public Integer getOrder() {
    return order;
  }

  /**
   * setOrder.
   **/
  public void setOrder(Integer order) {
    this.order = order;
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
    Document document = (Document) o;
    return Objects.equals(this.documentBase64, document.documentBase64) &&
        Objects.equals(this.documentDisplay, document.documentDisplay) &&
        Objects.equals(this.documentHtml, document.documentHtml) &&
        Objects.equals(this.documentName, document.documentName) &&
        Objects.equals(this.fileExtension, document.fileExtension) &&
        Objects.equals(this.mustRead, document.mustRead) &&
        Objects.equals(this.mustView, document.mustView) &&
        Objects.equals(this.order, document.order);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(documentBase64, documentDisplay, documentHtml, documentName, fileExtension, mustRead, mustView, order);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    
    sb.append("    documentBase64: ").append(toIndentedString(documentBase64)).append("\n");
    sb.append("    documentDisplay: ").append(toIndentedString(documentDisplay)).append("\n");
    sb.append("    documentHtml: ").append(toIndentedString(documentHtml)).append("\n");
    sb.append("    documentName: ").append(toIndentedString(documentName)).append("\n");
    sb.append("    fileExtension: ").append(toIndentedString(fileExtension)).append("\n");
    sb.append("    mustRead: ").append(toIndentedString(mustRead)).append("\n");
    sb.append("    mustView: ").append(toIndentedString(mustView)).append("\n");
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

