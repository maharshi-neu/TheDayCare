package edu.neu.thedaycare.entities;

import java.time.LocalDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Notification {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String message;
	private String sendTo; // email
	private LocalDate when;
	private Boolean sent;
	
	@Override
	public String toString() {
		return "Notification [getId()=" + getId() + ", getMessage()=" + getMessage() + ", getSendTo()=" + getSendTo()
				+ ", getWhen()=" + getWhen() + ", getSent()=" + getSent() + "]";
	}

	public Notification () {}

	public Notification(Long id, String message, String sendTo, LocalDate when, Boolean sent) {
		super();
		this.id = id;
		this.message = message;
		this.sendTo = sendTo;
		this.when = when;
		this.sent = sent;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getSendTo() {
		return sendTo;
	}
	public void setSendTo(String sendTo) {
		this.sendTo = sendTo;
	}
	public LocalDate getWhen() {
		return when;
	}
	public void setWhen(LocalDate when) {
		this.when = when;
	}
	public Boolean getSent() {
		return sent;
	}
	public void setSent(Boolean sent) {
		this.sent = sent;
	}

}
