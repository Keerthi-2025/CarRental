package com.carRental.CarRental.entites;


import com.carRental.CarRental.RoleType;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Getter
@Setter

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "user_id")
    private UUID userId;

    @Column(nullable = false)
    private  String firstName;

    @Column(nullable = false)
    private  String lastName;

    @Column(nullable = false, unique = true)
    private  String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String phone;

    private  String profileImage;

    private  String DL;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private RoleType role;

    private  Boolean enabled = false;
}
