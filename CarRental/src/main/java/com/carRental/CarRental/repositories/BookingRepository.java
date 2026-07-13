package com.carRental.CarRental.repositories;


import com.carRental.CarRental.entites.Booking;
import com.carRental.CarRental.entites.Car;
import com.carRental.CarRental.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository

public interface BookingRepository  extends JpaRepository<Booking, UUID> {

    List<Booking> findByUser(User user);

    List<Booking> findByCar(Car car);
}
