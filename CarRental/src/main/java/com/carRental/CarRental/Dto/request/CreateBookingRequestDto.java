package com.carRental.CarRental.Dto.request;

import java.time.LocalDate;
import java.util.UUID;

public record CreateBookingRequestDto(
        UUID carId,
        LocalDate pickupDate,
        LocalDate returnDate,
        String pickupLocation,
        String dropLocation


) {
}
