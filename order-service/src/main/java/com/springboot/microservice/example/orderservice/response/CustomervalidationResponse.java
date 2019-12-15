package com.springboot.microservice.example.orderservice.response;

import java.io.Serializable;
import java.util.Date;

public class CustomervalidationResponse implements Serializable {

	private static final long serialVersionUID = -867009559145240019L;

	private int id;
	private Long simcardNumber;
	private String firstName;
	private String lastName;
	private String email;
	private Date dob;
	private String governmentId;
	private String address;
	private String pincode;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGovernmentId() {
		return governmentId;
	}

	public void setGovernmentId(String governmentId) {
		this.governmentId = governmentId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public Long getSimcardNumber() {
		return simcardNumber;
	}

	public void setSimcardNumber(Long simcardNumber) {
		this.simcardNumber = simcardNumber;
	}

	public CustomervalidationResponse() {
		super();
	}

	public CustomervalidationResponse(int id, Long simcardNumber, String firstName, String lastName, String email,
			Date dob, String governmentId, String address, String pincode) {
		super();
		this.id = id;
		this.simcardNumber = simcardNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.dob = dob;
		this.governmentId = governmentId;
		this.address = address;
		this.pincode = pincode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
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
		CustomervalidationResponse other = (CustomervalidationResponse) obj;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CustomervalidationResponse [id=" + id + ", simcardNumber=" + simcardNumber + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + ", dob=" + dob + ", governmentId=" + governmentId
				+ ", address=" + address + ", pincode=" + pincode + "]";
	}

}
