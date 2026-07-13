package com.carRental.CarRental.Dto.response;

import com.carRental.CarRental.CarStatus;
import com.carRental.CarRental.FuelType;
import com.carRental.CarRental.Transmission;

import java.math.BigDecimal;
import java.util.UUID;

public record CarResponseDto(
        UUID carId,
        String carName,
        String brand,
        String model,
        Integer year,
        FuelType fuelType,
        Transmission transmission,
        Integer seatingCapacity,
        BigDecimal pricePerDay,
        String color,
        CarStatus carStatus
) {
}
