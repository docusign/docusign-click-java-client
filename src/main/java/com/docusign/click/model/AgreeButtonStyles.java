package com.docusign.click.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.click.model.BaseAgreeButtonStyles;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Control the display of the Agree button..
 *
 */
@Schema(description = "Control the display of the Agree button.")

public class AgreeButtonStyles {
  @JsonProperty(":disabled")
  private BaseAgreeButtonStyles disabled = null;

  @JsonProperty(":focus")
  private BaseAgreeButtonStyles focus = null;

  @JsonProperty(":hover")
  private BaseAgreeButtonStyles hover = null;

  @JsonProperty("backgroundColor")
  private String backgroundColor = null;

  @JsonProperty("border")
  private String border = null;

  @JsonProperty("borderColor")
  private String borderColor = null;

  @JsonProperty("borderRadius")
  private String borderRadius = null;

  @JsonProperty("borderStyle")
  private String borderStyle = null;

  @JsonProperty("borderWidth")
  private String borderWidth = null;

  @JsonProperty("boxShadow")
  private String boxShadow = null;

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

  @JsonProperty("height")
  private String height = null;

  @JsonProperty("margin")
  private String margin = null;

  @JsonProperty("opacity")
  private String opacity = null;

  @JsonProperty("outline")
  private String outline = null;

  @JsonProperty("outlineOffset")
  private String outlineOffset = null;

  @JsonProperty("padding")
  private String padding = null;

  @JsonProperty("width")
  private String width = null;


  /**
   * disabled.
   *
   * @return AgreeButtonStyles
   **/
  public AgreeButtonStyles disabled(BaseAgreeButtonStyles disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * Control the element's style when element is disabled.
   * @return disabled
   **/
  @Schema(description = "Control the element's style when element is disabled")
  public BaseAgreeButtonStyles getDisabled() {
    return disabled;
  }

  /**
   * setDisabled.
   **/
  public void setDisabled(BaseAgreeButtonStyles disabled) {
    this.disabled = disabled;
  }


  /**
   * focus.
   *
   * @return AgreeButtonStyles
   **/
  public AgreeButtonStyles focus(BaseAgreeButtonStyles focus) {
    this.focus = focus;
    return this;
  }

  /**
   * Control the elements's style when element is focused.
   * @return focus
   **/
  @Schema(description = "Control the elements's style when element is focused")
  public BaseAgreeButtonStyles getFocus() {
    return focus;
  }

  /**
   * setFocus.
   **/
  public void setFocus(BaseAgreeButtonStyles focus) {
    this.focus = focus;
  }


  /**
   * hover.
   *
   * @return AgreeButtonStyles
   **/
  public AgreeButtonStyles hover(BaseAgreeButtonStyles hover) {
    this.hover = hover;
    return this;
  }

  /**
   * control the element's hover style when hovered.
   * @return hover
   **/
  @Schema(description = "control the element's hover style when hovered")
  public BaseAgreeButtonStyles getHover() {
    return hover;
  }

  /**
   * setHover.
   **/
  public void setHover(BaseAgreeButtonStyles hover) {
    this.hover = hover;
  }


  /**
   * backgroundColor.
   *
   * @return AgreeButtonStyles
   **/
  public AgreeButtonStyles backgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

  /**
   * Control the background color of the element..
   * @return backgroundColor
   **/
  @Schema(description = "Control the background color of the element.")
  public String getBackgroundColor() {
    return backgroundColor;
  }

  /**
   * setBackgroundColor.
   **/
  public void setBackgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
  }


