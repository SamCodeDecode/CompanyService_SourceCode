package com.company.service;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.codec.ServerCodecConfigurer;
import org.springframework.web.client.RestTemplate;
import org.springframework.cloud.client.loadbalancer.*;

@EnableEurekaClient
@SpringBootApplication
@EnableCaching
public class CompanyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanyServiceApplication.class, args);
//		SpringApplication app=new SpringApplication(CompanyServiceApplication.class);
//		app.setDefaultProperties(null);
//		app.run(args);
		
	}

	@LoadBalanced 
	@Bean
	public RestTemplate restTemp() {

		return new RestTemplate();
	}
	
	
	@Bean
	public ServerCodecConfigurer serverCodecConfigurer() {
	    return ServerCodecConfigurer.create();
	}

//	
//	@Bean
//	public CacheManager cache() {
//		
//		return new SimpleCacheManager();
//	}

}
