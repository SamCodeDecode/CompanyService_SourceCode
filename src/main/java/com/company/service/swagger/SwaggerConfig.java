package com.company.service.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket getDoket() {
		
		return new Docket(DocumentationType.SWAGGER_2)
				.select()   //select API
				.apis(RequestHandlerSelectors.any()) //Select Any i.e all API
				.paths(PathSelectors.any())   //All paths
				.build() 
				.apiInfo(getApiInfo());
	}
	
	   private ApiInfo getApiInfo() {
	        return new ApiInfoBuilder()
	                .title("My API")
	                .description("API for my project")
	                .version("1.0")
	                .build();
	    }
}
