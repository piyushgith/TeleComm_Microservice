package com.springboot.microservice.example.customerservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.microservice.example.customerservice.entity.Customervalidation;
import com.springboot.microservice.example.customerservice.repository.CustomerRepository;

@RestController
@RequestMapping("customer-service")
public class CustomerController {

	@Autowired
	private CustomerRepository customerRepository;

	@GetMapping("/findAll")
	public ResponseEntity<List<Customervalidation>> getAll() {

		return new ResponseEntity<List<Customervalidation>>(customerRepository.findAll(), HttpStatus.OK);

	}

}
