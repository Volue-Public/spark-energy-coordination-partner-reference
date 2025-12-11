# spark-ec-client@v1

A TypeScript SDK client for the api.sandbox.voluespark.com API.

## Usage

First, install the SDK from npm.

```bash
npm install spark-ec-client --save
```

Next, try it out.


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


## Documentation

### API Endpoints

All URIs are relative to *https://api.sandbox.voluespark.com/energy-coordination/v1*

| Class | Method | HTTP request | Description
| ----- | ------ | ------------ | -------------
*EventsApi* | [**getAllEvents**](docs/EventsApi.md#getallevents) | **GET** /events | Get All Events
*EventsApi* | [**getEventById**](docs/EventsApi.md#geteventbyid) | **GET** /events/{eventId} | Get Event By Id
*ReportsApi* | [**postReport**](docs/ReportsApi.md#postreportoperation) | **POST** /reports | Create a report
*ResourcesApi* | [**deleteResourceById**](docs/ResourcesApi.md#deleteresourcebyid) | **DELETE** /resources/{resourceId} | Delete Resource
*ResourcesApi* | [**getResourceById**](docs/ResourcesApi.md#getresourcebyid) | **GET** /resources/{resourceId} | Get Resource by Id
*SimulationEventsApi* | [**postLPCLocationSimulation**](docs/SimulationEventsApi.md#postlpclocationsimulation) | **POST** /simulation/events/lpc/locations | Simulate LPC Location Event
*SimulationEventsApi* | [**postLPCResourceSimulation**](docs/SimulationEventsApi.md#postlpcresourcesimulation) | **POST** /simulation/events/lpc/resources | Simulate LPC Resource Event
*SimulationEventsApi* | [**postPriceCurveSimulation**](docs/SimulationEventsApi.md#postpricecurvesimulation) | **POST** /simulation/events/pricecurve | Simulate Price Curve Event
*SimulationEventsApi* | [**postUserEligibilitySimulation**](docs/SimulationEventsApi.md#postusereligibilitysimulation) | **POST** /simulation/events/usereligibility | Simulate User Eligibility Event
*SimulationPartnerDataApi* | [**deleteTenantDataSimulation**](docs/SimulationPartnerDataApi.md#deletetenantdatasimulation) | **DELETE** /simulation/partner | Cleanup Simulation Data
*SimulationPartnerDataApi* | [**postTenantDataSimulation**](docs/SimulationPartnerDataApi.md#posttenantdatasimulation) | **POST** /simulation/partner | Simulate DER-Partner Data
*UserApi* | [**deleteUserById**](docs/UserApi.md#deleteuserbyid) | **DELETE** /users/{userId} | Delete User
*UserApi* | [**getUserById**](docs/UserApi.md#getuserbyid) | **GET** /users/{userId} | Get User by Id
*UserApi* | [**getUsers**](docs/UserApi.md#getusers) | **GET** /users | Get Users
*UserApi* | [**postUser**](docs/UserApi.md#postuseroperation) | **POST** /users | Create a User
*UserApi* | [**postUsers**](docs/UserApi.md#postusers) | **POST** /users/batch | Create Multiple Users
*UserLocationsApi* | [**deleteLocation**](docs/UserLocationsApi.md#deletelocation) | **DELETE** /users/{userId}/locations/{locationId} | Delete User Location
*UserLocationsApi* | [**getLocationByLocationId**](docs/UserLocationsApi.md#getlocationbylocationid) | **GET** /users/{userId}/locations/{locationId} | Get User Location By Location Id
*UserLocationsApi* | [**getLocationsByUserId**](docs/UserLocationsApi.md#getlocationsbyuserid) | **GET** /users/{userId}/locations | Get A User\&#39;s Locations
*UserLocationsApi* | [**patchLocation**](docs/UserLocationsApi.md#patchlocationoperation) | **PATCH** /users/{userId}/locations/{locationId} | Patch User Location
*UserLocationsApi* | [**postLocation**](docs/UserLocationsApi.md#postlocationoperation) | **POST** /users/{userId}/locations | Create User Location
*UserLocationsApi* | [**postLocations**](docs/UserLocationsApi.md#postlocations) | **POST** /users/locations/batch | Create Multiple User Locations
*UserLocationsApi* | [**updateLocation**](docs/UserLocationsApi.md#updatelocation) | **PUT** /users/{userId}/locations/{locationId} | Update User Location
*UserResourcesApi* | [**getResourcesForUser**](docs/UserResourcesApi.md#getresourcesforuser) | **GET** /users/{userId}/resources | Get a User\&#39;s Resources
*UserResourcesApi* | [**postVehicle**](docs/UserResourcesApi.md#postvehicle) | **POST** /users/{userId}/vehicles | Create Vehicle Resource
*UserResourcesLocationBoundApi* | [**getLocationBoundResources**](docs/UserResourcesLocationBoundApi.md#getlocationboundresources) | **GET** /users/{userId}/locations/{locationId}/resources | Get Location Bound Resources
*UserResourcesLocationBoundApi* | [**postLocationBoundResource**](docs/UserResourcesLocationBoundApi.md#postlocationboundresourceoperation) | **POST** /users/{userId}/locations/{locationId}/resources | Create Location Bound Resource
*UserSparkProgramApi* | [**deleteUserEnrollment**](docs/UserSparkProgramApi.md#deleteuserenrollment) | **DELETE** /users/{userId}/enrollment | Delete User Enrollment
*UserSparkProgramApi* | [**fetchUserCompensation**](docs/UserSparkProgramApi.md#fetchusercompensation) | **GET** /users/{userId}/compensation | Will fetch the total compensation per location the user has for the current month
*UserSparkProgramApi* | [**getEligibleUsers**](docs/UserSparkProgramApi.md#geteligibleusers) | **GET** /users/eligible | Get Eligible Users
*UserSparkProgramApi* | [**getMpidEligibility**](docs/UserSparkProgramApi.md#getmpideligibility) | **GET** /meters/{mpid}/eligible | Check if MeterPoint id eligible for Spark
*UserSparkProgramApi* | [**getUserEligibilityByUserId**](docs/UserSparkProgramApi.md#getusereligibilitybyuserid) | **GET** /users/{userId}/eligibility | Get User Eligibility
*UserSparkProgramApi* | [**getUserEnrollmentByUserId**](docs/UserSparkProgramApi.md#getuserenrollmentbyuserid) | **GET** /users/{userId}/enrollment | Get User Enrollment
*UserSparkProgramApi* | [**postUserEnrollment**](docs/UserSparkProgramApi.md#postuserenrollment) | **POST** /users/{userId}/enrollment | Enroll User
*WebhooksApi* | [**deleteWebhookById**](docs/WebhooksApi.md#deletewebhookbyid) | **DELETE** /webhooks/{webhookId} | Delete a webhook
*WebhooksApi* | [**getWebhookById**](docs/WebhooksApi.md#getwebhookbyid) | **GET** /webhooks/{webhookId} | Get a Webhook by Id
*WebhooksApi* | [**getWebhookNotificationLogById**](docs/WebhooksApi.md#getwebhooknotificationlogbyid) | **GET** /webhooks/logs/{notificationId} | Get a webhook notification log by notification id
*WebhooksApi* | [**getWebhookNotificationLogs**](docs/WebhooksApi.md#getwebhooknotificationlogs) | **GET** /webhooks/logs | Get all webhook notification logs
*WebhooksApi* | [**getWebhooks**](docs/WebhooksApi.md#getwebhooks) | **GET** /webhooks | Get All Webhooks
*WebhooksApi* | [**patchWebhookById**](docs/WebhooksApi.md#patchwebhookbyid) | **PATCH** /webhooks/{webhookId} | Update individual fields of a Webhook
*WebhooksApi* | [**postWebhook**](docs/WebhooksApi.md#postwebhookoperation) | **POST** /webhooks | Create a Webhook
*WebhooksApi* | [**updateWebhookById**](docs/WebhooksApi.md#updatewebhookbyid) | **PUT** /webhooks/{webhookId} | Update a Webhook
*WebhooksApi* | [**updateWebhookEnabledById**](docs/WebhooksApi.md#updatewebhookenabledbyid) | **PUT** /webhooks/{webhookId}/enabled | Enable or Disable a Webhook


### Models

- [ApiPagination](docs/ApiPagination.md)
- [Coordinate](docs/Coordinate.md)
- [Currency](docs/Currency.md)
- [EnergyCurvePoint](docs/EnergyCurvePoint.md)
- [EnergyUnit](docs/EnergyUnit.md)
- [EnergyUsageReportPayload](docs/EnergyUsageReportPayload.md)
- [EventNotification](docs/EventNotification.md)
- [GetEligibleUsersResponse](docs/GetEligibleUsersResponse.md)
- [GetEventResponse](docs/GetEventResponse.md)
- [GetEventResponsePayload](docs/GetEventResponsePayload.md)
- [GetEventsResponse](docs/GetEventsResponse.md)
- [GetLocationBoundResourceResponse](docs/GetLocationBoundResourceResponse.md)
- [GetLocationResponse](docs/GetLocationResponse.md)
- [GetMpidEligibilityResponse](docs/GetMpidEligibilityResponse.md)
- [GetReportResponse](docs/GetReportResponse.md)
- [GetResourceResponse](docs/GetResourceResponse.md)
- [GetUserCompensationForCurrentMonthResponse](docs/GetUserCompensationForCurrentMonthResponse.md)
- [GetUserEligibilityResponse](docs/GetUserEligibilityResponse.md)
- [GetUserEnrollmentResponse](docs/GetUserEnrollmentResponse.md)
- [GetUserResourcesResponse](docs/GetUserResourcesResponse.md)
- [GetUserResponse](docs/GetUserResponse.md)
- [GetUsersResponse](docs/GetUsersResponse.md)
- [GetWebhookNotificationLogByIdResponse](docs/GetWebhookNotificationLogByIdResponse.md)
- [GetWebhookNotificationLogsResponse](docs/GetWebhookNotificationLogsResponse.md)
- [GetWebhookResponse](docs/GetWebhookResponse.md)
- [GetWebhooksResponse](docs/GetWebhooksResponse.md)
- [HttpValidationProblemDetails](docs/HttpValidationProblemDetails.md)
- [LPCDataPoint](docs/LPCDataPoint.md)
- [LPCLocation](docs/LPCLocation.md)
- [LPCLocationTarget](docs/LPCLocationTarget.md)
- [LPCReservationPayload](docs/LPCReservationPayload.md)
- [LPCResource](docs/LPCResource.md)
- [LPCResourceTarget](docs/LPCResourceTarget.md)
- [LocationCompensation](docs/LocationCompensation.md)
- [LocationEnergyUsagePlanReportPayload](docs/LocationEnergyUsagePlanReportPayload.md)
- [LocationEnergyUsageReportPayload](docs/LocationEnergyUsageReportPayload.md)
- [LocationLPCAcknowledgmentReportPayload](docs/LocationLPCAcknowledgmentReportPayload.md)
- [LocationLPCPayload](docs/LocationLPCPayload.md)
- [LocationLPCTarget](docs/LocationLPCTarget.md)
- [LocationTarget](docs/LocationTarget.md)
- [LocationType](docs/LocationType.md)
- [NotificationType](docs/NotificationType.md)
- [PatchLocationRequest](docs/PatchLocationRequest.md)
- [PatchWebhookRequest](docs/PatchWebhookRequest.md)
- [Period](docs/Period.md)
- [PostLocationBoundResourceRequest](docs/PostLocationBoundResourceRequest.md)
- [PostLocationRequest](docs/PostLocationRequest.md)
- [PostLocationWithUserRequest](docs/PostLocationWithUserRequest.md)
- [PostLocationsBatchRequest](docs/PostLocationsBatchRequest.md)
- [PostLocationsBatchResponse](docs/PostLocationsBatchResponse.md)
- [PostReportRequest](docs/PostReportRequest.md)
- [PostReportRequestPayloadsInner](docs/PostReportRequestPayloadsInner.md)
- [PostUserRequest](docs/PostUserRequest.md)
- [PostUsersBatchRequest](docs/PostUsersBatchRequest.md)
- [PostUsersBatchResponse](docs/PostUsersBatchResponse.md)
- [PostVehicleResourceRequest](docs/PostVehicleResourceRequest.md)
- [PostWebhookRequest](docs/PostWebhookRequest.md)
- [PriceArea](docs/PriceArea.md)
- [PriceCurve](docs/PriceCurve.md)
- [PriceCurvePayload](docs/PriceCurvePayload.md)
- [PriceCurvePoint](docs/PriceCurvePoint.md)
- [PriceCurveTarget](docs/PriceCurveTarget.md)
- [Problem](docs/Problem.md)
- [ProblemType](docs/ProblemType.md)
- [PutLocationRequest](docs/PutLocationRequest.md)
- [PutWebhookRequest](docs/PutWebhookRequest.md)
- [ResourceLPCAcknowledgmentReportPayload](docs/ResourceLPCAcknowledgmentReportPayload.md)
- [ResourceLPCPayload](docs/ResourceLPCPayload.md)
- [ResourceLPCTarget](docs/ResourceLPCTarget.md)
- [ResourceTarget](docs/ResourceTarget.md)
- [ResourceType](docs/ResourceType.md)
- [SimulateEventResponse](docs/SimulateEventResponse.md)
- [SimulateLocationLPCEventRequest](docs/SimulateLocationLPCEventRequest.md)
- [SimulatePriceCurveEventRequest](docs/SimulatePriceCurveEventRequest.md)
- [SimulateResourceLPCEventRequest](docs/SimulateResourceLPCEventRequest.md)
- [SparkEventPayload](docs/SparkEventPayload.md)
- [SparkEventPayloadType](docs/SparkEventPayloadType.md)
- [SparkReportPayload](docs/SparkReportPayload.md)
- [SparkReportPayloadType](docs/SparkReportPayloadType.md)
- [UserEligibilityPayload](docs/UserEligibilityPayload.md)
- [WebhookNotificationLog](docs/WebhookNotificationLog.md)
- [WebhookStatus](docs/WebhookStatus.md)

### Authorization


Authentication schemes defined for the API:
<a id="Bearer"></a>
#### Bearer


- **Type**: HTTP Bearer Token authentication

## About

This TypeScript SDK client supports the [Fetch API](https://fetch.spec.whatwg.org/)
and is automatically generated by the
[OpenAPI Generator](https://openapi-generator.tech) project:

- API version: `v1`
- Package version: `v1`
- Generator version: `7.17.0`
- Build package: `org.openapitools.codegen.languages.TypeScriptFetchClientCodegen`

The generated npm module supports the following:

- Environments
  * Node.js
  * Webpack
  * Browserify
- Language levels
  * ES5 - you must have a Promises/A+ library installed
  * ES6
- Module systems
  * CommonJS
  * ES6 module system


## Development

### Building

To build the TypeScript source code, you need to have Node.js and npm installed.
After cloning the repository, navigate to the project directory and run:

```bash
npm install
npm run build
```

### Publishing

Once you've built the package, you can publish it to npm:

```bash
npm publish
```

## License

[]()
