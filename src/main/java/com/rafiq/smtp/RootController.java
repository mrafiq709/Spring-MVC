package com.rafiq.smtp;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

	@Autowired
	SmtpMailSender smtpMailSender;
	
	@GetMapping("/send-mail")
	public void sendMail() throws MessagingException {
		smtpMailSender.send("aroraayman13052015@gmail.com", "Anniversary--> 13 May", "Hi");
	}
}
