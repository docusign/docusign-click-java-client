package com.docusign.click.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Error details..
 *
 */
@ApiModel(description = "Error details.")

public class ErrorDetails {
  @JsonProperty("errorCode")
  private String errorCode = null;

  @JsonProperty("message")
  private String message = null;


  /**
   * errorCode.
   *
   * @return ErrorDetails
   **/
  public ErrorDetails errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * The error code..
   * @return errorCode
   **/
  @ApiModelProperty(value = "The error code.")
  public String getErrorCode() {
    return errorCode;
  }

  /**
   * setErrorCode.
   **/
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  /**
   * message.
   *
   * @return ErrorDetails
   **/
  public ErrorDetails message(String message) {
    this.message = message;
    return this;
  }

  /**
   * The error message..
   * @return message
   **/
  @ApiModelProperty(value = "The error message.")
  public String getMessage() {
    return message;
  }

  /**
   * setMessage.
   **/
  public void setMessage(String message) {
    this.message = message;
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
    ErrorDetails errorDetails = (ErrorDetails) o;
    return Objects.equals(this.errorCode, errorDetails.errorCode) &&
        Objects.equals(this.message, errorDetails.message);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(errorCode, message);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDetails {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

