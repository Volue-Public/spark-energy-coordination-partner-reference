
# PostVehicleResourceRequest


## Properties

Name | Type
------------ | -------------
`resourceId` | string
`resourceType` | [ResourceType](ResourceType.md)

## Example

```typescript
import type { PostVehicleResourceRequest } from 'spark-ec-client'

// TODO: Update the object below with actual values
const example = {
  "resourceId": null,
  "resourceType": null,
} satisfies PostVehicleResourceRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PostVehicleResourceRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


