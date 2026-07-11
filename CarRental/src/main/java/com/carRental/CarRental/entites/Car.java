package com.carRental.CarRental.entites;


import com.carRental.CarRental.CarStatus;
import com.carRental.CarRental.FuelType;
import com.carRental.CarRental.Transmission;
import jakarta.persistence.*;
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

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "car_id")
    private UUID carId;

    @Column(nullable = false)
    private String carName;

    @Column(nullable = false)
    private String brand;

    @Column(nullable = false)
    private  String model;

    @Column(nullable = false)
    private  Integer year;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private FuelType fuelType;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Transmission transmission;

    @Column(nullable = false)
    private Integer seatingCapacity;

    @Column(nullable = false)
    private BigDecimal pricePerDay;

    @Column(nullable = false, unique = true)
    private  String registrationNumber;

    @Column(nullable = false)
    private  String color;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CarStatus carStatus;

    @Column(length = 1000)
    private  String description;





}
