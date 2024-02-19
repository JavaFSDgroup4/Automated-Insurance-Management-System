package com.fsd.customerInteraction.resource;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Message {
    @Override
	public String toString() {
		return "Message [id=" + id + ", phoneNumber=" + phoneNumber + ", message=" + message + "]";
	}

	public Long getId() {
		return id;
	}

	public Message() {
		super();
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Message(Long id, String phoneNumber, String message) {
		super();
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.message = message;
	}

	

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String phoneNumber;

    private String message;

    // Getters and setters
}