  /**
   * border.
   *
   * @return AgreeButtonStyles
   **/
  public AgreeButtonStyles border(String border) {
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
   * borderColor.
   *
   * @return AgreeButtonStyles
   **/
  public AgreeButtonStyles borderColor(String borderColor) {
    this.borderColor = borderColor;
    return this;
  }

  /**
   * Control the border color of the element..
   * @return borderColor
   **/
  @Schema(description = "Control the border color of the element.")
  public String getBorderColor() {
    return borderColor;
  }

  /**
   * setBorderColor.
   **/
  public void setBorderColor(String borderColor) {
    this.borderColor = borderColor;
  }


  /**
   * borderRadius.
   *
   * @return AgreeButtonStyles
   **/
  public AgreeButtonStyles borderRadius(String borderRadius) {
    this.borderRadius = borderRadius;
    return this;
  }

  /**
   * Control the border radius of the element..
   * @return borderRadius
   **/
  @Schema(description = "Control the border radius of the element.")
  public String getBorderRadius() {
    return borderRadius;
  }

  /**
   * setBorderRadius.
   **/
  public void setBorderRadius(String borderRadius) {
    this.borderRadius = borderRadius;
  }


  /**
   * borderStyle.
   *
   * @return AgreeButtonStyles
   **/
  public AgreeButtonStyles borderStyle(String borderStyle) {
    this.borderStyle = borderStyle;
    return this;
  }

  /**
   * Control the border style of the element..
   * @return borderStyle
   **/
  @Schema(description = "Control the border style of the element.")
  public String getBorderStyle() {
    return borderStyle;
  }

  /**
   * setBorderStyle.
   **/
  public void setBorderStyle(String borderStyle) {
    this.borderStyle = borderStyle;
  }


  /**
   * borderWidth.
   *
   * @return AgreeButtonStyles
   **/
  public AgreeButtonStyles borderWidth(String borderWidth) {
    this.borderWidth = borderWidth;
    return this;
  }

  /**
   * Control the border width of the element..
   * @return borderWidth
   **/
  @Schema(description = "Control the border width of the element.")
  public String getBorderWidth() {
    return borderWidth;
  }

  /**
   * setBorderWidth.
   **/
  public void setBorderWidth(String borderWidth) {
    this.borderWidth = borderWidth;
  }


  /**
   * boxShadow.
   *
   * @return AgreeButtonStyles
   **/
  public AgreeButtonStyles boxShadow(String boxShadow) {
    this.boxShadow = boxShadow;
    return this;
  }

  /**
   * Control the display of the box shadow of the agree button..
   * @return boxShadow
   **/
  @Schema(description = "Control the display of the box shadow of the agree button.")
  public String getBoxShadow() {
    return boxShadow;
  }

  /**
   * setBoxShadow.
   **/
  public void setBoxShadow(String boxShadow) {
    this.boxShadow = boxShadow;
  }


  /**
   * color.
   *
   * @return AgreeButtonStyles
   **/
  public AgreeButtonStyles color(String color) {
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
   * @return AgreeButtonStyles
   **/
  public AgreeButtonStyles fontFamily(String fontFamily) {
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
   * @return AgreeButtonStyles
   **/
  public AgreeButtonStyles fontSize(String fontSize) {
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
   * @return AgreeButtonStyles
   **/
  public AgreeButtonStyles fontStyle(String fontStyle) {
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
   * @return AgreeButtonStyles
   **/
  public AgreeButtonStyles fontWeight(Object fontWeight) {
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
   * height.
   *
   * @return AgreeButtonStyles
   **/
  public AgreeButtonStyles height(String height) {
    this.height = height;
    return this;
  }

  /**
   * Control the height of the agree button..
   * @return height
   **/
  @Schema(description = "Control the height of the agree button.")
  public String getHeight() {
    return height;
  }

  /**
   * setHeight.
   **/
  public void setHeight(String height) {
    this.height = height;
  }


  /**
   * margin.
   *
   * @return AgreeButtonStyles
   **/
  public AgreeButtonStyles margin(String margin) {
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
   * opacity.
   *
   * @return AgreeButtonStyles
   **/
  public AgreeButtonStyles opacity(String opacity) {
    this.opacity = opacity;
    return this;
  }

  /**
   * Control the opacity of the element.
   * @return opacity
   **/
  @Schema(description = "Control the opacity of the element")
  public String getOpacity() {
    return opacity;
  }

  /**
   * setOpacity.
   **/
  public void setOpacity(String opacity) {
    this.opacity = opacity;
  }


  /**
   * outline.
   *
   * @return AgreeButtonStyles
   **/
  public AgreeButtonStyles outline(String outline) {
    this.outline = outline;
    return this;
  }

  /**
   * Control the outline of the element.
   * @return outline
   **/
  @Schema(description = "Control the outline of the element")
  public String getOutline() {
    return outline;
  }

  /**
   * setOutline.
   **/
  public void setOutline(String outline) {
    this.outline = outline;
  }


  /**
   * outlineOffset.
   *
   * @return AgreeButtonStyles
   **/
  public AgreeButtonStyles outlineOffset(String outlineOffset) {
    this.outlineOffset = outlineOffset;
    return this;
  }

  /**
   * Conrol the outline offset of the element.
   * @return outlineOffset
   **/
  @Schema(description = "Conrol the outline offset of the element")
  public String getOutlineOffset() {
    return outlineOffset;
  }

  /**
   * setOutlineOffset.
   **/
  public void setOutlineOffset(String outlineOffset) {
    this.outlineOffset = outlineOffset;
  }


  /**
   * padding.
   *
   * @return AgreeButtonStyles
   **/
  public AgreeButtonStyles padding(String padding) {
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
   * width.
   *
   * @return AgreeButtonStyles
   **/
  public AgreeButtonStyles width(String width) {
    this.width = width;
    return this;
  }

  /**
   * Control the width of the agree button..
   * @return width
   **/
  @Schema(description = "Control the width of the agree button.")
  public String getWidth() {
    return width;
  }

  /**
   * setWidth.
   **/
  public void setWidth(String width) {
    this.width = width;
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
    AgreeButtonStyles agreeButtonStyles = (AgreeButtonStyles) o;
    return Objects.equals(this.disabled, agreeButtonStyles.disabled) &&
        Objects.equals(this.focus, agreeButtonStyles.focus) &&
        Objects.equals(this.hover, agreeButtonStyles.hover) &&
        Objects.equals(this.backgroundColor, agreeButtonStyles.backgroundColor) &&
        Objects.equals(this.border, agreeButtonStyles.border) &&
        Objects.equals(this.borderColor, agreeButtonStyles.borderColor) &&
        Objects.equals(this.borderRadius, agreeButtonStyles.borderRadius) &&
        Objects.equals(this.borderStyle, agreeButtonStyles.borderStyle) &&
        Objects.equals(this.borderWidth, agreeButtonStyles.borderWidth) &&
        Objects.equals(this.boxShadow, agreeButtonStyles.boxShadow) &&
        Objects.equals(this.color, agreeButtonStyles.color) &&
        Objects.equals(this.fontFamily, agreeButtonStyles.fontFamily) &&
        Objects.equals(this.fontSize, agreeButtonStyles.fontSize) &&
        Objects.equals(this.fontStyle, agreeButtonStyles.fontStyle) &&
        Objects.equals(this.fontWeight, agreeButtonStyles.fontWeight) &&
        Objects.equals(this.height, agreeButtonStyles.height) &&
        Objects.equals(this.margin, agreeButtonStyles.margin) &&
        Objects.equals(this.opacity, agreeButtonStyles.opacity) &&
        Objects.equals(this.outline, agreeButtonStyles.outline) &&
        Objects.equals(this.outlineOffset, agreeButtonStyles.outlineOffset) &&
        Objects.equals(this.padding, agreeButtonStyles.padding) &&
        Objects.equals(this.width, agreeButtonStyles.width);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(disabled, focus, hover, backgroundColor, border, borderColor, borderRadius, borderStyle, borderWidth, boxShadow, color, fontFamily, fontSize, fontStyle, fontWeight, height, margin, opacity, outline, outlineOffset, padding, width);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgreeButtonStyles {\n");
    
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    focus: ").append(toIndentedString(focus)).append("\n");
    sb.append("    hover: ").append(toIndentedString(hover)).append("\n");
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    border: ").append(toIndentedString(border)).append("\n");
    sb.append("    borderColor: ").append(toIndentedString(borderColor)).append("\n");
    sb.append("    borderRadius: ").append(toIndentedString(borderRadius)).append("\n");
    sb.append("    borderStyle: ").append(toIndentedString(borderStyle)).append("\n");
    sb.append("    borderWidth: ").append(toIndentedString(borderWidth)).append("\n");
    sb.append("    boxShadow: ").append(toIndentedString(boxShadow)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    fontFamily: ").append(toIndentedString(fontFamily)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    sb.append("    fontStyle: ").append(toIndentedString(fontStyle)).append("\n");
    sb.append("    fontWeight: ").append(toIndentedString(fontWeight)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    margin: ").append(toIndentedString(margin)).append("\n");
    sb.append("    opacity: ").append(toIndentedString(opacity)).append("\n");
    sb.append("    outline: ").append(toIndentedString(outline)).append("\n");
    sb.append("    outlineOffset: ").append(toIndentedString(outlineOffset)).append("\n");
    sb.append("    padding: ").append(toIndentedString(padding)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

