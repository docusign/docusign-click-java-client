
package com.docusign.click.api;

import javax.ws.rs.core.GenericType;

import com.docusign.click.client.ApiException;
import com.docusign.click.client.ApiClient;
import com.docusign.click.client.Configuration;
import com.docusign.click.model.*;
import com.docusign.click.client.Pair;




/**
 * DiagnosticsApi class.
 *
 **/
public class DiagnosticsApi {
  private ApiClient apiClient;

 /**
  * DiagnosticsApi.
  *
  **/
  public DiagnosticsApi() {
    this(Configuration.getDefaultApiClient());
  }

 /**
  * DiagnosticsApi.
  *
  **/
  public DiagnosticsApi(ApiClient apiClient) {
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
   * Provides base service and version access information..
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
}
