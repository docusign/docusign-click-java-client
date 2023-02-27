package com.docusign.click.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.click.model.DataField;
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

  @JsonProperty("consumerDisclosureEnabled")
  private Boolean consumerDisclosureEnabled = null;

  @JsonProperty("consumerDisclosureHtml")
  private String consumerDisclosureHtml = null;

  @JsonProperty("createdOn")
  private Object createdOn = null;

  @JsonProperty("dataFields")
  private java.util.List<DataField> dataFields = null;

  @JsonProperty("declinedOn")
  private Object declinedOn = null;

  @JsonProperty("documentData")
  private java.util.Map<String, String> documentData = null;

  @JsonProperty("documents")
  private java.util.List<Document> documents = null;

  @JsonProperty("metadata")
  private String metadata = null;

  @JsonProperty("returnUrl")
  private String returnUrl = null;

  @JsonProperty("settings")
  private DisplaySettings settings = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("style")
  private java.util.Map<String, String> style = null;

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
   * The external account number (int) or account ID GUID..
   * @return accountId
   **/
  @ApiModelProperty(value = "The external account number (int) or account ID GUID.")
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
   * Date that the client last completed the agreement.  This property is null if `agreementUrl` is not null and `status` is not  `agreed`..
   * @return agreedOn
   **/
  @ApiModelProperty(value = "Date that the client last completed the agreement.  This property is null if `agreementUrl` is not null and `status` is not  `agreed`.")
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
   * The agreement ID..
   * @return agreementId
   **/
  @ApiModelProperty(value = "The agreement ID.")
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
   * When not null, an agreement is required for user specified by  `clientUserId`.  When missing the user specified by `clientUserId` has already agreed and does not require a new acceptance.  Use this URL to render the agreement in a web page.  <!-- or redirected to when providing redirect_url as a query parameter. --> .
   * @return agreementUrl
   **/
  @ApiModelProperty(value = "When not null, an agreement is required for user specified by  `clientUserId`.  When missing the user specified by `clientUserId` has already agreed and does not require a new acceptance.  Use this URL to render the agreement in a web page.  <!-- or redirected to when providing redirect_url as a query parameter. --> ")
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
   * The ID of the clickwrap..
   * @return clickwrapId
   **/
  @ApiModelProperty(value = "The ID of the clickwrap.")
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
   * A unique value that identifies a user.\\nYou can use anything that your system uses\\nto identify unique users, such as\\nemployee IDs, email addresses, and surrogate keys as the value of `clientUserId`.\\n\\nA clickwrap with a specific `clientUserId` will not appear again\\nonce it has been accepted.\\n\".
   * @return clientUserId
   **/
  @ApiModelProperty(value = "A unique value that identifies a user.\\nYou can use anything that your system uses\\nto identify unique users, such as\\nemployee IDs, email addresses, and surrogate keys as the value of `clientUserId`.\\n\\nA clickwrap with a specific `clientUserId` will not appear again\\nonce it has been accepted.\\n\"")
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
   * consumerDisclosureEnabled.
   *
   * @return UserAgreementResponse
   **/
  public UserAgreementResponse consumerDisclosureEnabled(Boolean consumerDisclosureEnabled) {
    this.consumerDisclosureEnabled = consumerDisclosureEnabled;
    return this;
  }

  /**
   * **True** if consumer disclosure was required by this agreement..
   * @return consumerDisclosureEnabled
   **/
  @ApiModelProperty(value = "**True** if consumer disclosure was required by this agreement.")
  public Boolean isConsumerDisclosureEnabled() {
    return consumerDisclosureEnabled;
  }

  /**
   * setConsumerDisclosureEnabled.
   **/
  public void setConsumerDisclosureEnabled(Boolean consumerDisclosureEnabled) {
    this.consumerDisclosureEnabled = consumerDisclosureEnabled;
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
   * The customer-branded HTML with the Electronic Record and Signature Disclosure information.
   * @return consumerDisclosureHtml
   **/
  @ApiModelProperty(value = "The customer-branded HTML with the Electronic Record and Signature Disclosure information")
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
   * The date when the clickwrap was created. May be null..
   * @return createdOn
   **/
  @ApiModelProperty(value = "The date when the clickwrap was created. May be null.")
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
   * dataFields.
   *
   * @return UserAgreementResponse
   **/
  public UserAgreementResponse dataFields(java.util.List<DataField> dataFields) {
    this.dataFields = dataFields;
    return this;
  }
  
  /**
   * addDataFieldsItem.
   *
   * @return UserAgreementResponse
   **/
  public UserAgreementResponse addDataFieldsItem(DataField dataFieldsItem) {
    if (this.dataFields == null) {
      this.dataFields = new java.util.ArrayList<>();
    }
    this.dataFields.add(dataFieldsItem);
    return this;
  }

  /**
   * The list of all the data fields available for the clickwrap (custom fields and standard fields)..
   * @return dataFields
   **/
  @ApiModelProperty(value = "The list of all the data fields available for the clickwrap (custom fields and standard fields).")
  public java.util.List<DataField> getDataFields() {
    return dataFields;
  }

  /**
   * setDataFields.
   **/
  public void setDataFields(java.util.List<DataField> dataFields) {
    this.dataFields = dataFields;
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
   * The date when the user declined the most recent required agreement.  This property is valid only when `status` is `declined`. Otherwise it is null..
   * @return declinedOn
   **/
  @ApiModelProperty(value = "The date when the user declined the most recent required agreement.  This property is valid only when `status` is `declined`. Otherwise it is null.")
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
   * documentData.
   *
   * @return UserAgreementResponse
   **/
  public UserAgreementResponse documentData(java.util.Map<String, String> documentData) {
    this.documentData = documentData;
    return this;
  }

  /**
   * putDocumentDataItem.
   *
   * @return UserAgreementResponse
   **/
  public UserAgreementResponse putDocumentDataItem(String key, String documentDataItem) {
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
      this.documents = new java.util.ArrayList<>();
    }
    this.documents.add(documentsItem);
    return this;
  }

  /**
   * An array of documents..
   * @return documents
   **/
  @ApiModelProperty(value = "An array of documents.")
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
   * @return UserAgreementResponse
   **/
  public UserAgreementResponse returnUrl(String returnUrl) {
    this.returnUrl = returnUrl;
    return this;
  }

  /**
   * The URL redirected to after the agreement was completed..
   * @return returnUrl
   **/
  @ApiModelProperty(value = "The URL redirected to after the agreement was completed.")
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
   * settings.
   *
   * @return UserAgreementResponse
   **/
  public UserAgreementResponse settings(DisplaySettings settings) {
    this.settings = settings;
    return this;
  }

  /**
   * The display settings for this agreement..
   * @return settings
   **/
  @ApiModelProperty(value = "The display settings for this agreement.")
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
   * User agreement status. One of:  - `created` - `agreed` - `declined`.
   * @return status
   **/
  @ApiModelProperty(value = "User agreement status. One of:  - `created` - `agreed` - `declined`")
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
   * style.
   *
   * @return UserAgreementResponse
   **/
  public UserAgreementResponse style(java.util.Map<String, String> style) {
    this.style = style;
    return this;
  }

  /**
   * putStyleItem.
   *
   * @return UserAgreementResponse
   **/
  public UserAgreementResponse putStyleItem(String key, String styleItem) {
    if (this.style == null) {
      this.style = new java.util.HashMap<>();
    }
    this.style.put(key, styleItem);
    return this;
  }

  /**
   * This property specifies the custom style provided when the agreement was created by [customizing the template appearance][].    [customizing the template appearance]: /docs/click-api/click101/customize-elastic-template-appearance/ .
   * @return style
   **/
  @ApiModelProperty(value = "This property specifies the custom style provided when the agreement was created by [customizing the template appearance][].    [customizing the template appearance]: /docs/click-api/click101/customize-elastic-template-appearance/ ")
  public java.util.Map<String, String> getStyle() {
    return style;
  }

  /**
   * setStyle.
   **/
  public void setStyle(java.util.Map<String, String> style) {
    this.style = style;
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
   * The human-readable semver version string..
   * @return version
   **/
  @ApiModelProperty(value = "The human-readable semver version string.")
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
   * The ID of the version..
   * @return versionId
   **/
  @ApiModelProperty(value = "The ID of the version.")
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
   * Version of the clickwrap..
   * @return versionNumber
   **/
  @ApiModelProperty(value = "Version of the clickwrap.")
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
        Objects.equals(this.consumerDisclosureEnabled, userAgreementResponse.consumerDisclosureEnabled) &&
        Objects.equals(this.consumerDisclosureHtml, userAgreementResponse.consumerDisclosureHtml) &&
        Objects.equals(this.createdOn, userAgreementResponse.createdOn) &&
        Objects.equals(this.dataFields, userAgreementResponse.dataFields) &&
        Objects.equals(this.declinedOn, userAgreementResponse.declinedOn) &&
        Objects.equals(this.documentData, userAgreementResponse.documentData) &&
        Objects.equals(this.documents, userAgreementResponse.documents) &&
        Objects.equals(this.metadata, userAgreementResponse.metadata) &&
        Objects.equals(this.returnUrl, userAgreementResponse.returnUrl) &&
        Objects.equals(this.settings, userAgreementResponse.settings) &&
        Objects.equals(this.status, userAgreementResponse.status) &&
        Objects.equals(this.style, userAgreementResponse.style) &&
        Objects.equals(this.version, userAgreementResponse.version) &&
        Objects.equals(this.versionId, userAgreementResponse.versionId) &&
        Objects.equals(this.versionNumber, userAgreementResponse.versionNumber);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(accountId, agreedOn, agreementId, agreementUrl, clickwrapId, clientUserId, consumerDisclosureEnabled, consumerDisclosureHtml, createdOn, dataFields, declinedOn, documentData, documents, metadata, returnUrl, settings, status, style, version, versionId, versionNumber);
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
    sb.append("    consumerDisclosureEnabled: ").append(toIndentedString(consumerDisclosureEnabled)).append("\n");
    sb.append("    consumerDisclosureHtml: ").append(toIndentedString(consumerDisclosureHtml)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    dataFields: ").append(toIndentedString(dataFields)).append("\n");
    sb.append("    declinedOn: ").append(toIndentedString(declinedOn)).append("\n");
    sb.append("    documentData: ").append(toIndentedString(documentData)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    returnUrl: ").append(toIndentedString(returnUrl)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
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

