package com.springboot.microservice.example.userofferservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.microservice.example.userofferservice.entity.UserOffer;
import com.springboot.microservice.example.userofferservice.repository.UserOfferRepository;

@RestController
@RequestMapping("/useroffer-service")
public class UserOfferController {

	@Autowired
	private UserOfferRepository userOfferRepository;

	@GetMapping("/findAll")
	public ResponseEntity<List<UserOffer>> getAll() {

		return new ResponseEntity<List<UserOffer>>(userOfferRepository.findAll(), HttpStatus.OK);
	}

}
