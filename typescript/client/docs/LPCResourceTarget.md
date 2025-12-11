
# LPCResourceTarget


## Properties

Name | Type
------------ | -------------
`resource` | [ResourceTarget](ResourceTarget.md)
`points` | [Array&lt;LPCDataPoint&gt;](LPCDataPoint.md)

## Example

```typescript
import type { LPCResourceTarget } from 'spark-ec-client'

// TODO: Update the object below with actual values
const example = {
  "resource": null,
  "points": null,
} satisfies LPCResourceTarget

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as LPCResourceTarget
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


