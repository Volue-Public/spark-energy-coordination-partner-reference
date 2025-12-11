
# GetWebhookNotificationLogsResponse


## Properties

Name | Type
------------ | -------------
`webhookNotificationLogs` | [Array&lt;WebhookNotificationLog&gt;](WebhookNotificationLog.md)
`pagination` | [ApiPagination](ApiPagination.md)

## Example

```typescript
import type { GetWebhookNotificationLogsResponse } from 'spark-ec-client'

// TODO: Update the object below with actual values
const example = {
  "webhookNotificationLogs": null,
  "pagination": null,
} satisfies GetWebhookNotificationLogsResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as GetWebhookNotificationLogsResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


