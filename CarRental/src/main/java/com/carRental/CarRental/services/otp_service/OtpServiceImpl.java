package com.carRental.CarRental.services.otp_service;

import com.carRental.CarRental.entites.OtpVerification;
import com.carRental.CarRental.enums.OtpPurpose;
import com.carRental.CarRental.exceptions.ApiRequestException;
import com.carRental.CarRental.repositories.OtpVerificationRepository;
import com.carRental.CarRental.services.email_service.EmailService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Random;

@Service
public class OtpServiceImpl implements OtpService {

    private final OtpVerificationRepository otpVerificationRepository;
    private final EmailService emailService;

    public OtpServiceImpl(OtpVerificationRepository otpVerificationRepository,
                          EmailService emailService) {

        this.otpVerificationRepository = otpVerificationRepository;
        this.emailService = emailService;
    }

    @Override
    public String generateOtp(String email, OtpPurpose otpPurpose) {

        // Delete previous OTP if exists
        otpVerificationRepository.findByEmail(email)
                .ifPresent(otpVerificationRepository::delete);

        // Generate 6-digit OTP
        String otp = generateRandomOtp();

        // Save OTP
        OtpVerification otpVerification = new OtpVerification();

        otpVerification.setEmail(email);
        otpVerification.setOtp(otp);
        otpVerification.setOtpPurpose(otpPurpose);
        otpVerification.setExpiryTime(LocalDateTime.now().plusMinutes(5));
        otpVerification.setVerified(false);

        otpVerificationRepository.save(otpVerification);

        // Decide email subject
        String subject;

        if (otpPurpose == OtpPurpose.REGISTER) {

            subject = "Email Verification OTP";

        } else {

            subject = "Reset Password OTP";

        }

        // Send Email
        emailService.sendOtpEmail(email, subject, otp);

        return "OTP sent successfully";

    }

    @Override
    public String verifyOtp(String email,
                            String otp,
                            OtpPurpose otpPurpose) {

        Optional<OtpVerification> optionalOtp =
                otpVerificationRepository.findByEmail(email);

        if (optionalOtp.isEmpty()) {

            throw new ApiRequestException("OTP not found");

        }

        OtpVerification otpVerification = optionalOtp.get();

        // Check OTP Purpose
        if (!otpVerification.getOtpPurpose().equals(otpPurpose)) {

            throw new ApiRequestException("Invalid OTP purpose");

        }

        // Check OTP
        if (!otpVerification.getOtp().equals(otp)) {

            throw new ApiRequestException("Invalid OTP");

        }

        // Check Expiry
        if (otpVerification.getExpiryTime()
                .isBefore(LocalDateTime.now())) {

            throw new ApiRequestException("OTP Expired");

        }

        // Mark Verified
        otpVerification.setVerified(true);

        otpVerificationRepository.save(otpVerification);

        return "OTP Verified Successfully";

    }

    @Override
    public String resendOtp(String email, OtpPurpose otpPurpose) {

        Optional<OtpVerification> optionalOtp =
                otpVerificationRepository.findByEmail(email);

        if (optionalOtp.isPresent()) {
            otpVerificationRepository.delete(optionalOtp.get());
        }

        return generateOtp(email, otpPurpose);
    }

    @Override
    public String deleteOtp(String email) {

        Optional<OtpVerification> optionalOtp =
                otpVerificationRepository.findByEmail(email);

        if (optionalOtp.isEmpty()) {
            throw new ApiRequestException("OTP not found");
        }

        otpVerificationRepository.delete(optionalOtp.get());

        return "OTP deleted successfully";
    }

    /**
     * Generate Random 6-Digit OTP
     */
    private String generateRandomOtp() {

        Random random = new Random();

        int otp = 100000 + random.nextInt(900000);

        return String.valueOf(otp);
    }

}