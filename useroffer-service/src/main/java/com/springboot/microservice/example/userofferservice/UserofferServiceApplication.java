package com.springboot.microservice.example.userofferservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import com.springboot.microservice.example.userofferservice.entity.UserOffer;
import com.springboot.microservice.example.userofferservice.repository.UserOfferRepository;

@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
public class UserofferServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserofferServiceApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate getTemplate() {
		HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();
		clientHttpRequestFactory.setConnectionRequestTimeout(3000);
		clientHttpRequestFactory.setConnectTimeout(3000);
		return new RestTemplate(clientHttpRequestFactory);
	}

	@Bean
	CommandLineRunner init(UserOfferRepository userOfferRepository) {
		return args -> {
			List<UserOffer> list = new ArrayList<>();
			list.add(new UserOffer(1, 9009009001L, "10000 Minute", "1000 GB"));
			list.add(new UserOffer(2, 9009009002L, "20000 Minute", "10 GB"));
			list.add(new UserOffer(3, 9009009003L, "1000 Minute", "1 GB"));
			list.add(new UserOffer(4, 9009009004L, "120000 Minute", "200 GB"));

			list.forEach(x -> {
				userOfferRepository.save(x);
			});
		};
	}

}
