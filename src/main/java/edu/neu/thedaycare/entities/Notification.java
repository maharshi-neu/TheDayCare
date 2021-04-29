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
	private LocalDate whenDate;
	private Boolean sent;
	
	@Override
	public String toString() {
		return "Notification [getId()=" + getId() + ", getMessage()=" + getMessage() + ", getSendTo()=" + getSendTo()
				+ ", getWhen()=" + getWhenDate() + ", getSent()=" + getSent() + "]";
	}

	public Notification () {}

	public Notification(Long id, String message, String sendTo, LocalDate when, Boolean sent) {
		super();
		this.id = id;
		this.message = message;
		this.sendTo = sendTo;
		this.whenDate = when;
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
	public LocalDate getWhenDate() {
		return whenDate;
	}
	public void setWhenDate(LocalDate when) {
		this.whenDate = when;
	}
	public Boolean getSent() {
		return sent;
	}
	public void setSent(Boolean sent) {
		this.sent = sent;
	}

}
