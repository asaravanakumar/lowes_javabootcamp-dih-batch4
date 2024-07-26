package com.labs.scloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ScloudRegistryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScloudRegistryServiceApplication.class, args);
	}

}
