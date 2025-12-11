# SimulationPartnerDataApi

All URIs are relative to *https://api.sandbox.voluespark.com/energy-coordination/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteTenantDataSimulation**](SimulationPartnerDataApi.md#deletetenantdatasimulation) | **DELETE** /simulation/partner | Cleanup Simulation Data |
| [**postTenantDataSimulation**](SimulationPartnerDataApi.md#posttenantdatasimulation) | **POST** /simulation/partner | Simulate DER-Partner Data |



## deleteTenantDataSimulation

> deleteTenantDataSimulation()

Cleanup Simulation Data

Deletes all simulation data from the system. This includes users, vehicles, locations and resources.

### Example

```ts
import {
  Configuration,
  SimulationPartnerDataApi,
} from 'spark-ec-client';
import type { DeleteTenantDataSimulationRequest } from 'spark-ec-client';

async function example() {
  console.log("🚀 Testing spark-ec-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: Bearer
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new SimulationPartnerDataApi(config);

  try {
    const data = await api.deleteTenantDataSimulation();
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

`void` (Empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## postTenantDataSimulation

> postTenantDataSimulation()

Simulate DER-Partner Data

Creates simulated data with users, vehicles, locations and resources.

### Example

```ts
import {
  Configuration,
  SimulationPartnerDataApi,
} from 'spark-ec-client';
import type { PostTenantDataSimulationRequest } from 'spark-ec-client';

async function example() {
  console.log("🚀 Testing spark-ec-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: Bearer
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new SimulationPartnerDataApi(config);

  try {
    const data = await api.postTenantDataSimulation();
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

`void` (Empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **400** | Bad Request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

