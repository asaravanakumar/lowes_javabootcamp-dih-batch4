package com.labs.sboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
//@ComponentScan
//@Configuration
//@EnableAutoConfiguration
public class SbootCoreLabsApplication {

	private static Logger log = LoggerFactory.getLogger(SbootCoreLabsApplication.class);

	public static void main(String[] args) {


		ApplicationContext ctx = SpringApplication.run(SbootCoreLabsApplication.class, args);

		log.info("Bean Count: {}", ctx.getBeanDefinitionCount());

		Arrays.stream(ctx.getBeanDefinitionNames()).forEach(bname -> log.info(bname));

		Greetings greetings = ctx.getBean("greetings", Greetings.class);

		log.info(greetings.getMessage());
	}

//	@Bean
//	public Greetings greetings() {
//		return new Greetings("Welcome to Spring Boot");
//	}
}
