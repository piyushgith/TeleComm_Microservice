package com.springboot.microservice.example.customerservice;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import com.springboot.microservice.example.customerservice.entity.Customervalidation;
import com.springboot.microservice.example.customerservice.repository.CustomerRepository;

@SpringBootApplication
@EnableDiscoveryClient
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
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
	CommandLineRunner init(CustomerRepository customerRepository) {
		return args -> {
			List<Customervalidation> list = new ArrayList<>();
			list.add(new Customervalidation(1, 9009009001L, "Piyush", "Prasad", "piyush@gmail.com", new Date(),
					"BSEFYHF485", "Bangalore", "560100"));

			list.forEach(x -> {
				customerRepository.save(x);
			});
		};
	}

}
