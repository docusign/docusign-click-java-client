package com.docusign.click.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.click.model.UserAgreementResponse;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ClickwrapAgreementsResponse.
 *
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


  /**
   * beginCreatedOn.
   *
   * @return ClickwrapAgreementsResponse
   **/
  public ClickwrapAgreementsResponse beginCreatedOn(Object beginCreatedOn) {
    this.beginCreatedOn = beginCreatedOn;
    return this;
  }

  /**
   * User agreements from this datetime..
   * @return beginCreatedOn
   **/
  @Schema(description = "User agreements from this datetime.")
  public Object getBeginCreatedOn() {
    return beginCreatedOn;
  }

  /**
   * setBeginCreatedOn.
   **/
  public void setBeginCreatedOn(Object beginCreatedOn) {
    this.beginCreatedOn = beginCreatedOn;
  }


  /**
   * minimumPagesRemaining.
   *
   * @return ClickwrapAgreementsResponse
   **/
  public ClickwrapAgreementsResponse minimumPagesRemaining(Integer minimumPagesRemaining) {
    this.minimumPagesRemaining = minimumPagesRemaining;
    return this;
  }

  /**
   * Number of pages remaining in the response..
   * @return minimumPagesRemaining
   **/
  @Schema(description = "Number of pages remaining in the response.")
  public Integer getMinimumPagesRemaining() {
    return minimumPagesRemaining;
  }

  /**
   * setMinimumPagesRemaining.
   **/
  public void setMinimumPagesRemaining(Integer minimumPagesRemaining) {
    this.minimumPagesRemaining = minimumPagesRemaining;
  }


  /**
   * page.
   *
   * @return ClickwrapAgreementsResponse
   **/
  public ClickwrapAgreementsResponse page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * The number of the current page..
   * @return page
   **/
  @Schema(description = "The number of the current page.")
  public Integer getPage() {
    return page;
  }

  /**
   * setPage.
   **/
  public void setPage(Integer page) {
    this.page = page;
  }


  /**
   * pageSize.
   *
   * @return ClickwrapAgreementsResponse
   **/
  public ClickwrapAgreementsResponse pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * The number of items per page..
   * @return pageSize
   **/
  @Schema(description = "The number of items per page.")
  public Integer getPageSize() {
    return pageSize;
  }

  /**
   * setPageSize.
   **/
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  /**
   * userAgreements.
   *
   * @return ClickwrapAgreementsResponse
   **/
  public ClickwrapAgreementsResponse userAgreements(java.util.List<UserAgreementResponse> userAgreements) {
    this.userAgreements = userAgreements;
    return this;
  }
  
  /**
   * addUserAgreementsItem.
   *
   * @return ClickwrapAgreementsResponse
   **/
  public ClickwrapAgreementsResponse addUserAgreementsItem(UserAgreementResponse userAgreementsItem) {
    if (this.userAgreements == null) {
      this.userAgreements = new java.util.ArrayList<>();
    }
    this.userAgreements.add(userAgreementsItem);
    return this;
  }

  /**
   * An array of user agreements..
   * @return userAgreements
   **/
  @Schema(description = "An array of user agreements.")
  public java.util.List<UserAgreementResponse> getUserAgreements() {
    return userAgreements;
  }

  /**
   * setUserAgreements.
   **/
  public void setUserAgreements(java.util.List<UserAgreementResponse> userAgreements) {
    this.userAgreements = userAgreements;
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
    ClickwrapAgreementsResponse clickwrapAgreementsResponse = (ClickwrapAgreementsResponse) o;
    return Objects.equals(this.beginCreatedOn, clickwrapAgreementsResponse.beginCreatedOn) &&
        Objects.equals(this.minimumPagesRemaining, clickwrapAgreementsResponse.minimumPagesRemaining) &&
        Objects.equals(this.page, clickwrapAgreementsResponse.page) &&
        Objects.equals(this.pageSize, clickwrapAgreementsResponse.pageSize) &&
        Objects.equals(this.userAgreements, clickwrapAgreementsResponse.userAgreements);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(beginCreatedOn, minimumPagesRemaining, page, pageSize, userAgreements);
  }


  /**
   * Converts the given object to string.
   */
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

