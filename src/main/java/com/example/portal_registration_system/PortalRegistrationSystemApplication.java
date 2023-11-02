package com.example.portal_registration_system;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

@SpringBootApplication
@SecurityScheme(name = "javainuseapi",
        scheme = "basic", type = SecuritySchemeType.HTTP, in = SecuritySchemeIn.HEADER)
public class PortalRegistrationSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(PortalRegistrationSystemApplication.class, args);
    }

    @Bean
    public MethodValidationPostProcessor
    methodValidationPostProcessor() {
        return new MethodValidationPostProcessor();
    }
}
