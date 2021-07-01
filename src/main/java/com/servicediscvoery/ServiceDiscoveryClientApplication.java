package com.servicediscvoery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@EnableScheduling
@SpringBootApplication
public class ServiceDiscoveryClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDiscoveryClientApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
