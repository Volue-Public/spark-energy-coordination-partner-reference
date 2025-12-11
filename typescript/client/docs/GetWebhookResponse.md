
# GetWebhookResponse


## Properties

Name | Type
------------ | -------------
`webhookId` | string
`webhookUrl` | string
`name` | string
`notificationTypes` | [Array&lt;NotificationType&gt;](NotificationType.md)
`enabled` | boolean
`status` | [WebhookStatus](WebhookStatus.md)
`modifiedDate` | Date
`createdDate` | Date
`lastAnalyzedTimestamp` | Date

## Example

```typescript
import type { GetWebhookResponse } from 'spark-ec-client'

// TODO: Update the object below with actual values
const example = {
  "webhookId": null,
  "webhookUrl": null,
  "name": null,
  "notificationTypes": null,
  "enabled": null,
  "status": null,
  "modifiedDate": null,
  "createdDate": null,
  "lastAnalyzedTimestamp": null,
} satisfies GetWebhookResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as GetWebhookResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


