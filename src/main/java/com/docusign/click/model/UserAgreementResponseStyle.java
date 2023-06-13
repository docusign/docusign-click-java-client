package com.docusign.click.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.click.model.AgreeButtonStyles;
import com.docusign.click.model.AgreementStatementStyles;
import com.docusign.click.model.ContainerStyles;
import com.docusign.click.model.DisclosureLinkStyles;
import com.docusign.click.model.DocumentLinkStyles;
import com.docusign.click.model.HeaderStyles;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * This property specifies the custom style provided when the agreement was created by [customizing the template appearance][].    [customizing the template appearance]: /docs/click-api/click101/customize-elastic-template-appearance/ .
 *
 */
@Schema(description = "This property specifies the custom style provided when the agreement was created by [customizing the template appearance][].    [customizing the template appearance]: /docs/click-api/click101/customize-elastic-template-appearance/ ")

public class UserAgreementResponseStyle {
  @JsonProperty("agreeButton")
  private AgreeButtonStyles agreeButton = null;

  @JsonProperty("agreementStatement")
  private AgreementStatementStyles agreementStatement = null;

  @JsonProperty("container")
  private ContainerStyles container = null;

  @JsonProperty("disclosureLink")
  private DisclosureLinkStyles disclosureLink = null;

  @JsonProperty("documentLink")
  private DocumentLinkStyles documentLink = null;

  @JsonProperty("header")
  private HeaderStyles header = null;

  /**
   * Control the scrolling of the document either by browser or by a scrollbar in the clickwrap shell. Can only be applied if the clickwrap &#x60;format&#x60; is &#x60;inline&#x60;.
   */
  public enum ScrollControlEnum {
    BROWSER("browser"),
    
    FILL_PARENT("fill_parent");

    private String value;

    ScrollControlEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ScrollControlEnum fromValue(String value) {
      for (ScrollControlEnum b : ScrollControlEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("scrollControl")
  private ScrollControlEnum scrollControl = null;


  /**
   * agreeButton.
   *
   * @return UserAgreementResponseStyle
   **/
  public UserAgreementResponseStyle agreeButton(AgreeButtonStyles agreeButton) {
    this.agreeButton = agreeButton;
    return this;
  }

  /**
   * Control the display of the Agree button..
   * @return agreeButton
   **/
  @Schema(description = "Control the display of the Agree button.")
  public AgreeButtonStyles getAgreeButton() {
    return agreeButton;
  }

  /**
   * setAgreeButton.
   **/
  public void setAgreeButton(AgreeButtonStyles agreeButton) {
    this.agreeButton = agreeButton;
  }


  /**
   * agreementStatement.
   *
   * @return UserAgreementResponseStyle
   **/
  public UserAgreementResponseStyle agreementStatement(AgreementStatementStyles agreementStatement) {
    this.agreementStatement = agreementStatement;
    return this;
  }

  /**
   * Control the display of the agreement statement..
   * @return agreementStatement
   **/
  @Schema(description = "Control the display of the agreement statement.")
  public AgreementStatementStyles getAgreementStatement() {
    return agreementStatement;
  }

  /**
   * setAgreementStatement.
   **/
  public void setAgreementStatement(AgreementStatementStyles agreementStatement) {
    this.agreementStatement = agreementStatement;
  }


  /**
   * container.
   *
   * @return UserAgreementResponseStyle
   **/
  public UserAgreementResponseStyle container(ContainerStyles container) {
    this.container = container;
    return this;
  }

  /**
   * Control the overall clickwrap container and inherited styles such as font..
   * @return container
   **/
  @Schema(description = "Control the overall clickwrap container and inherited styles such as font.")
  public ContainerStyles getContainer() {
    return container;
  }

  /**
   * setContainer.
   **/
  public void setContainer(ContainerStyles container) {
    this.container = container;
  }


  /**
   * disclosureLink.
   *
   * @return UserAgreementResponseStyle
   **/
  public UserAgreementResponseStyle disclosureLink(DisclosureLinkStyles disclosureLink) {
    this.disclosureLink = disclosureLink;
    return this;
  }

  /**
   * Control the display of the disclosure link..
   * @return disclosureLink
   **/
  @Schema(description = "Control the display of the disclosure link.")
  public DisclosureLinkStyles getDisclosureLink() {
    return disclosureLink;
  }

  /**
   * setDisclosureLink.
   **/
  public void setDisclosureLink(DisclosureLinkStyles disclosureLink) {
    this.disclosureLink = disclosureLink;
  }


  /**
   * documentLink.
   *
   * @return UserAgreementResponseStyle
   **/
  public UserAgreementResponseStyle documentLink(DocumentLinkStyles documentLink) {
    this.documentLink = documentLink;
    return this;
  }

  /**
   * Control the display of the agreement statement..
   * @return documentLink
   **/
  @Schema(description = "Control the display of the agreement statement.")
  public DocumentLinkStyles getDocumentLink() {
    return documentLink;
  }

  /**
   * setDocumentLink.
   **/
  public void setDocumentLink(DocumentLinkStyles documentLink) {
    this.documentLink = documentLink;
  }


  /**
   * header.
   *
   * @return UserAgreementResponseStyle
   **/
  public UserAgreementResponseStyle header(HeaderStyles header) {
    this.header = header;
    return this;
  }

  /**
   * Control the display of the header..
   * @return header
   **/
  @Schema(description = "Control the display of the header.")
  public HeaderStyles getHeader() {
    return header;
  }

  /**
   * setHeader.
   **/
  public void setHeader(HeaderStyles header) {
    this.header = header;
  }


  /**
   * scrollControl.
   *
   * @return UserAgreementResponseStyle
   **/
  public UserAgreementResponseStyle scrollControl(ScrollControlEnum scrollControl) {
    this.scrollControl = scrollControl;
    return this;
  }

  /**
   * Control the scrolling of the document either by browser or by a scrollbar in the clickwrap shell. Can only be applied if the clickwrap `format` is `inline`..
   * @return scrollControl
   **/
  @Schema(description = "Control the scrolling of the document either by browser or by a scrollbar in the clickwrap shell. Can only be applied if the clickwrap `format` is `inline`.")
  public ScrollControlEnum getScrollControl() {
    return scrollControl;
  }

  /**
   * setScrollControl.
   **/
  public void setScrollControl(ScrollControlEnum scrollControl) {
    this.scrollControl = scrollControl;
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
    UserAgreementResponseStyle userAgreementResponseStyle = (UserAgreementResponseStyle) o;
    return Objects.equals(this.agreeButton, userAgreementResponseStyle.agreeButton) &&
        Objects.equals(this.agreementStatement, userAgreementResponseStyle.agreementStatement) &&
        Objects.equals(this.container, userAgreementResponseStyle.container) &&
        Objects.equals(this.disclosureLink, userAgreementResponseStyle.disclosureLink) &&
        Objects.equals(this.documentLink, userAgreementResponseStyle.documentLink) &&
        Objects.equals(this.header, userAgreementResponseStyle.header) &&
        Objects.equals(this.scrollControl, userAgreementResponseStyle.scrollControl);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(agreeButton, agreementStatement, container, disclosureLink, documentLink, header, scrollControl);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAgreementResponseStyle {\n");
    
    sb.append("    agreeButton: ").append(toIndentedString(agreeButton)).append("\n");
    sb.append("    agreementStatement: ").append(toIndentedString(agreementStatement)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    disclosureLink: ").append(toIndentedString(disclosureLink)).append("\n");
    sb.append("    documentLink: ").append(toIndentedString(documentLink)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    scrollControl: ").append(toIndentedString(scrollControl)).append("\n");
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

