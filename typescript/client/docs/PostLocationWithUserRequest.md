
# PostLocationWithUserRequest


## Properties

Name | Type
------------ | -------------
`locationId` | string
`locationType` | [LocationType](LocationType.md)
`coordinates` | [Coordinate](Coordinate.md)
`meterPointId` | string
`meterPointIds` | Array&lt;string&gt;
`userId` | string

## Example

```typescript
import type { PostLocationWithUserRequest } from 'spark-ec-client'

// TODO: Update the object below with actual values
const example = {
  "locationId": null,
  "locationType": null,
  "coordinates": null,
  "meterPointId": null,
  "meterPointIds": null,
  "userId": null,
} satisfies PostLocationWithUserRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PostLocationWithUserRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


