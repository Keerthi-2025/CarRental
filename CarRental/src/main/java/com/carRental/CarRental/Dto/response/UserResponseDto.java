package com.carRental.CarRental.Dto.response;

import com.carRental.CarRental.enums.RoleType;

import java.util.UUID;

public record UserResponseDto(
        UUID userId,
        String firstName,
        String lastName,
        String email,
        String phone,
        String profileImage,
        RoleType role
) {
}
