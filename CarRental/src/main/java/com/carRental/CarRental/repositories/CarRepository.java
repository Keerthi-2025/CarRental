package com.carRental.CarRental.repositories;

import com.carRental.CarRental.CarStatus;
import com.carRental.CarRental.entites.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface CarRepository extends JpaRepository<Car, UUID> {

    List<Car> findByBrandContainingIgnorecase(String brand);

    List<Car> findByCarNameContainingIgnoreCase(String carName);

    List<Car> findByCarStatus(CarStatus carStatus);

}
