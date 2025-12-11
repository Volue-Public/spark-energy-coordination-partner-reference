
# LPCLocationTarget


## Properties

Name | Type
------------ | -------------
`location` | [LocationTarget](LocationTarget.md)
`points` | [Array&lt;LPCDataPoint&gt;](LPCDataPoint.md)

## Example

```typescript
import type { LPCLocationTarget } from 'spark-ec-client'

// TODO: Update the object below with actual values
const example = {
  "location": null,
  "points": null,
} satisfies LPCLocationTarget

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as LPCLocationTarget
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


