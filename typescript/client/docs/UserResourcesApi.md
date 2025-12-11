# UserResourcesApi

All URIs are relative to *https://api.sandbox.voluespark.com/energy-coordination/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getResourcesForUser**](UserResourcesApi.md#getresourcesforuser) | **GET** /users/{userId}/resources | Get a User\&#39;s Resources |
| [**postVehicle**](UserResourcesApi.md#postvehicle) | **POST** /users/{userId}/vehicles | Create Vehicle Resource |



## getResourcesForUser

> GetUserResourcesResponse getResourcesForUser(userId)

Get a User\&#39;s Resources

Get all resources registered to a user. Returns both location bound resources and vehicles.

### Example

```ts
import {
  Configuration,
  UserResourcesApi,
} from 'spark-ec-client';
import type { GetResourcesForUserRequest } from 'spark-ec-client';

async function example() {
  console.log("🚀 Testing spark-ec-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: Bearer
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new UserResourcesApi(config);

  const body = {
    // string
    userId: userId_example,
  } satisfies GetResourcesForUserRequest;

  try {
    const data = await api.getResourcesForUser(body);
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
| **userId** | `string` |  | [Defaults to `undefined`] |

### Return type

[**GetUserResourcesResponse**](GetUserResourcesResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## postVehicle

> postVehicle(userId, postVehicleResourceRequest)

Create Vehicle Resource

### Example

```ts
import {
  Configuration,
  UserResourcesApi,
} from 'spark-ec-client';
import type { PostVehicleRequest } from 'spark-ec-client';

async function example() {
  console.log("🚀 Testing spark-ec-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: Bearer
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new UserResourcesApi(config);

  const body = {
    // string
    userId: userId_example,
    // PostVehicleResourceRequest
    postVehicleResourceRequest: {"resourceId":"72afee74-07fd-408a-a6f6-6ca86ed3547e","resourceType":"Vehicle"},
  } satisfies PostVehicleRequest;

  try {
    const data = await api.postVehicle(body);
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
| **userId** | `string` |  | [Defaults to `undefined`] |
| **postVehicleResourceRequest** | [PostVehicleResourceRequest](PostVehicleResourceRequest.md) |  | |

### Return type

`void` (Empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`, `application/problem+json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **400** | Bad Request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

