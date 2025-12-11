
# LocationLPCTarget


## Properties

Name | Type
------------ | -------------
`locationId` | string
`meterPointId` | string
`resolution` | string
`points` | [Array&lt;LPCDataPoint&gt;](LPCDataPoint.md)

## Example

```typescript
import type { LocationLPCTarget } from 'spark-ec-client'

// TODO: Update the object below with actual values
const example = {
  "locationId": null,
  "meterPointId": null,
  "resolution": 02:00:00,
  "points": null,
} satisfies LocationLPCTarget

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as LocationLPCTarget
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


