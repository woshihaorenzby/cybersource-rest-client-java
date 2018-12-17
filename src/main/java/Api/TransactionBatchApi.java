/*
 * CyberSource Flex API
 * Simple PAN tokenization service
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Api;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.reflect.TypeToken;

import Invokers.ApiCallback;
import Invokers.ApiClient;
import Invokers.ApiException;
import Invokers.ApiResponse;
import Invokers.Configuration;
import Invokers.Pair;
import Invokers.ProgressRequestBody;
import Invokers.ProgressResponseBody;
import Model.PtsV1TransactionBatchesGet200Response;

public class TransactionBatchApi {
    private ApiClient apiClient;

    public TransactionBatchApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TransactionBatchApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for ptsV1TransactionBatchesIdGet
     * @param id The batch id assigned for the template. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call ptsV1TransactionBatchesIdGetCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/pts/v1/transaction-batches/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/hal+json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET",  localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call ptsV1TransactionBatchesIdGetValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling ptsV1TransactionBatchesIdGet(Async)");
        }
        
        
        com.squareup.okhttp.Call call = ptsV1TransactionBatchesIdGetCall(id,  progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get an individual batch file Details processed through the Offline Transaction Submission Services
     * Provide the search range
     * @param id The batch id assigned for the template. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @return ApiResponse&lt;Void&gt;
     */
    public ApiResponse<PtsV1TransactionBatchesGet200Response> ptsV1TransactionBatchesIdGet(String id) throws ApiException {
        return ptsV1TransactionBatchesIdGetWithHttpInfo(id);
    }

    /**
     * Get an individual batch file Details processed through the Offline Transaction Submission Services
     * Provide the search range
     * @param id The batch id assigned for the template. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PtsV1TransactionBatchesGet200Response> ptsV1TransactionBatchesIdGetWithHttpInfo(String id) throws ApiException {
        com.squareup.okhttp.Call call = ptsV1TransactionBatchesIdGetValidateBeforeCall(id,  null, null);
        Type localVarReturnType = new TypeToken<PtsV1TransactionBatchesGet200Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get an individual batch file Details processed through the Offline Transaction Submission Services (asynchronously)
     * Provide the search range
     * @param id The batch id assigned for the template. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call ptsV1TransactionBatchesIdGetAsync(String id, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = ptsV1TransactionBatchesIdGetValidateBeforeCall(id,  progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
