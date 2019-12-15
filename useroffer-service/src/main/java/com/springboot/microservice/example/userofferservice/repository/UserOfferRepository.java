package com.springboot.microservice.example.userofferservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springboot.microservice.example.userofferservice.entity.UserOffer;

@Repository
public interface UserOfferRepository extends JpaRepository<UserOffer, Integer> {

	@Query("select u from UserOffer u where u.simcardNumber=:simNumber")
	public UserOffer findBySimcardNumber(Long simNumber);

}
