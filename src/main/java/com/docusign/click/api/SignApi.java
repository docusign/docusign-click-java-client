
package com.docusign.click.api;

import javax.ws.rs.core.GenericType;

import com.docusign.click.client.ApiException;
import com.docusign.click.client.ApiClient;
import com.docusign.click.client.Configuration;
import com.docusign.click.model.*;
import com.docusign.click.client.Pair;




/**
 * SignApi class.
 *
 **/
public class SignApi {
  private ApiClient apiClient;

 /**
  * SignApi.
  *
  **/
  public SignApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * SignApi.
  *
  **/
  public SignApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

 /**
  * getApiClient Method.
  *
  * @return ApiClient
  **/
  public ApiClient getApiClient() {
    return apiClient;
  }

 /**
  * setApiClient Method.
  *
  **/
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /// <summary>
  /// Downloads the agreement PDF and optionally certificate of completion. 
  /// </summary>

 /**
  * GetAgreementPdfOptions Class.
  *
  **/
  public class GetAgreementPdfOptions
  {
  private Boolean includeCoc = null;
  
 /**
  * setIncludeCoc method.
  */
  public void setIncludeCoc(Boolean includeCoc) {
    this.includeCoc = includeCoc;
  }

 /**
  * getIncludeCoc method.
  *
  * @return Boolean
  */
  public Boolean getIncludeCoc() {
    return this.includeCoc;
  }
  }

   /**
   * Downloads the agreement PDF and optionally certificate of completion..
   * 
   * @param accountId  (required)
   * @param clickwrapId  (required)
   * @param agreementId  (required)
   * @return byte[]
   */ 
  public byte[] getAgreementPdf(String accountId, String clickwrapId, String agreementId) throws ApiException {
    return getAgreementPdf(accountId, clickwrapId, agreementId, null);
  }

  /**
   * Downloads the agreement PDF and optionally certificate of completion..
   * 
   * @param accountId  (required)
   * @param clickwrapId  (required)
   * @param agreementId  (required)
   * @param options for modifying the method behavior.
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public byte[] getAgreementPdf(String accountId, String clickwrapId, String agreementId, SignApi.GetAgreementPdfOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getAgreementPdf");
    }
    
    // verify the required parameter 'clickwrapId' is set
    if (clickwrapId == null) {
      throw new ApiException(400, "Missing the required parameter 'clickwrapId' when calling getAgreementPdf");
    }
    
    // verify the required parameter 'agreementId' is set
    if (agreementId == null) {
      throw new ApiException(400, "Missing the required parameter 'agreementId' when calling getAgreementPdf");
    }
    
    // create path and map variables
    String localVarPath = "/v1/accounts/{accountId}/clickwraps/{clickwrapId}/agreements/{agreementId}/download"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "clickwrapId" + "\\}", apiClient.escapeString(clickwrapId.toString()))
      .replaceAll("\\{" + "agreementId" + "\\}", apiClient.escapeString(agreementId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("include_coc", options.includeCoc));
    }

    

    

    final String[] localVarAccepts = {
      "application/pdf"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };

    GenericType<byte[]> localVarReturnType = new GenericType<byte[]>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
