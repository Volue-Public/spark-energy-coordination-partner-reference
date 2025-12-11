# WebhooksApi

All URIs are relative to *https://api.sandbox.voluespark.com/energy-coordination/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteWebhookById**](WebhooksApi.md#deletewebhookbyid) | **DELETE** /webhooks/{webhookId} | Delete a webhook |
| [**getWebhookById**](WebhooksApi.md#getwebhookbyid) | **GET** /webhooks/{webhookId} | Get a Webhook by Id |
| [**getWebhookNotificationLogById**](WebhooksApi.md#getwebhooknotificationlogbyid) | **GET** /webhooks/logs/{notificationId} | Get a webhook notification log by notification id |
| [**getWebhookNotificationLogs**](WebhooksApi.md#getwebhooknotificationlogs) | **GET** /webhooks/logs | Get all webhook notification logs |
| [**getWebhooks**](WebhooksApi.md#getwebhooks) | **GET** /webhooks | Get All Webhooks |
| [**patchWebhookById**](WebhooksApi.md#patchwebhookbyid) | **PATCH** /webhooks/{webhookId} | Update individual fields of a Webhook |
| [**postWebhook**](WebhooksApi.md#postwebhookoperation) | **POST** /webhooks | Create a Webhook |
| [**updateWebhookById**](WebhooksApi.md#updatewebhookbyid) | **PUT** /webhooks/{webhookId} | Update a Webhook |
| [**updateWebhookEnabledById**](WebhooksApi.md#updatewebhookenabledbyid) | **PUT** /webhooks/{webhookId}/enabled | Enable or Disable a Webhook |



## deleteWebhookById

> deleteWebhookById(webhookId)

Delete a webhook

Returns 204 No Content if the webhook was deleted successfully. Returns 404 Not Found if the webhook to delete does not exist.

### Example

```ts
import {
  Configuration,
  WebhooksApi,
} from 'spark-ec-client';
import type { DeleteWebhookByIdRequest } from 'spark-ec-client';

async function example() {
  console.log("🚀 Testing spark-ec-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: Bearer
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new WebhooksApi(config);

  const body = {
    // string
    webhookId: webhookId_example,
  } satisfies DeleteWebhookByIdRequest;

  try {
    const data = await api.deleteWebhookById(body);
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
| **webhookId** | `string` |  | [Defaults to `undefined`] |

### Return type

`void` (Empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`, `application/problem+json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## getWebhookById

> GetWebhookResponse getWebhookById(webhookId)

Get a Webhook by Id

### Example

```ts
import {
  Configuration,
  WebhooksApi,
} from 'spark-ec-client';
import type { GetWebhookByIdRequest } from 'spark-ec-client';

async function example() {
  console.log("🚀 Testing spark-ec-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: Bearer
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new WebhooksApi(config);

  const body = {
    // string
    webhookId: webhookId_example,
  } satisfies GetWebhookByIdRequest;

  try {
    const data = await api.getWebhookById(body);
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
| **webhookId** | `string` |  | [Defaults to `undefined`] |

### Return type

[**GetWebhookResponse**](GetWebhookResponse.md)

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


## getWebhookNotificationLogById

> GetWebhookNotificationLogByIdResponse getWebhookNotificationLogById(notificationId)

Get a webhook notification log by notification id

### Example

```ts
import {
  Configuration,
  WebhooksApi,
} from 'spark-ec-client';
import type { GetWebhookNotificationLogByIdRequest } from 'spark-ec-client';

async function example() {
  console.log("🚀 Testing spark-ec-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: Bearer
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new WebhooksApi(config);

  const body = {
    // string
    notificationId: notificationId_example,
  } satisfies GetWebhookNotificationLogByIdRequest;

  try {
    const data = await api.getWebhookNotificationLogById(body);
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
| **notificationId** | `string` |  | [Defaults to `undefined`] |

### Return type

[**GetWebhookNotificationLogByIdResponse**](GetWebhookNotificationLogByIdResponse.md)

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


## getWebhookNotificationLogs

> GetWebhookNotificationLogsResponse getWebhookNotificationLogs(webhookId, page, pageSize)

Get all webhook notification logs

### Example

```ts
import {
  Configuration,
  WebhooksApi,
} from 'spark-ec-client';
import type { GetWebhookNotificationLogsRequest } from 'spark-ec-client';

async function example() {
  console.log("🚀 Testing spark-ec-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: Bearer
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new WebhooksApi(config);

  const body = {
    // string (optional)
    webhookId: webhookId_example,
    // number (optional)
    page: 56,
    // number (optional)
    pageSize: 56,
  } satisfies GetWebhookNotificationLogsRequest;

  try {
    const data = await api.getWebhookNotificationLogs(body);
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
| **webhookId** | `string` |  | [Optional] [Defaults to `undefined`] |
| **page** | `number` |  | [Optional] [Defaults to `undefined`] |
| **pageSize** | `number` |  | [Optional] [Defaults to `undefined`] |

### Return type

[**GetWebhookNotificationLogsResponse**](GetWebhookNotificationLogsResponse.md)

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


## getWebhooks

> GetWebhooksResponse getWebhooks()

Get All Webhooks

### Example

```ts
import {
  Configuration,
  WebhooksApi,
} from 'spark-ec-client';
import type { GetWebhooksRequest } from 'spark-ec-client';

async function example() {
  console.log("🚀 Testing spark-ec-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: Bearer
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new WebhooksApi(config);

  try {
    const data = await api.getWebhooks();
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

[**GetWebhooksResponse**](GetWebhooksResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## patchWebhookById

> GetWebhookResponse patchWebhookById(webhookId, patchWebhookRequest)

Update individual fields of a Webhook

### Example

```ts
import {
  Configuration,
  WebhooksApi,
} from 'spark-ec-client';
import type { PatchWebhookByIdRequest } from 'spark-ec-client';

async function example() {
  console.log("🚀 Testing spark-ec-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: Bearer
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new WebhooksApi(config);

  const body = {
    // string
    webhookId: webhookId_example,
    // PatchWebhookRequest
    patchWebhookRequest: ...,
  } satisfies PatchWebhookByIdRequest;

  try {
    const data = await api.patchWebhookById(body);
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
| **webhookId** | `string` |  | [Defaults to `undefined`] |
| **patchWebhookRequest** | [PatchWebhookRequest](PatchWebhookRequest.md) |  | |

### Return type

[**GetWebhookResponse**](GetWebhookResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`, `application/problem+json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## postWebhook

> postWebhook(postWebhookRequest)

Create a Webhook

### Example

```ts
import {
  Configuration,
  WebhooksApi,
} from 'spark-ec-client';
import type { PostWebhookOperationRequest } from 'spark-ec-client';

async function example() {
  console.log("🚀 Testing spark-ec-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: Bearer
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new WebhooksApi(config);

  const body = {
    // PostWebhookRequest
    postWebhookRequest: {"name":"Example Webhook","webhookSecret":"CMJ0PqrOtGIat7j","webhookUrl":"https://example.com/api","notificationTypes":["PriceCurveCreated","UserEligibilityUpdated","LocationLPCRequested","ResourceLPCRequested"]},
  } satisfies PostWebhookOperationRequest;

  try {
    const data = await api.postWebhook(body);
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
| **postWebhookRequest** | [PostWebhookRequest](PostWebhookRequest.md) |  | |

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


## updateWebhookById

> GetWebhookResponse updateWebhookById(webhookId, putWebhookRequest)

Update a Webhook

### Example

```ts
import {
  Configuration,
  WebhooksApi,
} from 'spark-ec-client';
import type { UpdateWebhookByIdRequest } from 'spark-ec-client';

async function example() {
  console.log("🚀 Testing spark-ec-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: Bearer
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new WebhooksApi(config);

  const body = {
    // string
    webhookId: webhookId_example,
    // PutWebhookRequest
    putWebhookRequest: {"webhookSecret":"New secret","webhookUrl":"https://new-example.com/api/v2/","notificationTypes":["PriceCurveCreated"],"enabled":true,"name":"New name"},
  } satisfies UpdateWebhookByIdRequest;

  try {
    const data = await api.updateWebhookById(body);
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
| **webhookId** | `string` |  | [Defaults to `undefined`] |
| **putWebhookRequest** | [PutWebhookRequest](PutWebhookRequest.md) |  | |

### Return type

[**GetWebhookResponse**](GetWebhookResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`, `application/problem+json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## updateWebhookEnabledById

> updateWebhookEnabledById(webhookId, enabled)

Enable or Disable a Webhook

### Example

```ts
import {
  Configuration,
  WebhooksApi,
} from 'spark-ec-client';
import type { UpdateWebhookEnabledByIdRequest } from 'spark-ec-client';

async function example() {
  console.log("🚀 Testing spark-ec-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: Bearer
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new WebhooksApi(config);

  const body = {
    // string
    webhookId: webhookId_example,
    // boolean
    enabled: true,
  } satisfies UpdateWebhookEnabledByIdRequest;

  try {
    const data = await api.updateWebhookEnabledById(body);
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
| **webhookId** | `string` |  | [Defaults to `undefined`] |
| **enabled** | `boolean` |  | [Defaults to `undefined`] |

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
| **404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

