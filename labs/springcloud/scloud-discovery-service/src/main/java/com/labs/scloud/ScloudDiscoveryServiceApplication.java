package com.labs.scloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@EnableDiscoveryClient
@SpringBootApplication
public class ScloudDiscoveryServiceApplication implements CommandLineRunner {

	private Logger log = LoggerFactory.getLogger(ScloudDiscoveryServiceApplication.class);

	@Autowired
	DiscoveryClient discoveryClient;

	public static void main(String[] args) {
		SpringApplication.run(ScloudDiscoveryServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<ServiceInstance> serviceInstances = discoveryClient.getInstances("scloud-greetings-service");
		log.info("No of service instances - {}", serviceInstances.size());


		serviceInstances.stream()
				.map(service -> service.getUri())
				.forEach(uri -> {log.info(uri.toString());
									var res = RestClient.create(uri + "/greetings")
											.get()
											.retrieve()
											.body(String.class);
									log.info(res);
								});
	}
}
