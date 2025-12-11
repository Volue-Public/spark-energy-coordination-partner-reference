
# EnergyUsageReportPayload


## Properties

Name | Type
------------ | -------------
`resourceId` | string
`locationId` | string
`meterPointId` | string
`points` | [Array&lt;EnergyCurvePoint&gt;](EnergyCurvePoint.md)
`resolution` | string
`curvePoints` | [Array&lt;EnergyCurvePoint&gt;](EnergyCurvePoint.md)

## Example

```typescript
import type { EnergyUsageReportPayload } from 'spark-ec-client'

// TODO: Update the object below with actual values
const example = {
  "resourceId": null,
  "locationId": null,
  "meterPointId": null,
  "points": null,
  "resolution": 02:00:00,
  "curvePoints": null,
} satisfies EnergyUsageReportPayload

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as EnergyUsageReportPayload
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


