package com.voluespark.energycoordination.cliclient;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.voluespark.energycoordination.client.api.ApiClient;
import com.voluespark.energycoordination.client.api.auth.HttpBearerAuth;
import java.beans.PropertyEditor;
import java.beans.PropertyEditorManager;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import reactor.core.publisher.Mono;

public class EnergyCoordinationClientCli {

  public static void main(String[] args) throws Exception {
    exitIf(args.length < 3, "Not enough arguments");

    String baseUrl = args[0];
    String apiName = args[1];
    String apiMethodName = args[2];
    String[] inputArguments = Arrays.stream(args).skip(3).toArray(String[]::new);

    ApiClient apiClient = new ApiClient();
    HttpBearerAuth bearer = (HttpBearerAuth) apiClient.getAuthentication("Bearer");
    bearer.setBearerToken(System.getenv("JWT_TOKEN"));
    apiClient.setBasePath(baseUrl);

    List<Class<?>> allApiClasses = getAllApiClasses();
    Optional<Class<?>> apiClass = allApiClasses.stream()
        .filter(c -> c.getSimpleName().equals(apiName))
        .findFirst();
    String classNames =
        allApiClasses.stream().map(Class::getSimpleName).collect(Collectors.joining("\n\t"));
    exitIf(apiClass.isEmpty(),
        "There is no API named " + apiName + " in the package. Available APIs:\n\t" + classNames);
    assert apiClass.isPresent();

    Optional<Method> apiMethod = Arrays.stream(apiClass.get().getMethods())
        .filter(m -> m.getName().equals(apiMethodName))
        .findAny();
    String methods = Arrays.stream(apiClass.get().getMethods())
        .filter(p -> p.getReturnType() == Mono.class)
        .map(Method::getName)
        .collect(Collectors.joining("\n\t"));
    exitIf(apiMethod.isEmpty(),
        "There is no method named " + apiMethodName + " in " + apiName + ", available methods:\n\t"
            + methods);
    assert apiMethod.isPresent();

    Parameter[] parameters = apiMethod.get().getParameters();
    String requiredArgs = Arrays.stream(apiMethod.get().getParameters())
        .map(p -> p.getName() + " " + p.getType().getName())
        .collect(Collectors.joining("\n\t"));
    exitIf(parameters.length > inputArguments.length,
        "Incorrect number of arguments provided. Required arguments:\n\t" + requiredArgs);

    Object apiInstance = apiClass.get().getConstructor(ApiClient.class).newInstance(apiClient);

    ObjectMapper objectMapper = apiClient.getObjectMapper();
    Object[] deserializedArgs = new Object[inputArguments.length];
    for (int i = 0; i < inputArguments.length; i++) {
      Class<?> paramType = parameters[i].getType();
      deserializedArgs[i] = deserializeArgument(objectMapper, paramType, inputArguments[i]);
    }

    Object apiResponse = apiMethod.get().invoke(apiInstance, deserializedArgs);
    if (apiResponse instanceof Mono<?> monoResponse) {
      apiResponse = monoResponse.block();
    }

    ObjectWriter prettyPrinter = objectMapper.writerWithDefaultPrettyPrinter();
    String jsonResponse = prettyPrinter.writeValueAsString(apiResponse);
    System.out.println(jsonResponse);
  }

  private static Object deserializeArgument(ObjectMapper objectMapper, Class<?> type, String value)
      throws JsonProcessingException {
    PropertyEditor editor = PropertyEditorManager.findEditor(type);
    if (editor != null) {
      editor.setAsText(value);
      return editor.getValue();
    }
    return objectMapper.readValue(value, type);
  }

  private static List<Class<?>> getAllApiClasses()
      throws IOException, ClassNotFoundException, URISyntaxException {
    String packageName = "com.voluespark.energycoordination.client.api";
    var classLoader = EnergyCoordinationClientCli.class.getClassLoader();
    String path = packageName.replace('.', '/');
    URI apiUrl = Collections.list(classLoader.getResources(path)).get(0).toURI();
    List<Path> files;
    if (apiUrl.getScheme().equals("jar")) {
      try (FileSystem fileSystem = FileSystems.newFileSystem(apiUrl, Map.of());
          Stream<Path> list = Files.list(fileSystem.getPath(path))) {
        files = list.toList();
      }
    } else {
      try (Stream<Path> list = Files.list(Path.of(apiUrl))) {
        files = list.toList();
      }
    }
    List<Class<?>> classes = new ArrayList<>();
    for (Path filePath : files) {
      String className = filePath.getFileName().toString();
      if (!className.endsWith("Api.class")) {
        continue;
      }
      classes.add(Class.forName(packageName + "." + className.replace(".class", "")));
    }
    return classes;
  }

  private static void exitIf(boolean condition, String errorMessage) {
    if (condition) {
      System.err.println(errorMessage);
      System.out.println("\nArguments: <API url> <API name> <API method> [method arguments]");
      System.exit(1);
    }
  }
}
