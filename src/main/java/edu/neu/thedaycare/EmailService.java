package edu.neu.thedaycare;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;


@Service
public class EmailService {

//	@Autowired
//	private EmailConfiguration emailConfiguration;

	public JavaMailSender getJavaMailSender() {
//		EmailConfiguration emailConfiguration = new EmailConfiguration();
		JavaMailSenderImpl mailSenderImpl = new JavaMailSenderImpl();
//		mailSenderImpl.setHost(emailConfiguration.getHost());
//		mailSenderImpl.setPort(emailConfiguration.getPort());
//		mailSenderImpl.setUsername(emailConfiguration.getUsername());
//		mailSenderImpl.setPassword(emailConfiguration.getPassword());
		
		mailSenderImpl.setHost("smtp.mailtrap.io");
		mailSenderImpl.setPort(2525);
		mailSenderImpl.setUsername("9d82be49777855");
		mailSenderImpl.setPassword("a70b78c24381c7");
		
		
		return mailSenderImpl;
	}

	public void sendSimpleMessage(String to, String from, String subject, String text) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(to);
		message.setSubject(subject);
		message.setText(text);
		message.setFrom(from);
		getJavaMailSender().send(message);
	}
}
