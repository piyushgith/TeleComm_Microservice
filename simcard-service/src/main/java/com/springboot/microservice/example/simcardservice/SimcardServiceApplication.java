package com.springboot.microservice.example.simcardservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@EnableDiscoveryClient
@SpringBootApplication
public class SimcardServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimcardServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner init(SimCardRepository simCardRepository) {
		return args -> {
			List<SimCard> simCardList = new ArrayList<>();
			simCardList.add(new SimCard(1, 9009009001L, 9009009001478L, "Valid", "active"));
			simCardList.add(new SimCard(2, 9009009002L, 9009009006589L, "Valid", "inactive"));
			simCardList.add(new SimCard(3, 9009009003L, 9009009006324L, "Invalid", "inactive"));
			simCardList.add(new SimCard(4, 9009009004L, 9009009007106L, "Valid", "active"));

			simCardList.forEach(x -> {
				simCardRepository.save(x);
			});
		};

	}

}
