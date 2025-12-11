
# GetMpidEligibilityResponse


## Properties

Name | Type
------------ | -------------
`meterPointId` | string
`isEligible` | boolean

## Example

```typescript
import type { GetMpidEligibilityResponse } from 'spark-ec-client'

// TODO: Update the object below with actual values
const example = {
  "meterPointId": null,
  "isEligible": null,
} satisfies GetMpidEligibilityResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as GetMpidEligibilityResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


