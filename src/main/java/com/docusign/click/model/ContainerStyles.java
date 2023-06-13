package com.docusign.click.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Control the overall clickwrap container and inherited styles such as font..
 *
 */
@Schema(description = "Control the overall clickwrap container and inherited styles such as font.")

public class ContainerStyles {
  @JsonProperty("backgroundColor")
  private String backgroundColor = null;

  @JsonProperty("borderColor")
  private String borderColor = null;

  @JsonProperty("borderRadius")
  private String borderRadius = null;

  @JsonProperty("borderStyle")
  private String borderStyle = null;

  @JsonProperty("borderWidth")
  private String borderWidth = null;


  /**
   * backgroundColor.
   *
   * @return ContainerStyles
   **/
  public ContainerStyles backgroundColor(String backgroundColor) {
    this.backgroundColor = backgroundColor;
    return this;
  }

  /**
   * This will be restricted to values not equal to: 'transparent', 'none'.
   * @return backgroundColor
   **/
  @Schema(description = "This will be restricted to values not equal to: 'transparent', 'none'")
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
   * borderColor.
   *
   * @return ContainerStyles
   **/
  public ContainerStyles borderColor(String borderColor) {
    this.borderColor = borderColor;
    return this;
  }

  /**
   * Adjust the border color of the clickwrap surrouding container..
   * @return borderColor
   **/
  @Schema(description = "Adjust the border color of the clickwrap surrouding container.")
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
   * @return ContainerStyles
   **/
  public ContainerStyles borderRadius(String borderRadius) {
    this.borderRadius = borderRadius;
    return this;
  }

  /**
   * Adjust the border radius of the clickwrap surrouding container..
   * @return borderRadius
   **/
  @Schema(description = "Adjust the border radius of the clickwrap surrouding container.")
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
   * @return ContainerStyles
   **/
  public ContainerStyles borderStyle(String borderStyle) {
    this.borderStyle = borderStyle;
    return this;
  }

  /**
   * Adjust the border style of the clickwrap surrouding container..
   * @return borderStyle
   **/
  @Schema(description = "Adjust the border style of the clickwrap surrouding container.")
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
   * @return ContainerStyles
   **/
  public ContainerStyles borderWidth(String borderWidth) {
    this.borderWidth = borderWidth;
    return this;
  }

  /**
   * Adjust the border width of the clickwrap surrouding container..
   * @return borderWidth
   **/
  @Schema(description = "Adjust the border width of the clickwrap surrouding container.")
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
    ContainerStyles containerStyles = (ContainerStyles) o;
    return Objects.equals(this.backgroundColor, containerStyles.backgroundColor) &&
        Objects.equals(this.borderColor, containerStyles.borderColor) &&
        Objects.equals(this.borderRadius, containerStyles.borderRadius) &&
        Objects.equals(this.borderStyle, containerStyles.borderStyle) &&
        Objects.equals(this.borderWidth, containerStyles.borderWidth);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(backgroundColor, borderColor, borderRadius, borderStyle, borderWidth);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerStyles {\n");
    
    sb.append("    backgroundColor: ").append(toIndentedString(backgroundColor)).append("\n");
    sb.append("    borderColor: ").append(toIndentedString(borderColor)).append("\n");
    sb.append("    borderRadius: ").append(toIndentedString(borderRadius)).append("\n");
    sb.append("    borderStyle: ").append(toIndentedString(borderStyle)).append("\n");
    sb.append("    borderWidth: ").append(toIndentedString(borderWidth)).append("\n");
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

