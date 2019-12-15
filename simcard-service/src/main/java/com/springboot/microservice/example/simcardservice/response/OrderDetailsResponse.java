package com.springboot.microservice.example.simcardservice.response;

import java.io.Serializable;
import java.util.Date;

public class OrderDetailsResponse implements Serializable {

	private static final long serialVersionUID = -4893409113029675569L;
	private int id;
	private Long serviceNumber;
	private String firstName;
	private String lastName;
	private String email;
	private Date dob;
	private String activate;

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

	public String getActivate() {
		return activate;
	}

	public void setActivate(String activate) {
		this.activate = activate;
	}

	public OrderDetailsResponse() {
		super();
	}

	public OrderDetailsResponse(int id, Long serviceNumber, String firstName, String lastName, String email, Date dob,
			String activate) {
		super();
		this.id = id;
		this.serviceNumber = serviceNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.dob = dob;
		this.activate = activate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result + ((serviceNumber == null) ? 0 : serviceNumber.hashCode());
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
		OrderDetailsResponse other = (OrderDetailsResponse) obj;
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
		if (serviceNumber == null) {
			if (other.serviceNumber != null)
				return false;
		} else if (!serviceNumber.equals(other.serviceNumber))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "OrderDetailsResponse [id=" + id + ", serviceNumber=" + serviceNumber + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + ", dob=" + dob + ", activate=" + activate + "]";
	}

}