
# GetLocationBoundResourceResponse


## Properties

Name | Type
------------ | -------------
`resourceId` | string
`resourceType` | [ResourceType](ResourceType.md)
`locationId` | string
`userId` | string
`meterPointId` | string

## Example

```typescript
import type { GetLocationBoundResourceResponse } from 'spark-ec-client'

// TODO: Update the object below with actual values
const example = {
  "resourceId": null,
  "resourceType": null,
  "locationId": null,
  "userId": null,
  "meterPointId": null,
} satisfies GetLocationBoundResourceResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as GetLocationBoundResourceResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


