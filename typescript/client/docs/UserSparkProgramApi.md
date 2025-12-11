# UserSparkProgramApi

All URIs are relative to *https://api.sandbox.voluespark.com/energy-coordination/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteUserEnrollment**](UserSparkProgramApi.md#deleteuserenrollment) | **DELETE** /users/{userId}/enrollment | Delete User Enrollment |
| [**fetchUserCompensation**](UserSparkProgramApi.md#fetchusercompensation) | **GET** /users/{userId}/compensation | Will fetch the total compensation per location the user has for the current month |
| [**getEligibleUsers**](UserSparkProgramApi.md#geteligibleusers) | **GET** /users/eligible | Get Eligible Users |
| [**getMpidEligibility**](UserSparkProgramApi.md#getmpideligibility) | **GET** /meters/{mpid}/eligible | Check if MeterPoint id eligible for Spark |
| [**getUserEligibilityByUserId**](UserSparkProgramApi.md#getusereligibilitybyuserid) | **GET** /users/{userId}/eligibility | Get User Eligibility |
| [**getUserEnrollmentByUserId**](UserSparkProgramApi.md#getuserenrollmentbyuserid) | **GET** /users/{userId}/enrollment | Get User Enrollment |
| [**postUserEnrollment**](UserSparkProgramApi.md#postuserenrollment) | **POST** /users/{userId}/enrollment | Enroll User |



## deleteUserEnrollment

> deleteUserEnrollment(userId)

Delete User Enrollment

Remove a user from the SPARK Program

### Example

```ts
import {
  Configuration,
  UserSparkProgramApi,
} from 'spark-ec-client';
import type { DeleteUserEnrollmentRequest } from 'spark-ec-client';

async function example() {
  console.log("🚀 Testing spark-ec-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: Bearer
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new UserSparkProgramApi(config);

  const body = {
    // string
    userId: userId_example,
  } satisfies DeleteUserEnrollmentRequest;

  try {
    const data = await api.deleteUserEnrollment(body);
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
| **400** | Bad Request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## fetchUserCompensation

> GetUserCompensationForCurrentMonthResponse fetchUserCompensation(userId)

Will fetch the total compensation per location the user has for the current month

### Example

```ts
import {
  Configuration,
  UserSparkProgramApi,
} from 'spark-ec-client';
import type { FetchUserCompensationRequest } from 'spark-ec-client';

async function example() {
  console.log("🚀 Testing spark-ec-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: Bearer
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new UserSparkProgramApi(config);

  const body = {
    // string
    userId: userId_example,
  } satisfies FetchUserCompensationRequest;

  try {
    const data = await api.fetchUserCompensation(body);
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

[**GetUserCompensationForCurrentMonthResponse**](GetUserCompensationForCurrentMonthResponse.md)

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


## getEligibleUsers

> GetEligibleUsersResponse getEligibleUsers(page, pageSize)

Get Eligible Users

Get all users who are eligible for the SPARK Program. Maximum pageSize is 1000.

### Example

```ts
import {
  Configuration,
  UserSparkProgramApi,
} from 'spark-ec-client';
import type { GetEligibleUsersRequest } from 'spark-ec-client';

async function example() {
  console.log("🚀 Testing spark-ec-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: Bearer
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new UserSparkProgramApi(config);

  const body = {
    // number (optional)
    page: 56,
    // number (optional)
    pageSize: 56,
  } satisfies GetEligibleUsersRequest;

  try {
    const data = await api.getEligibleUsers(body);
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

[**GetEligibleUsersResponse**](GetEligibleUsersResponse.md)

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


## getMpidEligibility

> GetMpidEligibilityResponse getMpidEligibility(mpid)

Check if MeterPoint id eligible for Spark

Indicates whether or not the given MeterPoint is currently eligible for the Spark program

### Example

```ts
import {
  Configuration,
  UserSparkProgramApi,
} from 'spark-ec-client';
import type { GetMpidEligibilityRequest } from 'spark-ec-client';

async function example() {
  console.log("🚀 Testing spark-ec-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: Bearer
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new UserSparkProgramApi(config);

  const body = {
    // string
    mpid: mpid_example,
  } satisfies GetMpidEligibilityRequest;

  try {
    const data = await api.getMpidEligibility(body);
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
| **mpid** | `string` |  | [Defaults to `undefined`] |

### Return type

[**GetMpidEligibilityResponse**](GetMpidEligibilityResponse.md)

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


## getUserEligibilityByUserId

> GetUserEligibilityResponse getUserEligibilityByUserId(userId)

Get User Eligibility

Check if a user is eligible for the SPARK Program

### Example

```ts
import {
  Configuration,
  UserSparkProgramApi,
} from 'spark-ec-client';
import type { GetUserEligibilityByUserIdRequest } from 'spark-ec-client';

async function example() {
  console.log("🚀 Testing spark-ec-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: Bearer
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new UserSparkProgramApi(config);

  const body = {
    // string
    userId: userId_example,
  } satisfies GetUserEligibilityByUserIdRequest;

  try {
    const data = await api.getUserEligibilityByUserId(body);
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

[**GetUserEligibilityResponse**](GetUserEligibilityResponse.md)

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


## getUserEnrollmentByUserId

> GetUserEnrollmentResponse getUserEnrollmentByUserId(userId)

Get User Enrollment

Get a user\&#39;s enrollment status. Also returns when the user was enrolled.

### Example

```ts
import {
  Configuration,
  UserSparkProgramApi,
} from 'spark-ec-client';
import type { GetUserEnrollmentByUserIdRequest } from 'spark-ec-client';

async function example() {
  console.log("🚀 Testing spark-ec-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: Bearer
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new UserSparkProgramApi(config);

  const body = {
    // string
    userId: userId_example,
  } satisfies GetUserEnrollmentByUserIdRequest;

  try {
    const data = await api.getUserEnrollmentByUserId(body);
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

[**GetUserEnrollmentResponse**](GetUserEnrollmentResponse.md)

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


## postUserEnrollment

> GetUserEnrollmentResponse postUserEnrollment(userId)

Enroll User

Enroll a user into the SPARK Program

### Example

```ts
import {
  Configuration,
  UserSparkProgramApi,
} from 'spark-ec-client';
import type { PostUserEnrollmentRequest } from 'spark-ec-client';

async function example() {
  console.log("🚀 Testing spark-ec-client SDK...");
  const config = new Configuration({ 
    // Configure HTTP bearer authorization: Bearer
    accessToken: "YOUR BEARER TOKEN",
  });
  const api = new UserSparkProgramApi(config);

  const body = {
    // string
    userId: userId_example,
  } satisfies PostUserEnrollmentRequest;

  try {
    const data = await api.postUserEnrollment(body);
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

[**GetUserEnrollmentResponse**](GetUserEnrollmentResponse.md)

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

