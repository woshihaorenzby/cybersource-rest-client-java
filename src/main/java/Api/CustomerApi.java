/*
 * CyberSource Merged Spec
 * All CyberSource API specs merged together. These are available at https://developer.cybersource.com/api/reference/api-reference.html
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Api;

import Invokers.ApiCallback;
import Invokers.ApiClient;
import Invokers.ApiException;
import Invokers.ApiResponse;
import Invokers.Configuration;
import Invokers.Pair;
import Invokers.ProgressRequestBody;
import Invokers.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;


import Model.InlineResponse400;
import Model.PatchCustomerRequest;
import Model.PostCustomerRequest;
import Model.TmsV2CustomersResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerApi {
    private ApiClient apiClient;

    public CustomerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CustomerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deleteCustomer
     * @param customerTokenId The TokenId of a customer. (required)
     * @param profileId The id of a profile containing user specific TMS configuration. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call deleteCustomerCall(String customerTokenId, String profileId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/tms/v2/customers/{customerTokenId}"
            .replaceAll("\\{" + "customerTokenId" + "\\}", apiClient.escapeString(customerTokenId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (profileId != null)
        localVarHeaderParams.put("profile-id", apiClient.parameterToString(profileId));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().newBuilder().addNetworkInterceptor(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteCustomerValidateBeforeCall(String customerTokenId, String profileId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'customerTokenId' is set
        if (customerTokenId == null) {
            throw new ApiException("Missing the required parameter 'customerTokenId' when calling deleteCustomer(Async)");
        }
        
        
        okhttp3.Call call = deleteCustomerCall(customerTokenId, profileId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete a Customer
     * 
     * @param customerTokenId The TokenId of a customer. (required)
     * @param profileId The id of a profile containing user specific TMS configuration. (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteCustomer(String customerTokenId, String profileId) throws ApiException {
        deleteCustomerWithHttpInfo(customerTokenId, profileId);
    }

    /**
     * Delete a Customer
     * 
     * @param customerTokenId The TokenId of a customer. (required)
     * @param profileId The id of a profile containing user specific TMS configuration. (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteCustomerWithHttpInfo(String customerTokenId, String profileId) throws ApiException {
        okhttp3.Call call = deleteCustomerValidateBeforeCall(customerTokenId, profileId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete a Customer (asynchronously)
     * 
     * @param customerTokenId The TokenId of a customer. (required)
     * @param profileId The id of a profile containing user specific TMS configuration. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call deleteCustomerAsync(String customerTokenId, String profileId, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        okhttp3.Call call = deleteCustomerValidateBeforeCall(customerTokenId, profileId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getCustomer
     * @param customerTokenId The TokenId of a customer. (required)
     * @param profileId The id of a profile containing user specific TMS configuration. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getCustomerCall(String customerTokenId, String profileId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/tms/v2/customers/{customerTokenId}"
            .replaceAll("\\{" + "customerTokenId" + "\\}", apiClient.escapeString(customerTokenId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (profileId != null)
        localVarHeaderParams.put("profile-id", apiClient.parameterToString(profileId));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().newBuilder().addNetworkInterceptor(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCustomerValidateBeforeCall(String customerTokenId, String profileId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'customerTokenId' is set
        if (customerTokenId == null) {
            throw new ApiException("Missing the required parameter 'customerTokenId' when calling getCustomer(Async)");
        }
        
        
        okhttp3.Call call = getCustomerCall(customerTokenId, profileId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Retrieve a Customer
     * 
     * @param customerTokenId The TokenId of a customer. (required)
     * @param profileId The id of a profile containing user specific TMS configuration. (optional)
     * @return TmsV2CustomersResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TmsV2CustomersResponse getCustomer(String customerTokenId, String profileId) throws ApiException {
        ApiResponse<TmsV2CustomersResponse> resp = getCustomerWithHttpInfo(customerTokenId, profileId);
        return resp.getData();
    }

    /**
     * Retrieve a Customer
     * 
     * @param customerTokenId The TokenId of a customer. (required)
     * @param profileId The id of a profile containing user specific TMS configuration. (optional)
     * @return ApiResponse&lt;TmsV2CustomersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TmsV2CustomersResponse> getCustomerWithHttpInfo(String customerTokenId, String profileId) throws ApiException {
        okhttp3.Call call = getCustomerValidateBeforeCall(customerTokenId, profileId, null, null);
        Type localVarReturnType = new TypeToken<TmsV2CustomersResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve a Customer (asynchronously)
     * 
     * @param customerTokenId The TokenId of a customer. (required)
     * @param profileId The id of a profile containing user specific TMS configuration. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getCustomerAsync(String customerTokenId, String profileId, final ApiCallback<TmsV2CustomersResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        okhttp3.Call call = getCustomerValidateBeforeCall(customerTokenId, profileId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TmsV2CustomersResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for patchCustomer
     * @param customerTokenId The TokenId of a customer. (required)
     * @param patchCustomerRequest  (required)
     * @param profileId The id of a profile containing user specific TMS configuration. (optional)
     * @param ifMatch Contains an ETag value from a GET request to make the request conditional. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call patchCustomerCall(String customerTokenId, PatchCustomerRequest patchCustomerRequest, String profileId, String ifMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = patchCustomerRequest;
        
        // create path and map variables
        String localVarPath = "/tms/v2/customers/{customerTokenId}"
            .replaceAll("\\{" + "customerTokenId" + "\\}", apiClient.escapeString(customerTokenId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (profileId != null)
        localVarHeaderParams.put("profile-id", apiClient.parameterToString(profileId));
        if (ifMatch != null)
        localVarHeaderParams.put("if-match", apiClient.parameterToString(ifMatch));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().newBuilder().addNetworkInterceptor(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private okhttp3.Call patchCustomerValidateBeforeCall(String customerTokenId, PatchCustomerRequest patchCustomerRequest, String profileId, String ifMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'customerTokenId' is set
        if (customerTokenId == null) {
            throw new ApiException("Missing the required parameter 'customerTokenId' when calling patchCustomer(Async)");
        }
        
        // verify the required parameter 'patchCustomerRequest' is set
        if (patchCustomerRequest == null) {
            throw new ApiException("Missing the required parameter 'patchCustomerRequest' when calling patchCustomer(Async)");
        }
        
        
        okhttp3.Call call = patchCustomerCall(customerTokenId, patchCustomerRequest, profileId, ifMatch, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Update a Customer
     * 
     * @param customerTokenId The TokenId of a customer. (required)
     * @param patchCustomerRequest  (required)
     * @param profileId The id of a profile containing user specific TMS configuration. (optional)
     * @param ifMatch Contains an ETag value from a GET request to make the request conditional. (optional)
     * @return TmsV2CustomersResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TmsV2CustomersResponse patchCustomer(String customerTokenId, PatchCustomerRequest patchCustomerRequest, String profileId, String ifMatch) throws ApiException {
        ApiResponse<TmsV2CustomersResponse> resp = patchCustomerWithHttpInfo(customerTokenId, patchCustomerRequest, profileId, ifMatch);
        return resp.getData();
    }

    /**
     * Update a Customer
     * 
     * @param customerTokenId The TokenId of a customer. (required)
     * @param patchCustomerRequest  (required)
     * @param profileId The id of a profile containing user specific TMS configuration. (optional)
     * @param ifMatch Contains an ETag value from a GET request to make the request conditional. (optional)
     * @return ApiResponse&lt;TmsV2CustomersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TmsV2CustomersResponse> patchCustomerWithHttpInfo(String customerTokenId, PatchCustomerRequest patchCustomerRequest, String profileId, String ifMatch) throws ApiException {
        okhttp3.Call call = patchCustomerValidateBeforeCall(customerTokenId, patchCustomerRequest, profileId, ifMatch, null, null);
        Type localVarReturnType = new TypeToken<TmsV2CustomersResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update a Customer (asynchronously)
     * 
     * @param customerTokenId The TokenId of a customer. (required)
     * @param patchCustomerRequest  (required)
     * @param profileId The id of a profile containing user specific TMS configuration. (optional)
     * @param ifMatch Contains an ETag value from a GET request to make the request conditional. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call patchCustomerAsync(String customerTokenId, PatchCustomerRequest patchCustomerRequest, String profileId, String ifMatch, final ApiCallback<TmsV2CustomersResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        okhttp3.Call call = patchCustomerValidateBeforeCall(customerTokenId, patchCustomerRequest, profileId, ifMatch, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TmsV2CustomersResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postCustomer
     * @param postCustomerRequest  (required)
     * @param profileId The id of a profile containing user specific TMS configuration. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call postCustomerCall(PostCustomerRequest postCustomerRequest, String profileId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = postCustomerRequest;
        
        // create path and map variables
        String localVarPath = "/tms/v2/customers";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (profileId != null)
        localVarHeaderParams.put("profile-id", apiClient.parameterToString(profileId));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json;charset=utf-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().newBuilder().addNetworkInterceptor(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private okhttp3.Call postCustomerValidateBeforeCall(PostCustomerRequest postCustomerRequest, String profileId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'postCustomerRequest' is set
        if (postCustomerRequest == null) {
            throw new ApiException("Missing the required parameter 'postCustomerRequest' when calling postCustomer(Async)");
        }
        
        
        okhttp3.Call call = postCustomerCall(postCustomerRequest, profileId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create a Customer
     * 
     * @param postCustomerRequest  (required)
     * @param profileId The id of a profile containing user specific TMS configuration. (optional)
     * @return TmsV2CustomersResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TmsV2CustomersResponse postCustomer(PostCustomerRequest postCustomerRequest, String profileId) throws ApiException {
        ApiResponse<TmsV2CustomersResponse> resp = postCustomerWithHttpInfo(postCustomerRequest, profileId);
        return resp.getData();
    }

    /**
     * Create a Customer
     * 
     * @param postCustomerRequest  (required)
     * @param profileId The id of a profile containing user specific TMS configuration. (optional)
     * @return ApiResponse&lt;TmsV2CustomersResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TmsV2CustomersResponse> postCustomerWithHttpInfo(PostCustomerRequest postCustomerRequest, String profileId) throws ApiException {
        okhttp3.Call call = postCustomerValidateBeforeCall(postCustomerRequest, profileId, null, null);
        Type localVarReturnType = new TypeToken<TmsV2CustomersResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create a Customer (asynchronously)
     * 
     * @param postCustomerRequest  (required)
     * @param profileId The id of a profile containing user specific TMS configuration. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call postCustomerAsync(PostCustomerRequest postCustomerRequest, String profileId, final ApiCallback<TmsV2CustomersResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        okhttp3.Call call = postCustomerValidateBeforeCall(postCustomerRequest, profileId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TmsV2CustomersResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}