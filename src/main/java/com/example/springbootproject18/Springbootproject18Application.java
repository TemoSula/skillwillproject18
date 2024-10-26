package com.example.springbootproject18;

import com.example.springbootproject18.Models.CarModel;
import com.example.springbootproject18.Models.UserModel;
import com.example.springbootproject18.Repositories.CarRepository;
import com.example.springbootproject18.Repositories.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.UUID;

@SpringBootApplication
public class Springbootproject18Application {

	@Autowired
	CarRepository carRepo;

	@Autowired
	UserRepository userRepo;



	public static void main(String[] args) {
		SpringApplication.run(Springbootproject18Application.class, args);
	}


}
