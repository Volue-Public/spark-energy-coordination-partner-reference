
# PriceCurvePayload


## Properties

Name | Type
------------ | -------------
`targets` | [Array&lt;PriceCurveTarget&gt;](PriceCurveTarget.md)
`priceCurveDelta` | [PriceCurve](PriceCurve.md)
`priceArea` | [PriceArea](PriceArea.md)

## Example

```typescript
import type { PriceCurvePayload } from 'spark-ec-client'

// TODO: Update the object below with actual values
const example = {
  "targets": null,
  "priceCurveDelta": null,
  "priceArea": null,
} satisfies PriceCurvePayload

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PriceCurvePayload
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


