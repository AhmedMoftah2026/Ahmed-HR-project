package com.ahmed.hr.base;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;

@Configuration

public class SwaggerConfigration {
	
	
@Bean
 OpenAPI baseOpenAPI() {
    return new OpenAPI().info(new io.swagger.v3.oas.models.info.Info()
            .title("Title")
            .version("1.0.0").description("Description"));

}
}

