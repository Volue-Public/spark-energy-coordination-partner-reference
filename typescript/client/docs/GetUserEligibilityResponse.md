
# GetUserEligibilityResponse


## Properties

Name | Type
------------ | -------------
`userId` | string
`isEligible` | boolean

## Example

```typescript
import type { GetUserEligibilityResponse } from 'spark-ec-client'

// TODO: Update the object below with actual values
const example = {
  "userId": null,
  "isEligible": null,
} satisfies GetUserEligibilityResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as GetUserEligibilityResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


