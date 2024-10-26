package com.example.springbootproject18.Repositories;

import com.example.springbootproject18.Models.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CarRepository extends JpaRepository<CarModel, UUID> {

    CarModel findBybrand(String brand);
    CarModel findBymodel(String model);
    CarModel findBygearbox(String gearbox);

}
