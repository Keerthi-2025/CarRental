package com.carRental.CarRental.services.otp_service;


import com.carRental.CarRental.enums.OtpPurpose;

public interface OtpService {

    /**
     * Generate and Send OTP
     */
    String generateOtp(String email, OtpPurpose otpPurpose);

    /**
     * Verify OTP
     */
    String verifyOtp(String email, String otp, OtpPurpose otpPurpose);

    /**
     * Resend OTP
     */
    String resendOtp(String email, OtpPurpose otpPurpose);

    /**
     * Delete OTP
     */
    String deleteOtp(String email);

}
