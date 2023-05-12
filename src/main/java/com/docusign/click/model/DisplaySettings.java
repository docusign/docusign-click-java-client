package com.docusign.click.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Information about how an agreement is displayed..
 *
 */
@Schema(description = "Information about how an agreement is displayed.")

public class DisplaySettings {
  @JsonProperty("actionButtonAlignment")
  private String actionButtonAlignment = null;

  @JsonProperty("allowClientOnly")
  private Boolean allowClientOnly = null;

  @JsonProperty("allowedHosts")
  private java.util.List<String> allowedHosts = null;

  @JsonProperty("brandId")
  private String brandId = null;

  @JsonProperty("consentButtonText")
  private String consentButtonText = null;

  @JsonProperty("consentText")
  private String consentText = null;

  @JsonProperty("declineButtonText")
  private String declineButtonText = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("documentDisplay")
  private String documentDisplay = null;

  @JsonProperty("downloadable")
  private Boolean downloadable = null;

  @JsonProperty("format")
  private String format = null;

  @JsonProperty("hasDeclineButton")
  private Boolean hasDeclineButton = null;

  @JsonProperty("mustRead")
  private Boolean mustRead = null;

  @JsonProperty("mustView")
  private Boolean mustView = null;

  @JsonProperty("recordDeclineResponses")
  private Boolean recordDeclineResponses = null;

  @JsonProperty("requireAccept")
  private Boolean requireAccept = null;

  @JsonProperty("sendToEmail")
  private Boolean sendToEmail = null;

  @JsonProperty("statementAlignment")
  private String statementAlignment = null;


  /**
   * actionButtonAlignment.
   *
   * @return DisplaySettings
   **/
  public DisplaySettings actionButtonAlignment(String actionButtonAlignment) {
    this.actionButtonAlignment = actionButtonAlignment;
    return this;
  }

  /**
   * Position of the Accept button in the agreement. One of   - `right` - `left` .
   * @return actionButtonAlignment
   **/
  @Schema(description = "Position of the Accept button in the agreement. One of   - `right` - `left` ")
  public String getActionButtonAlignment() {
    return actionButtonAlignment;
  }

  /**
   * setActionButtonAlignment.
   **/
  public void setActionButtonAlignment(String actionButtonAlignment) {
    this.actionButtonAlignment = actionButtonAlignment;
  }


  /**
   * allowClientOnly.
   *
   * @return DisplaySettings
   **/
  public DisplaySettings allowClientOnly(Boolean allowClientOnly) {
    this.allowClientOnly = allowClientOnly;
    return this;
  }

  /**
   * When **true,** this agreement can be be used in client-only integrations..
   * @return allowClientOnly
   **/
  @Schema(description = "When **true,** this agreement can be be used in client-only integrations.")
  public Boolean isAllowClientOnly() {
    return allowClientOnly;
  }

  /**
   * setAllowClientOnly.
   **/
  public void setAllowClientOnly(Boolean allowClientOnly) {
    this.allowClientOnly = allowClientOnly;
  }


  /**
   * allowedHosts.
   *
   * @return DisplaySettings
   **/
  public DisplaySettings allowedHosts(java.util.List<String> allowedHosts) {
    this.allowedHosts = allowedHosts;
    return this;
  }
  
  /**
   * addAllowedHostsItem.
   *
   * @return DisplaySettings
   **/
  public DisplaySettings addAllowedHostsItem(String allowedHostsItem) {
    if (this.allowedHosts == null) {
      this.allowedHosts = new java.util.ArrayList<>();
    }
    this.allowedHosts.add(allowedHostsItem);
    return this;
  }

  /**
   * Hosts that can host the clickwrap.  It is an error if the clickwrap didn't come from one of these hosts. .
   * @return allowedHosts
   **/
  @Schema(description = "Hosts that can host the clickwrap.  It is an error if the clickwrap didn't come from one of these hosts. ")
  public java.util.List<String> getAllowedHosts() {
    return allowedHosts;
  }

  /**
   * setAllowedHosts.
   **/
  public void setAllowedHosts(java.util.List<String> allowedHosts) {
    this.allowedHosts = allowedHosts;
  }


  /**
   * brandId.
   *
   * @return DisplaySettings
   **/
  public DisplaySettings brandId(String brandId) {
    this.brandId = brandId;
    return this;
  }

  /**
   * The signing brand ID..
   * @return brandId
   **/
  @Schema(description = "The signing brand ID.")
  public String getBrandId() {
    return brandId;
  }

  /**
   * setBrandId.
   **/
  public void setBrandId(String brandId) {
    this.brandId = brandId;
  }


  /**
   * consentButtonText.
   *
   * @return DisplaySettings
   **/
  public DisplaySettings consentButtonText(String consentButtonText) {
    this.consentButtonText = consentButtonText;
    return this;
  }

