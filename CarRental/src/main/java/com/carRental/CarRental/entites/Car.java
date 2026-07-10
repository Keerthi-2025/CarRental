package com.carRental.CarRental.entites;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

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



}
