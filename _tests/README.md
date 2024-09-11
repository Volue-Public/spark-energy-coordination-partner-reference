# Integration Tests

This directory contains integration tests for running either a webhook server or an API client. These tests are designed to verify the correctness of the webhook signature implementation and the behavior of the API client for basic CRUD operations.

## Webhook Server Test
The `webhook-server-test.sh` script is designed to test the functionality of a webhook server by simulating incoming webhook notifications with pre-signed events. It checks that the server can validate the signatures of the incoming requests using the provided HMAC-SHA256 signatures.

### How it works
The script:
1. Starts the webhook server for a specified programming language
2. Loads a signing key from `signing-key.txt` and exports it as an environment variable.
3. Sends predefined webhook notification events (`*.json` files) from the `webhook-test-data` directory to the webhook server.
4. Each request includes a signature header (`x-payload-signature`), which is checked against the expected HMAC-SHA256 signature from the corresponding `.hmacsha256b64` file.
5. The test passes if the server validates all webhook requests without error. If validation fails, the script outputs the server logs and exits with an error.

### How to run the test
Run the script with the programming language of your webhook server (e.g., `csharp` or `java`):
```bash
./webhook-server-test.sh csharp
```

### Webhook Notifications Test Data
The `webhook-test-data` directory contains:
- `price-curve-event.json`, `user-eligibility-event.json`: Webhook notification payloads.
- `*.hmacsha256b64`: HMAC-SHA256 signatures of the JSON payloads, which can be used to verify the correctness of the request signature.
- `signing-key.txt`: The HMAC signing key used to generate the signatures.

The signature files were generated using the following command:
```bash
for file in *.json; do
    openssl sha256 -hex -mac HMAC -macopt key:$(cat signing-key.txt) -binary $file | base64 > $file.hmacsha256b64
done
```

You can modify or add more test event files in the `webhook-test-data` directory. Ensure you generate the corresponding HMAC-SHA256 signatures using the above command.

## API Client Test
The `cli-client-test.sh` script tests API client functionality by making a series of requests to the sandbox EnergyCoordination API using different user and location operations. The client can be built and run in different languages (`csharp`, `java`, or `typescript`).

### How it works
The script:
1. Accepts the target language (`csharp`, `java`, `typescript`) as the first argument.
2. Builds the client using the appropriate build command for the language.
3. Generates an OAuth2 token using the `CLIENT_ID` and `CLIENT_SECRET` (if not provided directly as `JWT_TOKEN`).
4. Executes a series of API operations:
   - Retrieve a list of users.
   - Create a new user.
   - Create a new location for that user.
   - Update the location.
   - Patch the location.
   - Delete the location.
   - Delete the user.

### How to run the test
1. Set the required environment variables:
   - `CLIENT_ID`: The client ID for the API.
   - `CLIENT_SECRET`: The client secret for the API.
   - `JWT_TOKEN` (optional): If you already have a valid token, you can set it directly instead of setting `CLIENT_ID` and `CLIENT_SECRET`
   - `BASE_PATH` (optional): Point to a different environment, defaults to: https://api.sandbox.voluespark.com/energy-coordination/v1
2. Run the script with the programming language of your API client (e.g., `csharp`, `java`, or `typescript`):
   ```bash
   ./cli-client-test.sh csharp
   ```
