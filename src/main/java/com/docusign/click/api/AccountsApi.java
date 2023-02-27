
package com.docusign.click.api;

import javax.ws.rs.core.GenericType;

import com.docusign.click.client.ApiException;
import com.docusign.click.client.ApiClient;
import com.docusign.click.client.Configuration;
import com.docusign.click.model.*;
import com.docusign.click.client.Pair;
import com.docusign.click.client.ApiResponse;




/**
 * AccountsApi class.
 *
 **/
public class AccountsApi {
  private ApiClient apiClient;

 /**
  * AccountsApi.
  *
  **/
  public AccountsApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * AccountsApi.
  *
  **/
  public AccountsApi(ApiClient apiClient) {
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


  /**
   * Starts an export of clickwrap agreements for a specified date range..
   * Starts an asynchronus process to export clickwrap agreements for a specified date range. An email will be sent to the creator after it has been processed.  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60;
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param clickwrapId The ID of the clickwrap. (required)
   * @param bulkClickwrapRequest Data used to start a bulk agreements export. (optional)
   * @throws ApiException if fails to make API call
   */
  public void createBulkClickwrapAgreements(String accountId, String clickwrapId, BulkClickwrapRequest bulkClickwrapRequest) throws ApiException {
    createBulkClickwrapAgreementsWithHttpInfo(accountId, clickwrapId, bulkClickwrapRequest);
  }

  /**
   * Starts an export of clickwrap agreements for a specified date range.
   * Starts an asynchronus process to export clickwrap agreements for a specified date range. An email will be sent to the creator after it has been processed.  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60;
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param clickwrapId The ID of the clickwrap. (required)
   * @param bulkClickwrapRequest Data used to start a bulk agreements export. (optional)
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Object> createBulkClickwrapAgreementsWithHttpInfo(String accountId, String clickwrapId, BulkClickwrapRequest bulkClickwrapRequest) throws ApiException {
    Object localVarPostBody = bulkClickwrapRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createBulkClickwrapAgreements");
    }
    
    // verify the required parameter 'clickwrapId' is set
    if (clickwrapId == null) {
      throw new ApiException(400, "Missing the required parameter 'clickwrapId' when calling createBulkClickwrapAgreements");
    }
    
    // create path and map variables
    String localVarPath = "/v1/accounts/{accountId}/clickwraps/{clickwrapId}/bulk_agreements"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "clickwrapId" + "\\}", apiClient.escapeString(clickwrapId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    return new ApiResponse<Object>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), null);
  }

  /**
   * Creates a clickwrap for an account..
   * Creates a clickwrap for an account.  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60;.
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param clickwrapRequest Request body for working with clickwrap. (optional)
   * @return ClickwrapVersionSummaryResponse
   * @throws ApiException if fails to make API call
   */
  public ClickwrapVersionSummaryResponse createClickwrap(String accountId, ClickwrapRequest clickwrapRequest) throws ApiException {
    ApiResponse<ClickwrapVersionSummaryResponse> localVarResponse = createClickwrapWithHttpInfo(accountId, clickwrapRequest);
    return localVarResponse.getData();
  }

  /**
   * Creates a clickwrap for an account.
   * Creates a clickwrap for an account.  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60;.
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param clickwrapRequest Request body for working with clickwrap. (optional)
   * @return ClickwrapVersionSummaryResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ClickwrapVersionSummaryResponse > createClickwrapWithHttpInfo(String accountId, ClickwrapRequest clickwrapRequest) throws ApiException {
    Object localVarPostBody = clickwrapRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createClickwrap");
    }
    
    // create path and map variables
    String localVarPath = "/v1/accounts/{accountId}/clickwraps"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<ClickwrapVersionSummaryResponse> localVarReturnType = new GenericType<ClickwrapVersionSummaryResponse>() {};
    ClickwrapVersionSummaryResponse localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ClickwrapVersionSummaryResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Creates a new clickwrap version..
   * Creates a new version of an existing clickwrap. In a new version, you can replace the uploaded documents, change the display settings, and change the name of the clickwrap. The version number is automatically incremented based on the last version of the clickwrap.  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60;.
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param clickwrapId The ID of the clickwrap. (required)
   * @param clickwrapRequest Request body for working with clickwrap. (optional)
   * @return ClickwrapVersionSummaryResponse
   * @throws ApiException if fails to make API call
   */
  public ClickwrapVersionSummaryResponse createClickwrapVersion(String accountId, String clickwrapId, ClickwrapRequest clickwrapRequest) throws ApiException {
    ApiResponse<ClickwrapVersionSummaryResponse> localVarResponse = createClickwrapVersionWithHttpInfo(accountId, clickwrapId, clickwrapRequest);
    return localVarResponse.getData();
  }

  /**
   * Creates a new clickwrap version.
   * Creates a new version of an existing clickwrap. In a new version, you can replace the uploaded documents, change the display settings, and change the name of the clickwrap. The version number is automatically incremented based on the last version of the clickwrap.  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60;.
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param clickwrapId The ID of the clickwrap. (required)
   * @param clickwrapRequest Request body for working with clickwrap. (optional)
   * @return ClickwrapVersionSummaryResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ClickwrapVersionSummaryResponse > createClickwrapVersionWithHttpInfo(String accountId, String clickwrapId, ClickwrapRequest clickwrapRequest) throws ApiException {
    Object localVarPostBody = clickwrapRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createClickwrapVersion");
    }
    
    // verify the required parameter 'clickwrapId' is set
    if (clickwrapId == null) {
      throw new ApiException(400, "Missing the required parameter 'clickwrapId' when calling createClickwrapVersion");
    }
    
    // create path and map variables
    String localVarPath = "/v1/accounts/{accountId}/clickwraps/{clickwrapId}/versions"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "clickwrapId" + "\\}", apiClient.escapeString(clickwrapId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<ClickwrapVersionSummaryResponse> localVarReturnType = new GenericType<ClickwrapVersionSummaryResponse>() {};
    ClickwrapVersionSummaryResponse localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ClickwrapVersionSummaryResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Creates a unique URL for the agreement that you can embed in your application..
   * Creates a unique URL for the agreement that you can embed in your application.  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60; and &#x60;click.send&#x60;.  The request must include at least the &#x60;clientUserId&#x60;. This is a value that you generate to identify the unique recipient of the agreement.  If you are using a [dynamic content][] document, you can supply the values in the documentData property of the request, like this:  &#x60;&#x60;&#x60;json {   \&quot;clientUserId\&quot;: \&quot;cl-bc7f-48a9\&quot;,   \&quot;documentData\&quot;: {     \&quot;fullName\&quot;: \&quot;T. J. Fanning\&quot;,     \&quot;email\&quot;: \&quot;tj@example.com\&quot;,     \&quot;company\&quot;: \&quot;Fanning Indusdtries\&quot;,     \&quot;title\&quot;: \&quot;Cat wrangler\&quot;,     \&quot;date\&quot;: \&quot;2022-10-13T05:17:14-07:00\&quot;   } } &#x60;&#x60;&#x60;  A response will look like this. The &#x60;agreementUrl&#x60; is unique to the user identified by the &#x60;clientUserId&#x60;. Your user can open the URL to approve the agreement. The &#x60;documentData&#x60; property appears only if you provided it in the request.  &#x60;&#x60;&#x60;json {   \&quot;accountId\&quot;: \&quot;624e3e00-xxxx-xxxx-xxxx-43918c520dab\&quot;,   \&quot;clickwrapId\&quot;: \&quot;0e64e4a7-xxxx-xxxx-xxxx-ce5a93b162af\&quot;,   \&quot;clientUserId\&quot;: \&quot;tcl-bc7f-48a9j\&quot;,   \&quot;agreementId\&quot;: \&quot;1f346c7d-xxxx-xxxx-xxxx-a5c968666785\&quot;,   \&quot;documents\&quot;: [ . . .],   \&quot;consumerDisclosureEnabled\&quot;: true,   \&quot;agreementUrl\&quot;: \&quot;https://demo.docusign.net/clickapi/v1/redeem?agreementToken&#x3D;AcTZT8g ... cxEqrUsA1lQ8DPPy05dE0\&quot;,   \&quot;createdOn\&quot;: \&quot;2022-10-20T16:27:25.1287685Z\&quot;,   \&quot;status\&quot;: \&quot;created\&quot;,   \&quot;versionId\&quot;: \&quot;5957716d-xxxx-xxxx-xxxx-e1594f00ff12\&quot;,   \&quot;versionNumber\&quot;: 1,   \&quot;settings\&quot;: {     \&quot;displayName\&quot;: \&quot;Agree with me\&quot;,     \&quot;hasDeclineButton\&quot;: true,     .  . .     \&quot;statementAlignment\&quot;: \&quot;bottom\&quot;   },   \&quot;documentData\&quot;: {     \&quot;fullName\&quot;: \&quot;T. J. Fanning\&quot;,     \&quot;email\&quot;: \&quot;tj@example.com\&quot;,     \&quot;company\&quot;: \&quot;Fanning Indusdtries\&quot;,     \&quot;title\&quot;: \&quot;Cat wrangler\&quot;,     \&quot;date\&quot;: \&quot;2022-10-13T05:17:14-07:00\&quot;   } } &#x60;&#x60;&#x60;  This method returns the following result codes and response bodies depending on whether the user has agreed.   | Agreed | Response code | Response body          | | :----- | :------------ | :--------------------- | | No     | 201           | Full response as above | | Yes    | 200           | No response (empty)    |   ### Related topics  - [Add dynamic content to your clickwrap][dynamic content] - [How to embed a clickwrap][embed-howto]   [dynamic content]:  /docs/click-api/click101/customize-clickwrap-fields/#add-dynamic-content-to-your-clickwrap [embedding]:        /docs/click-api/click101/customize-clickwrap-fields/#embed-clickwraps-that-contain-dynamic-content [embed-howto]:      /docs/click-api/how-to/embed-clickwraps/ 
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param clickwrapId The ID of the clickwrap. (required)
   * @param userAgreementRequest Data used to create the agreement. (optional)
   * @return UserAgreementResponse
   * @throws ApiException if fails to make API call
   */
  public UserAgreementResponse createHasAgreed(String accountId, String clickwrapId, UserAgreementRequest userAgreementRequest) throws ApiException {
    ApiResponse<UserAgreementResponse> localVarResponse = createHasAgreedWithHttpInfo(accountId, clickwrapId, userAgreementRequest);
    return localVarResponse.getData();
  }

  /**
   * Creates a unique URL for the agreement that you can embed in your application.
   * Creates a unique URL for the agreement that you can embed in your application.  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60; and &#x60;click.send&#x60;.  The request must include at least the &#x60;clientUserId&#x60;. This is a value that you generate to identify the unique recipient of the agreement.  If you are using a [dynamic content][] document, you can supply the values in the documentData property of the request, like this:  &#x60;&#x60;&#x60;json {   \&quot;clientUserId\&quot;: \&quot;cl-bc7f-48a9\&quot;,   \&quot;documentData\&quot;: {     \&quot;fullName\&quot;: \&quot;T. J. Fanning\&quot;,     \&quot;email\&quot;: \&quot;tj@example.com\&quot;,     \&quot;company\&quot;: \&quot;Fanning Indusdtries\&quot;,     \&quot;title\&quot;: \&quot;Cat wrangler\&quot;,     \&quot;date\&quot;: \&quot;2022-10-13T05:17:14-07:00\&quot;   } } &#x60;&#x60;&#x60;  A response will look like this. The &#x60;agreementUrl&#x60; is unique to the user identified by the &#x60;clientUserId&#x60;. Your user can open the URL to approve the agreement. The &#x60;documentData&#x60; property appears only if you provided it in the request.  &#x60;&#x60;&#x60;json {   \&quot;accountId\&quot;: \&quot;624e3e00-xxxx-xxxx-xxxx-43918c520dab\&quot;,   \&quot;clickwrapId\&quot;: \&quot;0e64e4a7-xxxx-xxxx-xxxx-ce5a93b162af\&quot;,   \&quot;clientUserId\&quot;: \&quot;tcl-bc7f-48a9j\&quot;,   \&quot;agreementId\&quot;: \&quot;1f346c7d-xxxx-xxxx-xxxx-a5c968666785\&quot;,   \&quot;documents\&quot;: [ . . .],   \&quot;consumerDisclosureEnabled\&quot;: true,   \&quot;agreementUrl\&quot;: \&quot;https://demo.docusign.net/clickapi/v1/redeem?agreementToken&#x3D;AcTZT8g ... cxEqrUsA1lQ8DPPy05dE0\&quot;,   \&quot;createdOn\&quot;: \&quot;2022-10-20T16:27:25.1287685Z\&quot;,   \&quot;status\&quot;: \&quot;created\&quot;,   \&quot;versionId\&quot;: \&quot;5957716d-xxxx-xxxx-xxxx-e1594f00ff12\&quot;,   \&quot;versionNumber\&quot;: 1,   \&quot;settings\&quot;: {     \&quot;displayName\&quot;: \&quot;Agree with me\&quot;,     \&quot;hasDeclineButton\&quot;: true,     .  . .     \&quot;statementAlignment\&quot;: \&quot;bottom\&quot;   },   \&quot;documentData\&quot;: {     \&quot;fullName\&quot;: \&quot;T. J. Fanning\&quot;,     \&quot;email\&quot;: \&quot;tj@example.com\&quot;,     \&quot;company\&quot;: \&quot;Fanning Indusdtries\&quot;,     \&quot;title\&quot;: \&quot;Cat wrangler\&quot;,     \&quot;date\&quot;: \&quot;2022-10-13T05:17:14-07:00\&quot;   } } &#x60;&#x60;&#x60;  This method returns the following result codes and response bodies depending on whether the user has agreed.   | Agreed | Response code | Response body          | | :----- | :------------ | :--------------------- | | No     | 201           | Full response as above | | Yes    | 200           | No response (empty)    |   ### Related topics  - [Add dynamic content to your clickwrap][dynamic content] - [How to embed a clickwrap][embed-howto]   [dynamic content]:  /docs/click-api/click101/customize-clickwrap-fields/#add-dynamic-content-to-your-clickwrap [embedding]:        /docs/click-api/click101/customize-clickwrap-fields/#embed-clickwraps-that-contain-dynamic-content [embed-howto]:      /docs/click-api/how-to/embed-clickwraps/ 
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param clickwrapId The ID of the clickwrap. (required)
   * @param userAgreementRequest Data used to create the agreement. (optional)
   * @return UserAgreementResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserAgreementResponse > createHasAgreedWithHttpInfo(String accountId, String clickwrapId, UserAgreementRequest userAgreementRequest) throws ApiException {
    Object localVarPostBody = userAgreementRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling createHasAgreed");
    }
    
    // verify the required parameter 'clickwrapId' is set
    if (clickwrapId == null) {
      throw new ApiException(400, "Missing the required parameter 'clickwrapId' when calling createHasAgreed");
    }
    
    // create path and map variables
    String localVarPath = "/v1/accounts/{accountId}/clickwraps/{clickwrapId}/agreements"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "clickwrapId" + "\\}", apiClient.escapeString(clickwrapId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<UserAgreementResponse> localVarReturnType = new GenericType<UserAgreementResponse>() {};
    UserAgreementResponse localVarResponse = apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<UserAgreementResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Deletes a clickwrap and all of its versions. Deletes the clickwrap specified by &#x60;clickwrapId&#x60; and all of its versions. Active clickwraps are not deleted  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60;.
  /// </summary>

 /**
  * DeleteClickwrapOptions Class.
  *
  **/
  public class DeleteClickwrapOptions
  {
  private String versions = null;
  
 /**
  * setVersions method.
  */
  public void setVersions(String versions) {
    this.versions = versions;
  }

 /**
  * getVersions method.
  *
  * @return String
  */
  public String getVersions() {
    return this.versions;
  }
  }

   /**
   * Deletes a clickwrap and all of its versions..
   * Deletes the clickwrap specified by &#x60;clickwrapId&#x60; and all of its versions. Active clickwraps are not deleted  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60;.
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param clickwrapId The ID of the clickwrap. (required)
   * @return ClickwrapVersionsDeleteResponse
   */ 
  public ClickwrapVersionsDeleteResponse deleteClickwrap(String accountId, String clickwrapId) throws ApiException {
    return deleteClickwrap(accountId, clickwrapId, null);
  }

  /**
   * Deletes a clickwrap and all of its versions..
   * Deletes the clickwrap specified by &#x60;clickwrapId&#x60; and all of its versions. Active clickwraps are not deleted  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60;.
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param clickwrapId The ID of the clickwrap. (required)
   * @param options for modifying the method behavior.
   * @return ClickwrapVersionsDeleteResponse
   * @throws ApiException if fails to make API call
   */
  public ClickwrapVersionsDeleteResponse deleteClickwrap(String accountId, String clickwrapId, AccountsApi.DeleteClickwrapOptions options) throws ApiException {
    ApiResponse<ClickwrapVersionsDeleteResponse> localVarResponse = deleteClickwrapWithHttpInfo(accountId, clickwrapId, options);
    return localVarResponse.getData();
  }

  /**
   * Deletes a clickwrap and all of its versions.
   * Deletes the clickwrap specified by &#x60;clickwrapId&#x60; and all of its versions. Active clickwraps are not deleted  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60;.
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param clickwrapId The ID of the clickwrap. (required)
   * @param options for modifying the method behavior.
   * @return ClickwrapVersionsDeleteResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ClickwrapVersionsDeleteResponse > deleteClickwrapWithHttpInfo(String accountId, String clickwrapId, AccountsApi.DeleteClickwrapOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteClickwrap");
    }
    
    // verify the required parameter 'clickwrapId' is set
    if (clickwrapId == null) {
      throw new ApiException(400, "Missing the required parameter 'clickwrapId' when calling deleteClickwrap");
    }
    
    // create path and map variables
    String localVarPath = "/v1/accounts/{accountId}/clickwraps/{clickwrapId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "clickwrapId" + "\\}", apiClient.escapeString(clickwrapId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("versions", options.versions));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<ClickwrapVersionsDeleteResponse> localVarReturnType = new GenericType<ClickwrapVersionsDeleteResponse>() {};
    ClickwrapVersionsDeleteResponse localVarResponse = apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ClickwrapVersionsDeleteResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Deletes a clickwrap version by version ID..
   * Deletes the clickwrap version specified by &#x60;versionId&#x60; of the clickwrap specified by &#x60;clickwrapId&#x60;.  **Note:** This endpoint requires the version ID (a GUID), not the version number (an integer).  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60;.
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param clickwrapId The ID of the clickwrap. (required)
   * @param versionId The ID of the clickwrap version. (required)
   * @return ClickwrapVersionDeleteResponse
   * @throws ApiException if fails to make API call
   */
  public ClickwrapVersionDeleteResponse deleteClickwrapVersion(String accountId, String clickwrapId, String versionId) throws ApiException {
    ApiResponse<ClickwrapVersionDeleteResponse> localVarResponse = deleteClickwrapVersionWithHttpInfo(accountId, clickwrapId, versionId);
    return localVarResponse.getData();
  }

  /**
   * Deletes a clickwrap version by version ID.
   * Deletes the clickwrap version specified by &#x60;versionId&#x60; of the clickwrap specified by &#x60;clickwrapId&#x60;.  **Note:** This endpoint requires the version ID (a GUID), not the version number (an integer).  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60;.
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param clickwrapId The ID of the clickwrap. (required)
   * @param versionId The ID of the clickwrap version. (required)
   * @return ClickwrapVersionDeleteResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ClickwrapVersionDeleteResponse > deleteClickwrapVersionWithHttpInfo(String accountId, String clickwrapId, String versionId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteClickwrapVersion");
    }
    
    // verify the required parameter 'clickwrapId' is set
    if (clickwrapId == null) {
      throw new ApiException(400, "Missing the required parameter 'clickwrapId' when calling deleteClickwrapVersion");
    }
    
    // verify the required parameter 'versionId' is set
    if (versionId == null) {
      throw new ApiException(400, "Missing the required parameter 'versionId' when calling deleteClickwrapVersion");
    }
    
    // create path and map variables
    String localVarPath = "/v1/accounts/{accountId}/clickwraps/{clickwrapId}/versions/{versionId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "clickwrapId" + "\\}", apiClient.escapeString(clickwrapId.toString()))
      .replaceAll("\\{" + "versionId" + "\\}", apiClient.escapeString(versionId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<ClickwrapVersionDeleteResponse> localVarReturnType = new GenericType<ClickwrapVersionDeleteResponse>() {};
    ClickwrapVersionDeleteResponse localVarResponse = apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ClickwrapVersionDeleteResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Deletes the versions of a clickwrap. Deletes all versions of a clickwrap, or only the ones specified in the &#x60;clickwrapVersionIds&#x60; query parameter.  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60;.
  /// </summary>

 /**
  * DeleteClickwrapVersionsOptions Class.
  *
  **/
  public class DeleteClickwrapVersionsOptions
  {
  private String clickwrapVersionIds = null;
  
 /**
  * setClickwrapVersionIds method.
  */
  public void setClickwrapVersionIds(String clickwrapVersionIds) {
    this.clickwrapVersionIds = clickwrapVersionIds;
  }

 /**
  * getClickwrapVersionIds method.
  *
  * @return String
  */
  public String getClickwrapVersionIds() {
    return this.clickwrapVersionIds;
  }
  }

   /**
   * Deletes the versions of a clickwrap..
   * Deletes all versions of a clickwrap, or only the ones specified in the &#x60;clickwrapVersionIds&#x60; query parameter.  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60;.
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param clickwrapId The ID of the clickwrap. (required)
   * @return ClickwrapVersionsDeleteResponse
   */ 
  public ClickwrapVersionsDeleteResponse deleteClickwrapVersions(String accountId, String clickwrapId) throws ApiException {
    return deleteClickwrapVersions(accountId, clickwrapId, null);
  }

  /**
   * Deletes the versions of a clickwrap..
   * Deletes all versions of a clickwrap, or only the ones specified in the &#x60;clickwrapVersionIds&#x60; query parameter.  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60;.
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param clickwrapId The ID of the clickwrap. (required)
   * @param options for modifying the method behavior.
   * @return ClickwrapVersionsDeleteResponse
   * @throws ApiException if fails to make API call
   */
  public ClickwrapVersionsDeleteResponse deleteClickwrapVersions(String accountId, String clickwrapId, AccountsApi.DeleteClickwrapVersionsOptions options) throws ApiException {
    ApiResponse<ClickwrapVersionsDeleteResponse> localVarResponse = deleteClickwrapVersionsWithHttpInfo(accountId, clickwrapId, options);
    return localVarResponse.getData();
  }

  /**
   * Deletes the versions of a clickwrap.
   * Deletes all versions of a clickwrap, or only the ones specified in the &#x60;clickwrapVersionIds&#x60; query parameter.  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60;.
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param clickwrapId The ID of the clickwrap. (required)
   * @param options for modifying the method behavior.
   * @return ClickwrapVersionsDeleteResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ClickwrapVersionsDeleteResponse > deleteClickwrapVersionsWithHttpInfo(String accountId, String clickwrapId, AccountsApi.DeleteClickwrapVersionsOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteClickwrapVersions");
    }
    
    // verify the required parameter 'clickwrapId' is set
    if (clickwrapId == null) {
      throw new ApiException(400, "Missing the required parameter 'clickwrapId' when calling deleteClickwrapVersions");
    }
    
    // create path and map variables
    String localVarPath = "/v1/accounts/{accountId}/clickwraps/{clickwrapId}/versions"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "clickwrapId" + "\\}", apiClient.escapeString(clickwrapId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("clickwrapVersionIds", options.clickwrapVersionIds));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<ClickwrapVersionsDeleteResponse> localVarReturnType = new GenericType<ClickwrapVersionsDeleteResponse>() {};
    ClickwrapVersionsDeleteResponse localVarResponse = apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ClickwrapVersionsDeleteResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Deletes clickwraps for an account. Deletes all clickwraps for an account or only the ones specified in the &#x60;clickwrapIds&#x60; query parameter.  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60;.
  /// </summary>

 /**
  * DeleteClickwrapsOptions Class.
  *
  **/
  public class DeleteClickwrapsOptions
  {
  private String clickwrapIds = null;
  
 /**
  * setClickwrapIds method.
  */
  public void setClickwrapIds(String clickwrapIds) {
    this.clickwrapIds = clickwrapIds;
  }

 /**
  * getClickwrapIds method.
  *
  * @return String
  */
  public String getClickwrapIds() {
    return this.clickwrapIds;
  }
  }

   /**
   * Deletes clickwraps for an account..
   * Deletes all clickwraps for an account or only the ones specified in the &#x60;clickwrapIds&#x60; query parameter.  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60;.
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @return ClickwrapsDeleteResponse
   */ 
  public ClickwrapsDeleteResponse deleteClickwraps(String accountId) throws ApiException {
    return deleteClickwraps(accountId, null);
  }

  /**
   * Deletes clickwraps for an account..
   * Deletes all clickwraps for an account or only the ones specified in the &#x60;clickwrapIds&#x60; query parameter.  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60;.
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param options for modifying the method behavior.
   * @return ClickwrapsDeleteResponse
   * @throws ApiException if fails to make API call
   */
  public ClickwrapsDeleteResponse deleteClickwraps(String accountId, AccountsApi.DeleteClickwrapsOptions options) throws ApiException {
    ApiResponse<ClickwrapsDeleteResponse> localVarResponse = deleteClickwrapsWithHttpInfo(accountId, options);
    return localVarResponse.getData();
  }

  /**
   * Deletes clickwraps for an account.
   * Deletes all clickwraps for an account or only the ones specified in the &#x60;clickwrapIds&#x60; query parameter.  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60;.
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param options for modifying the method behavior.
   * @return ClickwrapsDeleteResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ClickwrapsDeleteResponse > deleteClickwrapsWithHttpInfo(String accountId, AccountsApi.DeleteClickwrapsOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteClickwraps");
    }
    
    // create path and map variables
    String localVarPath = "/v1/accounts/{accountId}/clickwraps"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("clickwrapIds", options.clickwrapIds));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<ClickwrapsDeleteResponse> localVarReturnType = new GenericType<ClickwrapsDeleteResponse>() {};
    ClickwrapsDeleteResponse localVarResponse = apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ClickwrapsDeleteResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Gets a specific agreement for a specified clickwrap..
   * Gets the agreement specified by &#x60;agreementId&#x60;.  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60; or &#x60;click.send&#x60;.
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param clickwrapId The ID of the clickwrap. (required)
   * @param agreementId The agreement ID. (required)
   * @return UserAgreementResponse
   * @throws ApiException if fails to make API call
   */
  public UserAgreementResponse getAgreement(String accountId, String clickwrapId, String agreementId) throws ApiException {
    ApiResponse<UserAgreementResponse> localVarResponse = getAgreementWithHttpInfo(accountId, clickwrapId, agreementId);
    return localVarResponse.getData();
  }

  /**
   * Gets a specific agreement for a specified clickwrap.
   * Gets the agreement specified by &#x60;agreementId&#x60;.  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60; or &#x60;click.send&#x60;.
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param clickwrapId The ID of the clickwrap. (required)
   * @param agreementId The agreement ID. (required)
   * @return UserAgreementResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<UserAgreementResponse > getAgreementWithHttpInfo(String accountId, String clickwrapId, String agreementId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getAgreement");
    }
    
    // verify the required parameter 'clickwrapId' is set
    if (clickwrapId == null) {
      throw new ApiException(400, "Missing the required parameter 'clickwrapId' when calling getAgreement");
    }
    
    // verify the required parameter 'agreementId' is set
    if (agreementId == null) {
      throw new ApiException(400, "Missing the required parameter 'agreementId' when calling getAgreement");
    }
    
    // create path and map variables
    String localVarPath = "/v1/accounts/{accountId}/clickwraps/{clickwrapId}/agreements/{agreementId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "clickwrapId" + "\\}", apiClient.escapeString(clickwrapId.toString()))
      .replaceAll("\\{" + "agreementId" + "\\}", apiClient.escapeString(agreementId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<UserAgreementResponse> localVarReturnType = new GenericType<UserAgreementResponse>() {};
    UserAgreementResponse localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<UserAgreementResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Downloads a document at an order within the agreement..
   * Downloads a specific document from the agreement presented to the user.  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.sign&#x60;
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param clickwrapId The ID of the clickwrap. (required)
   * @param versionId The ID of the clickwrap version. (required)
   * @param orderOrDisclosure The order of the document or consumer_disclosure. (required)
   * @return Document
   * @throws ApiException if fails to make API call
   */
  public Document getAgreementDocument(String accountId, String clickwrapId, String versionId, String orderOrDisclosure) throws ApiException {
    ApiResponse<Document> localVarResponse = getAgreementDocumentWithHttpInfo(accountId, clickwrapId, versionId, orderOrDisclosure);
    return localVarResponse.getData();
  }

  /**
   * Downloads a document at an order within the agreement.
   * Downloads a specific document from the agreement presented to the user.  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.sign&#x60;
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param clickwrapId The ID of the clickwrap. (required)
   * @param versionId The ID of the clickwrap version. (required)
   * @param orderOrDisclosure The order of the document or consumer_disclosure. (required)
   * @return Document
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Document > getAgreementDocumentWithHttpInfo(String accountId, String clickwrapId, String versionId, String orderOrDisclosure) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getAgreementDocument");
    }
    
    // verify the required parameter 'clickwrapId' is set
    if (clickwrapId == null) {
      throw new ApiException(400, "Missing the required parameter 'clickwrapId' when calling getAgreementDocument");
    }
    
    // verify the required parameter 'versionId' is set
    if (versionId == null) {
      throw new ApiException(400, "Missing the required parameter 'versionId' when calling getAgreementDocument");
    }
    
    // verify the required parameter 'orderOrDisclosure' is set
    if (orderOrDisclosure == null) {
      throw new ApiException(400, "Missing the required parameter 'orderOrDisclosure' when calling getAgreementDocument");
    }
    
    // create path and map variables
    String localVarPath = "/v1/accounts/{accountId}/clickwraps/{clickwrapId}/versions/{versionId}/documents/{orderOrDisclosure}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "clickwrapId" + "\\}", apiClient.escapeString(clickwrapId.toString()))
      .replaceAll("\\{" + "versionId" + "\\}", apiClient.escapeString(versionId.toString()))
      .replaceAll("\\{" + "orderOrDisclosure" + "\\}", apiClient.escapeString(orderOrDisclosure.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<Document> localVarReturnType = new GenericType<Document>() {};
    Document localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<Document>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Gets the completed user agreement PDF. Gets the PDF of  &#x60;agreementId&#x60; for the clickwrap specified by &#x60;clickwrapId&#x60;.  The response to this method is the bytes of the PDF file. The response includes the HTTP header &#x60;application/pdf&#x60;.  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60; or &#x60;click.send&#x60;.
  /// </summary>

 /**
  * GetAgreementPdfOptions Class.
  *
  **/
  public class GetAgreementPdfOptions
  {
  private String includeCoc = null;
  
 /**
  * setIncludeCoc method.
  */
  public void setIncludeCoc(String includeCoc) {
    this.includeCoc = includeCoc;
  }

 /**
  * getIncludeCoc method.
  *
  * @return String
  */
  public String getIncludeCoc() {
    return this.includeCoc;
  }
  }

   /**
   * Gets the completed user agreement PDF..
   * Gets the PDF of  &#x60;agreementId&#x60; for the clickwrap specified by &#x60;clickwrapId&#x60;.  The response to this method is the bytes of the PDF file. The response includes the HTTP header &#x60;application/pdf&#x60;.  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60; or &#x60;click.send&#x60;.
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param clickwrapId The ID of the clickwrap. (required)
   * @param agreementId The agreement ID. (required)
   * @return byte[]
   */ 
  public byte[] getAgreementPdf(String accountId, String clickwrapId, String agreementId) throws ApiException {
    return getAgreementPdf(accountId, clickwrapId, agreementId, null);
  }

  /**
   * Gets the completed user agreement PDF..
   * Gets the PDF of  &#x60;agreementId&#x60; for the clickwrap specified by &#x60;clickwrapId&#x60;.  The response to this method is the bytes of the PDF file. The response includes the HTTP header &#x60;application/pdf&#x60;.  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60; or &#x60;click.send&#x60;.
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param clickwrapId The ID of the clickwrap. (required)
   * @param agreementId The agreement ID. (required)
   * @param options for modifying the method behavior.
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public byte[] getAgreementPdf(String accountId, String clickwrapId, String agreementId, AccountsApi.GetAgreementPdfOptions options) throws ApiException {
    ApiResponse<byte[]> localVarResponse = getAgreementPdfWithHttpInfo(accountId, clickwrapId, agreementId, options);
    return localVarResponse.getData();
  }

  /**
   * Gets the completed user agreement PDF.
   * Gets the PDF of  &#x60;agreementId&#x60; for the clickwrap specified by &#x60;clickwrapId&#x60;.  The response to this method is the bytes of the PDF file. The response includes the HTTP header &#x60;application/pdf&#x60;.  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60; or &#x60;click.send&#x60;.
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param clickwrapId The ID of the clickwrap. (required)
   * @param agreementId The agreement ID. (required)
   * @param options for modifying the method behavior.
   * @return byte[]
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<byte[] > getAgreementPdfWithHttpInfo(String accountId, String clickwrapId, String agreementId, AccountsApi.GetAgreementPdfOptions options) throws ApiException {
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
    byte[] localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<byte[]>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Gets a  single clickwrap object..
   * Retrieves the definition of the specified clickwrap.  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60;.
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param clickwrapId The ID of the clickwrap. (required)
   * @return ClickwrapVersionResponse
   * @throws ApiException if fails to make API call
   */
  public ClickwrapVersionResponse getClickwrap(String accountId, String clickwrapId) throws ApiException {
    ApiResponse<ClickwrapVersionResponse> localVarResponse = getClickwrapWithHttpInfo(accountId, clickwrapId);
    return localVarResponse.getData();
  }

  /**
   * Gets a  single clickwrap object.
   * Retrieves the definition of the specified clickwrap.  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60;.
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param clickwrapId The ID of the clickwrap. (required)
   * @return ClickwrapVersionResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ClickwrapVersionResponse > getClickwrapWithHttpInfo(String accountId, String clickwrapId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getClickwrap");
    }
    
    // verify the required parameter 'clickwrapId' is set
    if (clickwrapId == null) {
      throw new ApiException(400, "Missing the required parameter 'clickwrapId' when calling getClickwrap");
    }
    
    // create path and map variables
    String localVarPath = "/v1/accounts/{accountId}/clickwraps/{clickwrapId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "clickwrapId" + "\\}", apiClient.escapeString(clickwrapId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<ClickwrapVersionResponse> localVarReturnType = new GenericType<ClickwrapVersionResponse>() {};
    ClickwrapVersionResponse localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ClickwrapVersionResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Get user agreements Retrieves the user agreements for a specified clickwrap. Each &#x60;userAgreementResponse&#x60; object describes a single user&#39;s response to the clickwrap. You can also filter the agreements by date, status, page number, and client user ID.  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60;.
  /// </summary>

 /**
  * GetClickwrapAgreementsOptions Class.
  *
  **/
  public class GetClickwrapAgreementsOptions
  {
  private String clientUserId = null;
  private String fromDate = null;
  private String pageNumber = null;
  private String status = null;
  private String toDate = null;
  
 /**
  * setClientUserId method.
  */
  public void setClientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
  }

 /**
  * getClientUserId method.
  *
  * @return String
  */
  public String getClientUserId() {
    return this.clientUserId;
  }
  
 /**
  * setFromDate method.
  */
  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }

