package com.example.etudiantservice.service;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI etudiantServiceOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Etudiant Service API")
                        .description("Microservice for managing students with One-to-Many relationship with Filiere")
                        .version("v1.0")
                        .contact(new Contact()
                                .name("Your Name")
                                .email("your-email@example.com")));
    }
}
