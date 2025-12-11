# UserResourcesLocationBoundApi

All URIs are relative to *https://api.sandbox.voluespark.com/energy-coordination/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getLocationBoundResources**](UserResourcesLocationBoundApi.md#getlocationboundresources) | **GET** /users/{userId}/locations/{locationId}/resources | Get Location Bound Resources |
| [**postLocationBoundResource**](UserResourcesLocationBoundApi.md#postlocationboundresourceoperation) | **POST** /users/{userId}/locations/{locationId}/resources | Create Location Bound Resource |



## getLocationBoundResources

> Array&lt;GetLocationBoundResourceResponse&gt; getLocationBoundResources(locationId, userId)

Get Location Bound Resources

Get all resources registered at a location.

### Example

```ts
import {
  Configuration,
  UserResourcesLocationBoundApi,
} from 'spark-ec-client';
import type { GetLocationBoundResourcesRequest } from 'spark-ec-client';

async function example() {
  console.log("🚀 Testing spark-ec-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: Bearer
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new UserResourcesLocationBoundApi(config);

  const body = {
    // string
    locationId: locationId_example,
    // string
    userId: userId_example,
  } satisfies GetLocationBoundResourcesRequest;

  try {
    const data = await api.getLocationBoundResources(body);
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
| **locationId** | `string` |  | [Defaults to `undefined`] |
| **userId** | `string` |  | [Defaults to `undefined`] |

### Return type

[**Array&lt;GetLocationBoundResourceResponse&gt;**](GetLocationBoundResourceResponse.md)

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


## postLocationBoundResource

> postLocationBoundResource(userId, locationId, postLocationBoundResourceRequest)

Create Location Bound Resource

Create a resource at a location.

### Example

```ts
import {
  Configuration,
  UserResourcesLocationBoundApi,
} from 'spark-ec-client';
import type { PostLocationBoundResourceOperationRequest } from 'spark-ec-client';

async function example() {
  console.log("🚀 Testing spark-ec-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: Bearer
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new UserResourcesLocationBoundApi(config);

  const body = {
    // string
    userId: userId_example,
    // string
    locationId: locationId_example,
    // PostLocationBoundResourceRequest
    postLocationBoundResourceRequest: {"meterPointId":"4258b430-7a9f-4826-a40f-348464b9482a","resourceId":"43b68e7b-bc17-4b3b-b041-296a2fd8a5fe","resourceType":"HotWaterTank"},
  } satisfies PostLocationBoundResourceOperationRequest;

  try {
    const data = await api.postLocationBoundResource(body);
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
| **locationId** | `string` |  | [Defaults to `undefined`] |
| **postLocationBoundResourceRequest** | [PostLocationBoundResourceRequest](PostLocationBoundResourceRequest.md) |  | |

### Return type

`void` (Empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

