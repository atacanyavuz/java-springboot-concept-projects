package com.atacanyavuz.maildev.controller.dto;


public record MailRequest(
        String destinationEmail,
        String mailHeader,
        String mailBody
) {
}
