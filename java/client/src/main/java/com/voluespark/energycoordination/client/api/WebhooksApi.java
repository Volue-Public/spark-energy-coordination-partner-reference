package com.voluespark.energycoordination.client.api;


import com.voluespark.energycoordination.client.model.GetWebhookNotificationLogByIdResponse;
import com.voluespark.energycoordination.client.model.GetWebhookNotificationLogsResponse;
import com.voluespark.energycoordination.client.model.GetWebhookResponse;
import com.voluespark.energycoordination.client.model.GetWebhooksResponse;
import com.voluespark.energycoordination.client.model.PatchWebhookRequest;
import com.voluespark.energycoordination.client.model.PostWebhookRequest;
import com.voluespark.energycoordination.client.model.PutWebhookRequest;
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
public class WebhooksApi {
  private ApiClient apiClient;

  public WebhooksApi() {
    this(new ApiClient());
  }

  @Autowired
  public WebhooksApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Delete a webhook Returns 204 No Content if the webhook was deleted successfully. Returns 404
   * Not Found if the webhook to delete does not exist.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>204</b> - No Content
   *
   * <p><b>400</b> - Bad Request
   *
   * <p><b>404</b> - Not Found
   *
   * @param webhookId The webhookId parameter
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  private ResponseSpec deleteWebhookByIdRequestCreation(String webhookId)
      throws WebClientResponseException {
    Object postBody = null;
    // verify the required parameter 'webhookId' is set
    if (webhookId == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'webhookId' when calling deleteWebhookById",
          HttpStatus.BAD_REQUEST.value(),
          HttpStatus.BAD_REQUEST.getReasonPhrase(),
          null,
          null,
          null);
    }
    // create path and map variables
    final Map<String, Object> pathParams = new HashMap<String, Object>();

    pathParams.put("webhookId", webhookId);

    final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
    final HttpHeaders headerParams = new HttpHeaders();
    final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
    final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

