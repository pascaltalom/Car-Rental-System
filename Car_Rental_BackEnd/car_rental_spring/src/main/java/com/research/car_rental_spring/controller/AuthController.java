package com.research.car_rental_spring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.research.car_rental_spring.dto.SignupRequest;
import com.research.car_rental_spring.dto.UserDto;
import com.research.car_rental_spring.services.auth.AuthService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity<?> signupCustomer(@RequestBody SignupRequest signupRequest){
        
       UserDto createdCustomerDto = authService.createCustomer(signupRequest);
       
       if(createdCustomerDto == null) return new ResponseEntity<>("Customer not Created, try Again", HttpStatus.BAD_REQUEST);
       
       return new  ResponseEntity<>(createdCustomerDto, HttpStatus.CREATED);
    }
}
