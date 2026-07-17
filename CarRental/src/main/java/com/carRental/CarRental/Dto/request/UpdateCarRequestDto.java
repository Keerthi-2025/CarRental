package com.carRental.CarRental.Dto.request;

import com.carRental.CarRental.enums.CarStatus;
import com.carRental.CarRental.enums.FuelType;
import com.carRental.CarRental.enums.Transmission;

import java.math.BigDecimal;

public record UpdateCarRequestDto(
        String carName,
        String  brand,
        String model,
        Integer year,
        FuelType fuelType,
        Transmission transmission,
        Integer seatingCapacity,
        BigDecimal pricePerDay,
        String color,
        String description,
        CarStatus carStatus
) {
}
