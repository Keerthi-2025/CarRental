package com.carRental.CarRental.entites;


import com.carRental.CarRental.enums.BookingStatus;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "bookings")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

@Getter
@Setter

public class Booking {


    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "booking_id")
    private UUID bookingId;

    @Column(nullable = false)
    private LocalDate pickupDate;

    @Column(nullable = false)
    private LocalDate returnDate;

    @Column(nullable = false)
    private  String pickupLocation;

    @Column(nullable = false)
    private  String dropLocation;

    @Column(nullable = false)
    private BigDecimal totalAmt;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BookingStatus bookingStatus;

    @ManyToOne
    @JoinColumn(name = "user_id",nullable = false)
    private  User user;

    @ManyToOne
    @JoinColumn(name = "car_id", nullable = false)
    private  Car car;


}
