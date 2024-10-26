package com.example.springbootproject18.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "users")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(name = "firstname", nullable = false,length = 60)
    private String firstName;
    @Column(name = "lastname", nullable = false,length = 60)
    private String lastName;
    @Column(name = "favoritecolor", length = 60)
    private String favoriteColor;
    @Column(name = "address", nullable = false,length = 60)
    private String address;

}
