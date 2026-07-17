package com.carRental.CarRental.Dto.request;

import com.carRental.CarRental.enums.Transmission;

import java.math.BigDecimal;

public record CreateCarRequestDto(
        String carName,
        String brand,
        String model,
        Integer year,
        String fuelType,
        Transmission transmission,
        Integer seatingCapacity,
        BigDecimal pricePerDay,
        String registrationNumber,
        String color,
        String description

) {
}
