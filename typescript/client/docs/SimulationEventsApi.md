# SimulationEventsApi

All URIs are relative to *https://api.sandbox.voluespark.com/energy-coordination/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postLPCLocationSimulation**](SimulationEventsApi.md#postlpclocationsimulation) | **POST** /simulation/events/lpc/locations | Simulate LPC Location Event |
| [**postLPCResourceSimulation**](SimulationEventsApi.md#postlpcresourcesimulation) | **POST** /simulation/events/lpc/resources | Simulate LPC Resource Event |
| [**postPriceCurveSimulation**](SimulationEventsApi.md#postpricecurvesimulation) | **POST** /simulation/events/pricecurve | Simulate Price Curve Event |
| [**postUserEligibilitySimulation**](SimulationEventsApi.md#postusereligibilitysimulation) | **POST** /simulation/events/usereligibility | Simulate User Eligibility Event |



## postLPCLocationSimulation

> SimulateEventResponse postLPCLocationSimulation(simulateLocationLPCEventRequest)

Simulate LPC Location Event

Creates a &#x60;LocationLPC&#x60; event in the system using the given parameters. The event will be sent to all webhooks that subscribe to the given type of event.  - If the &#x60;locations&#x60; parameter is not specified, random locations will be targeted if any exist.  - If the &#x60;points&#x60; parameter is not specified, a random points array with maximum power will be generated.

### Example

```ts
import {
  Configuration,
  SimulationEventsApi,
} from 'spark-ec-client';
import type { PostLPCLocationSimulationRequest } from 'spark-ec-client';

async function example() {
  console.log("🚀 Testing spark-ec-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: Bearer
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new SimulationEventsApi(config);

  const body = {
    // SimulateLocationLPCEventRequest
    simulateLocationLPCEventRequest: ...,
  } satisfies PostLPCLocationSimulationRequest;

  try {
    const data = await api.postLPCLocationSimulation(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **simulateLocationLPCEventRequest** | [SimulateLocationLPCEventRequest](SimulateLocationLPCEventRequest.md) |  | |

### Return type

[**SimulateEventResponse**](SimulateEventResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## postLPCResourceSimulation

> SimulateEventResponse postLPCResourceSimulation(simulateResourceLPCEventRequest)

Simulate LPC Resource Event

Creates a &#x60;ResourceLPC&#x60; event in the system using the given parameters. The event will be sent to all webhooks that subscribe to the given type of event.  - If the &#x60;resources&#x60; parameter is not specified, random resources at locations will be targeted if any exist.  - If the &#x60;points&#x60; parameter is not specified, a random points array with maximum power will be generated.

### Example

```ts
import {
  Configuration,
  SimulationEventsApi,
} from 'spark-ec-client';
import type { PostLPCResourceSimulationRequest } from 'spark-ec-client';

async function example() {
  console.log("🚀 Testing spark-ec-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: Bearer
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new SimulationEventsApi(config);

  const body = {
    // SimulateResourceLPCEventRequest
    simulateResourceLPCEventRequest: ...,
  } satisfies PostLPCResourceSimulationRequest;

  try {
    const data = await api.postLPCResourceSimulation(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **simulateResourceLPCEventRequest** | [SimulateResourceLPCEventRequest](SimulateResourceLPCEventRequest.md) |  | |

### Return type

[**SimulateEventResponse**](SimulateEventResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## postPriceCurveSimulation

> SimulateEventResponse postPriceCurveSimulation(simulatePriceCurveEventRequest)

Simulate Price Curve Event

Creates a &#x60;PriceCurve&#x60; event in the system using the given parameters. The event will be sent to all webhooks that subscribe to the given type of event.  - If the &#x60;targets&#x60; parameter is not specified, simulated resources and locations will be targeted instead if any exist.  - If the &#x60;priceArea&#x60; parameter is not specified, a random price area will be selected.  - If the &#x60;priceCurveDelta&#x60; parameter is not specified, a random price curve delta will be created.

### Example

```ts
import {
  Configuration,
  SimulationEventsApi,
} from 'spark-ec-client';
import type { PostPriceCurveSimulationRequest } from 'spark-ec-client';

async function example() {
  console.log("🚀 Testing spark-ec-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: Bearer
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new SimulationEventsApi(config);

  const body = {
    // SimulatePriceCurveEventRequest
    simulatePriceCurveEventRequest: ...,
  } satisfies PostPriceCurveSimulationRequest;

  try {
    const data = await api.postPriceCurveSimulation(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **simulatePriceCurveEventRequest** | [SimulatePriceCurveEventRequest](SimulatePriceCurveEventRequest.md) |  | |

### Return type

[**SimulateEventResponse**](SimulateEventResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## postUserEligibilitySimulation

> SimulateEventResponse postUserEligibilitySimulation()

Simulate User Eligibility Event

Creates a &#x60;UserEligibility&#x60; event in the system using the given parameters. The event will be sent to all webhooks that subscribe to the given type of event.  This event does not affect the eligibility of any users. It is only used to simulate the event.  For actual events, you can call the /users/eligible endpoint to check which users are eligible.

### Example

```ts
import {
  Configuration,
  SimulationEventsApi,
} from 'spark-ec-client';
import type { PostUserEligibilitySimulationRequest } from 'spark-ec-client';

async function example() {
  console.log("🚀 Testing spark-ec-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: Bearer
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new SimulationEventsApi(config);

  try {
    const data = await api.postUserEligibilitySimulation();
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**SimulateEventResponse**](SimulateEventResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

