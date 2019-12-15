package com.springboot.microservice.example.orderservice.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Orderdetails")
public class OrderDetails implements Serializable {

	private static final long serialVersionUID = -1786530844829629584L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "serviceNumber", length = 10, nullable = false)
	private Long serviceNumber;

	@Column(name = "firstName", length = 15, nullable = false)
	private String firstName;

	@Column(name = "lastName", length = 15, nullable = false)
	private String lastName;

	@Column(name = "email", length = 50, nullable = false)
	private String email;

	@Column(name = "dob", nullable = true)
	@Temporal(TemporalType.DATE)
	private Date dob;

	@Column(name = "activate", length = 20, nullable = false)
	private String activate;

	public OrderDetails() {
	}

	public OrderDetails(int id, Long serviceNumber, String firstName, String lastName, String email, Date dob,
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
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
		OrderDetails other = (OrderDetails) obj;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
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
		return "OrderDetails [id=" + id + ", serviceNumber=" + serviceNumber + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + ", dob=" + dob + ", activate=" + activate + "]";
	}

}