    final String[] localVarAccepts = {"application/json", "application/problem+json"};
    final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    final String[] localVarContentTypes = {};
    final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"Bearer"};

    ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
    return apiClient.invokeAPI(
        "/webhooks/{webhookId}",
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
   * Delete a webhook Returns 204 No Content if the webhook was deleted successfully. Returns 404
   * Not Found if the webhook to delete does not exist.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>204</b> - No Content
   *
   * <p><b>400</b> - Bad Request
   *
   * <p><b>404</b> - Not Found
   *
   * @param webhookId The webhookId parameter
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<Void> deleteWebhookById(String webhookId) throws WebClientResponseException {
    ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
    return deleteWebhookByIdRequestCreation(webhookId).bodyToMono(localVarReturnType);
  }

  /**
   * Delete a webhook Returns 204 No Content if the webhook was deleted successfully. Returns 404
   * Not Found if the webhook to delete does not exist.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>204</b> - No Content
   *
   * <p><b>400</b> - Bad Request
   *
   * <p><b>404</b> - Not Found
   *
   * @param webhookId The webhookId parameter
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<ResponseEntity<Void>> deleteWebhookByIdWithHttpInfo(String webhookId)
      throws WebClientResponseException {
    ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
    return deleteWebhookByIdRequestCreation(webhookId).toEntity(localVarReturnType);
  }

  /**
   * Delete a webhook Returns 204 No Content if the webhook was deleted successfully. Returns 404
   * Not Found if the webhook to delete does not exist.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>204</b> - No Content
   *
   * <p><b>400</b> - Bad Request
   *
   * <p><b>404</b> - Not Found
   *
   * @param webhookId The webhookId parameter
   * @return ResponseSpec
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public ResponseSpec deleteWebhookByIdWithResponseSpec(String webhookId)
      throws WebClientResponseException {
    return deleteWebhookByIdRequestCreation(webhookId);
  }

  /**
   * Get a Webhook by Id
   *
   * <p><b>200</b> - OK
   *
   * <p><b>404</b> - Not Found
   *
   * <p><b>400</b> - Bad Request
   *
   * @param webhookId The webhookId parameter
   * @return GetWebhookResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  private ResponseSpec getWebhookByIdRequestCreation(String webhookId)
      throws WebClientResponseException {
    Object postBody = null;
    // verify the required parameter 'webhookId' is set
    if (webhookId == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'webhookId' when calling getWebhookById",
          HttpStatus.BAD_REQUEST.value(),
          HttpStatus.BAD_REQUEST.getReasonPhrase(),
          null,
          null,
          null);
    }
    // create path and map variables
    final Map<String, Object> pathParams = new HashMap<String, Object>();

    pathParams.put("webhookId", webhookId);

    final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
    final HttpHeaders headerParams = new HttpHeaders();
    final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
    final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

    final String[] localVarAccepts = {"application/json", "application/problem+json"};
    final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    final String[] localVarContentTypes = {};
    final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"Bearer"};

    ParameterizedTypeReference<GetWebhookResponse> localVarReturnType =
        new ParameterizedTypeReference<GetWebhookResponse>() {};
    return apiClient.invokeAPI(
        "/webhooks/{webhookId}",
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
   * Get a Webhook by Id
   *
   * <p><b>200</b> - OK
   *
   * <p><b>404</b> - Not Found
   *
   * <p><b>400</b> - Bad Request
   *
   * @param webhookId The webhookId parameter
   * @return GetWebhookResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<GetWebhookResponse> getWebhookById(String webhookId)
      throws WebClientResponseException {
    ParameterizedTypeReference<GetWebhookResponse> localVarReturnType =
        new ParameterizedTypeReference<GetWebhookResponse>() {};
    return getWebhookByIdRequestCreation(webhookId).bodyToMono(localVarReturnType);
  }

  /**
   * Get a Webhook by Id
   *
   * <p><b>200</b> - OK
   *
   * <p><b>404</b> - Not Found
   *
   * <p><b>400</b> - Bad Request
   *
   * @param webhookId The webhookId parameter
   * @return ResponseEntity&lt;GetWebhookResponse&gt;
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<ResponseEntity<GetWebhookResponse>> getWebhookByIdWithHttpInfo(String webhookId)
      throws WebClientResponseException {
    ParameterizedTypeReference<GetWebhookResponse> localVarReturnType =
        new ParameterizedTypeReference<GetWebhookResponse>() {};
    return getWebhookByIdRequestCreation(webhookId).toEntity(localVarReturnType);
  }

  /**
   * Get a Webhook by Id
   *
   * <p><b>200</b> - OK
   *
   * <p><b>404</b> - Not Found
   *
   * <p><b>400</b> - Bad Request
   *
   * @param webhookId The webhookId parameter
   * @return ResponseSpec
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public ResponseSpec getWebhookByIdWithResponseSpec(String webhookId)
      throws WebClientResponseException {
    return getWebhookByIdRequestCreation(webhookId);
  }

  /**
   * Get a webhook notification log by notification id
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * @param notificationId The notificationId parameter
   * @return GetWebhookNotificationLogByIdResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  private ResponseSpec getWebhookNotificationLogByIdRequestCreation(String notificationId)
      throws WebClientResponseException {
    Object postBody = null;
    // verify the required parameter 'notificationId' is set
    if (notificationId == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'notificationId' when calling"
              + " getWebhookNotificationLogById",
          HttpStatus.BAD_REQUEST.value(),
          HttpStatus.BAD_REQUEST.getReasonPhrase(),
          null,
          null,
          null);
    }
    // create path and map variables
    final Map<String, Object> pathParams = new HashMap<String, Object>();

    pathParams.put("notificationId", notificationId);

    final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
    final HttpHeaders headerParams = new HttpHeaders();
    final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
    final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

    final String[] localVarAccepts = {"application/json", "application/problem+json"};
    final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    final String[] localVarContentTypes = {};
    final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"Bearer"};

    ParameterizedTypeReference<GetWebhookNotificationLogByIdResponse> localVarReturnType =
        new ParameterizedTypeReference<GetWebhookNotificationLogByIdResponse>() {};
    return apiClient.invokeAPI(
        "/webhooks/logs/{notificationId}",
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
   * Get a webhook notification log by notification id
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * @param notificationId The notificationId parameter
   * @return GetWebhookNotificationLogByIdResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<GetWebhookNotificationLogByIdResponse> getWebhookNotificationLogById(
      String notificationId) throws WebClientResponseException {
    ParameterizedTypeReference<GetWebhookNotificationLogByIdResponse> localVarReturnType =
        new ParameterizedTypeReference<GetWebhookNotificationLogByIdResponse>() {};
    return getWebhookNotificationLogByIdRequestCreation(notificationId)
        .bodyToMono(localVarReturnType);
  }

  /**
   * Get a webhook notification log by notification id
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * @param notificationId The notificationId parameter
   * @return ResponseEntity&lt;GetWebhookNotificationLogByIdResponse&gt;
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<ResponseEntity<GetWebhookNotificationLogByIdResponse>>
      getWebhookNotificationLogByIdWithHttpInfo(String notificationId)
          throws WebClientResponseException {
    ParameterizedTypeReference<GetWebhookNotificationLogByIdResponse> localVarReturnType =
        new ParameterizedTypeReference<GetWebhookNotificationLogByIdResponse>() {};
    return getWebhookNotificationLogByIdRequestCreation(notificationId)
        .toEntity(localVarReturnType);
  }

  /**
   * Get a webhook notification log by notification id
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * @param notificationId The notificationId parameter
   * @return ResponseSpec
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public ResponseSpec getWebhookNotificationLogByIdWithResponseSpec(String notificationId)
      throws WebClientResponseException {
    return getWebhookNotificationLogByIdRequestCreation(notificationId);
  }

  /**
   * Get all webhook notification logs
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * @param webhookId The webhookId parameter
   * @param page The page parameter
   * @param pageSize The pageSize parameter
   * @return GetWebhookNotificationLogsResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  private ResponseSpec getWebhookNotificationLogsRequestCreation(
      String webhookId, Integer page, Integer pageSize) throws WebClientResponseException {
    Object postBody = null;
    // create path and map variables
    final Map<String, Object> pathParams = new HashMap<String, Object>();

    final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
    final HttpHeaders headerParams = new HttpHeaders();
    final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
    final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

    queryParams.putAll(apiClient.parameterToMultiValueMap(null, "webhookId", webhookId));
    queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
    queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageSize", pageSize));

    final String[] localVarAccepts = {"application/json", "application/problem+json"};
    final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    final String[] localVarContentTypes = {};
    final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"Bearer"};

    ParameterizedTypeReference<GetWebhookNotificationLogsResponse> localVarReturnType =
        new ParameterizedTypeReference<GetWebhookNotificationLogsResponse>() {};
    return apiClient.invokeAPI(
        "/webhooks/logs",
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
   * Get all webhook notification logs
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * @param webhookId The webhookId parameter
   * @param page The page parameter
   * @param pageSize The pageSize parameter
   * @return GetWebhookNotificationLogsResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<GetWebhookNotificationLogsResponse> getWebhookNotificationLogs(
      String webhookId, Integer page, Integer pageSize) throws WebClientResponseException {
    ParameterizedTypeReference<GetWebhookNotificationLogsResponse> localVarReturnType =
        new ParameterizedTypeReference<GetWebhookNotificationLogsResponse>() {};
    return getWebhookNotificationLogsRequestCreation(webhookId, page, pageSize)
        .bodyToMono(localVarReturnType);
  }

  /**
   * Get all webhook notification logs
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * @param webhookId The webhookId parameter
   * @param page The page parameter
   * @param pageSize The pageSize parameter
   * @return ResponseEntity&lt;GetWebhookNotificationLogsResponse&gt;
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<ResponseEntity<GetWebhookNotificationLogsResponse>>
      getWebhookNotificationLogsWithHttpInfo(String webhookId, Integer page, Integer pageSize)
          throws WebClientResponseException {
    ParameterizedTypeReference<GetWebhookNotificationLogsResponse> localVarReturnType =
        new ParameterizedTypeReference<GetWebhookNotificationLogsResponse>() {};
    return getWebhookNotificationLogsRequestCreation(webhookId, page, pageSize)
        .toEntity(localVarReturnType);
  }

  /**
   * Get all webhook notification logs
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * @param webhookId The webhookId parameter
   * @param page The page parameter
   * @param pageSize The pageSize parameter
   * @return ResponseSpec
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public ResponseSpec getWebhookNotificationLogsWithResponseSpec(
      String webhookId, Integer page, Integer pageSize) throws WebClientResponseException {
    return getWebhookNotificationLogsRequestCreation(webhookId, page, pageSize);
  }

  /**
   * Get All Webhooks
   *
   * <p><b>200</b> - OK
   *
   * @return GetWebhooksResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  private ResponseSpec getWebhooksRequestCreation() throws WebClientResponseException {
    Object postBody = null;
    // create path and map variables
    final Map<String, Object> pathParams = new HashMap<String, Object>();

    final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
    final HttpHeaders headerParams = new HttpHeaders();
    final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
    final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

    final String[] localVarAccepts = {"application/json"};
    final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    final String[] localVarContentTypes = {};
    final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"Bearer"};

    ParameterizedTypeReference<GetWebhooksResponse> localVarReturnType =
        new ParameterizedTypeReference<GetWebhooksResponse>() {};
    return apiClient.invokeAPI(
        "/webhooks",
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
   * Get All Webhooks
   *
   * <p><b>200</b> - OK
   *
   * @return GetWebhooksResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<GetWebhooksResponse> getWebhooks() throws WebClientResponseException {
    ParameterizedTypeReference<GetWebhooksResponse> localVarReturnType =
        new ParameterizedTypeReference<GetWebhooksResponse>() {};
    return getWebhooksRequestCreation().bodyToMono(localVarReturnType);
  }

  /**
   * Get All Webhooks
   *
   * <p><b>200</b> - OK
   *
   * @return ResponseEntity&lt;GetWebhooksResponse&gt;
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<ResponseEntity<GetWebhooksResponse>> getWebhooksWithHttpInfo()
      throws WebClientResponseException {
    ParameterizedTypeReference<GetWebhooksResponse> localVarReturnType =
        new ParameterizedTypeReference<GetWebhooksResponse>() {};
    return getWebhooksRequestCreation().toEntity(localVarReturnType);
  }

  /**
   * Get All Webhooks
   *
   * <p><b>200</b> - OK
   *
   * @return ResponseSpec
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public ResponseSpec getWebhooksWithResponseSpec() throws WebClientResponseException {
    return getWebhooksRequestCreation();
  }

  /**
   * Update individual fields of a Webhook
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * <p><b>404</b> - Not Found
   *
   * @param webhookId The webhookId parameter
   * @param patchWebhookRequest The patchWebhookRequest parameter
   * @return GetWebhookResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  private ResponseSpec patchWebhookByIdRequestCreation(
      String webhookId, PatchWebhookRequest patchWebhookRequest) throws WebClientResponseException {
    Object postBody = patchWebhookRequest;
    // verify the required parameter 'webhookId' is set
    if (webhookId == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'webhookId' when calling patchWebhookById",
          HttpStatus.BAD_REQUEST.value(),
          HttpStatus.BAD_REQUEST.getReasonPhrase(),
          null,
          null,
          null);
    }
    // verify the required parameter 'patchWebhookRequest' is set
    if (patchWebhookRequest == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'patchWebhookRequest' when calling patchWebhookById",
          HttpStatus.BAD_REQUEST.value(),
          HttpStatus.BAD_REQUEST.getReasonPhrase(),
          null,
          null,
          null);
    }
    // create path and map variables
    final Map<String, Object> pathParams = new HashMap<String, Object>();

    pathParams.put("webhookId", webhookId);

    final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
    final HttpHeaders headerParams = new HttpHeaders();
    final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
    final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

    final String[] localVarAccepts = {"application/json", "application/problem+json"};
    final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    final String[] localVarContentTypes = {"application/json"};
    final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"Bearer"};

    ParameterizedTypeReference<GetWebhookResponse> localVarReturnType =
        new ParameterizedTypeReference<GetWebhookResponse>() {};
    return apiClient.invokeAPI(
        "/webhooks/{webhookId}",
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
   * Update individual fields of a Webhook
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * <p><b>404</b> - Not Found
   *
   * @param webhookId The webhookId parameter
   * @param patchWebhookRequest The patchWebhookRequest parameter
   * @return GetWebhookResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<GetWebhookResponse> patchWebhookById(
      String webhookId, PatchWebhookRequest patchWebhookRequest) throws WebClientResponseException {
    ParameterizedTypeReference<GetWebhookResponse> localVarReturnType =
        new ParameterizedTypeReference<GetWebhookResponse>() {};
    return patchWebhookByIdRequestCreation(webhookId, patchWebhookRequest)
        .bodyToMono(localVarReturnType);
  }

  /**
   * Update individual fields of a Webhook
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * <p><b>404</b> - Not Found
   *
   * @param webhookId The webhookId parameter
   * @param patchWebhookRequest The patchWebhookRequest parameter
   * @return ResponseEntity&lt;GetWebhookResponse&gt;
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<ResponseEntity<GetWebhookResponse>> patchWebhookByIdWithHttpInfo(
      String webhookId, PatchWebhookRequest patchWebhookRequest) throws WebClientResponseException {
    ParameterizedTypeReference<GetWebhookResponse> localVarReturnType =
        new ParameterizedTypeReference<GetWebhookResponse>() {};
    return patchWebhookByIdRequestCreation(webhookId, patchWebhookRequest)
        .toEntity(localVarReturnType);
  }

  /**
   * Update individual fields of a Webhook
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * <p><b>404</b> - Not Found
   *
   * @param webhookId The webhookId parameter
   * @param patchWebhookRequest The patchWebhookRequest parameter
   * @return ResponseSpec
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public ResponseSpec patchWebhookByIdWithResponseSpec(
      String webhookId, PatchWebhookRequest patchWebhookRequest) throws WebClientResponseException {
    return patchWebhookByIdRequestCreation(webhookId, patchWebhookRequest);
  }

  /**
   * Create a Webhook
   *
   * <p><b>200</b> - OK
   *
   * <p><b>201</b> - Created
   *
   * <p><b>400</b> - Bad Request
   *
   * @param postWebhookRequest The postWebhookRequest parameter
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  private ResponseSpec postWebhookRequestCreation(PostWebhookRequest postWebhookRequest)
      throws WebClientResponseException {
    Object postBody = postWebhookRequest;
    // verify the required parameter 'postWebhookRequest' is set
    if (postWebhookRequest == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'postWebhookRequest' when calling postWebhook",
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

    final String[] localVarAccepts = {"application/json", "application/problem+json"};
    final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    final String[] localVarContentTypes = {"application/json"};
    final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"Bearer"};

    ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
    return apiClient.invokeAPI(
        "/webhooks",
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
   * Create a Webhook
   *
   * <p><b>200</b> - OK
   *
   * <p><b>201</b> - Created
   *
   * <p><b>400</b> - Bad Request
   *
   * @param postWebhookRequest The postWebhookRequest parameter
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<Void> postWebhook(PostWebhookRequest postWebhookRequest)
      throws WebClientResponseException {
    ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
    return postWebhookRequestCreation(postWebhookRequest).bodyToMono(localVarReturnType);
  }

  /**
   * Create a Webhook
   *
   * <p><b>200</b> - OK
   *
   * <p><b>201</b> - Created
   *
   * <p><b>400</b> - Bad Request
   *
   * @param postWebhookRequest The postWebhookRequest parameter
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<ResponseEntity<Void>> postWebhookWithHttpInfo(PostWebhookRequest postWebhookRequest)
      throws WebClientResponseException {
    ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
    return postWebhookRequestCreation(postWebhookRequest).toEntity(localVarReturnType);
  }

  /**
   * Create a Webhook
   *
   * <p><b>200</b> - OK
   *
   * <p><b>201</b> - Created
   *
   * <p><b>400</b> - Bad Request
   *
   * @param postWebhookRequest The postWebhookRequest parameter
   * @return ResponseSpec
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public ResponseSpec postWebhookWithResponseSpec(PostWebhookRequest postWebhookRequest)
      throws WebClientResponseException {
    return postWebhookRequestCreation(postWebhookRequest);
  }

  /**
   * Update a Webhook
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * <p><b>404</b> - Not Found
   *
   * @param webhookId The webhookId parameter
   * @param putWebhookRequest The putWebhookRequest parameter
   * @return GetWebhookResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  private ResponseSpec updateWebhookByIdRequestCreation(
      String webhookId, PutWebhookRequest putWebhookRequest) throws WebClientResponseException {
    Object postBody = putWebhookRequest;
    // verify the required parameter 'webhookId' is set
    if (webhookId == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'webhookId' when calling updateWebhookById",
          HttpStatus.BAD_REQUEST.value(),
          HttpStatus.BAD_REQUEST.getReasonPhrase(),
          null,
          null,
          null);
    }
    // verify the required parameter 'putWebhookRequest' is set
    if (putWebhookRequest == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'putWebhookRequest' when calling updateWebhookById",
          HttpStatus.BAD_REQUEST.value(),
          HttpStatus.BAD_REQUEST.getReasonPhrase(),
          null,
          null,
          null);
    }
    // create path and map variables
    final Map<String, Object> pathParams = new HashMap<String, Object>();

    pathParams.put("webhookId", webhookId);

    final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
    final HttpHeaders headerParams = new HttpHeaders();
    final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
    final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

    final String[] localVarAccepts = {"application/json", "application/problem+json"};
    final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    final String[] localVarContentTypes = {"application/json"};
    final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"Bearer"};

    ParameterizedTypeReference<GetWebhookResponse> localVarReturnType =
        new ParameterizedTypeReference<GetWebhookResponse>() {};
    return apiClient.invokeAPI(
        "/webhooks/{webhookId}",
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
   * Update a Webhook
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * <p><b>404</b> - Not Found
   *
   * @param webhookId The webhookId parameter
   * @param putWebhookRequest The putWebhookRequest parameter
   * @return GetWebhookResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<GetWebhookResponse> updateWebhookById(
      String webhookId, PutWebhookRequest putWebhookRequest) throws WebClientResponseException {
    ParameterizedTypeReference<GetWebhookResponse> localVarReturnType =
        new ParameterizedTypeReference<GetWebhookResponse>() {};
    return updateWebhookByIdRequestCreation(webhookId, putWebhookRequest)
        .bodyToMono(localVarReturnType);
  }

  /**
   * Update a Webhook
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * <p><b>404</b> - Not Found
   *
   * @param webhookId The webhookId parameter
   * @param putWebhookRequest The putWebhookRequest parameter
   * @return ResponseEntity&lt;GetWebhookResponse&gt;
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<ResponseEntity<GetWebhookResponse>> updateWebhookByIdWithHttpInfo(
      String webhookId, PutWebhookRequest putWebhookRequest) throws WebClientResponseException {
    ParameterizedTypeReference<GetWebhookResponse> localVarReturnType =
        new ParameterizedTypeReference<GetWebhookResponse>() {};
    return updateWebhookByIdRequestCreation(webhookId, putWebhookRequest)
        .toEntity(localVarReturnType);
  }

  /**
   * Update a Webhook
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * <p><b>404</b> - Not Found
   *
   * @param webhookId The webhookId parameter
   * @param putWebhookRequest The putWebhookRequest parameter
   * @return ResponseSpec
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public ResponseSpec updateWebhookByIdWithResponseSpec(
      String webhookId, PutWebhookRequest putWebhookRequest) throws WebClientResponseException {
    return updateWebhookByIdRequestCreation(webhookId, putWebhookRequest);
  }

  /**
   * Enable or Disable a Webhook
   *
   * <p><b>200</b> - OK
   *
   * <p><b>204</b> - No Content
   *
   * <p><b>404</b> - Not Found
   *
   * @param webhookId The webhookId parameter
   * @param enabled The enabled parameter
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  private ResponseSpec updateWebhookEnabledByIdRequestCreation(String webhookId, Boolean enabled)
      throws WebClientResponseException {
    Object postBody = null;
    // verify the required parameter 'webhookId' is set
    if (webhookId == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'webhookId' when calling updateWebhookEnabledById",
          HttpStatus.BAD_REQUEST.value(),
          HttpStatus.BAD_REQUEST.getReasonPhrase(),
          null,
          null,
          null);
    }
    // verify the required parameter 'enabled' is set
    if (enabled == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'enabled' when calling updateWebhookEnabledById",
          HttpStatus.BAD_REQUEST.value(),
          HttpStatus.BAD_REQUEST.getReasonPhrase(),
          null,
          null,
          null);
    }
    // create path and map variables
    final Map<String, Object> pathParams = new HashMap<String, Object>();

    pathParams.put("webhookId", webhookId);

    final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
    final HttpHeaders headerParams = new HttpHeaders();
    final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
    final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

    queryParams.putAll(apiClient.parameterToMultiValueMap(null, "enabled", enabled));

    final String[] localVarAccepts = {"application/json"};
    final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    final String[] localVarContentTypes = {};
    final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"Bearer"};

    ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
    return apiClient.invokeAPI(
        "/webhooks/{webhookId}/enabled",
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
   * Enable or Disable a Webhook
   *
   * <p><b>200</b> - OK
   *
   * <p><b>204</b> - No Content
   *
   * <p><b>404</b> - Not Found
   *
   * @param webhookId The webhookId parameter
   * @param enabled The enabled parameter
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<Void> updateWebhookEnabledById(String webhookId, Boolean enabled)
      throws WebClientResponseException {
    ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
    return updateWebhookEnabledByIdRequestCreation(webhookId, enabled)
        .bodyToMono(localVarReturnType);
  }

  /**
   * Enable or Disable a Webhook
   *
   * <p><b>200</b> - OK
   *
   * <p><b>204</b> - No Content
   *
   * <p><b>404</b> - Not Found
   *
   * @param webhookId The webhookId parameter
   * @param enabled The enabled parameter
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<ResponseEntity<Void>> updateWebhookEnabledByIdWithHttpInfo(
      String webhookId, Boolean enabled) throws WebClientResponseException {
    ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
    return updateWebhookEnabledByIdRequestCreation(webhookId, enabled).toEntity(localVarReturnType);
  }

  /**
   * Enable or Disable a Webhook
   *
   * <p><b>200</b> - OK
   *
   * <p><b>204</b> - No Content
   *
   * <p><b>404</b> - Not Found
   *
   * @param webhookId The webhookId parameter
   * @param enabled The enabled parameter
   * @return ResponseSpec
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public ResponseSpec updateWebhookEnabledByIdWithResponseSpec(String webhookId, Boolean enabled)
      throws WebClientResponseException {
    return updateWebhookEnabledByIdRequestCreation(webhookId, enabled);
  }
}
