package com.voluespark.energycoordination.client.api;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
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
public class SimulationPartnerDataApi {
  private ApiClient apiClient;

  public SimulationPartnerDataApi() {
    this(new ApiClient());
  }

  @Autowired
  public SimulationPartnerDataApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Cleanup Simulation Data Deletes all simulation data from the system. This includes users,
   * vehicles, locations and resources.
   *
   * <p><b>200</b> - OK
   *
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  private ResponseSpec deleteTenantDataSimulationRequestCreation()
      throws WebClientResponseException {
    Object postBody = null;
    // create path and map variables
    final Map<String, Object> pathParams = new HashMap<String, Object>();

    final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
    final HttpHeaders headerParams = new HttpHeaders();
    final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
    final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

    final String[] localVarAccepts = {};
    final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
    final String[] localVarContentTypes = {};
    final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {"Bearer"};

    ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
    return apiClient.invokeAPI(
        "/simulation/partner",
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
   * Cleanup Simulation Data Deletes all simulation data from the system. This includes users,
   * vehicles, locations and resources.
   *
   * <p><b>200</b> - OK
   *
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<Void> deleteTenantDataSimulation() throws WebClientResponseException {
    ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
    return deleteTenantDataSimulationRequestCreation().bodyToMono(localVarReturnType);
  }

  /**
   * Cleanup Simulation Data Deletes all simulation data from the system. This includes users,
   * vehicles, locations and resources.
   *
   * <p><b>200</b> - OK
   *
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<ResponseEntity<Void>> deleteTenantDataSimulationWithHttpInfo()
      throws WebClientResponseException {
    ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
    return deleteTenantDataSimulationRequestCreation().toEntity(localVarReturnType);
  }

  /**
   * Cleanup Simulation Data Deletes all simulation data from the system. This includes users,
   * vehicles, locations and resources.
   *
   * <p><b>200</b> - OK
   *
   * @return ResponseSpec
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public ResponseSpec deleteTenantDataSimulationWithResponseSpec()
      throws WebClientResponseException {
    return deleteTenantDataSimulationRequestCreation();
  }

  /**
   * Simulate DER-Partner Data Creates simulated data with users, vehicles, locations and resources.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>201</b> - Created
   *
   * <p><b>400</b> - Bad Request
   *
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  private ResponseSpec postTenantDataSimulationRequestCreation() throws WebClientResponseException {
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

    ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
    return apiClient.invokeAPI(
        "/simulation/partner",
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
   * Simulate DER-Partner Data Creates simulated data with users, vehicles, locations and resources.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>201</b> - Created
   *
   * <p><b>400</b> - Bad Request
   *
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<Void> postTenantDataSimulation() throws WebClientResponseException {
    ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
    return postTenantDataSimulationRequestCreation().bodyToMono(localVarReturnType);
  }

  /**
   * Simulate DER-Partner Data Creates simulated data with users, vehicles, locations and resources.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>201</b> - Created
   *
   * <p><b>400</b> - Bad Request
   *
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public Mono<ResponseEntity<Void>> postTenantDataSimulationWithHttpInfo()
      throws WebClientResponseException {
    ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
    return postTenantDataSimulationRequestCreation().toEntity(localVarReturnType);
  }

  /**
   * Simulate DER-Partner Data Creates simulated data with users, vehicles, locations and resources.
   *
   * <p><b>200</b> - OK
   *
   * <p><b>201</b> - Created
   *
   * <p><b>400</b> - Bad Request
   *
   * @return ResponseSpec
   * @throws WebClientResponseException if an error occurs while attempting to invoke the API
   */
  public ResponseSpec postTenantDataSimulationWithResponseSpec() throws WebClientResponseException {
    return postTenantDataSimulationRequestCreation();
  }
}
