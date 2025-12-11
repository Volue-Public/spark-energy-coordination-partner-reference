
# EventNotification


## Properties

Name | Type
------------ | -------------
`notificationId` | string
`eventId` | string
`eventCreatedAtUtc` | Date
`notificationSentUtc` | Date
`notificationType` | [NotificationType](NotificationType.md)
`payload` | [SparkEventPayload](SparkEventPayload.md)

## Example

```typescript
import type { EventNotification } from 'spark-ec-client'

// TODO: Update the object below with actual values
const example = {
  "notificationId": null,
  "eventId": null,
  "eventCreatedAtUtc": null,
  "notificationSentUtc": null,
  "notificationType": null,
  "payload": null,
} satisfies EventNotification

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as EventNotification
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


