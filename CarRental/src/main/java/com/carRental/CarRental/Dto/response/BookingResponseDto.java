package com.carRental.CarRental.Dto.response;

import com.carRental.CarRental.BookingStatus;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public record BookingResponseDto(
        UUID bookingId,
        String carName,
        LocalDate pickupDate,
        LocalDate returnDate,
        String pickupLocation,
        String dropLocation,
        BigDecimal totalAmt,
        BookingStatus bookingStatus
) {
}
