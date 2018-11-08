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

import Invokers.ApiCallback;
import Invokers.ApiClient;
import Invokers.ApiException;
import Invokers.ApiResponse;
import Invokers.Configuration;
import Invokers.Pair;
import Invokers.ProgressRequestBody;
import Invokers.ProgressResponseBody;

import com.cybersource.authsdk.core.MerchantConfig;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.joda.time.DateTime;
import Model.PtsV1TransactionBatchesGet200Response;
import Model.PtsV1TransactionBatchesGet400Response;
import Model.PtsV1TransactionBatchesGet500Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionBatchesApi {
    private ApiClient apiClient;

    public TransactionBatchesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TransactionBatchesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for ptsV1TransactionBatchesGet
     * @param startTime Valid report Start Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format. - https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14   **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZZ  (required)
     * @param endTime Valid report End Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format. - https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14   **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZZ  (required)
     * @param merchantConfig  (merchant details)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call ptsV1TransactionBatchesGetCall(DateTime startTime, DateTime endTime,MerchantConfig merchantConfig, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/pts/v1/transaction-batches?startTime="+startTime.toString()+"&endTime="+endTime.toString();

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
        return apiClient.buildCall(localVarPath, "GET", merchantConfig, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call ptsV1TransactionBatchesGetValidateBeforeCall(DateTime startTime, DateTime endTime,MerchantConfig merchantConfig, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'startTime' is set
        if (startTime == null) {
            throw new ApiException("Missing the required parameter 'startTime' when calling ptsV1TransactionBatchesGet(Async)");
        }
        
        // verify the required parameter 'endTime' is set
        if (endTime == null) {
            throw new ApiException("Missing the required parameter 'endTime' when calling ptsV1TransactionBatchesGet(Async)");
        }
        
        
        com.squareup.okhttp.Call call = ptsV1TransactionBatchesGetCall(startTime, endTime, merchantConfig, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get a list of batch files processed through the Offline Transaction Submission Services
     * Provide the search range
     * @param startTime Valid report Start Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format. - https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14   **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZZ  (required)
     * @param endTime Valid report End Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format. - https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14   **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZZ  (required)
     * @param merchantConfig  (merchant details)
     * @return PtsV1TransactionBatchesGet200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PtsV1TransactionBatchesGet200Response ptsV1TransactionBatchesGet(DateTime startTime, DateTime endTime,MerchantConfig merchantConfig) throws ApiException {
        ApiResponse<PtsV1TransactionBatchesGet200Response> resp = ptsV1TransactionBatchesGetWithHttpInfo(startTime, endTime, merchantConfig);
        return resp.getData();
    }

    /**
     * Get a list of batch files processed through the Offline Transaction Submission Services
     * Provide the search range
     * @param startTime Valid report Start Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format. - https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14   **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZZ  (required)
     * @param endTime Valid report End Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format. - https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14   **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZZ  (required)
     * @param merchantConfig  (merchant details)
     * @return ApiResponse&lt;PtsV1TransactionBatchesGet200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PtsV1TransactionBatchesGet200Response> ptsV1TransactionBatchesGetWithHttpInfo(DateTime startTime, DateTime endTime,MerchantConfig merchantConfig) throws ApiException {
        com.squareup.okhttp.Call call = ptsV1TransactionBatchesGetValidateBeforeCall(startTime, endTime, merchantConfig, null, null);
        Type localVarReturnType = new TypeToken<PtsV1TransactionBatchesGet200Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a list of batch files processed through the Offline Transaction Submission Services (asynchronously)
     * Provide the search range
     * @param startTime Valid report Start Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format. - https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14   **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZZ  (required)
     * @param endTime Valid report End Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format. - https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14   **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZZ  (required)
     * @param merchantConfig  (merchant details)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call ptsV1TransactionBatchesGetAsync(DateTime startTime, DateTime endTime,MerchantConfig merchantConfig, final ApiCallback<PtsV1TransactionBatchesGet200Response> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = ptsV1TransactionBatchesGetValidateBeforeCall(startTime, endTime, merchantConfig, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PtsV1TransactionBatchesGet200Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}