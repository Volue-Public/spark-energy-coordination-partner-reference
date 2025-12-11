
# ResourceTarget


## Properties

Name | Type
------------ | -------------
`locationId` | string
`resourceId` | string
`meterPointId` | string

## Example

```typescript
import type { ResourceTarget } from 'spark-ec-client'

// TODO: Update the object below with actual values
const example = {
  "locationId": null,
  "resourceId": null,
  "meterPointId": null,
} satisfies ResourceTarget

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ResourceTarget
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


