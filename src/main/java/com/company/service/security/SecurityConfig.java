package com.company.service.security;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SecurityConfig extends WebSecurityConfigurerAdapter{
	

	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	
	}

//	CredentialsProvider provider = new BasicCredentialsProvider();
//	UsernamePasswordCredentials credentials = new UsernamePasswordCredentials(username, password);
//	provider.setCredentials(AuthScope.ANY, credentials);
//
//	HttpClient client = HttpClientBuilder.create().setDefaultCredentialsProvider(provider).build();
//
//	@Autowired
//	RestTemplate restTemplate;
//
//	HttpHeaders headers = new HttpHeaders();
//	headers.setContentType(MediaType.APPLICATION_JSON);
//	headers.setBasicAuth(username, password);
//
//	HttpEntity<String> request = new HttpEntity<>(body, headers);
//	ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, request, String.class);
//	
//	
	

}
