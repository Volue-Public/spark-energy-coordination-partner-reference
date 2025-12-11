# ReportsApi

All URIs are relative to *https://api.sandbox.voluespark.com/energy-coordination/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postReport**](ReportsApi.md#postreportoperation) | **POST** /reports | Create a report |



## postReport

> GetReportResponse postReport(postReportRequest)

Create a report

### Example

```ts
import {
  Configuration,
  ReportsApi,
} from 'spark-ec-client';
import type { PostReportOperationRequest } from 'spark-ec-client';

async function example() {
  console.log("🚀 Testing spark-ec-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: Bearer
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new ReportsApi(config);

  const body = {
    // PostReportRequest
    postReportRequest: {"eventId":"430c2fe1-74dc-4949-b309-ca72a6e12a99","payloads":[{"resourceId":"43b68e7b-bc17-4b3b-b041-296a2fd8a5fe","locationId":null,"meterPointId":null,"points":[{"timestamp":"2025-11-18T09:01:55.5848134+00:00","kiloWattHours":3.14}],"resolution":"01:00:00","curvePoints":null,"payloadType":"EnergyUsage"}]},
  } satisfies PostReportOperationRequest;

  try {
    const data = await api.postReport(body);
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
| **postReportRequest** | [PostReportRequest](PostReportRequest.md) |  | |

### Return type

[**GetReportResponse**](GetReportResponse.md)

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

