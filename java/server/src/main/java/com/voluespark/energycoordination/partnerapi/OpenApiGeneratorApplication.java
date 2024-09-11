package com.voluespark.energycoordination.partnerapi;

import com.fasterxml.jackson.databind.Module;
import org.openapitools.jackson.nullable.JsonNullableModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FullyQualifiedAnnotationBeanNameGenerator;

@SpringBootApplication(nameGenerator = FullyQualifiedAnnotationBeanNameGenerator.class)
@ComponentScan(
    basePackages = {
      "com.voluespark.energycoordination.partnerapi",
      "com.voluespark.energycoordination.partnerapi.api",
      "com.voluespark.energycoordination.partnerapi.configuration"
    },
    nameGenerator = FullyQualifiedAnnotationBeanNameGenerator.class)
public class OpenApiGeneratorApplication {

  public static void main(String[] args) {
    SpringApplication.run(OpenApiGeneratorApplication.class, args);
  }

  @Bean(
      name =
          "com.voluespark.energycoordination.partnerapi.OpenApiGeneratorApplication.jsonNullableModule")
  public Module jsonNullableModule() {
    return new JsonNullableModule();
  }
}
