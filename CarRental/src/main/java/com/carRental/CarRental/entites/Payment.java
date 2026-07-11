package com.carRental.CarRental.entites;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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

    private UUID paymentId;

    private String paymentGateway;

    private  String gatewatPaymentId;

    private BigDecimal amt;


}
