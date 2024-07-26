package com.labs.scloud;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.http.ResponseEntity;

@Slf4j
@EnableFeignClients
@SpringBootApplication
public class ScloudOpenfeignClientApplication implements CommandLineRunner {

//	private Logger log = LoggerFactory.getLogger(ScloudOpenfeignClientApplication.class);

	@Autowired
	GreetingsService greetingsService;

	public static void main(String[] args) {
		SpringApplication.run(ScloudOpenfeignClientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		for(int i=0; i < 4; i++) {
			ResponseEntity<String> response = greetingsService.greetings();
			log.info(response.getBody());
		}
	}
}
