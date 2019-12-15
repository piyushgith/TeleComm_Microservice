package com.springboot.microservice.example.simcardservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.microservice.example.simcardservice.entity.SimCard;

@Repository
public interface SimCardRepository extends JpaRepository<SimCard, Integer> {

}
