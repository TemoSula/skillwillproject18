package com.example.springbootproject18.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "cars")
public class CarModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(name = "brand", length = 60, nullable = false)
    private String brand;
    @Column(name = "model", length = 60, nullable = false)
    private String model;
    @Column(name = "color", length = 60, nullable = false)
    private String color;
    @Column(name = "gearbox", length = 60, nullable = false)
    private String gearbox;

}
