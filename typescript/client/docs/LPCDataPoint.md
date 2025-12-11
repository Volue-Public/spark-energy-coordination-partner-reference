
# LPCDataPoint


## Properties

Name | Type
------------ | -------------
`maxPowerInKiloWatts` | number
`timestamp` | Date

## Example

```typescript
import type { LPCDataPoint } from 'spark-ec-client'

// TODO: Update the object below with actual values
const example = {
  "maxPowerInKiloWatts": null,
  "timestamp": null,
} satisfies LPCDataPoint

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as LPCDataPoint
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


