
# PostReportRequestPayloadsInner


## Properties

Name | Type
------------ | -------------
`payloadType` | [SparkReportPayloadType](SparkReportPayloadType.md)
`resourceId` | string
`locationId` | string
`meterPointId` | string
`points` | [Array&lt;EnergyCurvePoint&gt;](EnergyCurvePoint.md)
`resolution` | string
`curvePoints` | [Array&lt;EnergyCurvePoint&gt;](EnergyCurvePoint.md)
`acknowledgedTargets` | [Array&lt;LPCLocation&gt;](LPCLocation.md)
`declinedTargets` | [Array&lt;LPCLocation&gt;](LPCLocation.md)
`baseline` | [Array&lt;EnergyCurvePoint&gt;](EnergyCurvePoint.md)
`flexibility` | [Array&lt;EnergyCurvePoint&gt;](EnergyCurvePoint.md)

## Example

```typescript
import type { PostReportRequestPayloadsInner } from 'spark-ec-client'

// TODO: Update the object below with actual values
const example = {
  "payloadType": null,
  "resourceId": null,
  "locationId": null,
  "meterPointId": null,
  "points": null,
  "resolution": 02:00:00,
  "curvePoints": null,
  "acknowledgedTargets": null,
  "declinedTargets": null,
  "baseline": null,
  "flexibility": null,
} satisfies PostReportRequestPayloadsInner

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PostReportRequestPayloadsInner
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


