
# PriceCurve


## Properties

Name | Type
------------ | -------------
`points` | [Array&lt;PriceCurvePoint&gt;](PriceCurvePoint.md)
`energyUnit` | [EnergyUnit](EnergyUnit.md)
`currency` | [Currency](Currency.md)
`resolution` | string

## Example

```typescript
import type { PriceCurve } from 'spark-ec-client'

// TODO: Update the object below with actual values
const example = {
  "points": null,
  "energyUnit": null,
  "currency": null,
  "resolution": 02:00:00,
} satisfies PriceCurve

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PriceCurve
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


