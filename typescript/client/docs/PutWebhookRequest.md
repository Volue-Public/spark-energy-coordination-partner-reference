
# PutWebhookRequest


## Properties

Name | Type
------------ | -------------
`webhookSecret` | string
`webhookUrl` | string
`notificationTypes` | [Array&lt;NotificationType&gt;](NotificationType.md)
`enabled` | boolean
`name` | string

## Example

```typescript
import type { PutWebhookRequest } from 'spark-ec-client'

// TODO: Update the object below with actual values
const example = {
  "webhookSecret": null,
  "webhookUrl": null,
  "notificationTypes": null,
  "enabled": null,
  "name": null,
} satisfies PutWebhookRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PutWebhookRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


