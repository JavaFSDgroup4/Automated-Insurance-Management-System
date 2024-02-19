package com.fsd.customerInteraction.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.fsd.customerInteraction.resource.Email;
import com.fsd.customerInteraction.service.EmailService;

@RestController
@RequestMapping("/api/emails")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping
    public Email sendEmail(@RequestBody Email email) {
        // Assuming you're setting these values in the client request
        email.setEmailAddress("aviashish63@gmail.com");
        email.setSubject("Test Mail...");
        email.setMessage("Hi, it's a test application for project development");
        return emailService.sendEmail(email);
    }
}
