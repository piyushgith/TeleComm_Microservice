package com.springboot.microservice.example.simcardservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimcardController {

	@GetMapping("/hi")
	public String sayHello() {
		return "Hi from SimcardController !!";
	}

}
