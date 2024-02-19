package com.fsd.customer.resource;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Customer.java
@Entity
@Table(name = "customers")
public class Customer {

 public Customer() {
		super();
	}

public Customer(String name, String email, String address, LocalDate dateOfBirth, String phoneNumber) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.phoneNumber = phoneNumber;
	}

public Customer(Long id, String name, String email, String address, LocalDate dateOfBirth, String phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		this.phoneNumber = phoneNumber;
	}

@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", dateOfBirth="
				+ dateOfBirth + ", phoneNumber=" + phoneNumber + "]";
	}

public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

@Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private String name;

 private String email;

 private String address;

 private LocalDate dateOfBirth;

 private String phoneNumber;

 // constructors, getters, setters
}
