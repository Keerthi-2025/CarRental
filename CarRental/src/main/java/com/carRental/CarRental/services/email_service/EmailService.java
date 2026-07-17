package com.carRental.CarRental.services.email_service;


public interface EmailService {

    String sendOtpEmail(String toEmail, String subject, String otp);

    String sendWelcomeEmail(String toEmail, String firstName);

    String sendBookingConfirmationEmail(
            String toEmail,
            String firstName,
            String bookingId
    );

    String sendBookingCancellationEmail(
            String toEmail,
            String firstName,
            String bookingId
    );

    String sendPaymentSuccessEmail(
            String toEmail,
            String firstName,
            String paymentId
    );
}