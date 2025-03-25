package com.atacanyavuz.maildev.service;

import com.atacanyavuz.maildev.controller.dto.MailRequest;
import com.atacanyavuz.maildev.email.EmailService;
import jakarta.mail.MessagingException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MailService {
    private final EmailService emailService;

    public Void sendEmail(MailRequest request) throws MessagingException {
        emailService.sendEmail(
                request.destinationEmail(),
                request.mailHeader(),
                request.mailBody()
                );
        return null;
    }
}
