package com.research.car_rental_spring.services.auth;

import com.research.car_rental_spring.dto.SignupRequest;
import com.research.car_rental_spring.dto.UserDto;

public interface AuthService {

    UserDto createCustomer(SignupRequest signupRequest);

}
