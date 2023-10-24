package com.gabriel.microservices.auth;

import org.gabriel.microservices.core.property.JwtConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableConfigurationProperties(value = JwtConfiguration.class)
@EntityScan({"org.gabriel.microservices.core.model"})
@EnableJpaRepositories({"org.gabriel.microservices.core.repository"})
public class AuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthApplication.class, args);
	}

}
