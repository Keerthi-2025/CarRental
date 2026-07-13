package com.carRental.CarRental.Dto.request;

import com.carRental.CarRental.CarStatus;
import com.carRental.CarRental.FuelType;
import com.carRental.CarRental.Transmission;
import com.carRental.CarRental.entites.Car;

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
