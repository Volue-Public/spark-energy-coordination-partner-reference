# C# reference implementation
This directory contains reference implementations of a C# webhook API server and an API client library.
* [Server](./server)
* [Client](./client)

## Required tools
The generated code is formatted using [csharpier](https://csharpier.com/).
To run the following commands you need [openapi-generator-cli](https://openapi-generator.tech/docs/installation) and the [dotnet cli](https://learn.microsoft.com/en-us/dotnet/core/install/) for the formatting.

## Generated .NET webhook API server
The code in the directory [`./server`](./server) contains an ASP.NET Core API which serves as a reference implementation for receiving notification events via webhooks.

### Running the server
In order to run the server you can run the following command:
```sh
cd csharp/server
SigningKey="Secret123%" dotnet run --project src/Partner.Api
```
This will start a server on port 8080, and a swagger UI is available at [http://localhost:8080/openapi/index.html](http://localhost:8080/openapi/index.html).
The `SigningKey` is the secret used for verifying the payload signatures of the notifications the API receives.

### Code generation commands
The ASP.NET server API was generated using the following commands:
```sh
cd csharp/server
export CSHARP_POST_PROCESS_FILE="dotnet csharpier"
openapi-generator-cli batch openapi-generator-config.yaml
```
This generates an abstract controller `NotificationControllerApi` for receiving the notification events.

### Modifications added to the generated code
While the goal is to keep the code modifications to a minimum, a few adjustments were made to the generated code:
1. Add test project to Solution file: `./server/src/Partner.Api.sln`.
2. Add service registration of filter to compute hash of body to: `./server/src/Partner.Api/Startup.cs`.

In order to implement the code that handles the received notification event you need to implement the `NotificationControllerApi`.
A reference implementation for the controller in this repository is located in `./server/src/Partner.Api/Implementations`.
This directory contains manual implementations of the controlles and only contains manually generated code.
The following files were added to the generated project in order to implement the functionality of receiveing a notification event properly:
1. An implementation of `NotificationEventControllerApi`: `./server/src/Partner.Api/Implementations/NotificationApiControllerImplementation.cs`
2. A filter to compute the HMAC SHA256 hash of the request body: `./server/src/Partner.Api/Filters/BodySignatureFilter.cs`

The following code shows the reference implementation of the `NotificationApiController`:
https://github.com/Volue/spark-energy-coordination-partner-reference/blob/d2a4441c1dde525affabd95b893d698cc09afb34/aspnetcore-server/src/Partner.Api/Implementations/NotificationApiControllerImplementation.cs#L15-L54


## Generated .NET API Client
The code in the directory `./csharp/client` contains a C# API client for the Energy Coordination API. The library can be generated and used as a dependency in new or existing projects.

### Code generation commands
The C# API client was generated using the following commands:
```sh
cd csharp/client
export CSHARP_POST_PROCESS_FILE="dotnet csharpier"
openapi-generator-cli batch openapi-generator-config.yaml
```
This code can be added as a dependency to an existing project or integrated into a new project as needed.

### API CLI client
In order to test out the generated library code a new dotnet console project was added to the solution named `EnergyCoordinationClient.Cli` which creates a curl like interface to call the various API methods. Here are a few example usages:
```sh
# Go to the client library source
cd csharp/client/src/EnergyCoordinationClient.Cli
# Set OAUTH JWT token as environment variable:
export JWT_TOKEN="..."
# Use variable for setting the base URL to sandbox API
BASE_URL=https://api.sandbox.voluespark.com/energy-coordination/v1
dotnet run $BASE_URL UserApi GetUsersAsync 1 5
dotnet run $BASE_URL UserApi PostUserAsync '{"userId": "83342290-1ae6-4bb0-981c-733dc2a56aa0"}'
dotnet run $BASE_URL UserLocationsApi PostLocationAsync "83342290-1ae6-4bb0-981c-733dc2a56aa0" '{"locationId": "51f20c65-e530-4f72-b418-83e95fbd10ec", "locationType": "Residential", "meterPointIds": ["707057500000000000"]}'
dotnet run $BASE_URL UserLocationsApi UpdateLocationAsync "83342290-1ae6-4bb0-981c-733dc2a56aa0" "51f20c65-e530-4f72-b418-83e95fbd10ec" '{"locationId": "51f20c65-e530-4f72-b418-83e95fbd10ec", "locationType": "Residential", "meterPointIds": ["707057500000000001"]}'
dotnet run $BASE_URL UserLocationsApi PatchLocationAsync "83342290-1ae6-4bb0-981c-733dc2a56aa0" "51f20c65-e530-4f72-b418-83e95fbd10ec" '{"locationType": "Commercial"}'
dotnet run $BASE_URL UserLocationsApi DeleteLocationAsync "51f20c65-e530-4f72-b418-83e95fbd10ec"
dotnet run $BASE_URL UserApi DeleteUserByIdAsync "83342290-1ae6-4bb0-981c-733dc2a56aa0"
```
