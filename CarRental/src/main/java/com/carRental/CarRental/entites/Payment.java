package com.carRental.CarRental.entites;


import com.carRental.CarRental.PaymentStatus;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Data
@Table(name = "payments")
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Getter
@Setter

public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "payment_id")
    private UUID paymentId;


    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private  PaymentStatus paymentGateway;

    @Column
    private  String gatewayPaymentId;

    @Column(nullable = false)
    private BigDecimal amt;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PaymentStatus paymentStatus;

    @OneToOne
    @JoinColumn(name = "booking_id", nullable = false)
    private  Booking booking;




}
