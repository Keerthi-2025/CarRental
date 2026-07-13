package com.carRental.CarRental.entites;


import com.carRental.CarRental.OtpPurpose;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@Table(name = "otp_verification")
@NoArgsConstructor
@AllArgsConstructor

@Getter
@Setter

public class OtpVerification {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "otp_id")
    private UUID otpId;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private  String otp;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private OtpPurpose otpPurpose;

    @Column(nullable = false)
    private LocalDateTime expiryTime;

    @Column(nullable = false)
    private  Boolean verified = false;
}
