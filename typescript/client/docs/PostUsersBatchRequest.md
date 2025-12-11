
# PostUsersBatchRequest


## Properties

Name | Type
------------ | -------------
`users` | [Array&lt;PostUserRequest&gt;](PostUserRequest.md)

## Example

```typescript
import type { PostUsersBatchRequest } from 'spark-ec-client'

// TODO: Update the object below with actual values
const example = {
  "users": null,
} satisfies PostUsersBatchRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PostUsersBatchRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


