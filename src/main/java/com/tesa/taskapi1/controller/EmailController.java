package com.tesa.taskapi1.controller;

import com.tesa.taskapi1.model.request.EmailRequest;
import com.tesa.taskapi1.model.response.EmailResponse;
import com.tesa.taskapi1.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/email")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/send")
    public EmailResponse sendEmail(@RequestBody EmailRequest emailRequest) {
        return emailService.sendEmail(emailRequest.getRecipientEmails(), emailRequest.getSubject(), emailRequest.getMessage());
    }

    @GetMapping("/test/{subject}")
    public String test(@PathVariable String subject){
        return emailService.test(subject);
    }
}