package com.docusign.click.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.click.model.DisplaySettings;
import com.docusign.click.model.Document;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * UserAgreementResponse.
 *
 */

public class UserAgreementResponse {
  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("agreedOn")
  private Object agreedOn = null;

  @JsonProperty("agreementId")
  private String agreementId = null;

  @JsonProperty("agreementUrl")
  private String agreementUrl = null;

  @JsonProperty("clickwrapId")
  private String clickwrapId = null;

  @JsonProperty("clientUserId")
  private String clientUserId = null;

  @JsonProperty("consumerDisclosureHtml")
  private String consumerDisclosureHtml = null;

  @JsonProperty("createdOn")
  private Object createdOn = null;

  @JsonProperty("declinedOn")
  private Object declinedOn = null;

  @JsonProperty("documents")
  private java.util.List<Document> documents = null;

  @JsonProperty("metadata")
  private String metadata = null;

  @JsonProperty("settings")
  private DisplaySettings settings = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("versionId")
  private String versionId = null;

  @JsonProperty("versionNumber")
  private Integer versionNumber = null;


  /**
   * accountId.
   *
   * @return UserAgreementResponse
   **/
  public UserAgreementResponse accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * .
   * @return accountId
   **/
  @ApiModelProperty(value = "")
  public String getAccountId() {
    return accountId;
  }

  /**
   * setAccountId.
   **/
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  /**
   * agreedOn.
   *
   * @return UserAgreementResponse
   **/
  public UserAgreementResponse agreedOn(Object agreedOn) {
    this.agreedOn = agreedOn;
    return this;
  }

  /**
   * .
   * @return agreedOn
   **/
  @ApiModelProperty(value = "")
  public Object getAgreedOn() {
    return agreedOn;
  }

  /**
   * setAgreedOn.
   **/
  public void setAgreedOn(Object agreedOn) {
    this.agreedOn = agreedOn;
  }


  /**
   * agreementId.
   *
   * @return UserAgreementResponse
   **/
  public UserAgreementResponse agreementId(String agreementId) {
    this.agreementId = agreementId;
    return this;
  }

  /**
   * .
   * @return agreementId
   **/
  @ApiModelProperty(value = "")
  public String getAgreementId() {
    return agreementId;
  }

  /**
   * setAgreementId.
   **/
  public void setAgreementId(String agreementId) {
    this.agreementId = agreementId;
  }


  /**
   * agreementUrl.
   *
   * @return UserAgreementResponse
   **/
  public UserAgreementResponse agreementUrl(String agreementUrl) {
    this.agreementUrl = agreementUrl;
    return this;
  }

  /**
   * .
   * @return agreementUrl
   **/
  @ApiModelProperty(value = "")
  public String getAgreementUrl() {
    return agreementUrl;
  }

  /**
   * setAgreementUrl.
   **/
  public void setAgreementUrl(String agreementUrl) {
    this.agreementUrl = agreementUrl;
  }


  /**
   * clickwrapId.
   *
   * @return UserAgreementResponse
   **/
  public UserAgreementResponse clickwrapId(String clickwrapId) {
    this.clickwrapId = clickwrapId;
    return this;
  }

  /**
   * .
   * @return clickwrapId
   **/
  @ApiModelProperty(value = "")
  public String getClickwrapId() {
    return clickwrapId;
  }

  /**
   * setClickwrapId.
   **/
  public void setClickwrapId(String clickwrapId) {
    this.clickwrapId = clickwrapId;
  }


