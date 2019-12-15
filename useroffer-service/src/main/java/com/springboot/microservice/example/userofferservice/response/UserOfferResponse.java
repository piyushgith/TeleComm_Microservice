package com.springboot.microservice.example.userofferservice.response;

import java.io.Serializable;

public class UserOfferResponse implements Serializable {

	private static final long serialVersionUID = -7050093362603636094L;
	private int id;
	private Long simcardNumber;
	private String callOffer;
	private String dataOffer;

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

	public UserOfferResponse() {
		super();
	}

	public UserOfferResponse(int id, Long simcardNumber, String callOffer, String dataOffer) {
		super();
		this.id = id;
		this.simcardNumber = simcardNumber;
		this.callOffer = callOffer;
		this.dataOffer = dataOffer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((callOffer == null) ? 0 : callOffer.hashCode());
		result = prime * result + ((dataOffer == null) ? 0 : dataOffer.hashCode());
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
		UserOfferResponse other = (UserOfferResponse) obj;
		if (callOffer == null) {
			if (other.callOffer != null)
				return false;
		} else if (!callOffer.equals(other.callOffer))
			return false;
		if (dataOffer == null) {
			if (other.dataOffer != null)
				return false;
		} else if (!dataOffer.equals(other.dataOffer))
			return false;
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
		return "UserOfferResponse [id=" + id + ", simcardNumber=" + simcardNumber + ", callOffer=" + callOffer
				+ ", dataOffer=" + dataOffer + "]";
	}

}
