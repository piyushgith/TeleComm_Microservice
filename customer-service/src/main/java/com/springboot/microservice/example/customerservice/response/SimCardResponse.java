package com.springboot.microservice.example.customerservice.response;

import java.io.Serializable;

public class SimCardResponse implements Serializable {

	private static final long serialVersionUID = -7563885823938766142L;

	private int id;
	private Long serviceNumber;
	private Long simcardNumber;
	private String validStatus;
	private String active;

	public SimCardResponse() {
		super();
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

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public SimCardResponse(int id, Long serviceNumber, Long simcardNumber, String validStatus, String active) {
		super();
		this.id = id;
		this.serviceNumber = serviceNumber;
		this.simcardNumber = simcardNumber;
		this.validStatus = validStatus;
		this.active = active;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((serviceNumber == null) ? 0 : serviceNumber.hashCode());
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
		SimCardResponse other = (SimCardResponse) obj;
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
		return true;
	}

	@Override
	public String toString() {
		return "SimCardResponse [id=" + id + ", serviceNumber=" + serviceNumber + ", simcardNumber=" + simcardNumber
				+ ", validStatus=" + validStatus + ", active=" + active + "]";
	}

}