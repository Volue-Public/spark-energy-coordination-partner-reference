package com.voluespark.energycoordination.client.api;


import com.voluespark.energycoordination.client.model.GetEventResponse;
import com.voluespark.energycoordination.client.model.GetEventsResponse;
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
public class EventsApi {
  private ApiClient apiClient;

  public EventsApi() {
    this(new ApiClient());
  }

  public EventsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get All Events Get all events, ordered by the most recent events first. Maximum pageSize is
   * 1000.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * @param page The page parameter
   * @param pageSize The pageSize parameter
   * @return GetEventsResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  private ResponseSpec getAllEventsRequestCreation(
      @jakarta.annotation.Nullable Integer page, @jakarta.annotation.Nullable Integer pageSize)
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

    ParameterizedTypeReference<GetEventsResponse> localVarReturnType =
        new ParameterizedTypeReference<GetEventsResponse>() {};
    return apiClient.invokeAPI(
        "/events",
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
   * Get All Events Get all events, ordered by the most recent events first. Maximum pageSize is
   * 1000.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * @param page The page parameter
   * @param pageSize The pageSize parameter
   * @return GetEventsResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<GetEventsResponse> getAllEvents(
      @jakarta.annotation.Nullable Integer page, @jakarta.annotation.Nullable Integer pageSize)
      throws WebClientResponseException {
    ParameterizedTypeReference<GetEventsResponse> localVarReturnType =
        new ParameterizedTypeReference<GetEventsResponse>() {};
    return getAllEventsRequestCreation(page, pageSize).bodyToMono(localVarReturnType);
  }

  /**
   * Get All Events Get all events, ordered by the most recent events first. Maximum pageSize is
   * 1000.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * @param page The page parameter
   * @param pageSize The pageSize parameter
   * @return ResponseEntity&lt;GetEventsResponse&gt;
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<ResponseEntity<GetEventsResponse>> getAllEventsWithHttpInfo(
      @jakarta.annotation.Nullable Integer page, @jakarta.annotation.Nullable Integer pageSize)
      throws WebClientResponseException {
    ParameterizedTypeReference<GetEventsResponse> localVarReturnType =
        new ParameterizedTypeReference<GetEventsResponse>() {};
    return getAllEventsRequestCreation(page, pageSize).toEntity(localVarReturnType);
  }

  /**
   * Get All Events Get all events, ordered by the most recent events first. Maximum pageSize is
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
  public ResponseSpec getAllEventsWithResponseSpec(
      @jakarta.annotation.Nullable Integer page, @jakarta.annotation.Nullable Integer pageSize)
      throws WebClientResponseException {
    return getAllEventsRequestCreation(page, pageSize);
  }

  /**
   * Get Event By Id
   *
   * <p><b>200</b> - OK
   *
   * <p><b>404</b> - Not Found
   *
   * <p><b>400</b> - Bad Request
   *
   * @param eventId The eventId parameter
   * @return GetEventResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  private ResponseSpec getEventByIdRequestCreation(@jakarta.annotation.Nonnull String eventId)
      throws WebClientResponseException {
    Object postBody = null;
    // verify the required parameter 'eventId' is set
    if (eventId == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'eventId' when calling getEventById",
          HttpStatus.BAD_REQUEST.value(),
          HttpStatus.BAD_REQUEST.getReasonPhrase(),
          null,
          null,
          null);
    }
    // create path and map variables
    final Map<String, Object> pathParams = new HashMap<String, Object>();

    pathParams.put("eventId", eventId);

    final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
    final HttpHeaders headerParams = new HttpHeaders();
    final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
    final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

    final String[] localVarAccepts = {"application/json", "application/problem+json"};
    final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    final String[] localVarContentTypes = {};
    final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"Bearer"};

    ParameterizedTypeReference<GetEventResponse> localVarReturnType =
        new ParameterizedTypeReference<GetEventResponse>() {};
    return apiClient.invokeAPI(
        "/events/{eventId}",
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
   * Get Event By Id
   *
   * <p><b>200</b> - OK
   *
   * <p><b>404</b> - Not Found
   *
   * <p><b>400</b> - Bad Request
   *
   * @param eventId The eventId parameter
   * @return GetEventResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<GetEventResponse> getEventById(@jakarta.annotation.Nonnull String eventId)
      throws WebClientResponseException {
    ParameterizedTypeReference<GetEventResponse> localVarReturnType =
        new ParameterizedTypeReference<GetEventResponse>() {};
    return getEventByIdRequestCreation(eventId).bodyToMono(localVarReturnType);
  }

  /**
   * Get Event By Id
   *
   * <p><b>200</b> - OK
   *
   * <p><b>404</b> - Not Found
   *
   * <p><b>400</b> - Bad Request
   *
   * @param eventId The eventId parameter
   * @return ResponseEntity&lt;GetEventResponse&gt;
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<ResponseEntity<GetEventResponse>> getEventByIdWithHttpInfo(
      @jakarta.annotation.Nonnull String eventId) throws WebClientResponseException {
    ParameterizedTypeReference<GetEventResponse> localVarReturnType =
        new ParameterizedTypeReference<GetEventResponse>() {};
    return getEventByIdRequestCreation(eventId).toEntity(localVarReturnType);
  }

  /**
   * Get Event By Id
   *
   * <p><b>200</b> - OK
   *
   * <p><b>404</b> - Not Found
   *
   * <p><b>400</b> - Bad Request
   *
   * @param eventId The eventId parameter
   * @return ResponseSpec
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public ResponseSpec getEventByIdWithResponseSpec(@jakarta.annotation.Nonnull String eventId)
      throws WebClientResponseException {
    return getEventByIdRequestCreation(eventId);
  }
}
