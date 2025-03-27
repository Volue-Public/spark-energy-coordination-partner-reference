package com.voluespark.energycoordination.client.api;


import com.voluespark.energycoordination.client.model.SimulateEventResponse;
import com.voluespark.energycoordination.client.model.SimulateLocationLPCEventRequest;
import com.voluespark.energycoordination.client.model.SimulatePriceCurveEventRequest;
import com.voluespark.energycoordination.client.model.SimulateResourceLPCEventRequest;
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
   * Simulate LPC Location Event Creates a &#x60;LocationLPC&#x60; event in the system using the
   * given parameters. The event will be sent to all webhooks that subscribe to the given type of
   * event. - If the &#x60;locations&#x60; parameter is not specified, random locations will be
   * targeted if any exist. - If the &#x60;points&#x60; parameter is not specified, a random points
   * array with maximum power will be generated.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * @param simulateLocationLPCEventRequest The simulateLocationLPCEventRequest parameter
   * @return SimulateEventResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  private ResponseSpec postLPCLocationSimulationRequestCreation(
      SimulateLocationLPCEventRequest simulateLocationLPCEventRequest)
      throws WebClientResponseException {
    Object postBody = simulateLocationLPCEventRequest;
    // verify the required parameter 'simulateLocationLPCEventRequest' is set
    if (simulateLocationLPCEventRequest == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'simulateLocationLPCEventRequest' when calling"
              + " postLPCLocationSimulation",
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
        "/simulation/events/lpc/locations",
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
   * Simulate LPC Location Event Creates a &#x60;LocationLPC&#x60; event in the system using the
   * given parameters. The event will be sent to all webhooks that subscribe to the given type of
   * event. - If the &#x60;locations&#x60; parameter is not specified, random locations will be
   * targeted if any exist. - If the &#x60;points&#x60; parameter is not specified, a random points
   * array with maximum power will be generated.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * @param simulateLocationLPCEventRequest The simulateLocationLPCEventRequest parameter
   * @return SimulateEventResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<SimulateEventResponse> postLPCLocationSimulation(
      SimulateLocationLPCEventRequest simulateLocationLPCEventRequest)
      throws WebClientResponseException {
    ParameterizedTypeReference<SimulateEventResponse> localVarReturnType =
        new ParameterizedTypeReference<SimulateEventResponse>() {};
    return postLPCLocationSimulationRequestCreation(simulateLocationLPCEventRequest)
        .bodyToMono(localVarReturnType);
  }

  /**
   * Simulate LPC Location Event Creates a &#x60;LocationLPC&#x60; event in the system using the
   * given parameters. The event will be sent to all webhooks that subscribe to the given type of
   * event. - If the &#x60;locations&#x60; parameter is not specified, random locations will be
   * targeted if any exist. - If the &#x60;points&#x60; parameter is not specified, a random points
   * array with maximum power will be generated.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * @param simulateLocationLPCEventRequest The simulateLocationLPCEventRequest parameter
   * @return ResponseEntity&lt;SimulateEventResponse&gt;
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<ResponseEntity<SimulateEventResponse>> postLPCLocationSimulationWithHttpInfo(
      SimulateLocationLPCEventRequest simulateLocationLPCEventRequest)
      throws WebClientResponseException {
    ParameterizedTypeReference<SimulateEventResponse> localVarReturnType =
        new ParameterizedTypeReference<SimulateEventResponse>() {};
    return postLPCLocationSimulationRequestCreation(simulateLocationLPCEventRequest)
        .toEntity(localVarReturnType);
  }

  /**
   * Simulate LPC Location Event Creates a &#x60;LocationLPC&#x60; event in the system using the
   * given parameters. The event will be sent to all webhooks that subscribe to the given type of
   * event. - If the &#x60;locations&#x60; parameter is not specified, random locations will be
   * targeted if any exist. - If the &#x60;points&#x60; parameter is not specified, a random points
   * array with maximum power will be generated.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * @param simulateLocationLPCEventRequest The simulateLocationLPCEventRequest parameter
   * @return ResponseSpec
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public ResponseSpec postLPCLocationSimulationWithResponseSpec(
      SimulateLocationLPCEventRequest simulateLocationLPCEventRequest)
      throws WebClientResponseException {
    return postLPCLocationSimulationRequestCreation(simulateLocationLPCEventRequest);
  }

  /**
   * Simulate LPC Resource Event Creates a &#x60;ResourceLPC&#x60; event in the system using the
   * given parameters. The event will be sent to all webhooks that subscribe to the given type of
   * event. - If the &#x60;resources&#x60; parameter is not specified, random resources at locations
   * will be targeted if any exist. - If the &#x60;points&#x60; parameter is not specified, a random
   * points array with maximum power will be generated.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * @param simulateResourceLPCEventRequest The simulateResourceLPCEventRequest parameter
   * @return SimulateEventResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  private ResponseSpec postLPCResourceSimulationRequestCreation(
      SimulateResourceLPCEventRequest simulateResourceLPCEventRequest)
      throws WebClientResponseException {
    Object postBody = simulateResourceLPCEventRequest;
    // verify the required parameter 'simulateResourceLPCEventRequest' is set
    if (simulateResourceLPCEventRequest == null) {
      throw new WebClientResponseException(
          "Missing the required parameter 'simulateResourceLPCEventRequest' when calling"
              + " postLPCResourceSimulation",
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
        "/simulation/events/lpc/resources",
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
   * Simulate LPC Resource Event Creates a &#x60;ResourceLPC&#x60; event in the system using the
   * given parameters. The event will be sent to all webhooks that subscribe to the given type of
   * event. - If the &#x60;resources&#x60; parameter is not specified, random resources at locations
   * will be targeted if any exist. - If the &#x60;points&#x60; parameter is not specified, a random
   * points array with maximum power will be generated.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * @param simulateResourceLPCEventRequest The simulateResourceLPCEventRequest parameter
   * @return SimulateEventResponse
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<SimulateEventResponse> postLPCResourceSimulation(
      SimulateResourceLPCEventRequest simulateResourceLPCEventRequest)
      throws WebClientResponseException {
    ParameterizedTypeReference<SimulateEventResponse> localVarReturnType =
        new ParameterizedTypeReference<SimulateEventResponse>() {};
    return postLPCResourceSimulationRequestCreation(simulateResourceLPCEventRequest)
        .bodyToMono(localVarReturnType);
  }

  /**
   * Simulate LPC Resource Event Creates a &#x60;ResourceLPC&#x60; event in the system using the
   * given parameters. The event will be sent to all webhooks that subscribe to the given type of
   * event. - If the &#x60;resources&#x60; parameter is not specified, random resources at locations
   * will be targeted if any exist. - If the &#x60;points&#x60; parameter is not specified, a random
   * points array with maximum power will be generated.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * @param simulateResourceLPCEventRequest The simulateResourceLPCEventRequest parameter
   * @return ResponseEntity&lt;SimulateEventResponse&gt;
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<ResponseEntity<SimulateEventResponse>> postLPCResourceSimulationWithHttpInfo(
      SimulateResourceLPCEventRequest simulateResourceLPCEventRequest)
      throws WebClientResponseException {
    ParameterizedTypeReference<SimulateEventResponse> localVarReturnType =
        new ParameterizedTypeReference<SimulateEventResponse>() {};
    return postLPCResourceSimulationRequestCreation(simulateResourceLPCEventRequest)
        .toEntity(localVarReturnType);
  }

  /**
   * Simulate LPC Resource Event Creates a &#x60;ResourceLPC&#x60; event in the system using the
   * given parameters. The event will be sent to all webhooks that subscribe to the given type of
   * event. - If the &#x60;resources&#x60; parameter is not specified, random resources at locations
   * will be targeted if any exist. - If the &#x60;points&#x60; parameter is not specified, a random
   * points array with maximum power will be generated.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>400</b> - Bad Request
   *
   * @param simulateResourceLPCEventRequest The simulateResourceLPCEventRequest parameter
   * @return ResponseSpec
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public ResponseSpec postLPCResourceSimulationWithResponseSpec(
      SimulateResourceLPCEventRequest simulateResourceLPCEventRequest)
      throws WebClientResponseException {
    return postLPCResourceSimulationRequestCreation(simulateResourceLPCEventRequest);
  }

  /**
   * Simulate Price Curve Event Creates a &#x60;PriceCurve&#x60; event in the system using the given
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
        "/simulation/events/pricecurve",
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
   * Simulate Price Curve Event Creates a &#x60;PriceCurve&#x60; event in the system using the given
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
   * Simulate Price Curve Event Creates a &#x60;PriceCurve&#x60; event in the system using the given
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
   * Simulate Price Curve Event Creates a &#x60;PriceCurve&#x60; event in the system using the given
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
   * Simulate User Eligibility Event Creates a &#x60;UserEligibility&#x60; event in the system using
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
        "/simulation/events/usereligibility",
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
   * Simulate User Eligibility Event Creates a &#x60;UserEligibility&#x60; event in the system using
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
   * Simulate User Eligibility Event Creates a &#x60;UserEligibility&#x60; event in the system using
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
   * Simulate User Eligibility Event Creates a &#x60;UserEligibility&#x60; event in the system using
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
