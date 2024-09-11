package com.voluespark.energycoordination.partnerapi.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfiguration {

  @Bean(
      name =
          "com.voluespark.energycoordination.partnerapi.configuration.SpringDocConfiguration.apiInfo")
  OpenAPI apiInfo() {
    return new OpenAPI()
        .info(
            new Info()
                .title("Partner webhook API")
                .description(
                    "A minimal OpenAPI spec with one POST endpoint to receive notifications from"
                        + " Spark energy-coordination.")
                .version("1.0.0"));
  }
}
