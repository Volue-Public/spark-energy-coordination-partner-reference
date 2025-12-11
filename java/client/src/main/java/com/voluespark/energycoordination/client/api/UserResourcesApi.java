package com.voluespark.energycoordination.client.api;


import com.voluespark.energycoordination.client.model.GetUserResourcesResponse;
import com.voluespark.energycoordination.client.model.PostVehicleResourceRequest;
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
public class UserResourcesApi {
  private ApiClient apiClient;

  public UserResourcesApi() {
    this(new ApiClient());
  }

  public UserResourcesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get a User&#39;s Resources Get all resources registered to a user. Returns both location bound
   * resources and vehicles.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>404</b> - Not Found
   *
   * @param userId The userId parameter
   * @return GetUserResourcesResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  private ResponseSpec getResourcesForUserRequestCreation(@jakarta.annotation.Nonnull String userId)
      throws WebClientResponseException {
    Object postBody = null;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'userId' when calling getResourcesForUser",
          HttpStatus.BAD_REQUEST.value(),
          HttpStatus.BAD_REQUEST.getReasonPhrase(),
          null,
          null,
          null);
    }
    // create path and map variables
    final Map<String, Object> pathParams = new HashMap<String, Object>();

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

    ParameterizedTypeReference<GetUserResourcesResponse> localVarReturnType =
        new ParameterizedTypeReference<GetUserResourcesResponse>() {};
    return apiClient.invokeAPI(
        "/users/{userId}/resources",
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
   * Get a User&#39;s Resources Get all resources registered to a user. Returns both location bound
   * resources and vehicles.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>404</b> - Not Found
   *
   * @param userId The userId parameter
   * @return GetUserResourcesResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<GetUserResourcesResponse> getResourcesForUser(
      @jakarta.annotation.Nonnull String userId) throws WebClientResponseException {
    ParameterizedTypeReference<GetUserResourcesResponse> localVarReturnType =
        new ParameterizedTypeReference<GetUserResourcesResponse>() {};
    return getResourcesForUserRequestCreation(userId).bodyToMono(localVarReturnType);
  }

  /**
   * Get a User&#39;s Resources Get all resources registered to a user. Returns both location bound
   * resources and vehicles.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>404</b> - Not Found
   *
   * @param userId The userId parameter
   * @return ResponseEntity&lt;GetUserResourcesResponse&gt;
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<ResponseEntity<GetUserResourcesResponse>> getResourcesForUserWithHttpInfo(
      @jakarta.annotation.Nonnull String userId) throws WebClientResponseException {
    ParameterizedTypeReference<GetUserResourcesResponse> localVarReturnType =
        new ParameterizedTypeReference<GetUserResourcesResponse>() {};
    return getResourcesForUserRequestCreation(userId).toEntity(localVarReturnType);
  }

  /**
   * Get a User&#39;s Resources Get all resources registered to a user. Returns both location bound
   * resources and vehicles.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>404</b> - Not Found
   *
   * @param userId The userId parameter
   * @return ResponseSpec
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public ResponseSpec getResourcesForUserWithResponseSpec(@jakarta.annotation.Nonnull String userId)
      throws WebClientResponseException {
    return getResourcesForUserRequestCreation(userId);
  }

  /**
   * Create Vehicle Resource
   *
   * <p><b>200</b> - OK
   *
   * <p><b>201</b> - Created
   *
   * <p><b>400</b> - Bad Request
   *
   * @param userId The userId parameter
   * @param postVehicleResourceRequest The postVehicleResourceRequest parameter
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  private ResponseSpec postVehicleRequestCreation(
      @jakarta.annotation.Nonnull String userId,
      @jakarta.annotation.Nonnull PostVehicleResourceRequest postVehicleResourceRequest)
      throws WebClientResponseException {
    Object postBody = postVehicleResourceRequest;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'userId' when calling postVehicle",
          HttpStatus.BAD_REQUEST.value(),
          HttpStatus.BAD_REQUEST.getReasonPhrase(),
          null,
          null,
          null);
    }
    // verify the required parameter 'postVehicleResourceRequest' is set
    if (postVehicleResourceRequest == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'postVehicleResourceRequest' when calling postVehicle",
          HttpStatus.BAD_REQUEST.value(),
          HttpStatus.BAD_REQUEST.getReasonPhrase(),
          null,
          null,
          null);
    }
    // create path and map variables
    final Map<String, Object> pathParams = new HashMap<String, Object>();

    pathParams.put("userId", userId);

    final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
    final HttpHeaders headerParams = new HttpHeaders();
    final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
    final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

    final String[] localVarAccepts = {"application/json", "application/problem+json"};
    final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    final String[] localVarContentTypes = {"application/json"};
    final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"Bearer"};

    ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
    return apiClient.invokeAPI(
        "/users/{userId}/vehicles",
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
   * Create Vehicle Resource
   *
   * <p><b>200</b> - OK
   *
   * <p><b>201</b> - Created
   *
   * <p><b>400</b> - Bad Request
   *
   * @param userId The userId parameter
   * @param postVehicleResourceRequest The postVehicleResourceRequest parameter
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<Void> postVehicle(
      @jakarta.annotation.Nonnull String userId,
      @jakarta.annotation.Nonnull PostVehicleResourceRequest postVehicleResourceRequest)
      throws WebClientResponseException {
    ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
    return postVehicleRequestCreation(userId, postVehicleResourceRequest)
        .bodyToMono(localVarReturnType);
  }

  /**
   * Create Vehicle Resource
   *
   * <p><b>200</b> - OK
   *
   * <p><b>201</b> - Created
   *
   * <p><b>400</b> - Bad Request
   *
   * @param userId The userId parameter
   * @param postVehicleResourceRequest The postVehicleResourceRequest parameter
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<ResponseEntity<Void>> postVehicleWithHttpInfo(
      @jakarta.annotation.Nonnull String userId,
      @jakarta.annotation.Nonnull PostVehicleResourceRequest postVehicleResourceRequest)
      throws WebClientResponseException {
    ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
    return postVehicleRequestCreation(userId, postVehicleResourceRequest)
        .toEntity(localVarReturnType);
  }

  /**
   * Create Vehicle Resource
   *
   * <p><b>200</b> - OK
   *
   * <p><b>201</b> - Created
   *
   * <p><b>400</b> - Bad Request
   *
   * @param userId The userId parameter
   * @param postVehicleResourceRequest The postVehicleResourceRequest parameter
   * @return ResponseSpec
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public ResponseSpec postVehicleWithResponseSpec(
      @jakarta.annotation.Nonnull String userId,
      @jakarta.annotation.Nonnull PostVehicleResourceRequest postVehicleResourceRequest)
      throws WebClientResponseException {
    return postVehicleRequestCreation(userId, postVehicleResourceRequest);
  }
}
