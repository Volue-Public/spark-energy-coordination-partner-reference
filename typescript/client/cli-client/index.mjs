import { argv, stderr, exit, env } from "process";
import { APIS } from "../dist/api/apis.js";
import { HttpBearerAuth } from "../dist/model/models.js";

function exitIf(condition, errorMessage) {
    if (condition) {
        stderr.write(`${errorMessage}\n`);
        console.log(`Usage: ${argv[1]} <API url> <API name> <API method> [method arguments]`);
        exit(1);
    }
}

function deserializeValue(value) {
    try {
        if (!isNaN(value)) {
            return parseFloat(value);  // Convert to number if applicable
        } else if (value.toLowerCase() === "true" || value.toLowerCase() === "false") {
            return value.toLowerCase() === "true";  // Convert to boolean if applicable
        } else {
            return JSON.parse(value);  // Try to parse as JSON (for objects)
        }
    } catch (e) {
        return value;  // If parsing fails, return as string
    }
}

exitIf(argv.length < 5, "Not enough arguments");

const baseUrl = argv[2];
const apiName = argv[3];
const apiMethodName = argv[4];
const inputArguments = argv.slice(5);

const apiClass = APIS.find(api => api.name === apiName);
const availableApis = APIS.map(api => api.name).join(", ")
exitIf(!apiClass, `No API named ${apiName} found. Available APIs: ${availableApis}`);
const apiInstance = new apiClass(baseUrl);

const jwtToken = env.JWT_TOKEN;
exitIf(!jwtToken, "JWT_TOKEN environment variable is not set");
const bearerAuth = new HttpBearerAuth();
bearerAuth.accessToken = jwtToken;
apiInstance.setDefaultAuthentication(bearerAuth);

const apiMethod = apiInstance[apiMethodName];
exitIf(!apiMethod, `No method named ${apiMethodName} found in ${apiName}.`);

// Function to get parameter names copied from: https://stackoverflow.com/a/31194949
const methodParams = (apiMethod + '')
    .replace(/[/][/].*$/mg, '') // strip single-line comments
    .replace(/\s+/g, '') // strip white space
    .replace(/[/][*][^/*]*[*][/]/g, '') // strip multi-line comments
    .split('){', 1)[0].replace(/^[^(]*[(]/, '') // extract the parameters
    .split(',').filter(Boolean) // split & filter
    .join(", ");
exitIf(
    inputArguments.length < apiMethod.length,
    `Incorrect number of arguments provided. Expected: ${methodParams}`
);

const deserializedArguments = inputArguments.map(arg => deserializeValue(arg));

try {
    const response = await apiMethod.apply(apiInstance, deserializedArguments);
    console.log(JSON.stringify(response.body, null, 2));
} catch (error) {
    stderr.write(`API call failed: ${error.message}\n`);
    exit(1);
}
