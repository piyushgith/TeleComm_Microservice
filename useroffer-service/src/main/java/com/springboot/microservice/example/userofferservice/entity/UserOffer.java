package com.springboot.microservice.example.userofferservice.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Useroffer")
public class UserOffer implements Serializable {

	private static final long serialVersionUID = -2848638526625039877L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "simcardNumber", length = 10, nullable = true)
	private Long simcardNumber;

	@Column(name = "callOffer", length = 20, nullable = false)
	private String callOffer;

	@Column(name = "dataOffer", length = 10, nullable = false)
	private String dataOffer;

	public UserOffer() {

	}

	public UserOffer(int id, Long simcardNumber, String callOffer, String dataOffer) {
		super();
		this.id = id;
		this.simcardNumber = simcardNumber;
		this.callOffer = callOffer;
		this.dataOffer = dataOffer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Long getSimcardNumber() {
		return simcardNumber;
	}

	public void setSimcardNumber(Long simcardNumber) {
		this.simcardNumber = simcardNumber;
	}

	public String getCallOffer() {
		return callOffer;
	}

	public void setCallOffer(String callOffer) {
		this.callOffer = callOffer;
	}

	public String getDataOffer() {
		return dataOffer;
	}

	public void setDataOffer(String dataOffer) {
		this.dataOffer = dataOffer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((simcardNumber == null) ? 0 : simcardNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserOffer other = (UserOffer) obj;
		if (id != other.id)
			return false;
		if (simcardNumber == null) {
			if (other.simcardNumber != null)
				return false;
		} else if (!simcardNumber.equals(other.simcardNumber))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserOffer [id=" + id + ", simcardNumber=" + simcardNumber + ", callOffer=" + callOffer + ", dataOffer="
				+ dataOffer + "]";
	}

}
