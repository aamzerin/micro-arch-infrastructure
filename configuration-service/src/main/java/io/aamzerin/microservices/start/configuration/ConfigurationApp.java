package io.aamzerin.microservices.start.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConfigurationApp {

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationApp.class, args);
	}
}