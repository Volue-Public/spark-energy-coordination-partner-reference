import { argv, stderr, exit, env } from "process";
import apis from "../dist/apis/index.js";
import { Configuration } from "../dist/runtime.js";

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
            return parseFloat(value);
        } else if (value.toLowerCase() === "true" || value.toLowerCase() === "false") {
            return value.toLowerCase() === "true";
        } else {
            return JSON.parse(value);
        }
    } catch (e) {
        return value;
    }
}

exitIf(argv.length < 5, "Not enough arguments");

const baseUrl = argv[2];
const apiName = argv[3];
const apiMethodName = argv[4];
const inputArguments = argv.slice(5);

const apiClass = Object.entries(apis).find(api => api[0] === apiName)[1]
const availableApis = Object.keys(apis).join(", ")
exitIf(!apiClass, `No API named ${apiName} found. Available APIs: ${availableApis}`);

const jwtToken = env.JWT_TOKEN;
exitIf(!jwtToken, "JWT_TOKEN environment variable is not set");
const config = new Configuration({ basePath: baseUrl, accessToken: jwtToken });
const apiInstance = new apiClass(config);
const apiMethod = apiInstance[apiMethodName + "Raw"];
exitIf(!apiMethod, `No method named ${apiMethodName} found in ${apiName}.`);

const requiredMatches = (apiMethod+'').matchAll(/requestParameters\['(\w+)'\] == null/g);
const requiredParams = Array.from(requiredMatches, m => m[1]);
const optionalMatches = (apiMethod+'').matchAll(/requestParameters\['(\w+)'\] != null/g);
const optionalParams = Array.from(optionalMatches, m => m[1]);
const allParamsFormatted = [
    ...requiredParams,
    ...optionalParams.map(p => `${p}?`)
].join(', ');
exitIf(
    inputArguments.length < requiredParams.length ||
        inputArguments.length > requiredParams.length + optionalParams.length,
    `Incorrect number of arguments provided. Parameters: ${allParamsFormatted}`,
);

const deserializedArguments = inputArguments.map(arg => deserializeValue(arg));
const requestParameters = {};
for (let i = 0; i < requiredParams.length; i++) {
    requestParameters[requiredParams[i]] = deserializedArguments[i];
}
for (let i = 0; i + requiredParams.length < deserializedArguments.length; i++) {
    requestParameters[optionalParams[i]] = deserializedArguments[i + requiredParams.length];
}

try {
    const response = await apiMethod.apply(apiInstance, [requestParameters, null]);
    if (response.raw.ok !== true) {
        throw new Error("Not OK response: " + response.raw);
    }
    console.log(JSON.stringify(await response.value(), null, 2));
} catch (error) {
    stderr.write(`API call failed: ${error.message}\n`);
    stderr.write(error);
    exit(1);
}
