package com.atacanyavuz.maildev.controller;


import com.atacanyavuz.maildev.controller.dto.MailRequest;
import com.atacanyavuz.maildev.service.MailService;
import jakarta.mail.MessagingException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MailController {
    private final MailService mailService;

    @PostMapping("sendEmail")
    public ResponseEntity<Void> sendEmail(
            @RequestBody MailRequest request
    ) throws MessagingException {
        return ResponseEntity.ok(mailService.sendEmail(request));
    }
}
