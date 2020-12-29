package com.docusign.click.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ConversionDocument
 */

public class ConversionDocument {
  @JsonProperty("base64")
  private String base64 = null;

  @JsonProperty("fileExtension")
  private String fileExtension = null;

  @JsonProperty("fileName")
  private String fileName = null;

  public ConversionDocument base64(String base64) {
    this.base64 = base64;
    return this;
  }

   /**
   * 
   * @return base64
  **/
  @ApiModelProperty(value = "")
  public String getBase64() {
    return base64;
  }

  public void setBase64(String base64) {
    this.base64 = base64;
  }

  public ConversionDocument fileExtension(String fileExtension) {
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

  public ConversionDocument fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * 
   * @return fileName
  **/
  @ApiModelProperty(value = "")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionDocument conversionDocument = (ConversionDocument) o;
    return Objects.equals(this.base64, conversionDocument.base64) &&
        Objects.equals(this.fileExtension, conversionDocument.fileExtension) &&
        Objects.equals(this.fileName, conversionDocument.fileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base64, fileExtension, fileName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionDocument {\n");
    
    sb.append("    base64: ").append(toIndentedString(base64)).append("\n");
    sb.append("    fileExtension: ").append(toIndentedString(fileExtension)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
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

