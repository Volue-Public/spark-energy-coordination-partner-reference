
# ResourceLPCAcknowledgmentReportPayload


## Properties

Name | Type
------------ | -------------
`acknowledgedTargets` | [Array&lt;LPCResource&gt;](LPCResource.md)
`declinedTargets` | [Array&lt;LPCResource&gt;](LPCResource.md)

## Example

```typescript
import type { ResourceLPCAcknowledgmentReportPayload } from 'spark-ec-client'

// TODO: Update the object below with actual values
const example = {
  "acknowledgedTargets": null,
  "declinedTargets": null,
} satisfies ResourceLPCAcknowledgmentReportPayload

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ResourceLPCAcknowledgmentReportPayload
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


