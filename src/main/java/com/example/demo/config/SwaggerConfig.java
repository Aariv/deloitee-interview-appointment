package com.example.demo.config;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	/**
	 * 
	 * @return the cdmp-hbase-api-1.0 group apis
	 */
	@Bean
	public Docket hbaseClientApi10() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("deloitee-api-1.0").select()
				.apis(RequestHandlerSelectors.basePackage("com.example.demo.rest")).paths(regex("/api/v1.*"))
				.build().apiInfo(apiInfo());

	}

	/**
	 * 
	 * @return apiInfo of the organization.
	 */
	private ApiInfo apiInfo() {
		return new ApiInfo("Deloitee Appointment API", "Rest API for Deloitee", "v1.0", "Terms of service",
				new Contact("Arivazhagan", "https://github.com/Aariv", "arivbits@gmail.com"), "Apache License Version 2.0",
				"https://www.apache.org/licenses/LICENSE-2.0");
	}
}