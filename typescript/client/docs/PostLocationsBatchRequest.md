
# PostLocationsBatchRequest


## Properties

Name | Type
------------ | -------------
`locations` | [Array&lt;PostLocationWithUserRequest&gt;](PostLocationWithUserRequest.md)

## Example

```typescript
import type { PostLocationsBatchRequest } from 'spark-ec-client'

// TODO: Update the object below with actual values
const example = {
  "locations": null,
} satisfies PostLocationsBatchRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PostLocationsBatchRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


