package com.docusign.click.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.click.model.UserAgreementResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ClickwrapAgreementsResponse
 */

public class ClickwrapAgreementsResponse {
  @JsonProperty("beginCreatedOn")
  private Object beginCreatedOn = null;

  @JsonProperty("minimumPagesRemaining")
  private Integer minimumPagesRemaining = null;

  @JsonProperty("page")
  private Integer page = null;

  @JsonProperty("pageSize")
  private Integer pageSize = null;

  @JsonProperty("userAgreements")
  private java.util.List<UserAgreementResponse> userAgreements = null;

  public ClickwrapAgreementsResponse beginCreatedOn(Object beginCreatedOn) {
    this.beginCreatedOn = beginCreatedOn;
    return this;
  }

   /**
   * 
   * @return beginCreatedOn
  **/
  @ApiModelProperty(value = "")
  public Object getBeginCreatedOn() {
    return beginCreatedOn;
  }

  public void setBeginCreatedOn(Object beginCreatedOn) {
    this.beginCreatedOn = beginCreatedOn;
  }

  public ClickwrapAgreementsResponse minimumPagesRemaining(Integer minimumPagesRemaining) {
    this.minimumPagesRemaining = minimumPagesRemaining;
    return this;
  }

   /**
   * 
   * @return minimumPagesRemaining
  **/
  @ApiModelProperty(value = "")
  public Integer getMinimumPagesRemaining() {
    return minimumPagesRemaining;
  }

  public void setMinimumPagesRemaining(Integer minimumPagesRemaining) {
    this.minimumPagesRemaining = minimumPagesRemaining;
  }

  public ClickwrapAgreementsResponse page(Integer page) {
    this.page = page;
    return this;
  }

   /**
   * 
   * @return page
  **/
  @ApiModelProperty(value = "")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public ClickwrapAgreementsResponse pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 
   * @return pageSize
  **/
  @ApiModelProperty(value = "")
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  public ClickwrapAgreementsResponse userAgreements(java.util.List<UserAgreementResponse> userAgreements) {
    this.userAgreements = userAgreements;
    return this;
  }

  public ClickwrapAgreementsResponse addUserAgreementsItem(UserAgreementResponse userAgreementsItem) {
    if (this.userAgreements == null) {
      this.userAgreements = new java.util.ArrayList<UserAgreementResponse>();
    }
    this.userAgreements.add(userAgreementsItem);
    return this;
  }

   /**
   * 
   * @return userAgreements
  **/
  @ApiModelProperty(value = "")
  public java.util.List<UserAgreementResponse> getUserAgreements() {
    return userAgreements;
  }

  public void setUserAgreements(java.util.List<UserAgreementResponse> userAgreements) {
    this.userAgreements = userAgreements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClickwrapAgreementsResponse clickwrapAgreementsResponse = (ClickwrapAgreementsResponse) o;
    return Objects.equals(this.beginCreatedOn, clickwrapAgreementsResponse.beginCreatedOn) &&
        Objects.equals(this.minimumPagesRemaining, clickwrapAgreementsResponse.minimumPagesRemaining) &&
        Objects.equals(this.page, clickwrapAgreementsResponse.page) &&
        Objects.equals(this.pageSize, clickwrapAgreementsResponse.pageSize) &&
        Objects.equals(this.userAgreements, clickwrapAgreementsResponse.userAgreements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beginCreatedOn, minimumPagesRemaining, page, pageSize, userAgreements);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClickwrapAgreementsResponse {\n");
    
    sb.append("    beginCreatedOn: ").append(toIndentedString(beginCreatedOn)).append("\n");
    sb.append("    minimumPagesRemaining: ").append(toIndentedString(minimumPagesRemaining)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    userAgreements: ").append(toIndentedString(userAgreements)).append("\n");
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

