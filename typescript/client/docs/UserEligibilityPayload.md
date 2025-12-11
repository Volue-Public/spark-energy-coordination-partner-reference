
# UserEligibilityPayload


## Properties

Name | Type
------------ | -------------
`lastUpdated` | Date
`addedUsers` | Array&lt;string&gt;
`removedUsers` | Array&lt;string&gt;

## Example

```typescript
import type { UserEligibilityPayload } from 'spark-ec-client'

// TODO: Update the object below with actual values
const example = {
  "lastUpdated": null,
  "addedUsers": null,
  "removedUsers": null,
} satisfies UserEligibilityPayload

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as UserEligibilityPayload
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


