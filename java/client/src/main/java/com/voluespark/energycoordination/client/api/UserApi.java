package com.voluespark.energycoordination.client.api;


import com.voluespark.energycoordination.client.model.GetUserResponse;
import com.voluespark.energycoordination.client.model.GetUsersResponse;
import com.voluespark.energycoordination.client.model.PostUserRequest;
import com.voluespark.energycoordination.client.model.PostUsersBatchRequest;
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
    comments = "Generator version: 7.12.0")
public class UserApi {
  private ApiClient apiClient;

  public UserApi() {
    this(new ApiClient());
  }

  @Autowired
  public UserApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Delete User Returns 204 No Content if the user was deleted successfully. Returns 404 Not Found
   * if the user to delete does not exist.
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
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  private ResponseSpec deleteUserByIdRequestCreation(String userId)
      throws WebClientResponseException {
    Object postBody = null;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'userId' when calling deleteUserById",
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

    ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
    return apiClient.invokeAPI(
        "/users/{userId}",
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
   * Delete User Returns 204 No Content if the user was deleted successfully. Returns 404 Not Found
   * if the user to delete does not exist.
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
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<Void> deleteUserById(String userId) throws WebClientResponseException {
    ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
    return deleteUserByIdRequestCreation(userId).bodyToMono(localVarReturnType);
  }

  /**
   * Delete User Returns 204 No Content if the user was deleted successfully. Returns 404 Not Found
   * if the user to delete does not exist.
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
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<ResponseEntity<Void>> deleteUserByIdWithHttpInfo(String userId)
      throws WebClientResponseException {
    ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
    return deleteUserByIdRequestCreation(userId).toEntity(localVarReturnType);
  }

  /**
   * Delete User Returns 204 No Content if the user was deleted successfully. Returns 404 Not Found
   * if the user to delete does not exist.
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
   * @return ResponseSpec
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public ResponseSpec deleteUserByIdWithResponseSpec(String userId)
      throws WebClientResponseException {
    return deleteUserByIdRequestCreation(userId);
  }

  /**
   * Get User by Id
   *
   * <p><b>200</b> - OK
   *
   * <p><b>404</b> - Not Found
   *
   * <p><b>400</b> - Bad Request
   *
   * @param userId The userId parameter
   * @return GetUserResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  private ResponseSpec getUserByIdRequestCreation(String userId) throws WebClientResponseException {
    Object postBody = null;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'userId' when calling getUserById",
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

    ParameterizedTypeReference<GetUserResponse> localVarReturnType =
        new ParameterizedTypeReference<GetUserResponse>() {};
    return apiClient.invokeAPI(
        "/users/{userId}",
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
   * Get User by Id
   *
   * <p><b>200</b> - OK
   *
   * <p><b>404</b> - Not Found
   *
   * <p><b>400</b> - Bad Request
   *
   * @param userId The userId parameter
   * @return GetUserResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<GetUserResponse> getUserById(String userId) throws WebClientResponseException {
    ParameterizedTypeReference<GetUserResponse> localVarReturnType =
        new ParameterizedTypeReference<GetUserResponse>() {};
    return getUserByIdRequestCreation(userId).bodyToMono(localVarReturnType);
  }

  /**
   * Get User by Id
   *
   * <p><b>200</b> - OK
   *
   * <p><b>404</b> - Not Found
   *
   * <p><b>400</b> - Bad Request
   *
   * @param userId The userId parameter
   * @return ResponseEntity&lt;GetUserResponse&gt;
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<ResponseEntity<GetUserResponse>> getUserByIdWithHttpInfo(String userId)
      throws WebClientResponseException {
    ParameterizedTypeReference<GetUserResponse> localVarReturnType =
        new ParameterizedTypeReference<GetUserResponse>() {};
    return getUserByIdRequestCreation(userId).toEntity(localVarReturnType);
  }

  /**
   * Get User by Id
   *
   * <p><b>200</b> - OK
   *
   * <p><b>404</b> - Not Found
   *
   * <p><b>400</b> - Bad Request
   *
   * @param userId The userId parameter
   * @return ResponseSpec
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public ResponseSpec getUserByIdWithResponseSpec(String userId) throws WebClientResponseException {
    return getUserByIdRequestCreation(userId);
  }

  /**
   * Get Users Get all users. Maximum pageSize is 1000.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * @param page The page parameter
   * @param pageSize The pageSize parameter
   * @return GetUsersResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  private ResponseSpec getUsersRequestCreation(Integer page, Integer pageSize)
      throws WebClientResponseException {
    Object postBody = null;
    // create path and map variables
    final Map<String, Object> pathParams = new HashMap<String, Object>();

    final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
    final HttpHeaders headerParams = new HttpHeaders();
    final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
    final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

    queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
    queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageSize", pageSize));

    final String[] localVarAccepts = {"application/json"};
    final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    final String[] localVarContentTypes = {};
    final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"Bearer"};

    ParameterizedTypeReference<GetUsersResponse> localVarReturnType =
        new ParameterizedTypeReference<GetUsersResponse>() {};
    return apiClient.invokeAPI(
        "/users",
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
   * Get Users Get all users. Maximum pageSize is 1000.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * @param page The page parameter
   * @param pageSize The pageSize parameter
   * @return GetUsersResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<GetUsersResponse> getUsers(Integer page, Integer pageSize)
      throws WebClientResponseException {
    ParameterizedTypeReference<GetUsersResponse> localVarReturnType =
        new ParameterizedTypeReference<GetUsersResponse>() {};
    return getUsersRequestCreation(page, pageSize).bodyToMono(localVarReturnType);
  }

  /**
   * Get Users Get all users. Maximum pageSize is 1000.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * @param page The page parameter
   * @param pageSize The pageSize parameter
   * @return ResponseEntity&lt;GetUsersResponse&gt;
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<ResponseEntity<GetUsersResponse>> getUsersWithHttpInfo(Integer page, Integer pageSize)
      throws WebClientResponseException {
    ParameterizedTypeReference<GetUsersResponse> localVarReturnType =
        new ParameterizedTypeReference<GetUsersResponse>() {};
    return getUsersRequestCreation(page, pageSize).toEntity(localVarReturnType);
  }

  /**
   * Get Users Get all users. Maximum pageSize is 1000.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * @param page The page parameter
   * @param pageSize The pageSize parameter
   * @return ResponseSpec
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public ResponseSpec getUsersWithResponseSpec(Integer page, Integer pageSize)
      throws WebClientResponseException {
    return getUsersRequestCreation(page, pageSize);
  }

  /**
   * Create a User
   *
   * <p><b>200</b> - OK
   *
   * <p><b>201</b> - Created
   *
   * <p><b>400</b> - Bad Request
   *
   * @param postUserRequest The postUserRequest parameter
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  private ResponseSpec postUserRequestCreation(PostUserRequest postUserRequest)
      throws WebClientResponseException {
    Object postBody = postUserRequest;
    // verify the required parameter 'postUserRequest' is set
    if (postUserRequest == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'postUserRequest' when calling postUser",
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
        "/users",
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
   * Create a User
   *
   * <p><b>200</b> - OK
   *
   * <p><b>201</b> - Created
   *
   * <p><b>400</b> - Bad Request
   *
   * @param postUserRequest The postUserRequest parameter
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<Void> postUser(PostUserRequest postUserRequest) throws WebClientResponseException {
    ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
    return postUserRequestCreation(postUserRequest).bodyToMono(localVarReturnType);
  }

  /**
   * Create a User
   *
   * <p><b>200</b> - OK
   *
   * <p><b>201</b> - Created
   *
   * <p><b>400</b> - Bad Request
   *
   * @param postUserRequest The postUserRequest parameter
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<ResponseEntity<Void>> postUserWithHttpInfo(PostUserRequest postUserRequest)
      throws WebClientResponseException {
    ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
    return postUserRequestCreation(postUserRequest).toEntity(localVarReturnType);
  }

  /**
   * Create a User
   *
   * <p><b>200</b> - OK
   *
   * <p><b>201</b> - Created
   *
   * <p><b>400</b> - Bad Request
   *
   * @param postUserRequest The postUserRequest parameter
   * @return ResponseSpec
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public ResponseSpec postUserWithResponseSpec(PostUserRequest postUserRequest)
      throws WebClientResponseException {
    return postUserRequestCreation(postUserRequest);
  }

  /**
   * Create Multiple Users
   *
   * <p><b>200</b> - OK
   *
   * <p><b>201</b> - Created
   *
   * <p><b>400</b> - Bad Request
   *
   * @param postUsersBatchRequest The postUsersBatchRequest parameter
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  private ResponseSpec postUsersRequestCreation(PostUsersBatchRequest postUsersBatchRequest)
      throws WebClientResponseException {
    Object postBody = postUsersBatchRequest;
    // verify the required parameter 'postUsersBatchRequest' is set
    if (postUsersBatchRequest == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'postUsersBatchRequest' when calling postUsers",
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
        "/users/batch",
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
   * Create Multiple Users
   *
   * <p><b>200</b> - OK
   *
   * <p><b>201</b> - Created
   *
   * <p><b>400</b> - Bad Request
   *
   * @param postUsersBatchRequest The postUsersBatchRequest parameter
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<Void> postUsers(PostUsersBatchRequest postUsersBatchRequest)
      throws WebClientResponseException {
    ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
    return postUsersRequestCreation(postUsersBatchRequest).bodyToMono(localVarReturnType);
  }

  /**
   * Create Multiple Users
   *
   * <p><b>200</b> - OK
   *
   * <p><b>201</b> - Created
   *
   * <p><b>400</b> - Bad Request
   *
   * @param postUsersBatchRequest The postUsersBatchRequest parameter
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<ResponseEntity<Void>> postUsersWithHttpInfo(
      PostUsersBatchRequest postUsersBatchRequest) throws WebClientResponseException {
    ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
    return postUsersRequestCreation(postUsersBatchRequest).toEntity(localVarReturnType);
  }

  /**
   * Create Multiple Users
   *
   * <p><b>200</b> - OK
   *
   * <p><b>201</b> - Created
   *
   * <p><b>400</b> - Bad Request
   *
   * @param postUsersBatchRequest The postUsersBatchRequest parameter
   * @return ResponseSpec
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public ResponseSpec postUsersWithResponseSpec(PostUsersBatchRequest postUsersBatchRequest)
      throws WebClientResponseException {
    return postUsersRequestCreation(postUsersBatchRequest);
  }
}
