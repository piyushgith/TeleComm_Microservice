package com.springboot.microservice.example.simcardservice.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Simcarddata")
public class SimCard implements Serializable {

	private static final long serialVersionUID = -6065955123288981402L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "serviceNumber", length = 10, nullable = false)
	private Long serviceNumber;

	@Column(name = "simcardNumber", length = 10, nullable = false)
	private Long simcardNumber;

	@Column(name = "validStatus", length = 10, nullable = false)
	private String validStatus;

	@Column(name = "active", length = 10, nullable = false)
	private String active;

	public SimCard() {
	}

	public SimCard(int id, Long serviceNumber, Long simcardNumber, String validStatus, String active) {
		super();
		this.id = id;
		this.serviceNumber = serviceNumber;
		this.simcardNumber = simcardNumber;
		this.validStatus = validStatus;
		this.active = active;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Long getServiceNumber() {
		return serviceNumber;
	}

	public void setServiceNumber(Long serviceNumber) {
		this.serviceNumber = serviceNumber;
	}

	public Long getSimcardNumber() {
		return simcardNumber;
	}

	public void setSimcardNumber(Long simcardNumber) {
		this.simcardNumber = simcardNumber;
	}

	public String getValidStatus() {
		return validStatus;
	}

	public void setValidStatus(String validStatus) {
		this.validStatus = validStatus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((active == null) ? 0 : active.hashCode());
		result = prime * result + id;
		result = prime * result + ((serviceNumber == null) ? 0 : serviceNumber.hashCode());
		result = prime * result + ((simcardNumber == null) ? 0 : simcardNumber.hashCode());
		result = prime * result + ((validStatus == null) ? 0 : validStatus.hashCode());
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
		SimCard other = (SimCard) obj;
		if (active == null) {
			if (other.active != null)
				return false;
		} else if (!active.equals(other.active))
			return false;
		if (id != other.id)
			return false;
		if (serviceNumber == null) {
			if (other.serviceNumber != null)
				return false;
		} else if (!serviceNumber.equals(other.serviceNumber))
			return false;
		if (simcardNumber == null) {
			if (other.simcardNumber != null)
				return false;
		} else if (!simcardNumber.equals(other.simcardNumber))
			return false;
		if (validStatus == null) {
			if (other.validStatus != null)
				return false;
		} else if (!validStatus.equals(other.validStatus))
			return false;
		return true;
	}

	
	
}
