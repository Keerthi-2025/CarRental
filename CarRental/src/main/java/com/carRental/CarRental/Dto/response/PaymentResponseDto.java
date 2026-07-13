package com.carRental.CarRental.Dto.response;

import com.carRental.CarRental.PaymentStatus;

import java.math.BigDecimal;
import java.util.UUID;

public record PaymentResponseDto(
        UUID paymentId,
        BigDecimal amt,
        PaymentStatus paymentStatus,
        String gatewayPaymentId
) {
}
