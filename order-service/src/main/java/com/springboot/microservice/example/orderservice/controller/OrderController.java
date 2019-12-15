package com.springboot.microservice.example.orderservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.microservice.example.orderservice.entity.OrderDetails;
import com.springboot.microservice.example.orderservice.repository.OrderDetailsRepository;

@RestController
@RequestMapping("order-service")
public class OrderController {

	@Autowired
	private OrderDetailsRepository orderDetailsRepository;

	@GetMapping("/findAll")
	public ResponseEntity<List<OrderDetails>> getAll() {

		return new ResponseEntity<List<OrderDetails>>(orderDetailsRepository.findAll(), HttpStatus.OK);
	}

}
