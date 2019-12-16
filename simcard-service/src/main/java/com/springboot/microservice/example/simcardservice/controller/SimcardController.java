package com.springboot.microservice.example.simcardservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.springboot.microservice.example.simcardservice.entity.SimCard;
import com.springboot.microservice.example.simcardservice.repository.SimCardRepository;
import com.springboot.microservice.example.simcardservice.response.UserOfferResponse;

@RestController
@RequestMapping("simcard-service")
public class SimcardController {

	@Autowired
	private SimCardRepository simCardRepository;

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/hi")
	public String sayHello() {
		return "Hi from SimcardController !!";
	}

	@GetMapping("/findAll")
	public ResponseEntity<List<SimCard>> searchAll() {
		return new ResponseEntity<List<SimCard>>(simCardRepository.findAll(), HttpStatus.OK);
	}

	@GetMapping("/{simNumber}/find")
	public UserOfferResponse findSimData(@PathVariable("simNumber") Long simNumber) {

		String URL="http://USER-OFFER-SERVICE/useroffer-service/9009009001/find";
		
		UserOfferResponse userOfferResponse = restTemplate.getForObject(URL, UserOfferResponse.class);

		return userOfferResponse != null ? userOfferResponse : null;

	}
}
