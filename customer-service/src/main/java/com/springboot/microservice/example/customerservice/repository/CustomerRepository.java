package com.springboot.microservice.example.customerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.microservice.example.customerservice.entity.Customervalidation;

@Repository
public interface CustomerRepository extends JpaRepository<Customervalidation, Integer> {

}
