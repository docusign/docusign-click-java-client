package com.docusign.click.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The object of data to be merged with the clickwrap document. A merged document must be created from Click&#39;s web editor and supports fullName, email, company, title and date..
 *
 */
@ApiModel(description = "The object of data to be merged with the clickwrap document. A merged document must be created from Click's web editor and supports fullName, email, company, title and date.")

public class DocumentData {
  @JsonProperty("fullName")
  private String fullName = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("company")
  private String company = null;

  @JsonProperty("jobTitle")
  private String jobTitle = null;

  @JsonProperty("date")
  private String date = null;


  /**
   * fullName.
   *
   * @return DocumentData
   **/
  public DocumentData fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * The full name of the signer. This field is created in the UI editor for a Clickwrap document. Only required if present in the document..
   * @return fullName
   **/
  @ApiModelProperty(value = "The full name of the signer. This field is created in the UI editor for a Clickwrap document. Only required if present in the document.")
  public String getFullName() {
    return fullName;
  }

  /**
   * setFullName.
   **/
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }


  /**
   * email.
   *
   * @return DocumentData
   **/
  public DocumentData email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email address of the signer. This field is created in the UI editor for a Clickwrap document. Only required if present in the document..
   * @return email
   **/
  @ApiModelProperty(value = "The email address of the signer. This field is created in the UI editor for a Clickwrap document. Only required if present in the document.")
  public String getEmail() {
    return email;
  }

  /**
   * setEmail.
   **/
  public void setEmail(String email) {
    this.email = email;
  }


  /**
   * company.
   *
   * @return DocumentData
   **/
  public DocumentData company(String company) {
    this.company = company;
    return this;
  }

  /**
   * The company name of the signer. This field is created in the UI editor for a Clickwrap document. Only required if present in the document..
   * @return company
   **/
  @ApiModelProperty(value = "The company name of the signer. This field is created in the UI editor for a Clickwrap document. Only required if present in the document.")
  public String getCompany() {
    return company;
  }

  /**
   * setCompany.
   **/
  public void setCompany(String company) {
    this.company = company;
  }


  /**
   * jobTitle.
   *
   * @return DocumentData
   **/
  public DocumentData jobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

  /**
   * The job title of the signer. This field is created in the UI editor for a Clickwrap document. Only required if present in the document..
   * @return jobTitle
   **/
  @ApiModelProperty(value = "The job title of the signer. This field is created in the UI editor for a Clickwrap document. Only required if present in the document.")
  public String getJobTitle() {
    return jobTitle;
  }

  /**
   * setJobTitle.
   **/
  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }


  /**
   * date.
   *
   * @return DocumentData
   **/
  public DocumentData date(String date) {
    this.date = date;
    return this;
  }

  /**
   * A custom date for the contract. This field is created in the UI editor for a Clickwrap document. Only required if present in the document..
   * @return date
   **/
  @ApiModelProperty(value = "A custom date for the contract. This field is created in the UI editor for a Clickwrap document. Only required if present in the document.")
  public String getDate() {
    return date;
  }

  /**
   * setDate.
   **/
  public void setDate(String date) {
    this.date = date;
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
    DocumentData documentData = (DocumentData) o;
    return Objects.equals(this.fullName, documentData.fullName) &&
        Objects.equals(this.email, documentData.email) &&
        Objects.equals(this.company, documentData.company) &&
        Objects.equals(this.jobTitle, documentData.jobTitle) &&
        Objects.equals(this.date, documentData.date);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(fullName, email, company, jobTitle, date);
  }


  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentData {\n");
    
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

