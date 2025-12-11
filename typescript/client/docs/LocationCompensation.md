
# LocationCompensation


## Properties

Name | Type
------------ | -------------
`locationId` | string
`meterPointIds` | Array&lt;string&gt;
`activeAmount` | number
`blockedAmount` | number
`currency` | [Currency](Currency.md)
`problems` | [Array&lt;Problem&gt;](Problem.md)

## Example

```typescript
import type { LocationCompensation } from 'spark-ec-client'

// TODO: Update the object below with actual values
const example = {
  "locationId": null,
  "meterPointIds": null,
  "activeAmount": null,
  "blockedAmount": null,
  "currency": null,
  "problems": null,
} satisfies LocationCompensation

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as LocationCompensation
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


