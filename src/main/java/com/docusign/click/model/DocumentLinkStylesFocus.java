package com.docusign.click.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * DocumentLinkStylesFocus.
 *
 */

public class DocumentLinkStylesFocus {
  @JsonProperty("border")
  private String border = null;

  @JsonProperty("color")
  private String color = null;

  @JsonProperty("fontFamily")
  private String fontFamily = null;

  @JsonProperty("fontSize")
  private String fontSize = null;

  @JsonProperty("fontStyle")
  private String fontStyle = null;

  @JsonProperty("fontWeight")
  private Object fontWeight = null;

  @JsonProperty("margin")
  private String margin = null;

  @JsonProperty("padding")
  private String padding = null;

  @JsonProperty("textDecoration")
  private String textDecoration = null;


  /**
   * border.
   *
   * @return DocumentLinkStylesFocus
   **/
  public DocumentLinkStylesFocus border(String border) {
    this.border = border;
    return this;
  }

  /**
   * Control the border of the element..
   * @return border
   **/
  @Schema(description = "Control the border of the element.")
  public String getBorder() {
    return border;
  }

  /**
   * setBorder.
   **/
  public void setBorder(String border) {
    this.border = border;
  }


  /**
   * color.
   *
   * @return DocumentLinkStylesFocus
   **/
  public DocumentLinkStylesFocus color(String color) {
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
   * fontFamily.
   *
   * @return DocumentLinkStylesFocus
   **/
  public DocumentLinkStylesFocus fontFamily(String fontFamily) {
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
   * @return DocumentLinkStylesFocus
   **/
  public DocumentLinkStylesFocus fontSize(String fontSize) {
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
   * @return DocumentLinkStylesFocus
   **/
  public DocumentLinkStylesFocus fontStyle(String fontStyle) {
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
   * @return DocumentLinkStylesFocus
   **/
  public DocumentLinkStylesFocus fontWeight(Object fontWeight) {
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
   * margin.
   *
   * @return DocumentLinkStylesFocus
   **/
  public DocumentLinkStylesFocus margin(String margin) {
    this.margin = margin;
    return this;
  }

  /**
   * Control the margin of the element..
   * @return margin
   **/
  @Schema(description = "Control the margin of the element.")
  public String getMargin() {
    return margin;
  }

  /**
   * setMargin.
   **/
  public void setMargin(String margin) {
    this.margin = margin;
  }


  /**
   * padding.
   *
   * @return DocumentLinkStylesFocus
   **/
  public DocumentLinkStylesFocus padding(String padding) {
    this.padding = padding;
    return this;
  }

  /**
   * Control the padding of the element..
   * @return padding
   **/
  @Schema(description = "Control the padding of the element.")
  public String getPadding() {
    return padding;
  }

  /**
   * setPadding.
   **/
  public void setPadding(String padding) {
    this.padding = padding;
  }


  /**
   * textDecoration.
   *
   * @return DocumentLinkStylesFocus
   **/
  public DocumentLinkStylesFocus textDecoration(String textDecoration) {
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
    DocumentLinkStylesFocus documentLinkStylesFocus = (DocumentLinkStylesFocus) o;
    return Objects.equals(this.border, documentLinkStylesFocus.border) &&
        Objects.equals(this.color, documentLinkStylesFocus.color) &&
        Objects.equals(this.fontFamily, documentLinkStylesFocus.fontFamily) &&
        Objects.equals(this.fontSize, documentLinkStylesFocus.fontSize) &&
        Objects.equals(this.fontStyle, documentLinkStylesFocus.fontStyle) &&
        Objects.equals(this.fontWeight, documentLinkStylesFocus.fontWeight) &&
        Objects.equals(this.margin, documentLinkStylesFocus.margin) &&
        Objects.equals(this.padding, documentLinkStylesFocus.padding) &&
        Objects.equals(this.textDecoration, documentLinkStylesFocus.textDecoration);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(border, color, fontFamily, fontSize, fontStyle, fontWeight, margin, padding, textDecoration);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentLinkStylesFocus {\n");
    
    sb.append("    border: ").append(toIndentedString(border)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    fontFamily: ").append(toIndentedString(fontFamily)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    sb.append("    fontStyle: ").append(toIndentedString(fontStyle)).append("\n");
    sb.append("    fontWeight: ").append(toIndentedString(fontWeight)).append("\n");
    sb.append("    margin: ").append(toIndentedString(margin)).append("\n");
    sb.append("    padding: ").append(toIndentedString(padding)).append("\n");
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

