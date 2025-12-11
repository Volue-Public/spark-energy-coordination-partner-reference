
# LPCResource


## Properties

Name | Type
------------ | -------------
`meterPointId` | string
`locationId` | string
`resourceId` | string

## Example

```typescript
import type { LPCResource } from 'spark-ec-client'

// TODO: Update the object below with actual values
const example = {
  "meterPointId": null,
  "locationId": null,
  "resourceId": null,
} satisfies LPCResource

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as LPCResource
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


