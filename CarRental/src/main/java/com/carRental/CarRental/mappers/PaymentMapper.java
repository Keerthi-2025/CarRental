package com.carRental.CarRental.mappers;


import com.carRental.CarRental.enums.PaymentGateway;
import com.carRental.CarRental.enums.PaymentStatus;
import com.carRental.CarRental.entites.Payment;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component

public class PaymentMapper {
    public Payment toPayment(BigDecimal amt, PaymentGateway paymentGateway, String gatewayPaymentId){
        return Payment.builder()
                .amt(amt)
                .paymentGateway(paymentGateway)
                .gatewayPaymentId(gatewayPaymentId)
                .paymentStatus(PaymentStatus.PENDING)
                .build();
    }
}
