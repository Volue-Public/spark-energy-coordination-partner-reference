# UserLocationsApi

All URIs are relative to *https://api.sandbox.voluespark.com/energy-coordination/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteLocation**](UserLocationsApi.md#deletelocation) | **DELETE** /users/{userId}/locations/{locationId} | Delete User Location |
| [**getLocationByLocationId**](UserLocationsApi.md#getlocationbylocationid) | **GET** /users/{userId}/locations/{locationId} | Get User Location By Location Id |
| [**getLocationsByUserId**](UserLocationsApi.md#getlocationsbyuserid) | **GET** /users/{userId}/locations | Get A User\&#39;s Locations |
| [**patchLocation**](UserLocationsApi.md#patchlocationoperation) | **PATCH** /users/{userId}/locations/{locationId} | Patch User Location |
| [**postLocation**](UserLocationsApi.md#postlocationoperation) | **POST** /users/{userId}/locations | Create User Location |
| [**postLocations**](UserLocationsApi.md#postlocations) | **POST** /users/locations/batch | Create Multiple User Locations |
| [**updateLocation**](UserLocationsApi.md#updatelocation) | **PUT** /users/{userId}/locations/{locationId} | Update User Location |



## deleteLocation

> deleteLocation(userId, locationId)

Delete User Location

Returns 204 No Content if the location was deleted successfully. Returns 404 Not Found if the location to delete does not exist.

### Example

```ts
import {
  Configuration,
  UserLocationsApi,
} from 'spark-ec-client';
import type { DeleteLocationRequest } from 'spark-ec-client';

async function example() {
  console.log("🚀 Testing spark-ec-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: Bearer
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new UserLocationsApi(config);

  const body = {
    // string
    userId: userId_example,
    // string
    locationId: locationId_example,
  } satisfies DeleteLocationRequest;

  try {
    const data = await api.deleteLocation(body);
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


## getLocationByLocationId

> GetLocationResponse getLocationByLocationId(userId, locationId)

Get User Location By Location Id

### Example

```ts
import {
  Configuration,
  UserLocationsApi,
} from 'spark-ec-client';
import type { GetLocationByLocationIdRequest } from 'spark-ec-client';

async function example() {
  console.log("🚀 Testing spark-ec-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: Bearer
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new UserLocationsApi(config);

  const body = {
    // string
    userId: userId_example,
    // string
    locationId: locationId_example,
  } satisfies GetLocationByLocationIdRequest;

  try {
    const data = await api.getLocationByLocationId(body);
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

### Return type

[**GetLocationResponse**](GetLocationResponse.md)

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
| **400** | Bad Request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## getLocationsByUserId

> Array&lt;GetLocationResponse&gt; getLocationsByUserId(userId)

Get A User\&#39;s Locations

### Example

```ts
import {
  Configuration,
  UserLocationsApi,
} from 'spark-ec-client';
import type { GetLocationsByUserIdRequest } from 'spark-ec-client';

async function example() {
  console.log("🚀 Testing spark-ec-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: Bearer
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new UserLocationsApi(config);

  const body = {
    // string
    userId: userId_example,
  } satisfies GetLocationsByUserIdRequest;

  try {
    const data = await api.getLocationsByUserId(body);
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

[**Array&lt;GetLocationResponse&gt;**](GetLocationResponse.md)

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


## patchLocation

> GetLocationResponse patchLocation(userId, locationId, patchLocationRequest)

Patch User Location

### Example

```ts
import {
  Configuration,
  UserLocationsApi,
} from 'spark-ec-client';
import type { PatchLocationOperationRequest } from 'spark-ec-client';

async function example() {
  console.log("🚀 Testing spark-ec-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: Bearer
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new UserLocationsApi(config);

  const body = {
    // string
    userId: userId_example,
    // string
    locationId: locationId_example,
    // PatchLocationRequest
    patchLocationRequest: {"locationType":null,"coordinates":{"latitude":78.22094240482632,"longitude":15.619465054484257},"meterPointIds":null},
  } satisfies PatchLocationOperationRequest;

  try {
    const data = await api.patchLocation(body);
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
| **patchLocationRequest** | [PatchLocationRequest](PatchLocationRequest.md) |  | |

### Return type

[**GetLocationResponse**](GetLocationResponse.md)

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
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## postLocation

> postLocation(userId, postLocationRequest)

Create User Location

### Example

```ts
import {
  Configuration,
  UserLocationsApi,
} from 'spark-ec-client';
import type { PostLocationOperationRequest } from 'spark-ec-client';

async function example() {
  console.log("🚀 Testing spark-ec-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: Bearer
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new UserLocationsApi(config);

  const body = {
    // string
    userId: userId_example,
    // PostLocationRequest
    postLocationRequest: {"locationId":"04e8b18b-ed73-4e80-880d-8219b4769304","locationType":"Residential","coordinates":null,"meterPointId":null,"meterPointIds":["4258b430-7a9f-4826-a40f-348464b9482a"]},
  } satisfies PostLocationOperationRequest;

  try {
    const data = await api.postLocation(body);
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
| **postLocationRequest** | [PostLocationRequest](PostLocationRequest.md) |  | |

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
| **409** | Conflict |  -  |
| **404** | Not Found |  -  |
| **400** | Bad Request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## postLocations

> postLocations(postLocationsBatchRequest)

Create Multiple User Locations

Create multiple locations for several users at once. \&quot;The request body should be an array of objects, each containing a user id and a create location request.

### Example

```ts
import {
  Configuration,
  UserLocationsApi,
} from 'spark-ec-client';
import type { PostLocationsRequest } from 'spark-ec-client';

async function example() {
  console.log("🚀 Testing spark-ec-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: Bearer
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new UserLocationsApi(config);

  const body = {
    // PostLocationsBatchRequest
    postLocationsBatchRequest: ...,
  } satisfies PostLocationsRequest;

  try {
    const data = await api.postLocations(body);
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
| **postLocationsBatchRequest** | [PostLocationsBatchRequest](PostLocationsBatchRequest.md) |  | |

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

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## updateLocation

> GetLocationResponse updateLocation(userId, locationId, putLocationRequest)

Update User Location

### Example

```ts
import {
  Configuration,
  UserLocationsApi,
} from 'spark-ec-client';
import type { UpdateLocationRequest } from 'spark-ec-client';

async function example() {
  console.log("🚀 Testing spark-ec-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: Bearer
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new UserLocationsApi(config);

  const body = {
    // string
    userId: userId_example,
    // string
    locationId: locationId_example,
    // PutLocationRequest
    putLocationRequest: ...,
  } satisfies UpdateLocationRequest;

  try {
    const data = await api.updateLocation(body);
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
| **putLocationRequest** | [PutLocationRequest](PutLocationRequest.md) |  | |

### Return type

[**GetLocationResponse**](GetLocationResponse.md)

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
| **404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

