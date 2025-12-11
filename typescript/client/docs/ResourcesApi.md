# ResourcesApi

All URIs are relative to *https://api.sandbox.voluespark.com/energy-coordination/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteResourceById**](ResourcesApi.md#deleteresourcebyid) | **DELETE** /resources/{resourceId} | Delete Resource |
| [**getResourceById**](ResourcesApi.md#getresourcebyid) | **GET** /resources/{resourceId} | Get Resource by Id |



## deleteResourceById

> deleteResourceById(resourceId)

Delete Resource

Returns 204 No Content if the resource was deleted successfully. Returns 404 Not Found if the resource to delete does not exist.

### Example

```ts
import {
  Configuration,
  ResourcesApi,
} from 'spark-ec-client';
import type { DeleteResourceByIdRequest } from 'spark-ec-client';

async function example() {
  console.log("🚀 Testing spark-ec-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: Bearer
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new ResourcesApi(config);

  const body = {
    // string
    resourceId: resourceId_example,
  } satisfies DeleteResourceByIdRequest;

  try {
    const data = await api.deleteResourceById(body);
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
| **resourceId** | `string` |  | [Defaults to `undefined`] |

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
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## getResourceById

> GetResourceResponse getResourceById(resourceId)

Get Resource by Id

### Example

```ts
import {
  Configuration,
  ResourcesApi,
} from 'spark-ec-client';
import type { GetResourceByIdRequest } from 'spark-ec-client';

async function example() {
  console.log("🚀 Testing spark-ec-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: Bearer
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new ResourcesApi(config);

  const body = {
    // string
    resourceId: resourceId_example,
  } satisfies GetResourceByIdRequest;

  try {
    const data = await api.getResourceById(body);
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
| **resourceId** | `string` |  | [Defaults to `undefined`] |

### Return type

[**GetResourceResponse**](GetResourceResponse.md)

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
| **404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

