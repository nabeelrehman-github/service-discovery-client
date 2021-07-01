package com.servicediscvoery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableDiscoveryClient
@EnableScheduling
@EnableAutoConfiguration
@SpringBootApplication
public class ServiceDiscoveryClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDiscoveryClientApplication.class, args);
	}

}
