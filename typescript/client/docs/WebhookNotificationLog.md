
# WebhookNotificationLog


## Properties

Name | Type
------------ | -------------
`webhookId` | string
`tenantId` | string
`partnerEventId` | string
`notificationId` | string
`notificationType` | [NotificationType](NotificationType.md)
`notificationSent` | Date
`sparkSignature` | string
`webhookUrl` | string
`requestTimeout` | boolean
`responseStatusCode` | number
`requestDurationMs` | number

## Example

```typescript
import type { WebhookNotificationLog } from 'spark-ec-client'

// TODO: Update the object below with actual values
const example = {
  "webhookId": null,
  "tenantId": null,
  "partnerEventId": null,
  "notificationId": null,
  "notificationType": null,
  "notificationSent": null,
  "sparkSignature": null,
  "webhookUrl": null,
  "requestTimeout": null,
  "responseStatusCode": null,
  "requestDurationMs": null,
} satisfies WebhookNotificationLog

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as WebhookNotificationLog
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


