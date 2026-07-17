package com.carRental.CarRental.mappers;


import com.carRental.CarRental.enums.RoleType;
import com.carRental.CarRental.entites.User;
import org.springframework.stereotype.Component;

@Component

public class UserMapper {

    public User toUser(String firstName, String lastName, String email, String password, String phone, RoleType role) {
        return User.builder()
                .firstName(firstName)
                .lastName(lastName)
                .email(email)
                .password(password)
                .phone(phone)
                .role(role)
                .enabled(false)
                .build();
    }


}
