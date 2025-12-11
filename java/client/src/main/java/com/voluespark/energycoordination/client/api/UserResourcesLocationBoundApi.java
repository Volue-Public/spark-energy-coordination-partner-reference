package com.voluespark.energycoordination.client.api;


import com.voluespark.energycoordination.client.model.GetLocationBoundResourceResponse;
import com.voluespark.energycoordination.client.model.PostLocationBoundResourceRequest;
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
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.17.0")
public class UserResourcesLocationBoundApi {
  private ApiClient apiClient;

  public UserResourcesLocationBoundApi() {
    this(new ApiClient());
  }

  public UserResourcesLocationBoundApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get Location Bound Resources Get all resources registered at a location.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>404</b> - Not Found
   *
   * @param locationId The locationId parameter
   * @param userId The userId parameter
   * @return List&lt;GetLocationBoundResourceResponse&gt;
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  private ResponseSpec getLocationBoundResourcesRequestCreation(
      @jakarta.annotation.Nonnull String locationId, @jakarta.annotation.Nonnull String userId)
      throws WebClientResponseException {
    Object postBody = null;
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'locationId' when calling getLocationBoundResources",
          HttpStatus.BAD_REQUEST.value(),
          HttpStatus.BAD_REQUEST.getReasonPhrase(),
          null,
          null,
          null);
    }
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'userId' when calling getLocationBoundResources",
          HttpStatus.BAD_REQUEST.value(),
          HttpStatus.BAD_REQUEST.getReasonPhrase(),
          null,
          null,
          null);
    }
    // create path and map variables
    final Map<String, Object> pathParams = new HashMap<String, Object>();

    pathParams.put("locationId", locationId);
    pathParams.put("userId", userId);

    final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
    final HttpHeaders headerParams = new HttpHeaders();
    final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
    final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

    final String[] localVarAccepts = {"application/json"};
    final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    final String[] localVarContentTypes = {};
    final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"Bearer"};

    ParameterizedTypeReference<GetLocationBoundResourceResponse> localVarReturnType =
        new ParameterizedTypeReference<GetLocationBoundResourceResponse>() {};
    return apiClient.invokeAPI(
        "/users/{userId}/locations/{locationId}/resources",
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
   * Get Location Bound Resources Get all resources registered at a location.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>404</b> - Not Found
   *
   * @param locationId The locationId parameter
   * @param userId The userId parameter
   * @return List&lt;GetLocationBoundResourceResponse&gt;
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Flux<GetLocationBoundResourceResponse> getLocationBoundResources(
      @jakarta.annotation.Nonnull String locationId, @jakarta.annotation.Nonnull String userId)
      throws WebClientResponseException {
    ParameterizedTypeReference<GetLocationBoundResourceResponse> localVarReturnType =
        new ParameterizedTypeReference<GetLocationBoundResourceResponse>() {};
    return getLocationBoundResourcesRequestCreation(locationId, userId)
        .bodyToFlux(localVarReturnType);
  }

  /**
   * Get Location Bound Resources Get all resources registered at a location.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>404</b> - Not Found
   *
   * @param locationId The locationId parameter
   * @param userId The userId parameter
   * @return ResponseEntity&lt;List&lt;GetLocationBoundResourceResponse&gt;&gt;
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<ResponseEntity<List<GetLocationBoundResourceResponse>>>
      getLocationBoundResourcesWithHttpInfo(
          @jakarta.annotation.Nonnull String locationId, @jakarta.annotation.Nonnull String userId)
          throws WebClientResponseException {
    ParameterizedTypeReference<GetLocationBoundResourceResponse> localVarReturnType =
        new ParameterizedTypeReference<GetLocationBoundResourceResponse>() {};
    return getLocationBoundResourcesRequestCreation(locationId, userId)
        .toEntityList(localVarReturnType);
  }

  /**
   * Get Location Bound Resources Get all resources registered at a location.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>404</b> - Not Found
   *
   * @param locationId The locationId parameter
   * @param userId The userId parameter
   * @return ResponseSpec
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public ResponseSpec getLocationBoundResourcesWithResponseSpec(
      @jakarta.annotation.Nonnull String locationId, @jakarta.annotation.Nonnull String userId)
      throws WebClientResponseException {
    return getLocationBoundResourcesRequestCreation(locationId, userId);
  }

  /**
   * Create Location Bound Resource Create a resource at a location.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>201</b> - Created
   *
   * <p><b>400</b> - Bad Request
   *
   * <p><b>404</b> - Not Found
   *
   * @param userId The userId parameter
   * @param locationId The locationId parameter
   * @param postLocationBoundResourceRequest The postLocationBoundResourceRequest parameter
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  private ResponseSpec postLocationBoundResourceRequestCreation(
      @jakarta.annotation.Nonnull String userId,
      @jakarta.annotation.Nonnull String locationId,
      @jakarta.annotation.Nonnull PostLocationBoundResourceRequest postLocationBoundResourceRequest)
      throws WebClientResponseException {
    Object postBody = postLocationBoundResourceRequest;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'userId' when calling postLocationBoundResource",
          HttpStatus.BAD_REQUEST.value(),
          HttpStatus.BAD_REQUEST.getReasonPhrase(),
          null,
          null,
          null);
    }
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'locationId' when calling postLocationBoundResource",
          HttpStatus.BAD_REQUEST.value(),
          HttpStatus.BAD_REQUEST.getReasonPhrase(),
          null,
          null,
          null);
    }
    // verify the required parameter 'postLocationBoundResourceRequest' is set
    if (postLocationBoundResourceRequest == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'postLocationBoundResourceRequest' when calling"
              + " postLocationBoundResource",
          HttpStatus.BAD_REQUEST.value(),
          HttpStatus.BAD_REQUEST.getReasonPhrase(),
          null,
          null,
          null);
    }
    // create path and map variables
    final Map<String, Object> pathParams = new HashMap<String, Object>();

    pathParams.put("userId", userId);
    pathParams.put("locationId", locationId);

    final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
    final HttpHeaders headerParams = new HttpHeaders();
    final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
    final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

    final String[] localVarAccepts = {"application/json"};
    final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    final String[] localVarContentTypes = {"application/json"};
    final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"Bearer"};

    ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
    return apiClient.invokeAPI(
        "/users/{userId}/locations/{locationId}/resources",
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
   * Create Location Bound Resource Create a resource at a location.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>201</b> - Created
   *
   * <p><b>400</b> - Bad Request
   *
   * <p><b>404</b> - Not Found
   *
   * @param userId The userId parameter
   * @param locationId The locationId parameter
   * @param postLocationBoundResourceRequest The postLocationBoundResourceRequest parameter
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<Void> postLocationBoundResource(
      @jakarta.annotation.Nonnull String userId,
      @jakarta.annotation.Nonnull String locationId,
      @jakarta.annotation.Nonnull PostLocationBoundResourceRequest postLocationBoundResourceRequest)
      throws WebClientResponseException {
    ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
    return postLocationBoundResourceRequestCreation(
            userId, locationId, postLocationBoundResourceRequest)
        .bodyToMono(localVarReturnType);
  }

  /**
   * Create Location Bound Resource Create a resource at a location.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>201</b> - Created
   *
   * <p><b>400</b> - Bad Request
   *
   * <p><b>404</b> - Not Found
   *
   * @param userId The userId parameter
   * @param locationId The locationId parameter
   * @param postLocationBoundResourceRequest The postLocationBoundResourceRequest parameter
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<ResponseEntity<Void>> postLocationBoundResourceWithHttpInfo(
      @jakarta.annotation.Nonnull String userId,
      @jakarta.annotation.Nonnull String locationId,
      @jakarta.annotation.Nonnull PostLocationBoundResourceRequest postLocationBoundResourceRequest)
      throws WebClientResponseException {
    ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
    return postLocationBoundResourceRequestCreation(
            userId, locationId, postLocationBoundResourceRequest)
        .toEntity(localVarReturnType);
  }

  /**
   * Create Location Bound Resource Create a resource at a location.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>201</b> - Created
   *
   * <p><b>400</b> - Bad Request
   *
   * <p><b>404</b> - Not Found
   *
   * @param userId The userId parameter
   * @param locationId The locationId parameter
   * @param postLocationBoundResourceRequest The postLocationBoundResourceRequest parameter
   * @return ResponseSpec
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public ResponseSpec postLocationBoundResourceWithResponseSpec(
      @jakarta.annotation.Nonnull String userId,
      @jakarta.annotation.Nonnull String locationId,
      @jakarta.annotation.Nonnull PostLocationBoundResourceRequest postLocationBoundResourceRequest)
      throws WebClientResponseException {
    return postLocationBoundResourceRequestCreation(
        userId, locationId, postLocationBoundResourceRequest);
  }
}
