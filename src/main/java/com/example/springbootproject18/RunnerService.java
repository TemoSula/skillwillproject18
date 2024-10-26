package com.example.springbootproject18;

import com.example.springbootproject18.Models.CarModel;
import com.example.springbootproject18.Models.UserModel;
import com.example.springbootproject18.Repositories.CarRepository;
import com.example.springbootproject18.Repositories.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Component
public class RunnerService {

    @Autowired
    UserRepository userRepo;

    @Autowired
    CarRepository carRepo;


    @PostConstruct
    public void runEverything(){
        // create user
        UUID generateIdForUser = UUID.randomUUID();
        UserModel user = new UserModel();
        /*user.setFirstName("giorgi");
        user.setLastName("giorgadze");
        user.setAddress("Tbillisi");
        user.setFavoriteColor("red");
        user.setId(generateIdForUser);
        userRepo.save(user);*/
        //
        UUID generateIdForCars =  UUID.randomUUID();
        CarModel car = new CarModel();
        /*car.setId(generateIdForCars);
        car.setBrand("Mercedes-Benz");
        car.setModel("E-class");
        car.setColor("Black");
        car.setGearbox("Manual");
        carRepo.save(car);*/

        //Here we can to invoke some query method for any entity
        //this is user 3 query method which i created
        //UserModel usermodelEntity = userRepo.findByaddress("Tbillisi");
        //System.out.println(usermodelEntity.getFirstName());
        //UserModel usermodelEntity = userRepo.findByfirstName("giorgi");
        //System.out.println(usermodelEntity.getFavoriteColor());
        //UserModel usermodelEntity = userRepo.findByfavoriteColor("red");
        //System.out.println(usermodelEntity.getId());

        //this is car 3 query method which i created
        // carmodelEntity = carRepo.findBymodel("E-class");
        //System.out.println(carmodelEntity.getBrand());
        //CarModel carmodelEntity = carRepo.findBybrand("Mercedes-Benz");
        //System.out.println(carmodelEntity.getId());
        CarModel carmodelEntity = carRepo.findBygearbox("Manual");
        System.out.println(carmodelEntity.getBrand());


    }
}
