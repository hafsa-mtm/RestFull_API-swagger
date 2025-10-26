package com.example.filiereservice.service;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI filiereServiceOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Filiere Service API")
                        .description("Microservice for managing academic programs (Filieres)")
                        .version("v1.0")
                        .contact(new Contact()
                                .name("Your Name")
                                .email("your-email@example.com")));
    }
}
