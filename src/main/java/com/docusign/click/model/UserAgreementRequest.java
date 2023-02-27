package com.docusign.click.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Data used to create the agreement..
 *
 */
@ApiModel(description = "Data used to create the agreement.")

public class UserAgreementRequest {
  @JsonProperty("clientUserId")
  private String clientUserId = null;

  @JsonProperty("documentData")
  private java.util.Map<String, String> documentData = null;

  @JsonProperty("metadata")
  private String metadata = null;

  @JsonProperty("returnUrl")
  private String returnUrl = null;


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
   * A unique value that identifies a user. You can use anything that your system uses to identify unique users, such as employee IDs, email addresses, and surrogate keys as the value of `clientUserId`.  A clickwrap with a specific `clientUserId` will not appear again once it has been accepted. .
   * @return clientUserId
   **/
  @ApiModelProperty(value = "A unique value that identifies a user. You can use anything that your system uses to identify unique users, such as employee IDs, email addresses, and surrogate keys as the value of `clientUserId`.  A clickwrap with a specific `clientUserId` will not appear again once it has been accepted. ")
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
  public UserAgreementRequest documentData(java.util.Map<String, String> documentData) {
    this.documentData = documentData;
    return this;
  }

  /**
   * putDocumentDataItem.
   *
   * @return UserAgreementRequest
   **/
  public UserAgreementRequest putDocumentDataItem(String key, String documentDataItem) {
    if (this.documentData == null) {
      this.documentData = new java.util.HashMap<>();
    }
    this.documentData.put(key, documentDataItem);
    return this;
  }

  /**
   * This property specifies the data used to create a clickwrap with [dynamic content][].    [dynamic content]: /docs/click-api/click101/customize-clickwrap-fields/#embed-clickwraps-that-contain-dynamic-content .
   * @return documentData
   **/
  @ApiModelProperty(value = "This property specifies the data used to create a clickwrap with [dynamic content][].    [dynamic content]: /docs/click-api/click101/customize-clickwrap-fields/#embed-clickwraps-that-contain-dynamic-content ")
  public java.util.Map<String, String> getDocumentData() {
    return documentData;
  }

  /**
   * setDocumentData.
   **/
  public void setDocumentData(java.util.Map<String, String> documentData) {
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
   * A customer-defined string you can use in requests. This string will appear in the corresponding response..
   * @return metadata
   **/
  @ApiModelProperty(value = "A customer-defined string you can use in requests. This string will appear in the corresponding response.")
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
   * returnUrl.
   *
   * @return UserAgreementRequest
   **/
  public UserAgreementRequest returnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
    return this;
  }

  /**
   * The URL to redirect to after the agreement is complete when the agreement is not rendered in an iframe..
   * @return returnUrl
   **/
  @ApiModelProperty(value = "The URL to redirect to after the agreement is complete when the agreement is not rendered in an iframe.")
  public String getReturnUrl() {
    return returnUrl;
  }

  /**
   * setReturnUrl.
   **/
  public void setReturnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
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
        Objects.equals(this.metadata, userAgreementRequest.metadata) &&
        Objects.equals(this.returnUrl, userAgreementRequest.returnUrl);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(clientUserId, documentData, metadata, returnUrl);
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
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
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