  /**
   * Text on the agree button..
   * @return consentButtonText
   **/
  @Schema(description = "Text on the agree button.")
  public String getConsentButtonText() {
    return consentButtonText;
  }

  /**
   * setConsentButtonText.
   **/
  public void setConsentButtonText(String consentButtonText) {
    this.consentButtonText = consentButtonText;
  }


  /**
   * consentText.
   *
   * @return DisplaySettings
   **/
  public DisplaySettings consentText(String consentText) {
    this.consentText = consentText;
    return this;
  }

  /**
   * The statement prefixing the Electronic Record and Signature Disclosure agreement..
   * @return consentText
   **/
  @Schema(description = "The statement prefixing the Electronic Record and Signature Disclosure agreement.")
  public String getConsentText() {
    return consentText;
  }

  /**
   * setConsentText.
   **/
  public void setConsentText(String consentText) {
    this.consentText = consentText;
  }


  /**
   * declineButtonText.
   *
   * @return DisplaySettings
   **/
  public DisplaySettings declineButtonText(String declineButtonText) {
    this.declineButtonText = declineButtonText;
    return this;
  }

  /**
   * The text on the decline button..
   * @return declineButtonText
   **/
  @Schema(description = "The text on the decline button.")
  public String getDeclineButtonText() {
    return declineButtonText;
  }

  /**
   * setDeclineButtonText.
   **/
  public void setDeclineButtonText(String declineButtonText) {
    this.declineButtonText = declineButtonText;
  }


  /**
   * displayName.
   *
   * @return DisplaySettings
   **/
  public DisplaySettings displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The display name of the user agreement..
   * @return displayName
   **/
  @Schema(description = "The display name of the user agreement.")
  public String getDisplayName() {
    return displayName;
  }