 /**
  * getFromDate method.
  *
  * @return String
  */
  public String getFromDate() {
    return this.fromDate;
  }
  
 /**
  * setPageNumber method.
  */
  public void setPageNumber(String pageNumber) {
    this.pageNumber = pageNumber;
  }

 /**
  * getPageNumber method.
  *
  * @return String
  */
  public String getPageNumber() {
    return this.pageNumber;
  }
  
 /**
  * setStatus method.
  */
  public void setStatus(String status) {
    this.status = status;
  }

 /**
  * getStatus method.
  *
  * @return String
  */
  public String getStatus() {
    return this.status;
  }
  
 /**
  * setToDate method.
  */
  public void setToDate(String toDate) {
    this.toDate = toDate;
  }

 /**
  * getToDate method.
  *
  * @return String
  */
  public String getToDate() {
    return this.toDate;
  }
  }

   /**
   * Get user agreements.
   * Retrieves the user agreements for a specified clickwrap. Each &#x60;userAgreementResponse&#x60; object describes a single user&#39;s response to the clickwrap. You can also filter the agreements by date, status, page number, and client user ID.  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60;.
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param clickwrapId The ID of the clickwrap. (required)
   * @return ClickwrapAgreementsResponse
   */ 
  public ClickwrapAgreementsResponse getClickwrapAgreements(String accountId, String clickwrapId) throws ApiException {
    return getClickwrapAgreements(accountId, clickwrapId, null);
  }

  /**
   * Get user agreements.
   * Retrieves the user agreements for a specified clickwrap. Each &#x60;userAgreementResponse&#x60; object describes a single user&#39;s response to the clickwrap. You can also filter the agreements by date, status, page number, and client user ID.  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60;.
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param clickwrapId The ID of the clickwrap. (required)
   * @param options for modifying the method behavior.
   * @return ClickwrapAgreementsResponse
   * @throws ApiException if fails to make API call
   */
  public ClickwrapAgreementsResponse getClickwrapAgreements(String accountId, String clickwrapId, AccountsApi.GetClickwrapAgreementsOptions options) throws ApiException {
    ApiResponse<ClickwrapAgreementsResponse> localVarResponse = getClickwrapAgreementsWithHttpInfo(accountId, clickwrapId, options);
    return localVarResponse.getData();
  }

  /**
   * Get user agreements
   * Retrieves the user agreements for a specified clickwrap. Each &#x60;userAgreementResponse&#x60; object describes a single user&#39;s response to the clickwrap. You can also filter the agreements by date, status, page number, and client user ID.  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60;.
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param clickwrapId The ID of the clickwrap. (required)
   * @param options for modifying the method behavior.
   * @return ClickwrapAgreementsResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ClickwrapAgreementsResponse > getClickwrapAgreementsWithHttpInfo(String accountId, String clickwrapId, AccountsApi.GetClickwrapAgreementsOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getClickwrapAgreements");
    }
    
    // verify the required parameter 'clickwrapId' is set
    if (clickwrapId == null) {
      throw new ApiException(400, "Missing the required parameter 'clickwrapId' when calling getClickwrapAgreements");
    }
    
    // create path and map variables
    String localVarPath = "/v1/accounts/{accountId}/clickwraps/{clickwrapId}/users"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "clickwrapId" + "\\}", apiClient.escapeString(clickwrapId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("client_user_id", options.clientUserId));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("from_date", options.fromDate));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("page_number", options.pageNumber));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("status", options.status));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("to_date", options.toDate));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<ClickwrapAgreementsResponse> localVarReturnType = new GenericType<ClickwrapAgreementsResponse>() {};
    ClickwrapAgreementsResponse localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ClickwrapAgreementsResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Gets a specific version of a clickwrap by version ID..
   * Gets the version specified by &#x60;versionId&#x60;  from the clickwrap &#x60;clickwrapId&#x60;.  **Note:** This endpoint requires the version ID (a GUID), not the version number (an integer).  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60;.
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param clickwrapId The ID of the clickwrap. (required)
   * @param versionId The ID of the clickwrap version. (required)
   * @return ClickwrapVersionResponse
   * @throws ApiException if fails to make API call
   */
  public ClickwrapVersionResponse getClickwrapVersion(String accountId, String clickwrapId, String versionId) throws ApiException {
    ApiResponse<ClickwrapVersionResponse> localVarResponse = getClickwrapVersionWithHttpInfo(accountId, clickwrapId, versionId);
    return localVarResponse.getData();
  }

  /**
   * Gets a specific version of a clickwrap by version ID.
   * Gets the version specified by &#x60;versionId&#x60;  from the clickwrap &#x60;clickwrapId&#x60;.  **Note:** This endpoint requires the version ID (a GUID), not the version number (an integer).  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60;.
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param clickwrapId The ID of the clickwrap. (required)
   * @param versionId The ID of the clickwrap version. (required)
   * @return ClickwrapVersionResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ClickwrapVersionResponse > getClickwrapVersionWithHttpInfo(String accountId, String clickwrapId, String versionId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getClickwrapVersion");
    }
    
    // verify the required parameter 'clickwrapId' is set
    if (clickwrapId == null) {
      throw new ApiException(400, "Missing the required parameter 'clickwrapId' when calling getClickwrapVersion");
    }
    
    // verify the required parameter 'versionId' is set
    if (versionId == null) {
      throw new ApiException(400, "Missing the required parameter 'versionId' when calling getClickwrapVersion");
    }
    
    // create path and map variables
    String localVarPath = "/v1/accounts/{accountId}/clickwraps/{clickwrapId}/versions/{versionId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "clickwrapId" + "\\}", apiClient.escapeString(clickwrapId.toString()))
      .replaceAll("\\{" + "versionId" + "\\}", apiClient.escapeString(versionId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<ClickwrapVersionResponse> localVarReturnType = new GenericType<ClickwrapVersionResponse>() {};
    ClickwrapVersionResponse localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ClickwrapVersionResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Gets the agreement responses for a clickwrap version by version ID. Gets the agreement responses for a specific version.  **Note:** This endpoint requires the version ID (a GUID), not the version number (an integer).  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60;.
  /// </summary>

 /**
  * GetClickwrapVersionAgreementsOptions Class.
  *
  **/
  public class GetClickwrapVersionAgreementsOptions
  {
  private String clientUserId = null;
  private String fromDate = null;
  private String pageNumber = null;
  private String status = null;
  private String toDate = null;
  
 /**
  * setClientUserId method.
  */
  public void setClientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
  }

 /**
  * getClientUserId method.
  *
  * @return String
  */
  public String getClientUserId() {
    return this.clientUserId;
  }
  
 /**
  * setFromDate method.
  */
  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }

 /**
  * getFromDate method.
  *
  * @return String
  */
  public String getFromDate() {
    return this.fromDate;
  }
  
 /**
  * setPageNumber method.
  */
  public void setPageNumber(String pageNumber) {
    this.pageNumber = pageNumber;
  }

 /**
  * getPageNumber method.
  *
  * @return String
  */
  public String getPageNumber() {
    return this.pageNumber;
  }
  
 /**
  * setStatus method.
  */
  public void setStatus(String status) {
    this.status = status;
  }

 /**
  * getStatus method.
  *
  * @return String
  */
  public String getStatus() {
    return this.status;
  }
  
 /**
  * setToDate method.
  */
  public void setToDate(String toDate) {
    this.toDate = toDate;
  }

 /**
  * getToDate method.
  *
  * @return String
  */
  public String getToDate() {
    return this.toDate;
  }
  }

   /**
   * Gets the agreement responses for a clickwrap version by version ID..
   * Gets the agreement responses for a specific version.  **Note:** This endpoint requires the version ID (a GUID), not the version number (an integer).  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60;.
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param clickwrapId The ID of the clickwrap. (required)
   * @param versionId The ID of the clickwrap version. (required)
   * @return ClickwrapAgreementsResponse
   */ 
  public ClickwrapAgreementsResponse getClickwrapVersionAgreements(String accountId, String clickwrapId, String versionId) throws ApiException {
    return getClickwrapVersionAgreements(accountId, clickwrapId, versionId, null);
  }

  /**
   * Gets the agreement responses for a clickwrap version by version ID..
   * Gets the agreement responses for a specific version.  **Note:** This endpoint requires the version ID (a GUID), not the version number (an integer).  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60;.
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param clickwrapId The ID of the clickwrap. (required)
   * @param versionId The ID of the clickwrap version. (required)
   * @param options for modifying the method behavior.
   * @return ClickwrapAgreementsResponse
   * @throws ApiException if fails to make API call
   */
  public ClickwrapAgreementsResponse getClickwrapVersionAgreements(String accountId, String clickwrapId, String versionId, AccountsApi.GetClickwrapVersionAgreementsOptions options) throws ApiException {
    ApiResponse<ClickwrapAgreementsResponse> localVarResponse = getClickwrapVersionAgreementsWithHttpInfo(accountId, clickwrapId, versionId, options);
    return localVarResponse.getData();
  }

  /**
   * Gets the agreement responses for a clickwrap version by version ID.
   * Gets the agreement responses for a specific version.  **Note:** This endpoint requires the version ID (a GUID), not the version number (an integer).  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60;.
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param clickwrapId The ID of the clickwrap. (required)
   * @param versionId The ID of the clickwrap version. (required)
   * @param options for modifying the method behavior.
   * @return ClickwrapAgreementsResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ClickwrapAgreementsResponse > getClickwrapVersionAgreementsWithHttpInfo(String accountId, String clickwrapId, String versionId, AccountsApi.GetClickwrapVersionAgreementsOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getClickwrapVersionAgreements");
    }
    
    // verify the required parameter 'clickwrapId' is set
    if (clickwrapId == null) {
      throw new ApiException(400, "Missing the required parameter 'clickwrapId' when calling getClickwrapVersionAgreements");
    }
    
    // verify the required parameter 'versionId' is set
    if (versionId == null) {
      throw new ApiException(400, "Missing the required parameter 'versionId' when calling getClickwrapVersionAgreements");
    }
    
    // create path and map variables
    String localVarPath = "/v1/accounts/{accountId}/clickwraps/{clickwrapId}/versions/{versionId}/users"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "clickwrapId" + "\\}", apiClient.escapeString(clickwrapId.toString()))
      .replaceAll("\\{" + "versionId" + "\\}", apiClient.escapeString(versionId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("client_user_id", options.clientUserId));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("from_date", options.fromDate));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("page_number", options.pageNumber));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("status", options.status));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("to_date", options.toDate));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<ClickwrapAgreementsResponse> localVarReturnType = new GenericType<ClickwrapAgreementsResponse>() {};
    ClickwrapAgreementsResponse localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ClickwrapAgreementsResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Gets all the versions of a clickwrap..
   * Gets all the versions of a clickwrap for an account.  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60;.
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param clickwrapId The ID of the clickwrap. (required)
   * @return ClickwrapVersionsPagedResponse
   * @throws ApiException if fails to make API call
   */
  public ClickwrapVersionsPagedResponse getClickwrapVersions(String accountId, String clickwrapId) throws ApiException {
    ApiResponse<ClickwrapVersionsPagedResponse> localVarResponse = getClickwrapVersionsWithHttpInfo(accountId, clickwrapId);
    return localVarResponse.getData();
  }

  /**
   * Gets all the versions of a clickwrap.
   * Gets all the versions of a clickwrap for an account.  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60;.
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param clickwrapId The ID of the clickwrap. (required)
   * @return ClickwrapVersionsPagedResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ClickwrapVersionsPagedResponse > getClickwrapVersionsWithHttpInfo(String accountId, String clickwrapId) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getClickwrapVersions");
    }
    
    // verify the required parameter 'clickwrapId' is set
    if (clickwrapId == null) {
      throw new ApiException(400, "Missing the required parameter 'clickwrapId' when calling getClickwrapVersions");
    }
    
    // create path and map variables
    String localVarPath = "/v1/accounts/{accountId}/clickwraps/{clickwrapId}/versions"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "clickwrapId" + "\\}", apiClient.escapeString(clickwrapId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<ClickwrapVersionsPagedResponse> localVarReturnType = new GenericType<ClickwrapVersionsPagedResponse>() {};
    ClickwrapVersionsPagedResponse localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ClickwrapVersionsPagedResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
  /// <summary>
  /// Gets all the clickwraps for a user. Gets all the clickwraps for a user.   **Note:** This endpoint returns a list of &#x60;clickwrapVersionSummaryResponse&#x60; objects. Each version of each clickwrap is returned as a separate entry in the list.  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60;. 
  /// </summary>

 /**
  * GetClickwrapsOptions Class.
  *
  **/
  public class GetClickwrapsOptions
  {
  private String filter = null;
  private String fromDate = null;
  private String name = null;
  private String ownerUserId = null;
  private String pageNumber = null;
  private String status = null;
  private String toDate = null;
  
 /**
  * setFilter method.
  */
  public void setFilter(String filter) {
    this.filter = filter;
  }

 /**
  * getFilter method.
  *
  * @return String
  */
  public String getFilter() {
    return this.filter;
  }
  
 /**
  * setFromDate method.
  */
  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }

 /**
  * getFromDate method.
  *
  * @return String
  */
  public String getFromDate() {
    return this.fromDate;
  }
  
 /**
  * setName method.
  */
  public void setName(String name) {
    this.name = name;
  }

 /**
  * getName method.
  *
  * @return String
  */
  public String getName() {
    return this.name;
  }
  
 /**
  * setOwnerUserId method.
  */
  public void setOwnerUserId(String ownerUserId) {
    this.ownerUserId = ownerUserId;
  }

 /**
  * getOwnerUserId method.
  *
  * @return String
  */
  public String getOwnerUserId() {
    return this.ownerUserId;
  }
  
 /**
  * setPageNumber method.
  */
  public void setPageNumber(String pageNumber) {
    this.pageNumber = pageNumber;
  }

 /**
  * getPageNumber method.
  *
  * @return String
  */
  public String getPageNumber() {
    return this.pageNumber;
  }
  
 /**
  * setStatus method.
  */
  public void setStatus(String status) {
    this.status = status;
  }

 /**
  * getStatus method.
  *
  * @return String
  */
  public String getStatus() {
    return this.status;
  }
  
 /**
  * setToDate method.
  */
  public void setToDate(String toDate) {
    this.toDate = toDate;
  }

 /**
  * getToDate method.
  *
  * @return String
  */
  public String getToDate() {
    return this.toDate;
  }
  }

   /**
   * Gets all the clickwraps for a user..
   * Gets all the clickwraps for a user.   **Note:** This endpoint returns a list of &#x60;clickwrapVersionSummaryResponse&#x60; objects. Each version of each clickwrap is returned as a separate entry in the list.  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60;. 
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @return ClickwrapVersionsResponse
   */ 
  public ClickwrapVersionsResponse getClickwraps(String accountId) throws ApiException {
    return getClickwraps(accountId, null);
  }

  /**
   * Gets all the clickwraps for a user..
   * Gets all the clickwraps for a user.   **Note:** This endpoint returns a list of &#x60;clickwrapVersionSummaryResponse&#x60; objects. Each version of each clickwrap is returned as a separate entry in the list.  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60;. 
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param options for modifying the method behavior.
   * @return ClickwrapVersionsResponse
   * @throws ApiException if fails to make API call
   */
  public ClickwrapVersionsResponse getClickwraps(String accountId, AccountsApi.GetClickwrapsOptions options) throws ApiException {
    ApiResponse<ClickwrapVersionsResponse> localVarResponse = getClickwrapsWithHttpInfo(accountId, options);
    return localVarResponse.getData();
  }

  /**
   * Gets all the clickwraps for a user.
   * Gets all the clickwraps for a user.   **Note:** This endpoint returns a list of &#x60;clickwrapVersionSummaryResponse&#x60; objects. Each version of each clickwrap is returned as a separate entry in the list.  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60;. 
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param options for modifying the method behavior.
   * @return ClickwrapVersionsResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ClickwrapVersionsResponse > getClickwrapsWithHttpInfo(String accountId, AccountsApi.GetClickwrapsOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getClickwraps");
    }
    
    // create path and map variables
    String localVarPath = "/v1/accounts/{accountId}/clickwraps"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("filter", options.filter));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("from_date", options.fromDate));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("name", options.name));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("ownerUserId", options.ownerUserId));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("page_number", options.pageNumber));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("status", options.status));
    }if (options != null) {
      localVarQueryParams.addAll(apiClient.parameterToPair("to_date", options.toDate));
    }

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<ClickwrapVersionsResponse> localVarReturnType = new GenericType<ClickwrapVersionsResponse>() {};
    ClickwrapVersionsResponse localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ClickwrapVersionsResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Gets the current version and other information about the Click API..
   * The response includes information about the Click API, including the service version, build version, and linked sites.  This method does not require authentication.
   * @return ServiceInformation
   * @throws ApiException if fails to make API call
   */
  public ServiceInformation getServiceInformation() throws ApiException {
    ApiResponse<ServiceInformation> localVarResponse = getServiceInformationWithHttpInfo();
    return localVarResponse.getData();
  }

  /**
   * Gets the current version and other information about the Click API.
   * The response includes information about the Click API, including the service version, build version, and linked sites.  This method does not require authentication.
   * @return ServiceInformation
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ServiceInformation > getServiceInformationWithHttpInfo() throws ApiException {
    Object localVarPostBody = "{}";
    
    // create path and map variables
    String localVarPath = "/service_information";

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<ServiceInformation> localVarReturnType = new GenericType<ServiceInformation>() {};
    ServiceInformation localVarResponse = apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ServiceInformation>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Update a clickwrap by ID..
   * Update a subset of properties on the clickwrap.  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60;.
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param clickwrapId The ID of the clickwrap. (required)
   * @param clickwrapTransferRequest Data used to transfer a clickwrap from one user to another. (optional)
   * @return ClickwrapVersionSummaryResponse
   * @throws ApiException if fails to make API call
   */
  public ClickwrapVersionSummaryResponse updateClickwrap(String accountId, String clickwrapId, ClickwrapTransferRequest clickwrapTransferRequest) throws ApiException {
    ApiResponse<ClickwrapVersionSummaryResponse> localVarResponse = updateClickwrapWithHttpInfo(accountId, clickwrapId, clickwrapTransferRequest);
    return localVarResponse.getData();
  }

  /**
   * Update a clickwrap by ID.
   * Update a subset of properties on the clickwrap.  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60;.
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param clickwrapId The ID of the clickwrap. (required)
   * @param clickwrapTransferRequest Data used to transfer a clickwrap from one user to another. (optional)
   * @return ClickwrapVersionSummaryResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ClickwrapVersionSummaryResponse > updateClickwrapWithHttpInfo(String accountId, String clickwrapId, ClickwrapTransferRequest clickwrapTransferRequest) throws ApiException {
    Object localVarPostBody = clickwrapTransferRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateClickwrap");
    }
    
    // verify the required parameter 'clickwrapId' is set
    if (clickwrapId == null) {
      throw new ApiException(400, "Missing the required parameter 'clickwrapId' when calling updateClickwrap");
    }
    
    // create path and map variables
    String localVarPath = "/v1/accounts/{accountId}/clickwraps/{clickwrapId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "clickwrapId" + "\\}", apiClient.escapeString(clickwrapId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<ClickwrapVersionSummaryResponse> localVarReturnType = new GenericType<ClickwrapVersionSummaryResponse>() {};
    ClickwrapVersionSummaryResponse localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ClickwrapVersionSummaryResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }

  /**
   * Updates clickwrap version status and ownership..
   * Updates the clickwrap version status and ownership by transferring from previous user ID to new user ID.  **Note:** This endpoint requires the version ID (a GUID), not the version number (an integer).  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60;.
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param clickwrapId The ID of the clickwrap. (required)
   * @param versionId The ID of the clickwrap version. (required)
   * @param clickwrapRequest Request body for working with clickwrap. (optional)
   * @return ClickwrapVersionSummaryResponse
   * @throws ApiException if fails to make API call
   */
  public ClickwrapVersionSummaryResponse updateClickwrapVersion(String accountId, String clickwrapId, String versionId, ClickwrapRequest clickwrapRequest) throws ApiException {
    ApiResponse<ClickwrapVersionSummaryResponse> localVarResponse = updateClickwrapVersionWithHttpInfo(accountId, clickwrapId, versionId, clickwrapRequest);
    return localVarResponse.getData();
  }

  /**
   * Updates clickwrap version status and ownership.
   * Updates the clickwrap version status and ownership by transferring from previous user ID to new user ID.  **Note:** This endpoint requires the version ID (a GUID), not the version number (an integer).  [Required authentication scopes](/docs/click-api/click101/auth/): &#x60;click.manage&#x60;.
   * @param accountId The external account number (int) or account ID GUID. (required)
   * @param clickwrapId The ID of the clickwrap. (required)
   * @param versionId The ID of the clickwrap version. (required)
   * @param clickwrapRequest Request body for working with clickwrap. (optional)
   * @return ClickwrapVersionSummaryResponse
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<ClickwrapVersionSummaryResponse > updateClickwrapVersionWithHttpInfo(String accountId, String clickwrapId, String versionId, ClickwrapRequest clickwrapRequest) throws ApiException {
    Object localVarPostBody = clickwrapRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateClickwrapVersion");
    }
    
    // verify the required parameter 'clickwrapId' is set
    if (clickwrapId == null) {
      throw new ApiException(400, "Missing the required parameter 'clickwrapId' when calling updateClickwrapVersion");
    }
    
    // verify the required parameter 'versionId' is set
    if (versionId == null) {
      throw new ApiException(400, "Missing the required parameter 'versionId' when calling updateClickwrapVersion");
    }
    
    // create path and map variables
    String localVarPath = "/v1/accounts/{accountId}/clickwraps/{clickwrapId}/versions/{versionId}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "clickwrapId" + "\\}", apiClient.escapeString(clickwrapId.toString()))
      .replaceAll("\\{" + "versionId" + "\\}", apiClient.escapeString(versionId.toString()));

    // query params
    java.util.List<Pair> localVarQueryParams = new java.util.ArrayList<Pair>();
    java.util.List<Pair> localVarCollectionQueryParams = new java.util.ArrayList<Pair>();
    java.util.Map<String, String> localVarHeaderParams = new java.util.HashMap<String, String>();
    java.util.Map<String, Object> localVarFormParams = new java.util.HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };
    
    GenericType<ClickwrapVersionSummaryResponse> localVarReturnType = new GenericType<ClickwrapVersionSummaryResponse>() {};
    ClickwrapVersionSummaryResponse localVarResponse = apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    return new ApiResponse<ClickwrapVersionSummaryResponse>(apiClient.getStatusCode(), apiClient.getResponseHeaders(), localVarResponse);
  }
}
