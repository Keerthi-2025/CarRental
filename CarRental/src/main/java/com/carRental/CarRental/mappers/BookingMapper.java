package com.carRental.CarRental.mappers;


import com.carRental.CarRental.enums.BookingStatus;
import com.carRental.CarRental.entites.Booking;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;

@Component

public class BookingMapper {
    public Booking toBooking(
            LocalDate pickupDate,
            LocalDate returnDate,
            String pickupLocation,
            String dropLocation,
            BigDecimal totalAmt){
        return Booking.builder()
                .pickupDate(pickupDate)
                .returnDate(returnDate)
                .pickupLocation(pickupLocation)
                .dropLocation(dropLocation)
                .totalAmt(totalAmt)
                .bookingStatus(BookingStatus.PENDING)
                .build();
    }
}
