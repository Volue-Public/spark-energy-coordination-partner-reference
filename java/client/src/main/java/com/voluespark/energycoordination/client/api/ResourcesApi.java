package com.voluespark.energycoordination.client.api;


import com.voluespark.energycoordination.client.model.GetResourceResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
    comments = "Generator version: 7.17.0")
public class ResourcesApi {
  private ApiClient apiClient;

  public ResourcesApi() {
    this(new ApiClient());
  }

  public ResourcesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Delete Resource Returns 204 No Content if the resource was deleted successfully. Returns 404
   * Not Found if the resource to delete does not exist.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>204</b> - No Content
   *
   * <p><b>400</b> - Bad Request
   *
   * <p><b>404</b> - Not Found
   *
   * @param resourceId The resourceId parameter
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  private ResponseSpec deleteResourceByIdRequestCreation(
      @jakarta.annotation.Nonnull String resourceId) throws WebClientResponseException {
    Object postBody = null;
    // verify the required parameter 'resourceId' is set
    if (resourceId == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'resourceId' when calling deleteResourceById",
          HttpStatus.BAD_REQUEST.value(),
          HttpStatus.BAD_REQUEST.getReasonPhrase(),
          null,
          null,
          null);
    }
    // create path and map variables
    final Map<String, Object> pathParams = new HashMap<String, Object>();

    pathParams.put("resourceId", resourceId);

    final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
    final HttpHeaders headerParams = new HttpHeaders();
    final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
    final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

    final String[] localVarAccepts = {"application/json"};
    final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    final String[] localVarContentTypes = {};
    final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"Bearer"};

    ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
    return apiClient.invokeAPI(
        "/resources/{resourceId}",
        HttpMethod.DELETE,
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
   * Delete Resource Returns 204 No Content if the resource was deleted successfully. Returns 404
   * Not Found if the resource to delete does not exist.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>204</b> - No Content
   *
   * <p><b>400</b> - Bad Request
   *
   * <p><b>404</b> - Not Found
   *
   * @param resourceId The resourceId parameter
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<Void> deleteResourceById(@jakarta.annotation.Nonnull String resourceId)
      throws WebClientResponseException {
    ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
    return deleteResourceByIdRequestCreation(resourceId).bodyToMono(localVarReturnType);
  }

  /**
   * Delete Resource Returns 204 No Content if the resource was deleted successfully. Returns 404
   * Not Found if the resource to delete does not exist.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>204</b> - No Content
   *
   * <p><b>400</b> - Bad Request
   *
   * <p><b>404</b> - Not Found
   *
   * @param resourceId The resourceId parameter
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<ResponseEntity<Void>> deleteResourceByIdWithHttpInfo(
      @jakarta.annotation.Nonnull String resourceId) throws WebClientResponseException {
    ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
    return deleteResourceByIdRequestCreation(resourceId).toEntity(localVarReturnType);
  }

  /**
   * Delete Resource Returns 204 No Content if the resource was deleted successfully. Returns 404
   * Not Found if the resource to delete does not exist.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>204</b> - No Content
   *
   * <p><b>400</b> - Bad Request
   *
   * <p><b>404</b> - Not Found
   *
   * @param resourceId The resourceId parameter
   * @return ResponseSpec
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public ResponseSpec deleteResourceByIdWithResponseSpec(
      @jakarta.annotation.Nonnull String resourceId) throws WebClientResponseException {
    return deleteResourceByIdRequestCreation(resourceId);
  }

  /**
   * Get Resource by Id
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * <p><b>404</b> - Not Found
   *
   * @param resourceId The resourceId parameter
   * @return GetResourceResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  private ResponseSpec getResourceByIdRequestCreation(@jakarta.annotation.Nonnull String resourceId)
      throws WebClientResponseException {
    Object postBody = null;
    // verify the required parameter 'resourceId' is set
    if (resourceId == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'resourceId' when calling getResourceById",
          HttpStatus.BAD_REQUEST.value(),
          HttpStatus.BAD_REQUEST.getReasonPhrase(),
          null,
          null,
          null);
    }
    // create path and map variables
    final Map<String, Object> pathParams = new HashMap<String, Object>();

    pathParams.put("resourceId", resourceId);

    final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
    final HttpHeaders headerParams = new HttpHeaders();
    final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
    final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

    final String[] localVarAccepts = {"application/json"};
    final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    final String[] localVarContentTypes = {};
    final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"Bearer"};

    ParameterizedTypeReference<GetResourceResponse> localVarReturnType =
        new ParameterizedTypeReference<GetResourceResponse>() {};
    return apiClient.invokeAPI(
        "/resources/{resourceId}",
        HttpMethod.GET,
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
   * Get Resource by Id
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * <p><b>404</b> - Not Found
   *
   * @param resourceId The resourceId parameter
   * @return GetResourceResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<GetResourceResponse> getResourceById(@jakarta.annotation.Nonnull String resourceId)
      throws WebClientResponseException {
    ParameterizedTypeReference<GetResourceResponse> localVarReturnType =
        new ParameterizedTypeReference<GetResourceResponse>() {};
    return getResourceByIdRequestCreation(resourceId).bodyToMono(localVarReturnType);
  }

  /**
   * Get Resource by Id
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * <p><b>404</b> - Not Found
   *
   * @param resourceId The resourceId parameter
   * @return ResponseEntity&lt;GetResourceResponse&gt;
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<ResponseEntity<GetResourceResponse>> getResourceByIdWithHttpInfo(
      @jakarta.annotation.Nonnull String resourceId) throws WebClientResponseException {
    ParameterizedTypeReference<GetResourceResponse> localVarReturnType =
        new ParameterizedTypeReference<GetResourceResponse>() {};
    return getResourceByIdRequestCreation(resourceId).toEntity(localVarReturnType);
  }

  /**
   * Get Resource by Id
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * <p><b>404</b> - Not Found
   *
   * @param resourceId The resourceId parameter
   * @return ResponseSpec
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public ResponseSpec getResourceByIdWithResponseSpec(@jakarta.annotation.Nonnull String resourceId)
      throws WebClientResponseException {
    return getResourceByIdRequestCreation(resourceId);
  }
}
