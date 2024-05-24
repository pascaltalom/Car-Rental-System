package com.research.car_rental_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.research.car_rental_spring.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
