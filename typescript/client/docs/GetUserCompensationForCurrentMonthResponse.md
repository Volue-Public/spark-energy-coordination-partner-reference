
# GetUserCompensationForCurrentMonthResponse


## Properties

Name | Type
------------ | -------------
`userId` | string
`period` | [Period](Period.md)
`locationCompensations` | [Array&lt;LocationCompensation&gt;](LocationCompensation.md)

## Example

```typescript
import type { GetUserCompensationForCurrentMonthResponse } from 'spark-ec-client'

// TODO: Update the object below with actual values
const example = {
  "userId": null,
  "period": null,
  "locationCompensations": null,
} satisfies GetUserCompensationForCurrentMonthResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as GetUserCompensationForCurrentMonthResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