  /**
   * setDisplayName.
   **/
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  /**
   * documentDisplay.
   *
   * @return DisplaySettings
   **/
  public DisplaySettings documentDisplay(String documentDisplay) {
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
   * downloadable.
   *
   * @return DisplaySettings
   **/
  public DisplaySettings downloadable(Boolean downloadable) {
    this.downloadable = downloadable;
    return this;
  }

  /**
   * **True** if the agreement is downloadable..
   * @return downloadable
   **/
  @Schema(description = "**True** if the agreement is downloadable.")
  public Boolean isDownloadable() {
    return downloadable;
  }

  /**
   * setDownloadable.
   **/
  public void setDownloadable(Boolean downloadable) {
    this.downloadable = downloadable;
  }


  /**
   * format.
   *
   * @return DisplaySettings
   **/
  public DisplaySettings format(String format) {
    this.format = format;
    return this;
  }

  /**
   * Display format: inline or modal..
   * @return format
   **/
  @Schema(description = "Display format: inline or modal.")
  public String getFormat() {
    return format;
  }

  /**
   * setFormat.
   **/
  public void setFormat(String format) {
    this.format = format;
  }


  /**
   * hasDeclineButton.
   *
   * @return DisplaySettings
   **/
  public DisplaySettings hasDeclineButton(Boolean hasDeclineButton) {
    this.hasDeclineButton = hasDeclineButton;
    return this;
  }

  /**
   * **True** if the agreement has a decline button..
   * @return hasDeclineButton
   **/
  @Schema(description = "**True** if the agreement has a decline button.")
  public Boolean isHasDeclineButton() {
    return hasDeclineButton;
  }

  /**
   * setHasDeclineButton.
   **/
  public void setHasDeclineButton(Boolean hasDeclineButton) {
    this.hasDeclineButton = hasDeclineButton;
  }


  /**
   * mustRead.
   *
   * @return DisplaySettings
   **/
  public DisplaySettings mustRead(Boolean mustRead) {
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
   * @return DisplaySettings
   **/
  public DisplaySettings mustView(Boolean mustView) {
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
   * recordDeclineResponses.
   *
   * @return DisplaySettings
   **/
  public DisplaySettings recordDeclineResponses(Boolean recordDeclineResponses) {
    this.recordDeclineResponses = recordDeclineResponses;
    return this;
  }

  /**
   * When **true,** this agreement records decline actions..
   * @return recordDeclineResponses
   **/
  @Schema(description = "When **true,** this agreement records decline actions.")
  public Boolean isRecordDeclineResponses() {
    return recordDeclineResponses;
  }

  /**
   * setRecordDeclineResponses.
   **/
  public void setRecordDeclineResponses(Boolean recordDeclineResponses) {
    this.recordDeclineResponses = recordDeclineResponses;
  }


  /**
   * requireAccept.
   *
   * @return DisplaySettings
   **/
  public DisplaySettings requireAccept(Boolean requireAccept) {
    this.requireAccept = requireAccept;
    return this;
  }

  /**
   * **True** if a checkbox is required to accept..
   * @return requireAccept
   **/
  @Schema(description = "**True** if a checkbox is required to accept.")
  public Boolean isRequireAccept() {
    return requireAccept;
  }

  /**
   * setRequireAccept.
   **/
  public void setRequireAccept(Boolean requireAccept) {
    this.requireAccept = requireAccept;
  }


  /**
   * sendToEmail.
   *
   * @return DisplaySettings
   **/
  public DisplaySettings sendToEmail(Boolean sendToEmail) {
    this.sendToEmail = sendToEmail;
    return this;
  }

  /**
   * **True** if send to email is applicable..
   * @return sendToEmail
   **/
  @Schema(description = "**True** if send to email is applicable.")
  public Boolean isSendToEmail() {
    return sendToEmail;
  }

  /**
   * setSendToEmail.
   **/
  public void setSendToEmail(Boolean sendToEmail) {
    this.sendToEmail = sendToEmail;
  }


  /**
   * statementAlignment.
   *
   * @return DisplaySettings
   **/
  public DisplaySettings statementAlignment(String statementAlignment) {
    this.statementAlignment = statementAlignment;
    return this;
  }

  /**
   * Position of the agreement statement. One of   - `top` - `bottom` .
   * @return statementAlignment
   **/
  @Schema(description = "Position of the agreement statement. One of   - `top` - `bottom` ")
  public String getStatementAlignment() {
    return statementAlignment;
  }

  /**
   * setStatementAlignment.
   **/
  public void setStatementAlignment(String statementAlignment) {
    this.statementAlignment = statementAlignment;
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
    DisplaySettings displaySettings = (DisplaySettings) o;
    return Objects.equals(this.actionButtonAlignment, displaySettings.actionButtonAlignment) &&
        Objects.equals(this.allowClientOnly, displaySettings.allowClientOnly) &&
        Objects.equals(this.allowedHosts, displaySettings.allowedHosts) &&
        Objects.equals(this.brandId, displaySettings.brandId) &&
        Objects.equals(this.consentButtonText, displaySettings.consentButtonText) &&
        Objects.equals(this.consentText, displaySettings.consentText) &&
        Objects.equals(this.declineButtonText, displaySettings.declineButtonText) &&
        Objects.equals(this.displayName, displaySettings.displayName) &&
        Objects.equals(this.documentDisplay, displaySettings.documentDisplay) &&
        Objects.equals(this.downloadable, displaySettings.downloadable) &&
        Objects.equals(this.format, displaySettings.format) &&
        Objects.equals(this.hasDeclineButton, displaySettings.hasDeclineButton) &&
        Objects.equals(this.mustRead, displaySettings.mustRead) &&
        Objects.equals(this.mustView, displaySettings.mustView) &&
        Objects.equals(this.recordDeclineResponses, displaySettings.recordDeclineResponses) &&
        Objects.equals(this.requireAccept, displaySettings.requireAccept) &&
        Objects.equals(this.sendToEmail, displaySettings.sendToEmail) &&
        Objects.equals(this.statementAlignment, displaySettings.statementAlignment);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(actionButtonAlignment, allowClientOnly, allowedHosts, brandId, consentButtonText, consentText, declineButtonText, displayName, documentDisplay, downloadable, format, hasDeclineButton, mustRead, mustView, recordDeclineResponses, requireAccept, sendToEmail, statementAlignment);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplaySettings {\n");
    
    sb.append("    actionButtonAlignment: ").append(toIndentedString(actionButtonAlignment)).append("\n");
    sb.append("    allowClientOnly: ").append(toIndentedString(allowClientOnly)).append("\n");
    sb.append("    allowedHosts: ").append(toIndentedString(allowedHosts)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    consentButtonText: ").append(toIndentedString(consentButtonText)).append("\n");
    sb.append("    consentText: ").append(toIndentedString(consentText)).append("\n");
    sb.append("    declineButtonText: ").append(toIndentedString(declineButtonText)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    documentDisplay: ").append(toIndentedString(documentDisplay)).append("\n");
    sb.append("    downloadable: ").append(toIndentedString(downloadable)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    hasDeclineButton: ").append(toIndentedString(hasDeclineButton)).append("\n");
    sb.append("    mustRead: ").append(toIndentedString(mustRead)).append("\n");
    sb.append("    mustView: ").append(toIndentedString(mustView)).append("\n");
    sb.append("    recordDeclineResponses: ").append(toIndentedString(recordDeclineResponses)).append("\n");
    sb.append("    requireAccept: ").append(toIndentedString(requireAccept)).append("\n");
    sb.append("    sendToEmail: ").append(toIndentedString(sendToEmail)).append("\n");
    sb.append("    statementAlignment: ").append(toIndentedString(statementAlignment)).append("\n");
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

