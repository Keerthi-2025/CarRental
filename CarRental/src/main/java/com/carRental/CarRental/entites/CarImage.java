package com.carRental.CarRental.entites;


import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "car_images")
@Builder


@Getter
@Setter

public class CarImage {
    

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "car_id")
    private UUID imageId;

    @Column(nullable = false)
    private String imageUrl;

    @ManyToOne
    @JoinColumn(nullable = false)
    private  Car car;

}
