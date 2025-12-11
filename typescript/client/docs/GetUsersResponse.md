
# GetUsersResponse


## Properties

Name | Type
------------ | -------------
`pagination` | [ApiPagination](ApiPagination.md)
`users` | [Array&lt;GetUserResponse&gt;](GetUserResponse.md)

## Example

```typescript
import type { GetUsersResponse } from 'spark-ec-client'

// TODO: Update the object below with actual values
const example = {
  "pagination": null,
  "users": null,
} satisfies GetUsersResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as GetUsersResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


