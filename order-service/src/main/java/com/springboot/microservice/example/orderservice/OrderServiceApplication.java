package com.springboot.microservice.example.orderservice;

import java.util.ArrayList;
import java.util.Date;
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

import com.springboot.microservice.example.orderservice.entity.OrderDetails;
import com.springboot.microservice.example.orderservice.repository.OrderDetailsRepository;

@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
public class OrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
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
	CommandLineRunner init(OrderDetailsRepository OrderDetailsRepository) {
		return init -> {
			List<OrderDetails> list = new ArrayList<>();
			list.add(new OrderDetails(1, 9009009001L, "Piyush", "Prasad", "piyush@gmail.com", new Date(), "Activated"));
			list.add(new OrderDetails(2, 9009009002L, "Ram", "Singh", "ram@protonmail.com", new Date(), "Not Activated"));

			OrderDetailsRepository.saveAll(list);
		};

	}

}
