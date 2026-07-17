package com.carRental.CarRental.mappers;


import com.carRental.CarRental.enums.CarStatus;
import com.carRental.CarRental.enums.FuelType;
import com.carRental.CarRental.enums.Transmission;
import com.carRental.CarRental.entites.Car;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component

public class CarMapper {
    public Car toCar(
            String carName,
            String brand,
            String model,
            Integer year,
            FuelType fuelType,
            Transmission transmission,
            Integer seatingCapacity,
            BigDecimal pricePerDay,
            String registrationNumber,
            String color,
            String description){
        return  Car.builder()
                .carName(carName)
                .brand(brand)
                .model(model)
                .year(year)
                .fuelType(fuelType)
                .transmission(transmission)
                .seatingCapacity(seatingCapacity)
                .pricePerDay(pricePerDay)
                .registrationNumber(registrationNumber)
                .color(color)
                .description(description)
                .carStatus(CarStatus.AVAILABLE)
                .build();
    }
}
