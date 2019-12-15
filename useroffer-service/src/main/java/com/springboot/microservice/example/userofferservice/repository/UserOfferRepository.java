package com.springboot.microservice.example.userofferservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.microservice.example.userofferservice.entity.UserOffer;

@Repository
public interface UserOfferRepository extends JpaRepository<UserOffer, Integer> {

}
