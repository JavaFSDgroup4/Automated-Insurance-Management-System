package com.fsd.customerInteraction.resource;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Override
//	public String toString() {
//		return "Email [id=" + id + ", emailAddress=" + emailAddress + ", subject=" + subject + ", message=" + message
//				+ "]";
//	}

	public Email(Long id, String emailAddress, String subject, String message) {
		super();
		this.id = id;
		this.emailAddress = emailAddress;
		this.subject = subject;
		this.message = message;
	}

	public Email() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private String emailAddress;

    private String subject;

    private String message;

    // Getters and setters
}

