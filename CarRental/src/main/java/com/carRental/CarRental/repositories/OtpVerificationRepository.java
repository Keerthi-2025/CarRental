package com.carRental.CarRental.repositories;


import com.carRental.CarRental.entites.OtpVerification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository

public interface OtpVerificationRepository extends JpaRepository<OtpVerification, UUID> {


    Optional<OtpVerification> findByEmail(String email);


    void deleteByEmail(String email);
}
