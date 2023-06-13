package com.docusign.click.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Control the display of the header..
 *
 */
@Schema(description = "Control the display of the header.")

public class HeaderStyles {
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

  @JsonProperty("textDecoration")
  private String textDecoration = null;


  /**
   * color.
   *
   * @return HeaderStyles
   **/
  public HeaderStyles color(String color) {
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
   * @return HeaderStyles
   **/
  public HeaderStyles display(DisplayEnum display) {
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
   * @return HeaderStyles
   **/
  public HeaderStyles fontFamily(String fontFamily) {
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
   * @return HeaderStyles
   **/
  public HeaderStyles fontSize(String fontSize) {
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
   * @return HeaderStyles
   **/
  public HeaderStyles fontStyle(String fontStyle) {
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
   * @return HeaderStyles
   **/
  public HeaderStyles fontWeight(Object fontWeight) {
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
   * textDecoration.
   *
   * @return HeaderStyles
   **/
  public HeaderStyles textDecoration(String textDecoration) {
    this.textDecoration = textDecoration;
    return this;
  }

  /**
   * Control the underline and other styles of the text..
   * @return textDecoration
   **/
  @Schema(description = "Control the underline and other styles of the text.")
  public String getTextDecoration() {
    return textDecoration;
  }

  /**
   * setTextDecoration.
   **/
  public void setTextDecoration(String textDecoration) {
    this.textDecoration = textDecoration;
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
    HeaderStyles headerStyles = (HeaderStyles) o;
    return Objects.equals(this.color, headerStyles.color) &&
        Objects.equals(this.display, headerStyles.display) &&
        Objects.equals(this.fontFamily, headerStyles.fontFamily) &&
        Objects.equals(this.fontSize, headerStyles.fontSize) &&
        Objects.equals(this.fontStyle, headerStyles.fontStyle) &&
        Objects.equals(this.fontWeight, headerStyles.fontWeight) &&
        Objects.equals(this.textDecoration, headerStyles.textDecoration);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(color, display, fontFamily, fontSize, fontStyle, fontWeight, textDecoration);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeaderStyles {\n");
    
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    fontFamily: ").append(toIndentedString(fontFamily)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    sb.append("    fontStyle: ").append(toIndentedString(fontStyle)).append("\n");
    sb.append("    fontWeight: ").append(toIndentedString(fontWeight)).append("\n");
    sb.append("    textDecoration: ").append(toIndentedString(textDecoration)).append("\n");
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

