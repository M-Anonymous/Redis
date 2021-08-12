package com.study.redis.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author lemon
 */
@Configuration
@EnableOpenApi
public class SwaggerConfig {

    private final String TITLE = "权限管理系统";
    private final String DESCRIPTION = "权限管理系统";
    private final String LICENSE = "";
    private final String VERSION = "1.0.0";
    private final String NAME = "Redis";
    private final String URL = "";
    private final String EMAIL = "";
    private final String SWAGGER_SCAN_BASE_PACKAGE = "com.study.redis";

    @Bean
    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(this.TITLE)
                .description(this.DESCRIPTION)
                .license(this.LICENSE)
                .termsOfServiceUrl(URL)
                .version(this.VERSION)
                .contact(new Contact(NAME, URL, EMAIL))
                .build();
    }

    @Bean
    public Docket api4Margin() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("Redis")
                .select()
                .apis(RequestHandlerSelectors.basePackage(this.SWAGGER_SCAN_BASE_PACKAGE))
                .paths(PathSelectors.regex("/**.*"))
                .build();
    }
}
