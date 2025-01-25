package com.voluespark.energycoordination.client.api;


import com.voluespark.energycoordination.client.model.GetEligibleUsersResponse;
import com.voluespark.energycoordination.client.model.GetMpidEligibilityResponse;
import com.voluespark.energycoordination.client.model.GetUserCompensationForCurrentMonthResponse;
import com.voluespark.energycoordination.client.model.GetUserEligibilityResponse;
import com.voluespark.energycoordination.client.model.GetUserEnrollmentResponse;
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
public class UserSparkProgramApi {
  private ApiClient apiClient;

  public UserSparkProgramApi() {
    this(new ApiClient());
  }

  @Autowired
  public UserSparkProgramApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Delete User Enrollment Remove a user from the SPARK Program
   *
   * <p><b>200</b> - OK
   *
   * <p><b>204</b> - No Content
   *
   * <p><b>404</b> - Not Found
   *
   * <p><b>400</b> - Bad Request
   *
   * @param userId The userId parameter
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  private ResponseSpec deleteUserEnrollmentRequestCreation(String userId)
      throws WebClientResponseException {
    Object postBody = null;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'userId' when calling deleteUserEnrollment",
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
        "/users/{userId}/enrollment",
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
   * Delete User Enrollment Remove a user from the SPARK Program
   *
   * <p><b>200</b> - OK
   *
   * <p><b>204</b> - No Content
   *
   * <p><b>404</b> - Not Found
   *
   * <p><b>400</b> - Bad Request
   *
   * @param userId The userId parameter
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<Void> deleteUserEnrollment(String userId) throws WebClientResponseException {
    ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
    return deleteUserEnrollmentRequestCreation(userId).bodyToMono(localVarReturnType);
  }

  /**
   * Delete User Enrollment Remove a user from the SPARK Program
   *
   * <p><b>200</b> - OK
   *
   * <p><b>204</b> - No Content
   *
   * <p><b>404</b> - Not Found
   *
   * <p><b>400</b> - Bad Request
   *
   * @param userId The userId parameter
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<ResponseEntity<Void>> deleteUserEnrollmentWithHttpInfo(String userId)
      throws WebClientResponseException {
    ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
    return deleteUserEnrollmentRequestCreation(userId).toEntity(localVarReturnType);
  }

  /**
   * Delete User Enrollment Remove a user from the SPARK Program
   *
   * <p><b>200</b> - OK
   *
   * <p><b>204</b> - No Content
   *
   * <p><b>404</b> - Not Found
   *
   * <p><b>400</b> - Bad Request
   *
   * @param userId The userId parameter
   * @return ResponseSpec
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public ResponseSpec deleteUserEnrollmentWithResponseSpec(String userId)
      throws WebClientResponseException {
    return deleteUserEnrollmentRequestCreation(userId);
  }

  /**
   * Will fetch the total compensation per location the user has for the current month
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * <p><b>404</b> - Not Found
   *
   * @param userId The userId parameter
   * @return GetUserCompensationForCurrentMonthResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  private ResponseSpec fetchUserCompensationRequestCreation(String userId)
      throws WebClientResponseException {
    Object postBody = null;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'userId' when calling fetchUserCompensation",
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

    ParameterizedTypeReference<GetUserCompensationForCurrentMonthResponse> localVarReturnType =
        new ParameterizedTypeReference<GetUserCompensationForCurrentMonthResponse>() {};
    return apiClient.invokeAPI(
        "/users/{userId}/compensation",
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
   * Will fetch the total compensation per location the user has for the current month
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * <p><b>404</b> - Not Found
   *
   * @param userId The userId parameter
   * @return GetUserCompensationForCurrentMonthResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<GetUserCompensationForCurrentMonthResponse> fetchUserCompensation(String userId)
      throws WebClientResponseException {
    ParameterizedTypeReference<GetUserCompensationForCurrentMonthResponse> localVarReturnType =
        new ParameterizedTypeReference<GetUserCompensationForCurrentMonthResponse>() {};
    return fetchUserCompensationRequestCreation(userId).bodyToMono(localVarReturnType);
  }

  /**
   * Will fetch the total compensation per location the user has for the current month
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * <p><b>404</b> - Not Found
   *
   * @param userId The userId parameter
   * @return ResponseEntity&lt;GetUserCompensationForCurrentMonthResponse&gt;
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<ResponseEntity<GetUserCompensationForCurrentMonthResponse>>
      fetchUserCompensationWithHttpInfo(String userId) throws WebClientResponseException {
    ParameterizedTypeReference<GetUserCompensationForCurrentMonthResponse> localVarReturnType =
        new ParameterizedTypeReference<GetUserCompensationForCurrentMonthResponse>() {};
    return fetchUserCompensationRequestCreation(userId).toEntity(localVarReturnType);
  }

  /**
   * Will fetch the total compensation per location the user has for the current month
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * <p><b>404</b> - Not Found
   *
   * @param userId The userId parameter
   * @return ResponseSpec
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public ResponseSpec fetchUserCompensationWithResponseSpec(String userId)
      throws WebClientResponseException {
    return fetchUserCompensationRequestCreation(userId);
  }

  /**
   * Get Eligible Users Get all users who are eligible for the SPARK Program. Maximum pageSize is
   * 1000.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * @param page The page parameter
   * @param pageSize The pageSize parameter
   * @return GetEligibleUsersResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  private ResponseSpec getEligibleUsersRequestCreation(Integer page, Integer pageSize)
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

    final String[] localVarAccepts = {"application/json", "application/problem+json"};
    final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    final String[] localVarContentTypes = {};
    final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"Bearer"};

    ParameterizedTypeReference<GetEligibleUsersResponse> localVarReturnType =
        new ParameterizedTypeReference<GetEligibleUsersResponse>() {};
    return apiClient.invokeAPI(
        "/users/eligible",
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
   * Get Eligible Users Get all users who are eligible for the SPARK Program. Maximum pageSize is
   * 1000.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * @param page The page parameter
   * @param pageSize The pageSize parameter
   * @return GetEligibleUsersResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<GetEligibleUsersResponse> getEligibleUsers(Integer page, Integer pageSize)
      throws WebClientResponseException {
    ParameterizedTypeReference<GetEligibleUsersResponse> localVarReturnType =
        new ParameterizedTypeReference<GetEligibleUsersResponse>() {};
    return getEligibleUsersRequestCreation(page, pageSize).bodyToMono(localVarReturnType);
  }

  /**
   * Get Eligible Users Get all users who are eligible for the SPARK Program. Maximum pageSize is
   * 1000.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * @param page The page parameter
   * @param pageSize The pageSize parameter
   * @return ResponseEntity&lt;GetEligibleUsersResponse&gt;
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<ResponseEntity<GetEligibleUsersResponse>> getEligibleUsersWithHttpInfo(
      Integer page, Integer pageSize) throws WebClientResponseException {
    ParameterizedTypeReference<GetEligibleUsersResponse> localVarReturnType =
        new ParameterizedTypeReference<GetEligibleUsersResponse>() {};
    return getEligibleUsersRequestCreation(page, pageSize).toEntity(localVarReturnType);
  }

  /**
   * Get Eligible Users Get all users who are eligible for the SPARK Program. Maximum pageSize is
   * 1000.
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
  public ResponseSpec getEligibleUsersWithResponseSpec(Integer page, Integer pageSize)
      throws WebClientResponseException {
    return getEligibleUsersRequestCreation(page, pageSize);
  }

  /**
   * Check if MeterPoint id eligible for Spark Indicates whether or not the given MeterPoint is
   * currently eligible for the Spark program
   *
   * <p><b>200</b> - OK
   *
   * @param mpid The mpid parameter
   * @return GetMpidEligibilityResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  private ResponseSpec getMpidEligibilityRequestCreation(String mpid)
      throws WebClientResponseException {
    Object postBody = null;
    // verify the required parameter 'mpid' is set
    if (mpid == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'mpid' when calling getMpidEligibility",
          HttpStatus.BAD_REQUEST.value(),
          HttpStatus.BAD_REQUEST.getReasonPhrase(),
          null,
          null,
          null);
    }
    // create path and map variables
    final Map<String, Object> pathParams = new HashMap<String, Object>();

    pathParams.put("mpid", mpid);

    final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
    final HttpHeaders headerParams = new HttpHeaders();
    final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
    final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

    final String[] localVarAccepts = {"application/json"};
    final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    final String[] localVarContentTypes = {};
    final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"Bearer"};

    ParameterizedTypeReference<GetMpidEligibilityResponse> localVarReturnType =
        new ParameterizedTypeReference<GetMpidEligibilityResponse>() {};
    return apiClient.invokeAPI(
        "/meters/{mpid}/eligible",
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
   * Check if MeterPoint id eligible for Spark Indicates whether or not the given MeterPoint is
   * currently eligible for the Spark program
   *
   * <p><b>200</b> - OK
   *
   * @param mpid The mpid parameter
   * @return GetMpidEligibilityResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<GetMpidEligibilityResponse> getMpidEligibility(String mpid)
      throws WebClientResponseException {
    ParameterizedTypeReference<GetMpidEligibilityResponse> localVarReturnType =
        new ParameterizedTypeReference<GetMpidEligibilityResponse>() {};
    return getMpidEligibilityRequestCreation(mpid).bodyToMono(localVarReturnType);
  }

  /**
   * Check if MeterPoint id eligible for Spark Indicates whether or not the given MeterPoint is
   * currently eligible for the Spark program
   *
   * <p><b>200</b> - OK
   *
   * @param mpid The mpid parameter
   * @return ResponseEntity&lt;GetMpidEligibilityResponse&gt;
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<ResponseEntity<GetMpidEligibilityResponse>> getMpidEligibilityWithHttpInfo(
      String mpid) throws WebClientResponseException {
    ParameterizedTypeReference<GetMpidEligibilityResponse> localVarReturnType =
        new ParameterizedTypeReference<GetMpidEligibilityResponse>() {};
    return getMpidEligibilityRequestCreation(mpid).toEntity(localVarReturnType);
  }

  /**
   * Check if MeterPoint id eligible for Spark Indicates whether or not the given MeterPoint is
   * currently eligible for the Spark program
   *
   * <p><b>200</b> - OK
   *
   * @param mpid The mpid parameter
   * @return ResponseSpec
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public ResponseSpec getMpidEligibilityWithResponseSpec(String mpid)
      throws WebClientResponseException {
    return getMpidEligibilityRequestCreation(mpid);
  }

  /**
   * Get User Eligibility Check if a user is eligible for the SPARK Program
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * <p><b>404</b> - Not Found
   *
   * @param userId The userId parameter
   * @return GetUserEligibilityResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  private ResponseSpec getUserEligibilityByUserIdRequestCreation(String userId)
      throws WebClientResponseException {
    Object postBody = null;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'userId' when calling getUserEligibilityByUserId",
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

    ParameterizedTypeReference<GetUserEligibilityResponse> localVarReturnType =
        new ParameterizedTypeReference<GetUserEligibilityResponse>() {};
    return apiClient.invokeAPI(
        "/users/{userId}/eligibility",
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
   * Get User Eligibility Check if a user is eligible for the SPARK Program
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * <p><b>404</b> - Not Found
   *
   * @param userId The userId parameter
   * @return GetUserEligibilityResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<GetUserEligibilityResponse> getUserEligibilityByUserId(String userId)
      throws WebClientResponseException {
    ParameterizedTypeReference<GetUserEligibilityResponse> localVarReturnType =
        new ParameterizedTypeReference<GetUserEligibilityResponse>() {};
    return getUserEligibilityByUserIdRequestCreation(userId).bodyToMono(localVarReturnType);
  }

  /**
   * Get User Eligibility Check if a user is eligible for the SPARK Program
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * <p><b>404</b> - Not Found
   *
   * @param userId The userId parameter
   * @return ResponseEntity&lt;GetUserEligibilityResponse&gt;
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<ResponseEntity<GetUserEligibilityResponse>> getUserEligibilityByUserIdWithHttpInfo(
      String userId) throws WebClientResponseException {
    ParameterizedTypeReference<GetUserEligibilityResponse> localVarReturnType =
        new ParameterizedTypeReference<GetUserEligibilityResponse>() {};
    return getUserEligibilityByUserIdRequestCreation(userId).toEntity(localVarReturnType);
  }

  /**
   * Get User Eligibility Check if a user is eligible for the SPARK Program
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * <p><b>404</b> - Not Found
   *
   * @param userId The userId parameter
   * @return ResponseSpec
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public ResponseSpec getUserEligibilityByUserIdWithResponseSpec(String userId)
      throws WebClientResponseException {
    return getUserEligibilityByUserIdRequestCreation(userId);
  }

  /**
   * Get User Enrollment Get a user&#39;s enrollment status. Also returns when the user was
   * enrolled.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>404</b> - Not Found
   *
   * <p><b>400</b> - Bad Request
   *
   * @param userId The userId parameter
   * @return GetUserEnrollmentResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  private ResponseSpec getUserEnrollmentByUserIdRequestCreation(String userId)
      throws WebClientResponseException {
    Object postBody = null;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'userId' when calling getUserEnrollmentByUserId",
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

    ParameterizedTypeReference<GetUserEnrollmentResponse> localVarReturnType =
        new ParameterizedTypeReference<GetUserEnrollmentResponse>() {};
    return apiClient.invokeAPI(
        "/users/{userId}/enrollment",
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
   * Get User Enrollment Get a user&#39;s enrollment status. Also returns when the user was
   * enrolled.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>404</b> - Not Found
   *
   * <p><b>400</b> - Bad Request
   *
   * @param userId The userId parameter
   * @return GetUserEnrollmentResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<GetUserEnrollmentResponse> getUserEnrollmentByUserId(String userId)
      throws WebClientResponseException {
    ParameterizedTypeReference<GetUserEnrollmentResponse> localVarReturnType =
        new ParameterizedTypeReference<GetUserEnrollmentResponse>() {};
    return getUserEnrollmentByUserIdRequestCreation(userId).bodyToMono(localVarReturnType);
  }

  /**
   * Get User Enrollment Get a user&#39;s enrollment status. Also returns when the user was
   * enrolled.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>404</b> - Not Found
   *
   * <p><b>400</b> - Bad Request
   *
   * @param userId The userId parameter
   * @return ResponseEntity&lt;GetUserEnrollmentResponse&gt;
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<ResponseEntity<GetUserEnrollmentResponse>> getUserEnrollmentByUserIdWithHttpInfo(
      String userId) throws WebClientResponseException {
    ParameterizedTypeReference<GetUserEnrollmentResponse> localVarReturnType =
        new ParameterizedTypeReference<GetUserEnrollmentResponse>() {};
    return getUserEnrollmentByUserIdRequestCreation(userId).toEntity(localVarReturnType);
  }

  /**
   * Get User Enrollment Get a user&#39;s enrollment status. Also returns when the user was
   * enrolled.
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
  public ResponseSpec getUserEnrollmentByUserIdWithResponseSpec(String userId)
      throws WebClientResponseException {
    return getUserEnrollmentByUserIdRequestCreation(userId);
  }

  /**
   * Enroll User Enroll a user into the SPARK Program
   *
   * <p><b>200</b> - OK
   *
   * <p><b>404</b> - Not Found
   *
   * <p><b>400</b> - Bad Request
   *
   * @param userId The userId parameter
   * @return GetUserEnrollmentResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  private ResponseSpec postUserEnrollmentRequestCreation(String userId)
      throws WebClientResponseException {
    Object postBody = null;
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'userId' when calling postUserEnrollment",
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

    ParameterizedTypeReference<GetUserEnrollmentResponse> localVarReturnType =
        new ParameterizedTypeReference<GetUserEnrollmentResponse>() {};
    return apiClient.invokeAPI(
        "/users/{userId}/enrollment",
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
   * Enroll User Enroll a user into the SPARK Program
   *
   * <p><b>200</b> - OK
   *
   * <p><b>404</b> - Not Found
   *
   * <p><b>400</b> - Bad Request
   *
   * @param userId The userId parameter
   * @return GetUserEnrollmentResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<GetUserEnrollmentResponse> postUserEnrollment(String userId)
      throws WebClientResponseException {
    ParameterizedTypeReference<GetUserEnrollmentResponse> localVarReturnType =
        new ParameterizedTypeReference<GetUserEnrollmentResponse>() {};
    return postUserEnrollmentRequestCreation(userId).bodyToMono(localVarReturnType);
  }

  /**
   * Enroll User Enroll a user into the SPARK Program
   *
   * <p><b>200</b> - OK
   *
   * <p><b>404</b> - Not Found
   *
   * <p><b>400</b> - Bad Request
   *
   * @param userId The userId parameter
   * @return ResponseEntity&lt;GetUserEnrollmentResponse&gt;
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<ResponseEntity<GetUserEnrollmentResponse>> postUserEnrollmentWithHttpInfo(
      String userId) throws WebClientResponseException {
    ParameterizedTypeReference<GetUserEnrollmentResponse> localVarReturnType =
        new ParameterizedTypeReference<GetUserEnrollmentResponse>() {};
    return postUserEnrollmentRequestCreation(userId).toEntity(localVarReturnType);
  }

  /**
   * Enroll User Enroll a user into the SPARK Program
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
  public ResponseSpec postUserEnrollmentWithResponseSpec(String userId)
      throws WebClientResponseException {
    return postUserEnrollmentRequestCreation(userId);
  }
}
