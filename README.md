# Volue Spark reference DER partner implementation
This repository provides reference code for interfacing with the Volue Spark Energy Coordination API documented [here](https://docs.voluespark.com/guides/energy-coordination/getting-started)

The goal of this repository is to rely on automatic code generation with little to no manual code changes.
This is to reduce the amount of code needed for reimplementing it using a different framework or language and to be able to keep up to date with future updates to openapi-generator-cli.

## Repository structure
### Available languages
Code for the following programming languages are currently generated. Click the links to go to that language implementation.
| Language | Webhook server | API client |
|----------|----------------|------------|
| [C#](./csharp) | [server](./csharp/server) | [client](./csharp/client) |
| [Java](./java) | [server](./java/server) | [client](./java/client) |
| [Typescript](./typescript) |  | [client](./typescript/client) |

### Common API specifications
The [`_common`](./_common) directory contains openapi files which are used across all available lanugages.
* [OpenAPI Specification for API Clients](./_common/ec-sandbox-swagger.json)
* [OpenAPI Specification for Webhook Server](./_common/webhook-server-openapi.yaml)

### Tests
Test scripts are provided in the [`_tests`](./_tests) directory. The webhook servers are validated using sample data and the API clients are tested agains the sandbox environment.
  - [CLI client test script](./_tests/cli-client-test.sh)
  - [Webhook server test script](./_tests/webhook-server-test.sh)
  - [Webhook server test data](../../tree/main/_tests/webhook_test_data)

## Features
This repository serves the following features:
* Code generation for API clients and webhook servers.
* Reference implementations of webhook servers in the available languages.
* Automatic tests to ensure that webhook servers work with our current implementation.
* Automatic tests to ensure that the API clients work with the Sandbox environment.
* Automatic regeneration of code whenever the OpenApi file served by the Sandbox environment changes.

This repository currently does not serve the following features:
* Publishing API clients to package repositories like nuget, maven central and npm.
* Publishing versioned artifacts or releases

## Getting started
There are two main ways of interacting with the Spark Energy Coordination API: setting up a webhook server for receiving notifications, and using an API client to call the Spark Energy Coordination API. These two capabilities can live in the same application or they could be to separate applications, which is up for the implementer to decide. In this repository they will be separated into separate applications for separation of concern and ease of code generation.

To get started you can copy the code directly from this repository which already contains working webhook servers and API client libraries. If you prefer to generate the code yourself the following command can be used to create either a webhook server or an API client library:
```sh
openapi-generator-cli batch openapi-generator-config.yaml
```
This command uses the `openapi-generator-config.yaml` which is present in each client and server directory for each language in order to generate the code.
If you wish to use these files outside this repository the important files to copy over are the `openapi-generator-config.yaml` and the `.openapi-generator-ignore` files from the directory which corresponds to the desired language and client or server. For webhook servers you also need the `webhook-server-openapi.yaml` file which is referenced by the `openapi-generator-config.yaml` file.

## Running tests
To run integration tests for the webhook server or API client, use the test scripts located in the _tests directory:

```sh
language="csharp" # Set language to one of the available languages like "java" or "csharp"
# Run CLI client tests
./tests/cli-client-test.sh $language

# Run Webhook server tests
./tests/webhook-test.sh $language
```

## Other languages
Currently the reference code generated in this repository only cover the [languages listed](#available-implementations) above, but the code generation process should be similar for other languages. Visit the [openapi-generator-cli](https://openapi-generator.tech/docs/generators) website for a list of the available generators in other languages.

## Contributing
If you want to contribute to this repository, please read our [contributing guidelines](./CONTRIBUTING.md)
