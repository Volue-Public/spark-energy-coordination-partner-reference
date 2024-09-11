package com.voluespark.energycoordination.client.api;


import com.voluespark.energycoordination.client.model.SimulateEventResponse;
import com.voluespark.energycoordination.client.model.SimulatePriceCurveEventRequest;
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
public class SimulationEventsApi {
  private ApiClient apiClient;

  public SimulationEventsApi() {
    this(new ApiClient());
  }

  @Autowired
  public SimulationEventsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Simulate Price Curve Event Creates a &#x60;PriceCurveEvent&#x60; in the system using the given
   * parameters. The event will be sent to all webhooks that subscribe to the given type of event. -
   * If the &#x60;targets&#x60; parameter is not specified, simulated resources and locations will
   * be targeted instead if any exist. - If the &#x60;priceArea&#x60; parameter is not specified, a
   * random price area will be selected. - If the &#x60;priceCurveDelta&#x60; parameter is not
   * specified, a random price curve delta will be created.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * @param simulatePriceCurveEventRequest The simulatePriceCurveEventRequest parameter
   * @return SimulateEventResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  private ResponseSpec postPriceCurveSimulationRequestCreation(
      SimulatePriceCurveEventRequest simulatePriceCurveEventRequest)
      throws WebClientResponseException {
    Object postBody = simulatePriceCurveEventRequest;
    // verify the required parameter 'simulatePriceCurveEventRequest' is set
    if (simulatePriceCurveEventRequest == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'simulatePriceCurveEventRequest' when calling"
              + " postPriceCurveSimulation",
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

    ParameterizedTypeReference<SimulateEventResponse> localVarReturnType =
        new ParameterizedTypeReference<SimulateEventResponse>() {};
    return apiClient.invokeAPI(
        "/simulation/events/priceCurve",
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
   * Simulate Price Curve Event Creates a &#x60;PriceCurveEvent&#x60; in the system using the given
   * parameters. The event will be sent to all webhooks that subscribe to the given type of event. -
   * If the &#x60;targets&#x60; parameter is not specified, simulated resources and locations will
   * be targeted instead if any exist. - If the &#x60;priceArea&#x60; parameter is not specified, a
   * random price area will be selected. - If the &#x60;priceCurveDelta&#x60; parameter is not
   * specified, a random price curve delta will be created.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * @param simulatePriceCurveEventRequest The simulatePriceCurveEventRequest parameter
   * @return SimulateEventResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<SimulateEventResponse> postPriceCurveSimulation(
      SimulatePriceCurveEventRequest simulatePriceCurveEventRequest)
      throws WebClientResponseException {
    ParameterizedTypeReference<SimulateEventResponse> localVarReturnType =
        new ParameterizedTypeReference<SimulateEventResponse>() {};
    return postPriceCurveSimulationRequestCreation(simulatePriceCurveEventRequest)
        .bodyToMono(localVarReturnType);
  }

  /**
   * Simulate Price Curve Event Creates a &#x60;PriceCurveEvent&#x60; in the system using the given
   * parameters. The event will be sent to all webhooks that subscribe to the given type of event. -
   * If the &#x60;targets&#x60; parameter is not specified, simulated resources and locations will
   * be targeted instead if any exist. - If the &#x60;priceArea&#x60; parameter is not specified, a
   * random price area will be selected. - If the &#x60;priceCurveDelta&#x60; parameter is not
   * specified, a random price curve delta will be created.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * @param simulatePriceCurveEventRequest The simulatePriceCurveEventRequest parameter
   * @return ResponseEntity&lt;SimulateEventResponse&gt;
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<ResponseEntity<SimulateEventResponse>> postPriceCurveSimulationWithHttpInfo(
      SimulatePriceCurveEventRequest simulatePriceCurveEventRequest)
      throws WebClientResponseException {
    ParameterizedTypeReference<SimulateEventResponse> localVarReturnType =
        new ParameterizedTypeReference<SimulateEventResponse>() {};
    return postPriceCurveSimulationRequestCreation(simulatePriceCurveEventRequest)
        .toEntity(localVarReturnType);
  }

  /**
   * Simulate Price Curve Event Creates a &#x60;PriceCurveEvent&#x60; in the system using the given
   * parameters. The event will be sent to all webhooks that subscribe to the given type of event. -
   * If the &#x60;targets&#x60; parameter is not specified, simulated resources and locations will
   * be targeted instead if any exist. - If the &#x60;priceArea&#x60; parameter is not specified, a
   * random price area will be selected. - If the &#x60;priceCurveDelta&#x60; parameter is not
   * specified, a random price curve delta will be created.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * @param simulatePriceCurveEventRequest The simulatePriceCurveEventRequest parameter
   * @return ResponseSpec
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public ResponseSpec postPriceCurveSimulationWithResponseSpec(
      SimulatePriceCurveEventRequest simulatePriceCurveEventRequest)
      throws WebClientResponseException {
    return postPriceCurveSimulationRequestCreation(simulatePriceCurveEventRequest);
  }

  /**
   * Simulate User Eligibility Event Creates a &#x60;UserEligibilityEvent&#x60; in the system using
   * the given parameters. The event will be sent to all webhooks that subscribe to the given type
   * of event. This event does not affect the eligibility of any users. It is only used to simulate
   * the event. For actual events, you can call the /users/eligible endpoint to check which users
   * are eligible.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * @return SimulateEventResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  private ResponseSpec postUserEligibilitySimulationRequestCreation()
      throws WebClientResponseException {
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

    ParameterizedTypeReference<SimulateEventResponse> localVarReturnType =
        new ParameterizedTypeReference<SimulateEventResponse>() {};
    return apiClient.invokeAPI(
        "/simulation/events/userEligibility",
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
   * Simulate User Eligibility Event Creates a &#x60;UserEligibilityEvent&#x60; in the system using
   * the given parameters. The event will be sent to all webhooks that subscribe to the given type
   * of event. This event does not affect the eligibility of any users. It is only used to simulate
   * the event. For actual events, you can call the /users/eligible endpoint to check which users
   * are eligible.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * @return SimulateEventResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<SimulateEventResponse> postUserEligibilitySimulation()
      throws WebClientResponseException {
    ParameterizedTypeReference<SimulateEventResponse> localVarReturnType =
        new ParameterizedTypeReference<SimulateEventResponse>() {};
    return postUserEligibilitySimulationRequestCreation().bodyToMono(localVarReturnType);
  }

  /**
   * Simulate User Eligibility Event Creates a &#x60;UserEligibilityEvent&#x60; in the system using
   * the given parameters. The event will be sent to all webhooks that subscribe to the given type
   * of event. This event does not affect the eligibility of any users. It is only used to simulate
   * the event. For actual events, you can call the /users/eligible endpoint to check which users
   * are eligible.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * @return ResponseEntity&lt;SimulateEventResponse&gt;
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<ResponseEntity<SimulateEventResponse>> postUserEligibilitySimulationWithHttpInfo()
      throws WebClientResponseException {
    ParameterizedTypeReference<SimulateEventResponse> localVarReturnType =
        new ParameterizedTypeReference<SimulateEventResponse>() {};
    return postUserEligibilitySimulationRequestCreation().toEntity(localVarReturnType);
  }

  /**
   * Simulate User Eligibility Event Creates a &#x60;UserEligibilityEvent&#x60; in the system using
   * the given parameters. The event will be sent to all webhooks that subscribe to the given type
   * of event. This event does not affect the eligibility of any users. It is only used to simulate
   * the event. For actual events, you can call the /users/eligible endpoint to check which users
   * are eligible.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * @return ResponseSpec
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public ResponseSpec postUserEligibilitySimulationWithResponseSpec()
      throws WebClientResponseException {
    return postUserEligibilitySimulationRequestCreation();
  }
}
