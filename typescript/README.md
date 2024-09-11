# Typescript reference implementation
This directory contains reference implementations of an API client library.
* [Client](./client)

No server was generated for typescript as there are no openapi server generators for typescript. There is one in beta for [nodejs and express](https://openapi-generator.tech/docs/generators/nodejs-express-server), but I'll leave the implementation details of that as an exercise to the reader as typescript/javascript is typically not run as a server.

## Required tools
To run the following commands you need [openapi-generator-cli](https://openapi-generator.tech/docs/installation) and [node + npm](https://docs.npmjs.com/downloading-and-installing-node-js-and-npm).

## Generated Java API client
The code in the directory `./java/client` contains a Java API client for the Energy Coordination API. The library can be generated and used as a dependency in new or existing projects.

### Code generation commands
The Typescript API client was generated using the following commands:
```sh
cd typescript/client
openapi-generator-cli batch openapi-generator-config.yaml
# There seems to be an issue with the TS OpenApi generation, these sed commands fixes it.
sed -i '/suppressImplicitAnyIndexErrors/d' tsconfig.json
sed -i -e 's/extends any//g' -e 's/return super.*(\(.*\)).*/return \1;/g' model/httpValidationProblemDetails.ts
```
This code can be added as a dependency to an existing project or integrated into a new project as needed.

### API CLI client
In order to test out the generated library code a cli-client script was added to the directory named `cli-client` which creates a curl like interface to call the various API methods. Here are a few example usages:
```sh
npm run build
# Set OAUTH JWT token as environment variable:
export JWT_TOKEN="..."
# Use variable for setting the base URL to sandbox API
BASE_URL=https://api.sandbox.voluespark.com/energy-coordination/v1
node cli-client/index.mjs $BASE_URL UserApi getUsers 1 5
node cli-client/index.mjs $BASE_URL UserApi postUser '{"userId": "83342290-1ae6-4bb0-981c-733dc2a56aa0"}'
node cli-client/index.mjs $BASE_URL UserLocationsApi postLocation "83342290-1ae6-4bb0-981c-733dc2a56aa0" '{"locationId": "51f20c65-e530-4f72-b418-83e95fbd10ec", "locationType": "Residential", "meterPointIds": ["707057500000000000"]}'
node cli-client/index.mjs $BASE_URL UserLocationsApi updateLocation "83342290-1ae6-4bb0-981c-733dc2a56aa0" "51f20c65-e530-4f72-b418-83e95fbd10ec" '{"locationId": "51f20c65-e530-4f72-b418-83e95fbd10ec", "locationType": "Residential", "meterPointIds": ["707057500000000001"]}'
node cli-client/index.mjs $BASE_URL UserLocationsApi patchLocation "83342290-1ae6-4bb0-981c-733dc2a56aa0" "51f20c65-e530-4f72-b418-83e95fbd10ec" '{"locationType": "Commercial"}'
node cli-client/index.mjs $BASE_URL UserLocationsApi deleteLocation "51f20c65-e530-4f72-b418-83e95fbd10ec"
node cli-client/index.mjs $BASE_URL UserApi deleteUserById "83342290-1ae6-4bb0-981c-733dc2a56aa0"
```
