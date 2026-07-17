package com.carRental.CarRental.services;


import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    private final JavaMailSender mailSender;

    public EmailServiceImpl(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    @Override
    public String sendOtpEmail(String toEmail, String subject, String otp) {

        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo(toEmail);
        message.setSubject(subject);

        message.setText(
                "Dear Customer,\n\n" +
                        "Your One Time Password (OTP) is: " + otp + "\n\n" +
                        "This OTP is valid for 5 minutes.\n\n" +
                        "Please do not share this OTP with anyone.\n\n" +
                        "Regards,\n" +
                        "Car Rental Team"
        );

        mailSender.send(message);

        return "OTP email sent successfully";
    }

    @Override
    public String sendWelcomeEmail(String toEmail, String firstName) {

        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo(toEmail);
        message.setSubject("Welcome to Car Rental");

        message.setText(
                "Dear " + firstName + ",\n\n" +
                        "Welcome to Car Rental.\n\n" +
                        "Your account has been successfully verified.\n\n" +
                        "You can now login and start booking cars.\n\n" +
                        "Thank You,\n" +
                        "Car Rental Team"
        );

        mailSender.send(message);

        return "Welcome email sent successfully";
    }

    @Override
    public String sendBookingConfirmationEmail(String toEmail, String firstName, String bookingId) {

        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo(toEmail);
        message.setSubject("Booking Confirmed");

        message.setText(
                "Dear " + firstName + ",\n\n" +
                        "Your booking has been confirmed successfully.\n\n" +
                        "Booking ID : " + bookingId + "\n\n" +
                        "Thank you for choosing Car Rental.\n\n" +
                        "Regards,\n" +
                        "Car Rental Team"
        );

        mailSender.send(message);

        return "Booking confirmation email sent successfully";
    }

    @Override
    public String sendBookingCancellationEmail(String toEmail, String firstName, String bookingId) {

        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo(toEmail);
        message.setSubject("Booking Cancelled");

        message.setText(
                "Dear " + firstName + ",\n\n" +
                        "Your booking has been cancelled.\n\n" +
                        "Booking ID : " + bookingId + "\n\n" +
                        "If this was not requested by you, please contact support.\n\n" +
                        "Regards,\n" +
                        "Car Rental Team"
        );

        mailSender.send(message);

        return "Booking cancellation email sent successfully";
    }

    @Override
    public String sendPaymentSuccessEmail(String toEmail, String firstName, String paymentId) {

        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo(toEmail);
        message.setSubject("Payment Successful");

        message.setText(
                "Dear " + firstName + ",\n\n" +
                        "Your payment has been completed successfully.\n\n" +
                        "Payment ID : " + paymentId + "\n\n" +
                        "Thank you for using Car Rental.\n\n" +
                        "Regards,\n" +
                        "Car Rental Team"
        );

        mailSender.send(message);

        return "Payment success email sent successfully";
    }
}
