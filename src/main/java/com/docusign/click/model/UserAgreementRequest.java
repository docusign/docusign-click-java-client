package com.docusign.click.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * UserAgreementRequest
 */

public class UserAgreementRequest {
  @JsonProperty("clientUserId")
  private String clientUserId = null;

  @JsonProperty("hostOrigin")
  private String hostOrigin = null;

  @JsonProperty("metadata")
  private String metadata = null;

  public UserAgreementRequest clientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
    return this;
  }

   /**
   * 
   * @return clientUserId
  **/
  @ApiModelProperty(value = "")
  public String getClientUserId() {
    return clientUserId;
  }

  public void setClientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
  }

  public UserAgreementRequest hostOrigin(String hostOrigin) {
    this.hostOrigin = hostOrigin;
    return this;
  }

   /**
   * 
   * @return hostOrigin
  **/
  @ApiModelProperty(value = "")
  public String getHostOrigin() {
    return hostOrigin;
  }

  public void setHostOrigin(String hostOrigin) {
    this.hostOrigin = hostOrigin;
  }

  public UserAgreementRequest metadata(String metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * 
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public String getMetadata() {
    return metadata;
  }

  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAgreementRequest userAgreementRequest = (UserAgreementRequest) o;
    return Objects.equals(this.clientUserId, userAgreementRequest.clientUserId) &&
        Objects.equals(this.hostOrigin, userAgreementRequest.hostOrigin) &&
        Objects.equals(this.metadata, userAgreementRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientUserId, hostOrigin, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAgreementRequest {\n");
    
    sb.append("    clientUserId: ").append(toIndentedString(clientUserId)).append("\n");
    sb.append("    hostOrigin: ").append(toIndentedString(hostOrigin)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

