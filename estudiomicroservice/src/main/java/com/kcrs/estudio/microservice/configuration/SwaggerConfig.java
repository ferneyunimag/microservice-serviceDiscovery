package com.kcrs.estudio.microservice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableWebMvc
@EnableSwagger2
public class SwaggerConfig {

    private static ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Client Microservice system ")
                .description("Microservice Client Persistency system ")
                .license("Apache 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0")
                .termsOfServiceUrl("")
                .version("1.0.0")
                .build();
    }

    @Bean
    public Docket customImplementation() {
        return new Docket(DocumentationType.OAS_30)
                //.tags(new Tag("accounts", "accounts related"))
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.kcrs.estudio.microservice"))
                .build()
                .apiInfo(apiInfo());
    }

}

