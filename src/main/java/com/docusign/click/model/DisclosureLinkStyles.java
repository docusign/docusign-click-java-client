package com.docusign.click.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Control the display of the disclosure link..
 *
 */
@Schema(description = "Control the display of the disclosure link.")

public class DisclosureLinkStyles {
  /**
   * Gets or Sets display
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


  /**
   * display.
   *
   * @return DisclosureLinkStyles
   **/
  public DisclosureLinkStyles display(DisplayEnum display) {
    this.display = display;
    return this;
  }

  /**
   * Get display.
   * @return display
   **/
  @Schema(description = "")
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
    DisclosureLinkStyles disclosureLinkStyles = (DisclosureLinkStyles) o;
    return Objects.equals(this.display, disclosureLinkStyles.display);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(display);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisclosureLinkStyles {\n");
    
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
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

