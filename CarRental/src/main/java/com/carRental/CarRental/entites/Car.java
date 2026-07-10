package com.carRental.CarRental.entites;


import com.carRental.CarRental.FuelType;
import com.carRental.CarRental.Transmission;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "cars")
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Getter
@Setter

public class Car {

    private UUID carId;


    private String carName;

    private String brand;

    private  String model;

    private  Integer year;


    private FuelType fuelType;


    private Transmission transmission;


    private Integer seatingCapacity;


    private BigDecimal pricePerDay;

    private  String registrationNumber;


    private  String color;



//    private CartStatus cartStatus;


    private  String description;





}
