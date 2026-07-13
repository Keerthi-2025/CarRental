package com.carRental.CarRental.repositories;


import com.carRental.CarRental.entites.Booking;
import com.carRental.CarRental.entites.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository

public interface PaymentRepository extends JpaRepository<Payment, UUID> {

    Optional<Payment> findByBooking(Booking booking);
}
