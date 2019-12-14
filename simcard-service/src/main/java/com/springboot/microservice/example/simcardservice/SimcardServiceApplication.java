package com.springboot.microservice.example.simcardservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class SimcardServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimcardServiceApplication.class, args);
	}

}
