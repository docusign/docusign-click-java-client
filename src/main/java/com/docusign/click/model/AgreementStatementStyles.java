package com.docusign.click.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Control the display of the agreement statement..
 *
 */
@Schema(description = "Control the display of the agreement statement.")

public class AgreementStatementStyles {
  @JsonProperty("color")
  private String color = null;

  /**
   * Control the display of the header. Can only be set to &#39;none&#39; over the default for hiding purposes.
   */
  public enum DisplayEnum {
    NONE("none");

    private String value;

    DisplayEnum(String value) {
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
    public static DisplayEnum fromValue(String value) {
      for (DisplayEnum b : DisplayEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("display")
  private DisplayEnum display = null;

  @JsonProperty("fontFamily")
  private String fontFamily = null;

  @JsonProperty("fontSize")
  private String fontSize = null;

  @JsonProperty("fontStyle")
  private String fontStyle = null;

  @JsonProperty("fontWeight")
  private Object fontWeight = null;


  /**
   * color.
   *
   * @return AgreementStatementStyles
   **/
  public AgreementStatementStyles color(String color) {
    this.color = color;
    return this;
  }

  /**
   * Control the fore-ground color of the element..
   * @return color
   **/
  @Schema(description = "Control the fore-ground color of the element.")
  public String getColor() {
    return color;
  }

  /**
   * setColor.
   **/
  public void setColor(String color) {
    this.color = color;
  }


  /**
   * display.
   *
   * @return AgreementStatementStyles
   **/
  public AgreementStatementStyles display(DisplayEnum display) {
    this.display = display;
    return this;
  }

  /**
   * Control the display of the header. Can only be set to 'none' over the default for hiding purposes..
   * @return display
   **/
  @Schema(description = "Control the display of the header. Can only be set to 'none' over the default for hiding purposes.")
  public DisplayEnum getDisplay() {
    return display;
  }

  /**
   * setDisplay.
   **/
  public void setDisplay(DisplayEnum display) {
    this.display = display;
  }


  /**
   * fontFamily.
   *
   * @return AgreementStatementStyles
   **/
  public AgreementStatementStyles fontFamily(String fontFamily) {
    this.fontFamily = fontFamily;
    return this;
  }

  /**
   * Control the font family of the text..
   * @return fontFamily
   **/
  @Schema(description = "Control the font family of the text.")
  public String getFontFamily() {
    return fontFamily;
  }

  /**
   * setFontFamily.
   **/
  public void setFontFamily(String fontFamily) {
    this.fontFamily = fontFamily;
  }


  /**
   * fontSize.
   *
   * @return AgreementStatementStyles
   **/
  public AgreementStatementStyles fontSize(String fontSize) {
    this.fontSize = fontSize;
    return this;
  }

  /**
   * Control the font size of the text..
   * @return fontSize
   **/
  @Schema(description = "Control the font size of the text.")
  public String getFontSize() {
    return fontSize;
  }

  /**
   * setFontSize.
   **/
  public void setFontSize(String fontSize) {
    this.fontSize = fontSize;
  }


  /**
   * fontStyle.
   *
   * @return AgreementStatementStyles
   **/
  public AgreementStatementStyles fontStyle(String fontStyle) {
    this.fontStyle = fontStyle;
    return this;
  }

  /**
   * Control the font style of the text..
   * @return fontStyle
   **/
  @Schema(description = "Control the font style of the text.")
  public String getFontStyle() {
    return fontStyle;
  }

  /**
   * setFontStyle.
   **/
  public void setFontStyle(String fontStyle) {
    this.fontStyle = fontStyle;
  }


  /**
   * fontWeight.
   *
   * @return AgreementStatementStyles
   **/
  public AgreementStatementStyles fontWeight(Object fontWeight) {
    this.fontWeight = fontWeight;
    return this;
  }

  /**
   * Control the font weight of the text..
   * @return fontWeight
   **/
  @Schema(description = "Control the font weight of the text.")
  public Object getFontWeight() {
    return fontWeight;
  }

  /**
   * setFontWeight.
   **/
  public void setFontWeight(Object fontWeight) {
    this.fontWeight = fontWeight;
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
    AgreementStatementStyles agreementStatementStyles = (AgreementStatementStyles) o;
    return Objects.equals(this.color, agreementStatementStyles.color) &&
        Objects.equals(this.display, agreementStatementStyles.display) &&
        Objects.equals(this.fontFamily, agreementStatementStyles.fontFamily) &&
        Objects.equals(this.fontSize, agreementStatementStyles.fontSize) &&
        Objects.equals(this.fontStyle, agreementStatementStyles.fontStyle) &&
        Objects.equals(this.fontWeight, agreementStatementStyles.fontWeight);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(color, display, fontFamily, fontSize, fontStyle, fontWeight);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgreementStatementStyles {\n");
    
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    fontFamily: ").append(toIndentedString(fontFamily)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    sb.append("    fontStyle: ").append(toIndentedString(fontStyle)).append("\n");
    sb.append("    fontWeight: ").append(toIndentedString(fontWeight)).append("\n");
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

