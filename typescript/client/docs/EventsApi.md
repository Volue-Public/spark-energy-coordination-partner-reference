# EventsApi

All URIs are relative to *https://api.sandbox.voluespark.com/energy-coordination/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllEvents**](EventsApi.md#getallevents) | **GET** /events | Get All Events |
| [**getEventById**](EventsApi.md#geteventbyid) | **GET** /events/{eventId} | Get Event By Id |



## getAllEvents

> GetEventsResponse getAllEvents(page, pageSize)

Get All Events

Get all events, ordered by the most recent events first. Maximum pageSize is 1000.

### Example

```ts
import {
  Configuration,
  EventsApi,
} from 'spark-ec-client';
import type { GetAllEventsRequest } from 'spark-ec-client';

async function example() {
  console.log("🚀 Testing spark-ec-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: Bearer
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new EventsApi(config);

  const body = {
    // number (optional)
    page: 56,
    // number (optional)
    pageSize: 56,
  } satisfies GetAllEventsRequest;

  try {
    const data = await api.getAllEvents(body);
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
| **page** | `number` |  | [Optional] [Defaults to `undefined`] |
| **pageSize** | `number` |  | [Optional] [Defaults to `undefined`] |

### Return type

[**GetEventsResponse**](GetEventsResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`, `application/problem+json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## getEventById

> GetEventResponse getEventById(eventId)

Get Event By Id

### Example

```ts
import {
  Configuration,
  EventsApi,
} from 'spark-ec-client';
import type { GetEventByIdRequest } from 'spark-ec-client';

async function example() {
  console.log("🚀 Testing spark-ec-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: Bearer
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new EventsApi(config);

  const body = {
    // string
    eventId: eventId_example,
  } satisfies GetEventByIdRequest;

  try {
    const data = await api.getEventById(body);
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
| **eventId** | `string` |  | [Defaults to `undefined`] |

### Return type

[**GetEventResponse**](GetEventResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`, `application/problem+json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **400** | Bad Request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

