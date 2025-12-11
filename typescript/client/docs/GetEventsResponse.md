
# GetEventsResponse


## Properties

Name | Type
------------ | -------------
`pagination` | [ApiPagination](ApiPagination.md)
`events` | [Array&lt;GetEventResponse&gt;](GetEventResponse.md)

## Example

```typescript
import type { GetEventsResponse } from 'spark-ec-client'

// TODO: Update the object below with actual values
const example = {
  "pagination": null,
  "events": null,
} satisfies GetEventsResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as GetEventsResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


