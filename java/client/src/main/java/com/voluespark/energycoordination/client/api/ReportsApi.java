package com.voluespark.energycoordination.client.api;


import com.voluespark.energycoordination.client.model.GetReportResponse;
import com.voluespark.energycoordination.client.model.PostReportRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Mono;

@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.9.0-SNAPSHOT")
public class ReportsApi {
  private ApiClient apiClient;

  public ReportsApi() {
    this(new ApiClient());
  }

  @Autowired
  public ReportsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a report
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * @param postReportRequest The postReportRequest parameter
   * @return GetReportResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  private ResponseSpec postReportRequestCreation(PostReportRequest postReportRequest)
      throws WebClientResponseException {
    Object postBody = postReportRequest;
    // verify the required parameter 'postReportRequest' is set
    if (postReportRequest == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'postReportRequest' when calling postReport",
          HttpStatus.BAD_REQUEST.value(),
          HttpStatus.BAD_REQUEST.getReasonPhrase(),
          null,
          null,
          null);
    }
    // create path and map variables
    final Map<String, Object> pathParams = new HashMap<String, Object>();

    final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
    final HttpHeaders headerParams = new HttpHeaders();
    final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
    final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

    final String[] localVarAccepts = {"application/json"};
    final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    final String[] localVarContentTypes = {"application/json"};
    final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"Bearer"};

    ParameterizedTypeReference<GetReportResponse> localVarReturnType =
        new ParameterizedTypeReference<GetReportResponse>() {};
    return apiClient.invokeAPI(
        "/reports",
        HttpMethod.POST,
        pathParams,
        queryParams,
        postBody,
        headerParams,
        cookieParams,
        formParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType);
  }

  /**
   * Create a report
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * @param postReportRequest The postReportRequest parameter
   * @return GetReportResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<GetReportResponse> postReport(PostReportRequest postReportRequest)
      throws WebClientResponseException {
    ParameterizedTypeReference<GetReportResponse> localVarReturnType =
        new ParameterizedTypeReference<GetReportResponse>() {};
    return postReportRequestCreation(postReportRequest).bodyToMono(localVarReturnType);
  }

  /**
   * Create a report
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * @param postReportRequest The postReportRequest parameter
   * @return ResponseEntity&lt;GetReportResponse&gt;
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<ResponseEntity<GetReportResponse>> postReportWithHttpInfo(
      PostReportRequest postReportRequest) throws WebClientResponseException {
    ParameterizedTypeReference<GetReportResponse> localVarReturnType =
        new ParameterizedTypeReference<GetReportResponse>() {};
    return postReportRequestCreation(postReportRequest).toEntity(localVarReturnType);
  }

  /**
   * Create a report
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * @param postReportRequest The postReportRequest parameter
   * @return ResponseSpec
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public ResponseSpec postReportWithResponseSpec(PostReportRequest postReportRequest)
      throws WebClientResponseException {
    return postReportRequestCreation(postReportRequest);
  }
}
