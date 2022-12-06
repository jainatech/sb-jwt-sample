package com.sample.auth.jwt.json.web.token.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class JsonWebTokenSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonWebTokenSampleApplication.class, args);
	}

}
