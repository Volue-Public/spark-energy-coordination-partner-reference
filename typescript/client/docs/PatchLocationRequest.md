
# PatchLocationRequest


## Properties

Name | Type
------------ | -------------
`locationType` | [LocationType](LocationType.md)
`coordinates` | [Coordinate](Coordinate.md)
`meterPointIds` | Array&lt;string&gt;

## Example

```typescript
import type { PatchLocationRequest } from 'spark-ec-client'

// TODO: Update the object below with actual values
const example = {
  "locationType": null,
  "coordinates": null,
  "meterPointIds": null,
} satisfies PatchLocationRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PatchLocationRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


