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



import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DownloadDTDApi {
    private ApiClient apiClient;

    public DownloadDTDApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DownloadDTDApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getDTDV2
     * @param reportDefinitionNameVersion Name and version of DTD file to download. Some DTDs only have one version. In that case version name is not needed. Some example values are ctdr-1.0, tdr, pbdr-1.1 (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getDTDV2Call(String reportDefinitionNameVersion, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/reporting/v3/dtds/{reportDefinitionNameVersion}"
            .replaceAll("\\{" + "reportDefinitionNameVersion" + "\\}", apiClient.escapeString(reportDefinitionNameVersion.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml-dtd"
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
    private okhttp3.Call getDTDV2ValidateBeforeCall(String reportDefinitionNameVersion, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'reportDefinitionNameVersion' is set
        if (reportDefinitionNameVersion == null) {
            throw new ApiException("Missing the required parameter 'reportDefinitionNameVersion' when calling getDTDV2(Async)");
        }
        
        
        okhttp3.Call call = getDTDV2Call(reportDefinitionNameVersion, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Download DTD for Report
     * Used to download DTDs for reports on no-auth.
     * @param reportDefinitionNameVersion Name and version of DTD file to download. Some DTDs only have one version. In that case version name is not needed. Some example values are ctdr-1.0, tdr, pbdr-1.1 (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getDTDV2(String reportDefinitionNameVersion) throws ApiException {
        getDTDV2WithHttpInfo(reportDefinitionNameVersion);
    }

    /**
     * Download DTD for Report
     * Used to download DTDs for reports on no-auth.
     * @param reportDefinitionNameVersion Name and version of DTD file to download. Some DTDs only have one version. In that case version name is not needed. Some example values are ctdr-1.0, tdr, pbdr-1.1 (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getDTDV2WithHttpInfo(String reportDefinitionNameVersion) throws ApiException {
        okhttp3.Call call = getDTDV2ValidateBeforeCall(reportDefinitionNameVersion, null, null);
        return apiClient.execute(call);
    }

    /**
     * Download DTD for Report (asynchronously)
     * Used to download DTDs for reports on no-auth.
     * @param reportDefinitionNameVersion Name and version of DTD file to download. Some DTDs only have one version. In that case version name is not needed. Some example values are ctdr-1.0, tdr, pbdr-1.1 (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getDTDV2Async(String reportDefinitionNameVersion, final ApiCallback<Void> callback) throws ApiException {

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

        okhttp3.Call call = getDTDV2ValidateBeforeCall(reportDefinitionNameVersion, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
