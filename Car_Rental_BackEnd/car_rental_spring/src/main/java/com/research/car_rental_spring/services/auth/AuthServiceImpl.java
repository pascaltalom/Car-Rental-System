package com.research.car_rental_spring.services.auth;

import org.springframework.stereotype.Service;

import com.research.car_rental_spring.dto.SignupRequest;
import com.research.car_rental_spring.dto.UserDto;
import com.research.car_rental_spring.entity.User;
import com.research.car_rental_spring.enums.UserRole;
import com.research.car_rental_spring.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;

    @Override
    public UserDto createCustomer(SignupRequest signupRequest) {

        User user = new User();
        user.setName(signupRequest.getName());
        user.setEmail(signupRequest.getEmail());
        user.setPassword(signupRequest.getPassword());
        user.setUserRole(UserRole.CUSTOMER);
        User createdUser = userRepository.save(user);
        UserDto userDto = new UserDto();
        userDto.setId(createdUser.getId());

        return userDto;
    }
}
