package com.springboot.microservice.example.simcardservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/simcard-service")
public class SimcardController {

	@Autowired
	private SimCardRepository simCardRepository;

	@GetMapping("/hi")
	public String sayHello() {
		return "Hi from SimcardController !!";
	}

	@GetMapping("/findAll")
	public ResponseEntity<List<SimCard>> searchAll() {
		return new ResponseEntity<List<SimCard>>(simCardRepository.findAll(), HttpStatus.OK);
	}
	
	
}
