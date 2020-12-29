
package com.docusign.click.api;

import javax.ws.rs.core.GenericType;

import com.docusign.click.client.ApiException;
import com.docusign.click.client.ApiClient;
import com.docusign.click.client.Configuration;
import com.docusign.click.model.*;
import com.docusign.click.client.Pair;



public class AccountsApi {
  private ApiClient apiClient;

  public AccountsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AccountsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }


  /**
   * Creates a Clickwrap for the specified accountId
   * 
   * @param accountId  (required)
   * @param clickwrapRequest  (optional)
   * @return ClickwrapVersionSummaryResponse
   * @throws ApiException if fails to make API call
   */
  public ClickwrapVersionSummaryResponse createClickwrap(String accountId, ClickwrapRequest clickwrapRequest) throws ApiException {
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
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Creates the clickwrap version
   * 
   * @param accountId  (required)
   * @param clickwrapId  (required)
   * @param clickwrapRequest  (optional)
   * @return ClickwrapVersionSummaryResponse
   * @throws ApiException if fails to make API call
   */
  public ClickwrapVersionSummaryResponse createClickwrapVersion(String accountId, String clickwrapId, ClickwrapRequest clickwrapRequest) throws ApiException {
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
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Checks if a user has agreed to a clickwrap and returns a response with the agreement url. Returns HttpStatusCode.OK if user has no pending agreement.
   * 
   * @param accountId  (required)
   * @param clickwrapId  (required)
   * @param userAgreementRequest  (optional)
   * @return UserAgreementResponse
   * @throws ApiException if fails to make API call
   */
  public UserAgreementResponse createHasAgreed(String accountId, String clickwrapId, UserAgreementRequest userAgreementRequest) throws ApiException {
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
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Deletes the clickwrap and all its version specified by clickwrapId. Active clickwrap will not get deleted 
  /// </summary>
  public class DeleteClickwrapOptions
  {
  private String versions = null;
  /*
   * 
   */
  public void setVersions(String versions) {
    this.versions = versions;
  }

  public String getVersions() {
    return this.versions;
  }
  }

   /**
   * Deletes the clickwrap and all its version specified by clickwrapId. Active clickwrap will not get deleted
   * 
   * @param accountId  (required)
   * @param clickwrapId  (required)
   * @return ClickwrapVersionsDeleteResponse
   */ 
  public ClickwrapVersionsDeleteResponse deleteClickwrap(String accountId, String clickwrapId) throws ApiException {
    return deleteClickwrap(accountId, clickwrapId, null);
  }

  /**
   * Deletes the clickwrap and all its version specified by clickwrapId. Active clickwrap will not get deleted
   * 
   * @param accountId  (required)
   * @param clickwrapId  (required)
   * @param options for modifying the method behavior.
   * @return ClickwrapVersionsDeleteResponse
   * @throws ApiException if fails to make API call
   */
  public ClickwrapVersionsDeleteResponse deleteClickwrap(String accountId, String clickwrapId, AccountsApi.DeleteClickwrapOptions options) throws ApiException {
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
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Delete a Clickwrap version specified by versionId
   * 
   * @param accountId  (required)
   * @param clickwrapId  (required)
   * @param versionId  (required)
   * @return ClickwrapVersionDeleteResponse
   * @throws ApiException if fails to make API call
   */
  public ClickwrapVersionDeleteResponse deleteClickwrapVersion(String accountId, String clickwrapId, String versionId) throws ApiException {
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
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Delete a Clickwrap version specified by versionNumber. Use versionId instead of versionNumber
   * 
   * @param accountId  (required)
   * @param clickwrapId  (required)
   * @param versionNumber  (required)
   * @return ClickwrapVersionSummaryResponse
   * @throws ApiException if fails to make API call
   */
  public ClickwrapVersionSummaryResponse deleteClickwrapVersionByNumber(String accountId, String clickwrapId, String versionNumber) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling deleteClickwrapVersionByNumber");
    }
    
    // verify the required parameter 'clickwrapId' is set
    if (clickwrapId == null) {
      throw new ApiException(400, "Missing the required parameter 'clickwrapId' when calling deleteClickwrapVersionByNumber");
    }
    
    // verify the required parameter 'versionNumber' is set
    if (versionNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'versionNumber' when calling deleteClickwrapVersionByNumber");
    }
    
    // create path and map variables
    String localVarPath = "/v1/accounts/{accountId}/clickwraps/{clickwrapId}/versions/{versionNumber}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "clickwrapId" + "\\}", apiClient.escapeString(clickwrapId.toString()))
      .replaceAll("\\{" + "versionNumber" + "\\}", apiClient.escapeString(versionNumber.toString()));

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
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Deletes the versions specified by query parameter clickwrapVersionIds for a clickwrap, or all versions if no query parameter is specified. It will not delete if a version is active. 
  /// </summary>
  public class DeleteClickwrapVersionsOptions
  {
  private String clickwrapVersionIds = null;
  /*
   * 
   */
  public void setClickwrapVersionIds(String clickwrapVersionIds) {
    this.clickwrapVersionIds = clickwrapVersionIds;
  }

  public String getClickwrapVersionIds() {
    return this.clickwrapVersionIds;
  }
  }

   /**
   * Deletes the versions specified by query parameter clickwrapVersionIds for a clickwrap, or all versions if no query parameter is specified. It will not delete if a version is active.
   * 
   * @param accountId  (required)
   * @param clickwrapId  (required)
   * @return ClickwrapVersionsDeleteResponse
   */ 
  public ClickwrapVersionsDeleteResponse deleteClickwrapVersions(String accountId, String clickwrapId) throws ApiException {
    return deleteClickwrapVersions(accountId, clickwrapId, null);
  }

  /**
   * Deletes the versions specified by query parameter clickwrapVersionIds for a clickwrap, or all versions if no query parameter is specified. It will not delete if a version is active.
   * 
   * @param accountId  (required)
   * @param clickwrapId  (required)
   * @param options for modifying the method behavior.
   * @return ClickwrapVersionsDeleteResponse
   * @throws ApiException if fails to make API call
   */
  public ClickwrapVersionsDeleteResponse deleteClickwrapVersions(String accountId, String clickwrapId, AccountsApi.DeleteClickwrapVersionsOptions options) throws ApiException {
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
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Deletes all the clickwraps for an account or the ones passed in query parameter clickwrapIds. It will not delete active clickwraps. 
  /// </summary>
  public class DeleteClickwrapsOptions
  {
  private String clickwrapIds = null;
  /*
   * 
   */
  public void setClickwrapIds(String clickwrapIds) {
    this.clickwrapIds = clickwrapIds;
  }

  public String getClickwrapIds() {
    return this.clickwrapIds;
  }
  }

   /**
   * Deletes all the clickwraps for an account or the ones passed in query parameter clickwrapIds. It will not delete active clickwraps.
   * 
   * @param accountId  (required)
   * @return ClickwrapsDeleteResponse
   */ 
  public ClickwrapsDeleteResponse deleteClickwraps(String accountId) throws ApiException {
    return deleteClickwraps(accountId, null);
  }

  /**
   * Deletes all the clickwraps for an account or the ones passed in query parameter clickwrapIds. It will not delete active clickwraps.
   * 
   * @param accountId  (required)
   * @param options for modifying the method behavior.
   * @return ClickwrapsDeleteResponse
   * @throws ApiException if fails to make API call
   */
  public ClickwrapsDeleteResponse deleteClickwraps(String accountId, AccountsApi.DeleteClickwrapsOptions options) throws ApiException {
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
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * 
   * 
   * @param accountId  (required)
   * @param clickwrapId  (required)
   * @param agreementId  (required)
   * @return UserAgreementResponse
   * @throws ApiException if fails to make API call
   */
  public UserAgreementResponse getAgreement(String accountId, String clickwrapId, String agreementId) throws ApiException {
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
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * 
   * 
   * @param accountId  (required)
   * @param clickwrapId  (required)
   * @param agreementId  (required)
   * @throws ApiException if fails to make API call
   */
  public void getAgreementPdf(String accountId, String clickwrapId, String agreementId) throws ApiException {
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

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "docusignAccessCode" };


    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }

  /**
   * Gets the clickwrap for an account specified by clickwrapId
   * 
   * @param accountId  (required)
   * @param clickwrapId  (required)
   * @return ClickwrapVersionResponse
   * @throws ApiException if fails to make API call
   */
  public ClickwrapVersionResponse getClickwrap(String accountId, String clickwrapId) throws ApiException {
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
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Gets the Clickwraps for an account 
  /// </summary>
  public class GetClickwrapAgreementsOptions
  {
  private String clientUserId = null;
  private String fromDate = null;
  private String pageNumber = null;
  private String status = null;
  private String toDate = null;
  /*
   * 
   */
  public void setClientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
  }

  public String getClientUserId() {
    return this.clientUserId;
  }
  /*
   * 
   */
  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }

  public String getFromDate() {
    return this.fromDate;
  }
  /*
   * 
   */
  public void setPageNumber(String pageNumber) {
    this.pageNumber = pageNumber;
  }

  public String getPageNumber() {
    return this.pageNumber;
  }
  /*
   * 
   */
  public void setStatus(String status) {
    this.status = status;
  }

  public String getStatus() {
    return this.status;
  }
  /*
   * 
   */
  public void setToDate(String toDate) {
    this.toDate = toDate;
  }

  public String getToDate() {
    return this.toDate;
  }
  }

   /**
   * Gets the Clickwraps for an account
   * 
   * @param accountId  (required)
   * @param clickwrapId  (required)
   * @return ClickwrapAgreementsResponse
   */ 
  public ClickwrapAgreementsResponse getClickwrapAgreements(String accountId, String clickwrapId) throws ApiException {
    return getClickwrapAgreements(accountId, clickwrapId, null);
  }

  /**
   * Gets the Clickwraps for an account
   * 
   * @param accountId  (required)
   * @param clickwrapId  (required)
   * @param options for modifying the method behavior.
   * @return ClickwrapAgreementsResponse
   * @throws ApiException if fails to make API call
   */
  public ClickwrapAgreementsResponse getClickwrapAgreements(String accountId, String clickwrapId, AccountsApi.GetClickwrapAgreementsOptions options) throws ApiException {
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
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Gets the Clickwrap version by clickwrapId and versionId for an account
   * 
   * @param accountId  (required)
   * @param clickwrapId  (required)
   * @param versionId  (required)
   * @return ClickwrapVersionResponse
   * @throws ApiException if fails to make API call
   */
  public ClickwrapVersionResponse getClickwrapVersion(String accountId, String clickwrapId, String versionId) throws ApiException {
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
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Gets the agreement responses for a clickwrap version 
  /// </summary>
  public class GetClickwrapVersionAgreementsOptions
  {
  private String clientUserId = null;
  private String fromDate = null;
  private String pageNumber = null;
  private String status = null;
  private String toDate = null;
  /*
   * 
   */
  public void setClientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
  }

  public String getClientUserId() {
    return this.clientUserId;
  }
  /*
   * 
   */
  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }

  public String getFromDate() {
    return this.fromDate;
  }
  /*
   * 
   */
  public void setPageNumber(String pageNumber) {
    this.pageNumber = pageNumber;
  }

  public String getPageNumber() {
    return this.pageNumber;
  }
  /*
   * 
   */
  public void setStatus(String status) {
    this.status = status;
  }

  public String getStatus() {
    return this.status;
  }
  /*
   * 
   */
  public void setToDate(String toDate) {
    this.toDate = toDate;
  }

  public String getToDate() {
    return this.toDate;
  }
  }

   /**
   * Gets the agreement responses for a clickwrap version
   * 
   * @param accountId  (required)
   * @param clickwrapId  (required)
   * @param versionId  (required)
   * @return ClickwrapAgreementsResponse
   */ 
  public ClickwrapAgreementsResponse getClickwrapVersionAgreements(String accountId, String clickwrapId, String versionId) throws ApiException {
    return getClickwrapVersionAgreements(accountId, clickwrapId, versionId, null);
  }

  /**
   * Gets the agreement responses for a clickwrap version
   * 
   * @param accountId  (required)
   * @param clickwrapId  (required)
   * @param versionId  (required)
   * @param options for modifying the method behavior.
   * @return ClickwrapAgreementsResponse
   * @throws ApiException if fails to make API call
   */
  public ClickwrapAgreementsResponse getClickwrapVersionAgreements(String accountId, String clickwrapId, String versionId, AccountsApi.GetClickwrapVersionAgreementsOptions options) throws ApiException {
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
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Gets the agreement responses for a clickwrap version 
  /// </summary>
  public class GetClickwrapVersionAgreementsByNumberOptions
  {
  private String clientUserId = null;
  private String fromDate = null;
  private String pageNumber = null;
  private String status = null;
  private String toDate = null;
  /*
   * 
   */
  public void setClientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
  }

  public String getClientUserId() {
    return this.clientUserId;
  }
  /*
   * 
   */
  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }

  public String getFromDate() {
    return this.fromDate;
  }
  /*
   * 
   */
  public void setPageNumber(String pageNumber) {
    this.pageNumber = pageNumber;
  }

  public String getPageNumber() {
    return this.pageNumber;
  }
  /*
   * 
   */
  public void setStatus(String status) {
    this.status = status;
  }

  public String getStatus() {
    return this.status;
  }
  /*
   * 
   */
  public void setToDate(String toDate) {
    this.toDate = toDate;
  }

  public String getToDate() {
    return this.toDate;
  }
  }

   /**
   * Gets the agreement responses for a clickwrap version
   * 
   * @param accountId  (required)
   * @param clickwrapId  (required)
   * @param versionNumber  (required)
   * @return ClickwrapAgreementsResponse
   */ 
  public ClickwrapAgreementsResponse getClickwrapVersionAgreementsByNumber(String accountId, String clickwrapId, String versionNumber) throws ApiException {
    return getClickwrapVersionAgreementsByNumber(accountId, clickwrapId, versionNumber, null);
  }

  /**
   * Gets the agreement responses for a clickwrap version
   * 
   * @param accountId  (required)
   * @param clickwrapId  (required)
   * @param versionNumber  (required)
   * @param options for modifying the method behavior.
   * @return ClickwrapAgreementsResponse
   * @throws ApiException if fails to make API call
   */
  public ClickwrapAgreementsResponse getClickwrapVersionAgreementsByNumber(String accountId, String clickwrapId, String versionNumber, AccountsApi.GetClickwrapVersionAgreementsByNumberOptions options) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getClickwrapVersionAgreementsByNumber");
    }
    
    // verify the required parameter 'clickwrapId' is set
    if (clickwrapId == null) {
      throw new ApiException(400, "Missing the required parameter 'clickwrapId' when calling getClickwrapVersionAgreementsByNumber");
    }
    
    // verify the required parameter 'versionNumber' is set
    if (versionNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'versionNumber' when calling getClickwrapVersionAgreementsByNumber");
    }
    
    // create path and map variables
    String localVarPath = "/v1/accounts/{accountId}/clickwraps/{clickwrapId}/versions/{versionNumber}/users"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "clickwrapId" + "\\}", apiClient.escapeString(clickwrapId.toString()))
      .replaceAll("\\{" + "versionNumber" + "\\}", apiClient.escapeString(versionNumber.toString()));

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
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Gets the Clickwrap version by clickwrapId and versionNumber for an account
   * 
   * @param accountId  (required)
   * @param clickwrapId  (required)
   * @param versionNumber  (required)
   * @return ClickwrapVersionResponse
   * @throws ApiException if fails to make API call
   */
  public ClickwrapVersionResponse getClickwrapVersionByNumber(String accountId, String clickwrapId, String versionNumber) throws ApiException {
    Object localVarPostBody = "{}";
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling getClickwrapVersionByNumber");
    }
    
    // verify the required parameter 'clickwrapId' is set
    if (clickwrapId == null) {
      throw new ApiException(400, "Missing the required parameter 'clickwrapId' when calling getClickwrapVersionByNumber");
    }
    
    // verify the required parameter 'versionNumber' is set
    if (versionNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'versionNumber' when calling getClickwrapVersionByNumber");
    }
    
    // create path and map variables
    String localVarPath = "/v1/accounts/{accountId}/clickwraps/{clickwrapId}/versions/{versionNumber}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "clickwrapId" + "\\}", apiClient.escapeString(clickwrapId.toString()))
      .replaceAll("\\{" + "versionNumber" + "\\}", apiClient.escapeString(versionNumber.toString()));

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
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Gets all the versions of a clickwrap for an account
   * 
   * @param accountId  (required)
   * @param clickwrapId  (required)
   * @return ClickwrapVersionsPagedResponse
   * @throws ApiException if fails to make API call
   */
  public ClickwrapVersionsPagedResponse getClickwrapVersions(String accountId, String clickwrapId) throws ApiException {
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
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /// <summary>
  /// Gets the Clickwraps for an account 
  /// </summary>
  public class GetClickwrapsOptions
  {
  private String fromDate = null;
  private String ownerUserId = null;
  private String pageNumber = null;
  private String status = null;
  private String toDate = null;
  /*
   * 
   */
  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }

  public String getFromDate() {
    return this.fromDate;
  }
  /*
   * 
   */
  public void setOwnerUserId(String ownerUserId) {
    this.ownerUserId = ownerUserId;
  }

  public String getOwnerUserId() {
    return this.ownerUserId;
  }
  /*
   * 
   */
  public void setPageNumber(String pageNumber) {
    this.pageNumber = pageNumber;
  }

  public String getPageNumber() {
    return this.pageNumber;
  }
  /*
   * 
   */
  public void setStatus(String status) {
    this.status = status;
  }

  public String getStatus() {
    return this.status;
  }
  /*
   * 
   */
  public void setToDate(String toDate) {
    this.toDate = toDate;
  }

  public String getToDate() {
    return this.toDate;
  }
  }

   /**
   * Gets the Clickwraps for an account
   * 
   * @param accountId  (required)
   * @return ClickwrapVersionsResponse
   */ 
  public ClickwrapVersionsResponse getClickwraps(String accountId) throws ApiException {
    return getClickwraps(accountId, null);
  }

  /**
   * Gets the Clickwraps for an account
   * 
   * @param accountId  (required)
   * @param options for modifying the method behavior.
   * @return ClickwrapVersionsResponse
   * @throws ApiException if fails to make API call
   */
  public ClickwrapVersionsResponse getClickwraps(String accountId, AccountsApi.GetClickwrapsOptions options) throws ApiException {
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
      localVarQueryParams.addAll(apiClient.parameterToPair("from_date", options.fromDate));
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
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Provides base service and version access information.
   * 
   * @return ServiceInformation
   * @throws ApiException if fails to make API call
   */
  public ServiceInformation getServiceInformation() throws ApiException {
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
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Updates the clickwrap specified by clickwrapId
   * 
   * @param accountId  (required)
   * @param clickwrapId  (required)
   * @param clickwrapTransferRequest  (optional)
   * @return ClickwrapVersionSummaryResponse
   * @throws ApiException if fails to make API call
   */
  public ClickwrapVersionSummaryResponse updateClickwrap(String accountId, String clickwrapId, ClickwrapTransferRequest clickwrapTransferRequest) throws ApiException {
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
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Updates the clickwrap version specified by versionId
   * 
   * @param accountId  (required)
   * @param clickwrapId  (required)
   * @param versionId  (required)
   * @param clickwrapRequest  (optional)
   * @return ClickwrapVersionSummaryResponse
   * @throws ApiException if fails to make API call
   */
  public ClickwrapVersionSummaryResponse updateClickwrapVersion(String accountId, String clickwrapId, String versionId, ClickwrapRequest clickwrapRequest) throws ApiException {
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
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }

  /**
   * Updates the clickwrap version specified by versionNumber. Use versionId instead of versionNumber
   * 
   * @param accountId  (required)
   * @param clickwrapId  (required)
   * @param versionNumber  (required)
   * @param clickwrapRequest  (optional)
   * @return ClickwrapVersionSummaryResponse
   * @throws ApiException if fails to make API call
   */
  public ClickwrapVersionSummaryResponse updateClickwrapVersionByNumber(String accountId, String clickwrapId, String versionNumber, ClickwrapRequest clickwrapRequest) throws ApiException {
    Object localVarPostBody = clickwrapRequest;
    
    // verify the required parameter 'accountId' is set
    if (accountId == null) {
      throw new ApiException(400, "Missing the required parameter 'accountId' when calling updateClickwrapVersionByNumber");
    }
    
    // verify the required parameter 'clickwrapId' is set
    if (clickwrapId == null) {
      throw new ApiException(400, "Missing the required parameter 'clickwrapId' when calling updateClickwrapVersionByNumber");
    }
    
    // verify the required parameter 'versionNumber' is set
    if (versionNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'versionNumber' when calling updateClickwrapVersionByNumber");
    }
    
    // create path and map variables
    String localVarPath = "/v1/accounts/{accountId}/clickwraps/{clickwrapId}/versions/{versionNumber}"
      .replaceAll("\\{" + "accountId" + "\\}", apiClient.escapeString(accountId.toString()))
      .replaceAll("\\{" + "clickwrapId" + "\\}", apiClient.escapeString(clickwrapId.toString()))
      .replaceAll("\\{" + "versionNumber" + "\\}", apiClient.escapeString(versionNumber.toString()));

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
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
