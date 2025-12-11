
# PostWebhookRequest


## Properties

Name | Type
------------ | -------------
`name` | string
`webhookSecret` | string
`webhookUrl` | string
`notificationTypes` | [Array&lt;NotificationType&gt;](NotificationType.md)

## Example

```typescript
import type { PostWebhookRequest } from 'spark-ec-client'

// TODO: Update the object below with actual values
const example = {
  "name": null,
  "webhookSecret": null,
  "webhookUrl": null,
  "notificationTypes": null,
} satisfies PostWebhookRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PostWebhookRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


