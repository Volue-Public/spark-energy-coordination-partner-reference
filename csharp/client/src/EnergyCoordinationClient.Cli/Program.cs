using System.ComponentModel;
using System.Reflection;
using EnergyCoordinationClient.Client;
using Newtonsoft.Json;

var jsonSerializerSettings = new ApiClient().SerializerSettings;
var jsonSerializer = JsonSerializer.Create(jsonSerializerSettings);

var cliArgs = Environment.GetCommandLineArgs();
ExitIf(cliArgs.Length < 4, "Not enough arguments");

var baseUrl = cliArgs[1];
var apiName = cliArgs[2];
var apiMethodName = cliArgs[3];
var inputArguments = cliArgs.Skip(4).ToArray();

var assembly = Assembly.Load("EnergyCoordinationClient");
var apiTypes = assembly
    .GetTypes()
    .Where(t => !t.IsInterface && t.Name.EndsWith("Api", StringComparison.Ordinal))
    .ToArray();
var apiType = apiTypes.FirstOrDefault(t => t.Name == apiName);
var allApis = string.Join("\n\t", apiTypes.Select(t => t.Name).ToArray());
ExitIf(
    apiType == null,
    $"There is no API named {apiName} in the assembly {assembly}. Available APIs:\n\t{allApis}"
);

// Need to map from endpoint name to method name, ie getUsers -> GetUsersAsync
var methodMap = apiType!
    .GetMethods()
    .Where(m => m.Name.EndsWith("Async", StringComparison.Ordinal))
    .ToDictionary(m => char.ToLower(m.Name[0]) + m.Name.Substring(1, m.Name.Length - 6), m => m);

var allMethods = string.Join("\n\t", methodMap.Keys.ToArray());
ExitIf(
    !methodMap.ContainsKey(apiMethodName),
    $"There is no method named {apiMethodName} in {apiName}, available methods:\n\t{allMethods}"
);

var method = methodMap[apiMethodName];
var parameters = method.GetParameters();
var requiredArgs = parameters.Where(a => !a.HasDefaultValue).ToArray();
var allArgs = string.Join(
    "\n\t",
    parameters
        .Where(t => t.ParameterType != typeof(CancellationToken))
        .Select(a => $"{a.Name}{(a.HasDefaultValue ? "?" : "")} {a.ParameterType}")
        .ToArray()
);
ExitIf(
    requiredArgs.Length > inputArguments.Length,
    $"Incorrect number of arguments provided. All possible arguments:\n\t{allArgs}"
);

var constructor = apiType.GetConstructor([typeof(Configuration)]);
ExitIf(constructor == null, $"Unable to find constructor for {apiName} with configuration");

var config = new Configuration()
{
    AccessToken = Environment.GetEnvironmentVariable("JWT_TOKEN")!,
    BasePath = baseUrl,
};
var api = constructor!.Invoke([config])!;
var inputArgumentValues = inputArguments
    .Select((s, i) => DeserializeValue(jsonSerializer, s, parameters[i].ParameterType))
    .ToArray();
var defaultArgumentValues = method
    .GetParameters()
    .Skip(inputArgumentValues.Length)
    .Select(p => p.DefaultValue)
    .ToArray();
var apiReturn = method.Invoke(api, [.. inputArgumentValues, .. defaultArgumentValues]);
ExitIf(apiReturn is not Task, $"Invalid api method not async: {apiName}");

var task = (Task)apiReturn!;
await ((Task)apiReturn!).ConfigureAwait(false);
var result = task.GetType().GetProperty("Result")?.GetValue(task);

Console.WriteLine(JsonConvert.SerializeObject(result, Formatting.Indented, jsonSerializerSettings));

static void ExitIf(bool condition, string errorMessage)
{
    if (condition)
    {
        var cliArgs = Environment.GetCommandLineArgs();
        Console.Error.WriteLine(errorMessage);
        Console.WriteLine(
            $"\nUsage: {cliArgs[0]} <API url> <API name> <API method> [method arguments]"
        );
        Environment.Exit(1);
    }
}

static object? DeserializeValue(JsonSerializer jsonSerializer, string value, Type type)
{
    var typeConverter = TypeDescriptor.GetConverter(type);
    return typeConverter != null && typeConverter.CanConvertFrom(typeof(string))
        ? typeConverter.ConvertFromString(value)
        : jsonSerializer.Deserialize(new StringReader(value), type);
}
