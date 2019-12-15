package com.springboot.microservice.example.userofferservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.microservice.example.userofferservice.entity.UserOffer;
import com.springboot.microservice.example.userofferservice.repository.UserOfferRepository;
import com.springboot.microservice.example.userofferservice.response.UserOfferResponse;

@RestController
@RequestMapping("/useroffer-service")
public class UserOfferController {

	@Autowired
	private UserOfferRepository userOfferRepository;

	@GetMapping("/findAll")
	public ResponseEntity<List<UserOffer>> getAll() {

		return new ResponseEntity<List<UserOffer>>(userOfferRepository.findAll(), HttpStatus.OK);
	}

	@GetMapping("/{simNumber}/find")
	public ResponseEntity<UserOfferResponse> findOfferforNumber(@PathVariable("simNumber") Long simNumber) {

		UserOffer userOffer = userOfferRepository.findBySimcardNumber(simNumber);

		UserOfferResponse userOfferResponse = new UserOfferResponse(userOffer.getId(), userOffer.getSimcardNumber(),
				userOffer.getCallOffer(), userOffer.getDataOffer());

		return new ResponseEntity<UserOfferResponse>(userOfferResponse, HttpStatus.OK);
	}

}
