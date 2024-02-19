package com.fsd.customerInteraction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.fsd.customerInteraction.resource.Email;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;
    
    public Email sendEmail(Email email) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("javafsdgroup@gmail.com");
        message.setTo(email.getEmailAddress());
        message.setSubject(email.getSubject());
        message.setText(email.getMessage());
        
        mailSender.send(message);

        System.out.println("Mail sent successfully...");
        return email;
    }
}
