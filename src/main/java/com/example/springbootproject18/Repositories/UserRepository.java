package com.example.springbootproject18.Repositories;

import com.example.springbootproject18.Models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserModel, UUID> {

    UserModel findByfirstName(String firstname);
    UserModel findByaddress(String address);
    UserModel findByfavoriteColor(String favcolor);
}
