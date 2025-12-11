
# ApiPagination


## Properties

Name | Type
------------ | -------------
`totalRecords` | number
`pageSize` | number
`currentPage` | number
`totalPages` | number
`nextPage` | number
`previousPage` | number

## Example

```typescript
import type { ApiPagination } from 'spark-ec-client'

// TODO: Update the object below with actual values
const example = {
  "totalRecords": null,
  "pageSize": null,
  "currentPage": null,
  "totalPages": null,
  "nextPage": null,
  "previousPage": null,
} satisfies ApiPagination

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ApiPagination
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


