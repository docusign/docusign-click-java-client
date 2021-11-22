package com.docusign.click.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.click.model.DocumentData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * UserAgreementRequest.
 *
 */

public class UserAgreementRequest {
  @JsonProperty("clientUserId")
  private String clientUserId = null;

  @JsonProperty("documentData")
  private DocumentData documentData = null;

  @JsonProperty("metadata")
  private String metadata = null;


  /**
   * clientUserId.
   *
   * @return UserAgreementRequest
   **/
  public UserAgreementRequest clientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
    return this;
  }

  /**
   * .
   * @return clientUserId
   **/
  @ApiModelProperty(value = "")
  public String getClientUserId() {
    return clientUserId;
  }

  /**
   * setClientUserId.
   **/
  public void setClientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
  }


  /**
   * documentData.
   *
   * @return UserAgreementRequest
   **/
  public UserAgreementRequest documentData(DocumentData documentData) {
    this.documentData = documentData;
    return this;
  }

  /**
   * Get documentData.
   * @return documentData
   **/
  @ApiModelProperty(value = "")
  public DocumentData getDocumentData() {
    return documentData;
  }

  /**
   * setDocumentData.
   **/
  public void setDocumentData(DocumentData documentData) {
    this.documentData = documentData;
  }


  /**
   * metadata.
   *
   * @return UserAgreementRequest
   **/
  public UserAgreementRequest metadata(String metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * .
   * @return metadata
   **/
  @ApiModelProperty(value = "")
  public String getMetadata() {
    return metadata;
  }

  /**
   * setMetadata.
   **/
  public void setMetadata(String metadata) {
    this.metadata = metadata;
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
    UserAgreementRequest userAgreementRequest = (UserAgreementRequest) o;
    return Objects.equals(this.clientUserId, userAgreementRequest.clientUserId) &&
        Objects.equals(this.documentData, userAgreementRequest.documentData) &&
        Objects.equals(this.metadata, userAgreementRequest.metadata);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(clientUserId, documentData, metadata);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAgreementRequest {\n");
    
    sb.append("    clientUserId: ").append(toIndentedString(clientUserId)).append("\n");
    sb.append("    documentData: ").append(toIndentedString(documentData)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

