
# ResourceLPCTarget


## Properties

Name | Type
------------ | -------------
`meterPointId` | string
`locationId` | string
`resourceId` | string
`resolution` | string
`points` | [Array&lt;LPCDataPoint&gt;](LPCDataPoint.md)

## Example

```typescript
import type { ResourceLPCTarget } from 'spark-ec-client'

// TODO: Update the object below with actual values
const example = {
  "meterPointId": null,
  "locationId": null,
  "resourceId": null,
  "resolution": 02:00:00,
  "points": null,
} satisfies ResourceLPCTarget

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ResourceLPCTarget
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


