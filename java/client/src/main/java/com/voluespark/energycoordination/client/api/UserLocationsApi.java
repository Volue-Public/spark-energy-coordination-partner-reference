package com.voluespark.energycoordination.client.api;


import com.voluespark.energycoordination.client.model.GetLocationResponse;
import com.voluespark.energycoordination.client.model.PatchLocationRequest;
import com.voluespark.energycoordination.client.model.PostLocationRequest;
import com.voluespark.energycoordination.client.model.PostLocationsBatchRequest;
import com.voluespark.energycoordination.client.model.PutLocationRequest;
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
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@jakarta.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    comments = "Generator version: 7.12.0")
public class UserLocationsApi {
  private ApiClient apiClient;

  public UserLocationsApi() {
    this(new ApiClient());
  }

  @Autowired
  public UserLocationsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Delete User Location Returns 204 No Content if the location was deleted successfully. Returns
   * 404 Not Found if the location to delete does not exist.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>204</b> - No Content
   *
   * <p><b>400</b> - Bad Request
   *
   * <p><b>404</b> - Not Found
   *
   * @param userId The userId parameter
   * @param locationId The locationId parameter
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  private ResponseSpec deleteLocationRequestCreation(String userId, String locationId)
      throws WebClientResponseException {
    Object postBody = null;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'userId' when calling deleteLocation",
          HttpStatus.BAD_REQUEST.value(),
          HttpStatus.BAD_REQUEST.getReasonPhrase(),
          null,
          null,
          null);
    }
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'locationId' when calling deleteLocation",
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
    final String[] localVarContentTypes = {};
    final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"Bearer"};

    ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
    return apiClient.invokeAPI(
        "/users/{userId}/locations/{locationId}",
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
   * Delete User Location Returns 204 No Content if the location was deleted successfully. Returns
   * 404 Not Found if the location to delete does not exist.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>204</b> - No Content
   *
   * <p><b>400</b> - Bad Request
   *
   * <p><b>404</b> - Not Found
   *
   * @param userId The userId parameter
   * @param locationId The locationId parameter
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<Void> deleteLocation(String userId, String locationId)
      throws WebClientResponseException {
    ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
    return deleteLocationRequestCreation(userId, locationId).bodyToMono(localVarReturnType);
  }

  /**
   * Delete User Location Returns 204 No Content if the location was deleted successfully. Returns
   * 404 Not Found if the location to delete does not exist.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>204</b> - No Content
   *
   * <p><b>400</b> - Bad Request
   *
   * <p><b>404</b> - Not Found
   *
   * @param userId The userId parameter
   * @param locationId The locationId parameter
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<ResponseEntity<Void>> deleteLocationWithHttpInfo(String userId, String locationId)
      throws WebClientResponseException {
    ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
    return deleteLocationRequestCreation(userId, locationId).toEntity(localVarReturnType);
  }

  /**
   * Delete User Location Returns 204 No Content if the location was deleted successfully. Returns
   * 404 Not Found if the location to delete does not exist.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>204</b> - No Content
   *
   * <p><b>400</b> - Bad Request
   *
   * <p><b>404</b> - Not Found
   *
   * @param userId The userId parameter
   * @param locationId The locationId parameter
   * @return ResponseSpec
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public ResponseSpec deleteLocationWithResponseSpec(String userId, String locationId)
      throws WebClientResponseException {
    return deleteLocationRequestCreation(userId, locationId);
  }

  /**
   * Get User Location By Location Id
   *
   * <p><b>200</b> - OK
   *
   * <p><b>404</b> - Not Found
   *
   * <p><b>400</b> - Bad Request
   *
   * @param userId The userId parameter
   * @param locationId The locationId parameter
   * @return GetLocationResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  private ResponseSpec getLocationByLocationIdRequestCreation(String userId, String locationId)
      throws WebClientResponseException {
    Object postBody = null;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'userId' when calling getLocationByLocationId",
          HttpStatus.BAD_REQUEST.value(),
          HttpStatus.BAD_REQUEST.getReasonPhrase(),
          null,
          null,
          null);
    }
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'locationId' when calling getLocationByLocationId",
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
    final String[] localVarContentTypes = {};
    final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"Bearer"};

    ParameterizedTypeReference<GetLocationResponse> localVarReturnType =
        new ParameterizedTypeReference<GetLocationResponse>() {};
    return apiClient.invokeAPI(
        "/users/{userId}/locations/{locationId}",
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
   * Get User Location By Location Id
   *
   * <p><b>200</b> - OK
   *
   * <p><b>404</b> - Not Found
   *
   * <p><b>400</b> - Bad Request
   *
   * @param userId The userId parameter
   * @param locationId The locationId parameter
   * @return GetLocationResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<GetLocationResponse> getLocationByLocationId(String userId, String locationId)
      throws WebClientResponseException {
    ParameterizedTypeReference<GetLocationResponse> localVarReturnType =
        new ParameterizedTypeReference<GetLocationResponse>() {};
    return getLocationByLocationIdRequestCreation(userId, locationId)
        .bodyToMono(localVarReturnType);
  }

  /**
   * Get User Location By Location Id
   *
   * <p><b>200</b> - OK
   *
   * <p><b>404</b> - Not Found
   *
   * <p><b>400</b> - Bad Request
   *
   * @param userId The userId parameter
   * @param locationId The locationId parameter
   * @return ResponseEntity&lt;GetLocationResponse&gt;
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<ResponseEntity<GetLocationResponse>> getLocationByLocationIdWithHttpInfo(
      String userId, String locationId) throws WebClientResponseException {
    ParameterizedTypeReference<GetLocationResponse> localVarReturnType =
        new ParameterizedTypeReference<GetLocationResponse>() {};
    return getLocationByLocationIdRequestCreation(userId, locationId).toEntity(localVarReturnType);
  }

  /**
   * Get User Location By Location Id
   *
   * <p><b>200</b> - OK
   *
   * <p><b>404</b> - Not Found
   *
   * <p><b>400</b> - Bad Request
   *
   * @param userId The userId parameter
   * @param locationId The locationId parameter
   * @return ResponseSpec
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public ResponseSpec getLocationByLocationIdWithResponseSpec(String userId, String locationId)
      throws WebClientResponseException {
    return getLocationByLocationIdRequestCreation(userId, locationId);
  }

  /**
   * Get A User&#39;s Locations
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * @param userId The userId parameter
   * @return List&lt;GetLocationResponse&gt;
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  private ResponseSpec getLocationsByUserIdRequestCreation(String userId)
      throws WebClientResponseException {
    Object postBody = null;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'userId' when calling getLocationsByUserId",
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

    ParameterizedTypeReference<GetLocationResponse> localVarReturnType =
        new ParameterizedTypeReference<GetLocationResponse>() {};
    return apiClient.invokeAPI(
        "/users/{userId}/locations",
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
   * Get A User&#39;s Locations
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * @param userId The userId parameter
   * @return List&lt;GetLocationResponse&gt;
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Flux<GetLocationResponse> getLocationsByUserId(String userId)
      throws WebClientResponseException {
    ParameterizedTypeReference<GetLocationResponse> localVarReturnType =
        new ParameterizedTypeReference<GetLocationResponse>() {};
    return getLocationsByUserIdRequestCreation(userId).bodyToFlux(localVarReturnType);
  }

  /**
   * Get A User&#39;s Locations
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * @param userId The userId parameter
   * @return ResponseEntity&lt;List&lt;GetLocationResponse&gt;&gt;
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<ResponseEntity<List<GetLocationResponse>>> getLocationsByUserIdWithHttpInfo(
      String userId) throws WebClientResponseException {
    ParameterizedTypeReference<GetLocationResponse> localVarReturnType =
        new ParameterizedTypeReference<GetLocationResponse>() {};
    return getLocationsByUserIdRequestCreation(userId).toEntityList(localVarReturnType);
  }

  /**
   * Get A User&#39;s Locations
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * @param userId The userId parameter
   * @return ResponseSpec
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public ResponseSpec getLocationsByUserIdWithResponseSpec(String userId)
      throws WebClientResponseException {
    return getLocationsByUserIdRequestCreation(userId);
  }

  /**
   * Patch User Location
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * <p><b>404</b> - Not Found
   *
   * <p><b>409</b> - Conflict
   *
   * @param userId The userId parameter
   * @param locationId The locationId parameter
   * @param patchLocationRequest The patchLocationRequest parameter
   * @return GetLocationResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  private ResponseSpec patchLocationRequestCreation(
      String userId, String locationId, PatchLocationRequest patchLocationRequest)
      throws WebClientResponseException {
    Object postBody = patchLocationRequest;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'userId' when calling patchLocation",
          HttpStatus.BAD_REQUEST.value(),
          HttpStatus.BAD_REQUEST.getReasonPhrase(),
          null,
          null,
          null);
    }
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'locationId' when calling patchLocation",
          HttpStatus.BAD_REQUEST.value(),
          HttpStatus.BAD_REQUEST.getReasonPhrase(),
          null,
          null,
          null);
    }
    // verify the required parameter 'patchLocationRequest' is set
    if (patchLocationRequest == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'patchLocationRequest' when calling patchLocation",
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

    ParameterizedTypeReference<GetLocationResponse> localVarReturnType =
        new ParameterizedTypeReference<GetLocationResponse>() {};
    return apiClient.invokeAPI(
        "/users/{userId}/locations/{locationId}",
        HttpMethod.PATCH,
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
   * Patch User Location
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * <p><b>404</b> - Not Found
   *
   * <p><b>409</b> - Conflict
   *
   * @param userId The userId parameter
   * @param locationId The locationId parameter
   * @param patchLocationRequest The patchLocationRequest parameter
   * @return GetLocationResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<GetLocationResponse> patchLocation(
      String userId, String locationId, PatchLocationRequest patchLocationRequest)
      throws WebClientResponseException {
    ParameterizedTypeReference<GetLocationResponse> localVarReturnType =
        new ParameterizedTypeReference<GetLocationResponse>() {};
    return patchLocationRequestCreation(userId, locationId, patchLocationRequest)
        .bodyToMono(localVarReturnType);
  }

  /**
   * Patch User Location
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * <p><b>404</b> - Not Found
   *
   * <p><b>409</b> - Conflict
   *
   * @param userId The userId parameter
   * @param locationId The locationId parameter
   * @param patchLocationRequest The patchLocationRequest parameter
   * @return ResponseEntity&lt;GetLocationResponse&gt;
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<ResponseEntity<GetLocationResponse>> patchLocationWithHttpInfo(
      String userId, String locationId, PatchLocationRequest patchLocationRequest)
      throws WebClientResponseException {
    ParameterizedTypeReference<GetLocationResponse> localVarReturnType =
        new ParameterizedTypeReference<GetLocationResponse>() {};
    return patchLocationRequestCreation(userId, locationId, patchLocationRequest)
        .toEntity(localVarReturnType);
  }

  /**
   * Patch User Location
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * <p><b>404</b> - Not Found
   *
   * <p><b>409</b> - Conflict
   *
   * @param userId The userId parameter
   * @param locationId The locationId parameter
   * @param patchLocationRequest The patchLocationRequest parameter
   * @return ResponseSpec
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public ResponseSpec patchLocationWithResponseSpec(
      String userId, String locationId, PatchLocationRequest patchLocationRequest)
      throws WebClientResponseException {
    return patchLocationRequestCreation(userId, locationId, patchLocationRequest);
  }

  /**
   * Create User Location
   *
   * <p><b>200</b> - OK
   *
   * <p><b>201</b> - Created
   *
   * <p><b>409</b> - Conflict
   *
   * <p><b>404</b> - Not Found
   *
   * <p><b>400</b> - Bad Request
   *
   * @param userId The userId parameter
   * @param postLocationRequest The postLocationRequest parameter
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  private ResponseSpec postLocationRequestCreation(
      String userId, PostLocationRequest postLocationRequest) throws WebClientResponseException {
    Object postBody = postLocationRequest;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'userId' when calling postLocation",
          HttpStatus.BAD_REQUEST.value(),
          HttpStatus.BAD_REQUEST.getReasonPhrase(),
          null,
          null,
          null);
    }
    // verify the required parameter 'postLocationRequest' is set
    if (postLocationRequest == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'postLocationRequest' when calling postLocation",
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
    final String[] localVarContentTypes = {"application/json"};
    final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"Bearer"};

    ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
    return apiClient.invokeAPI(
        "/users/{userId}/locations",
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
   * Create User Location
   *
   * <p><b>200</b> - OK
   *
   * <p><b>201</b> - Created
   *
   * <p><b>409</b> - Conflict
   *
   * <p><b>404</b> - Not Found
   *
   * <p><b>400</b> - Bad Request
   *
   * @param userId The userId parameter
   * @param postLocationRequest The postLocationRequest parameter
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<Void> postLocation(String userId, PostLocationRequest postLocationRequest)
      throws WebClientResponseException {
    ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
    return postLocationRequestCreation(userId, postLocationRequest).bodyToMono(localVarReturnType);
  }

  /**
   * Create User Location
   *
   * <p><b>200</b> - OK
   *
   * <p><b>201</b> - Created
   *
   * <p><b>409</b> - Conflict
   *
   * <p><b>404</b> - Not Found
   *
   * <p><b>400</b> - Bad Request
   *
   * @param userId The userId parameter
   * @param postLocationRequest The postLocationRequest parameter
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<ResponseEntity<Void>> postLocationWithHttpInfo(
      String userId, PostLocationRequest postLocationRequest) throws WebClientResponseException {
    ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
    return postLocationRequestCreation(userId, postLocationRequest).toEntity(localVarReturnType);
  }

  /**
   * Create User Location
   *
   * <p><b>200</b> - OK
   *
   * <p><b>201</b> - Created
   *
   * <p><b>409</b> - Conflict
   *
   * <p><b>404</b> - Not Found
   *
   * <p><b>400</b> - Bad Request
   *
   * @param userId The userId parameter
   * @param postLocationRequest The postLocationRequest parameter
   * @return ResponseSpec
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public ResponseSpec postLocationWithResponseSpec(
      String userId, PostLocationRequest postLocationRequest) throws WebClientResponseException {
    return postLocationRequestCreation(userId, postLocationRequest);
  }

  /**
   * Create Multiple User Locations Create multiple locations for several users at once. \&quot;The
   * request body should be an array of objects, each containing a user id and a create location
   * request.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>201</b> - Created
   *
   * <p><b>400</b> - Bad Request
   *
   * @param postLocationsBatchRequest The postLocationsBatchRequest parameter
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  private ResponseSpec postLocationsRequestCreation(
      PostLocationsBatchRequest postLocationsBatchRequest) throws WebClientResponseException {
    Object postBody = postLocationsBatchRequest;
    // verify the required parameter 'postLocationsBatchRequest' is set
    if (postLocationsBatchRequest == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'postLocationsBatchRequest' when calling postLocations",
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

    ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
    return apiClient.invokeAPI(
        "/users/locations/batch",
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
   * Create Multiple User Locations Create multiple locations for several users at once. \&quot;The
   * request body should be an array of objects, each containing a user id and a create location
   * request.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>201</b> - Created
   *
   * <p><b>400</b> - Bad Request
   *
   * @param postLocationsBatchRequest The postLocationsBatchRequest parameter
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<Void> postLocations(PostLocationsBatchRequest postLocationsBatchRequest)
      throws WebClientResponseException {
    ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
    return postLocationsRequestCreation(postLocationsBatchRequest).bodyToMono(localVarReturnType);
  }

  /**
   * Create Multiple User Locations Create multiple locations for several users at once. \&quot;The
   * request body should be an array of objects, each containing a user id and a create location
   * request.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>201</b> - Created
   *
   * <p><b>400</b> - Bad Request
   *
   * @param postLocationsBatchRequest The postLocationsBatchRequest parameter
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<ResponseEntity<Void>> postLocationsWithHttpInfo(
      PostLocationsBatchRequest postLocationsBatchRequest) throws WebClientResponseException {
    ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
    return postLocationsRequestCreation(postLocationsBatchRequest).toEntity(localVarReturnType);
  }

  /**
   * Create Multiple User Locations Create multiple locations for several users at once. \&quot;The
   * request body should be an array of objects, each containing a user id and a create location
   * request.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>201</b> - Created
   *
   * <p><b>400</b> - Bad Request
   *
   * @param postLocationsBatchRequest The postLocationsBatchRequest parameter
   * @return ResponseSpec
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public ResponseSpec postLocationsWithResponseSpec(
      PostLocationsBatchRequest postLocationsBatchRequest) throws WebClientResponseException {
    return postLocationsRequestCreation(postLocationsBatchRequest);
  }

  /**
   * Update User Location
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * <p><b>404</b> - Not Found
   *
   * @param userId The userId parameter
   * @param locationId The locationId parameter
   * @param putLocationRequest The putLocationRequest parameter
   * @return GetLocationResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  private ResponseSpec updateLocationRequestCreation(
      String userId, String locationId, PutLocationRequest putLocationRequest)
      throws WebClientResponseException {
    Object postBody = putLocationRequest;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'userId' when calling updateLocation",
          HttpStatus.BAD_REQUEST.value(),
          HttpStatus.BAD_REQUEST.getReasonPhrase(),
          null,
          null,
          null);
    }
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'locationId' when calling updateLocation",
          HttpStatus.BAD_REQUEST.value(),
          HttpStatus.BAD_REQUEST.getReasonPhrase(),
          null,
          null,
          null);
    }
    // verify the required parameter 'putLocationRequest' is set
    if (putLocationRequest == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'putLocationRequest' when calling updateLocation",
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

    ParameterizedTypeReference<GetLocationResponse> localVarReturnType =
        new ParameterizedTypeReference<GetLocationResponse>() {};
    return apiClient.invokeAPI(
        "/users/{userId}/locations/{locationId}",
        HttpMethod.PUT,
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
   * Update User Location
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * <p><b>404</b> - Not Found
   *
   * @param userId The userId parameter
   * @param locationId The locationId parameter
   * @param putLocationRequest The putLocationRequest parameter
   * @return GetLocationResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<GetLocationResponse> updateLocation(
      String userId, String locationId, PutLocationRequest putLocationRequest)
      throws WebClientResponseException {
    ParameterizedTypeReference<GetLocationResponse> localVarReturnType =
        new ParameterizedTypeReference<GetLocationResponse>() {};
    return updateLocationRequestCreation(userId, locationId, putLocationRequest)
        .bodyToMono(localVarReturnType);
  }

  /**
   * Update User Location
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * <p><b>404</b> - Not Found
   *
   * @param userId The userId parameter
   * @param locationId The locationId parameter
   * @param putLocationRequest The putLocationRequest parameter
   * @return ResponseEntity&lt;GetLocationResponse&gt;
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<ResponseEntity<GetLocationResponse>> updateLocationWithHttpInfo(
      String userId, String locationId, PutLocationRequest putLocationRequest)
      throws WebClientResponseException {
    ParameterizedTypeReference<GetLocationResponse> localVarReturnType =
        new ParameterizedTypeReference<GetLocationResponse>() {};
    return updateLocationRequestCreation(userId, locationId, putLocationRequest)
        .toEntity(localVarReturnType);
  }

  /**
   * Update User Location
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * <p><b>404</b> - Not Found
   *
   * @param userId The userId parameter
   * @param locationId The locationId parameter
   * @param putLocationRequest The putLocationRequest parameter
   * @return ResponseSpec
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public ResponseSpec updateLocationWithResponseSpec(
      String userId, String locationId, PutLocationRequest putLocationRequest)
      throws WebClientResponseException {
    return updateLocationRequestCreation(userId, locationId, putLocationRequest);
  }
}
