# Java reference implementation
This directory contains reference implementations of a Java webhook API server and an API client library.
* [Server](./server)
* [Client](./client)

## Required tools
The generated code is formatted using [google-java-format](https://github.com/google/google-java-format)
To run the following commands you need [openapi-generator-cli](https://openapi-generator.tech/docs/installation) and [maven](https://learn.microsoft.com/en-us/dotnet/core/install/) for downloading the formatting tool.

## Generated Java webhook API server
The code in the directory [`./server`](./server) contains a Java Spring Boot API which serves as a reference implementation for receiving notification notifications via webhooks.

### Running the server
In order to run the server you can run the following command:
```sh
cd java/server
mvn clean install
SIGNING_KEY="Secret123%" java -jar target/partnerapi-1.0.0.jar
```
This will start a server on port 8080, and a swagger UI is available at [http://localhost:8080/openapi/index.html](http://localhost:8080/openapi/index.html).
The `SIGNING_KEY` is the secret used for verifying the payload signatures of the notifications the API receives.

### Code generation commands
The server API was generated using the following commands:
```sh
cd java/server
# Download code formatter
mvn dependency:copy -Dartifact=com.google.googlejavaformat:google-java-format:LATEST:jar:all-deps -DoutputDirectory=target -Dmdep.stripVersion
export JAVA_POST_PROCESS_FILE="java -jar target/google-java-format-all-deps.jar -i"
openapi-generator-cli batch openapi-generator-config.yaml
```

This generates an interface named `NotifyApi` for receiving the notification events.

### Modifications added to the generated code
In order to implement the code that handles the received notification event you need to implement the `NotifyApi` interface.
The following files were added to the generated project in order to implement the functionality of receiveing a notification event properly:
1. An implementation of the `NotifyApi` interface: `./server/src/main/java/com/voluespark/partnerapi/api/NotifyApiController.java`
2. A filter to compute the HMAC SHA256 hash of the request body: `./server/src/main/java/com/voluespark/partnerapi/filters/BodySignatureFilter.java`
3. A test to verify the implementation: `./server/src/test/java/com/voluespark/partnerapi/api/NotifyApiControllerTest.java`

The following code shows the reference implementation of the `NotifyApi`:
TODO: replace with actual code

## Generated Java API client
The code in the directory `./java/client` contains a Java API client for the Energy Coordination API. The library can be generated and used as a dependency in new or existing projects.

### Code generation commands
The Java API client was generated using the following commands:
```sh
cd java/client
# Download code formatter
mvn dependency:copy -Dartifact=com.google.googlejavaformat:google-java-format:LATEST:jar:all-deps -DoutputDirectory=target -Dmdep.stripVersion
export JAVA_POST_PROCESS_FILE="java -jar target/google-java-format-all-deps.jar -i"
openapi-generator-cli batch openapi-generator-config.yaml
```

### API CLI client
In order to test out the generated library code a new maven project was added to the directory named `cli-client` which creates a curl like interface to call the various API methods. Here are a few example usages:
```sh
cd cli-client
mvn clean package
# Set OAUTH JWT token as environment variable:
export JWT_TOKEN="..."
# Use variable for setting the base URL to sandbox API
BASE_URL=https://api.sandbox.voluespark.com/energy-coordination/v1
JAR_FILE=target/cli-client-v1-jar-with-dependencies.jar
java -jar $JAR_FILE $BASE_URL UserApi getUsers 1 5
java -jar $JAR_FILE $BASE_URL UserApi postUser '{"userId": "83342290-1ae6-4bb0-981c-733dc2a56aa0"}'
java -jar $JAR_FILE $BASE_URL UserLocationsApi postLocation "83342290-1ae6-4bb0-981c-733dc2a56aa0" '{"locationId": "51f20c65-e530-4f72-b418-83e95fbd10ec", "locationType": "Residential", "meterPointIds": ["707057500000000000"]}'
java -jar $JAR_FILE $BASE_URL UserLocationsApi updateLocation "83342290-1ae6-4bb0-981c-733dc2a56aa0" "51f20c65-e530-4f72-b418-83e95fbd10ec" '{"locationId": "51f20c65-e530-4f72-b418-83e95fbd10ec", "locationType": "Residential", "meterPointIds": ["707057500000000001"]}'
java -jar $JAR_FILE $BASE_URL UserLocationsApi patchLocation "83342290-1ae6-4bb0-981c-733dc2a56aa0" "51f20c65-e530-4f72-b418-83e95fbd10ec" '{"locationType": "Commercial"}'
java -jar $JAR_FILE $BASE_URL UserLocationsApi deleteLocation "51f20c65-e530-4f72-b418-83e95fbd10ec"
java -jar $JAR_FILE $BASE_URL UserApi deleteUserById "83342290-1ae6-4bb0-981c-733dc2a56aa0"
```