  /**
   * clientUserId.
   *
   * @return UserAgreementResponse
   **/
  public UserAgreementResponse clientUserId(String clientUserId) {
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
   * consumerDisclosureHtml.
   *
   * @return UserAgreementResponse
   **/
  public UserAgreementResponse consumerDisclosureHtml(String consumerDisclosureHtml) {
    this.consumerDisclosureHtml = consumerDisclosureHtml;
    return this;
  }

  /**
   * .
   * @return consumerDisclosureHtml
   **/
  @ApiModelProperty(value = "")
  public String getConsumerDisclosureHtml() {
    return consumerDisclosureHtml;
  }

  /**
   * setConsumerDisclosureHtml.
   **/
  public void setConsumerDisclosureHtml(String consumerDisclosureHtml) {
    this.consumerDisclosureHtml = consumerDisclosureHtml;
  }


  /**
   * createdOn.
   *
   * @return UserAgreementResponse
   **/
  public UserAgreementResponse createdOn(Object createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * .
   * @return createdOn
   **/
  @ApiModelProperty(value = "")
  public Object getCreatedOn() {
    return createdOn;
  }

  /**
   * setCreatedOn.
   **/
  public void setCreatedOn(Object createdOn) {
    this.createdOn = createdOn;
  }


  /**
   * declinedOn.
   *
   * @return UserAgreementResponse
   **/
  public UserAgreementResponse declinedOn(Object declinedOn) {
    this.declinedOn = declinedOn;
    return this;
  }

  /**
   * .
   * @return declinedOn
   **/
  @ApiModelProperty(value = "")
  public Object getDeclinedOn() {
    return declinedOn;
  }

  /**
   * setDeclinedOn.
   **/
  public void setDeclinedOn(Object declinedOn) {
    this.declinedOn = declinedOn;
  }


  /**
   * documents.
   *
   * @return UserAgreementResponse
   **/
  public UserAgreementResponse documents(java.util.List<Document> documents) {
    this.documents = documents;
    return this;
  }
  
  /**
   * addDocumentsItem.
   *
   * @return UserAgreementResponse
   **/
  public UserAgreementResponse addDocumentsItem(Document documentsItem) {
    if (this.documents == null) {
      this.documents = new java.util.ArrayList<Document>();
    }
    this.documents.add(documentsItem);
    return this;
  }

  /**
   * .
   * @return documents
   **/
  @ApiModelProperty(value = "")
  public java.util.List<Document> getDocuments() {
    return documents;
  }

  /**
   * setDocuments.
   **/
  public void setDocuments(java.util.List<Document> documents) {
    this.documents = documents;
  }


  /**
   * metadata.
   *
   * @return UserAgreementResponse
   **/
  public UserAgreementResponse metadata(String metadata) {
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
   * settings.
   *
   * @return UserAgreementResponse
   **/
  public UserAgreementResponse settings(DisplaySettings settings) {
    this.settings = settings;
    return this;
  }

  /**
   * Get settings.
   * @return settings
   **/
  @ApiModelProperty(value = "")
  public DisplaySettings getSettings() {
    return settings;
  }

  /**
   * setSettings.
   **/
  public void setSettings(DisplaySettings settings) {
    this.settings = settings;
  }


  /**
   * status.
   *
   * @return UserAgreementResponse
   **/
  public UserAgreementResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * .
   * @return status
   **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  /**
   * setStatus.
   **/
  public void setStatus(String status) {
    this.status = status;
  }


  /**
   * version.
   *
   * @return UserAgreementResponse
   **/
  public UserAgreementResponse version(String version) {
    this.version = version;
    return this;
  }

  /**
   * .
   * @return version
   **/
  @ApiModelProperty(value = "")
  public String getVersion() {
    return version;
  }

  /**
   * setVersion.
   **/
  public void setVersion(String version) {
    this.version = version;
  }


  /**
   * versionId.
   *
   * @return UserAgreementResponse
   **/
  public UserAgreementResponse versionId(String versionId) {
    this.versionId = versionId;
    return this;
  }

  /**
   * .
   * @return versionId
   **/
  @ApiModelProperty(value = "")
  public String getVersionId() {
    return versionId;
  }

  /**
   * setVersionId.
   **/
  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }


  /**
   * versionNumber.
   *
   * @return UserAgreementResponse
   **/
  public UserAgreementResponse versionNumber(Integer versionNumber) {
    this.versionNumber = versionNumber;
    return this;
  }

  /**
   * .
   * @return versionNumber
   **/
  @ApiModelProperty(value = "")
  public Integer getVersionNumber() {
    return versionNumber;
  }

  /**
   * setVersionNumber.
   **/
  public void setVersionNumber(Integer versionNumber) {
    this.versionNumber = versionNumber;
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
    UserAgreementResponse userAgreementResponse = (UserAgreementResponse) o;
    return Objects.equals(this.accountId, userAgreementResponse.accountId) &&
        Objects.equals(this.agreedOn, userAgreementResponse.agreedOn) &&
        Objects.equals(this.agreementId, userAgreementResponse.agreementId) &&
        Objects.equals(this.agreementUrl, userAgreementResponse.agreementUrl) &&
        Objects.equals(this.clickwrapId, userAgreementResponse.clickwrapId) &&
        Objects.equals(this.clientUserId, userAgreementResponse.clientUserId) &&
        Objects.equals(this.consumerDisclosureHtml, userAgreementResponse.consumerDisclosureHtml) &&
        Objects.equals(this.createdOn, userAgreementResponse.createdOn) &&
        Objects.equals(this.declinedOn, userAgreementResponse.declinedOn) &&
        Objects.equals(this.documents, userAgreementResponse.documents) &&
        Objects.equals(this.metadata, userAgreementResponse.metadata) &&
        Objects.equals(this.settings, userAgreementResponse.settings) &&
        Objects.equals(this.status, userAgreementResponse.status) &&
        Objects.equals(this.version, userAgreementResponse.version) &&
        Objects.equals(this.versionId, userAgreementResponse.versionId) &&
        Objects.equals(this.versionNumber, userAgreementResponse.versionNumber);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(accountId, agreedOn, agreementId, agreementUrl, clickwrapId, clientUserId, consumerDisclosureHtml, createdOn, declinedOn, documents, metadata, settings, status, version, versionId, versionNumber);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAgreementResponse {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    agreedOn: ").append(toIndentedString(agreedOn)).append("\n");
    sb.append("    agreementId: ").append(toIndentedString(agreementId)).append("\n");
    sb.append("    agreementUrl: ").append(toIndentedString(agreementUrl)).append("\n");
    sb.append("    clickwrapId: ").append(toIndentedString(clickwrapId)).append("\n");
    sb.append("    clientUserId: ").append(toIndentedString(clientUserId)).append("\n");
    sb.append("    consumerDisclosureHtml: ").append(toIndentedString(consumerDisclosureHtml)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    declinedOn: ").append(toIndentedString(declinedOn)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
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

