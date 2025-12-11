
# PostLocationBoundResourceRequest


## Properties

Name | Type
------------ | -------------
`resourceId` | string
`resourceType` | [ResourceType](ResourceType.md)
`meterPointId` | string

## Example

```typescript
import type { PostLocationBoundResourceRequest } from 'spark-ec-client'

// TODO: Update the object below with actual values
const example = {
  "resourceId": null,
  "resourceType": null,
  "meterPointId": null,
} satisfies PostLocationBoundResourceRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PostLocationBoundResourceRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


