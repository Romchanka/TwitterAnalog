package com.example.shop.services.impl;

import com.example.shop.Model.DTO.UserDTO;
import com.example.shop.Model.User;
import com.example.shop.repositiories.UserRepo;
import com.example.shop.services.CreateUser;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateUserImpl implements CreateUser {

    @Override
    public ResponseEntity<String> create(UserDTO userDTO) {
        User user = new User();
        user.setUsername(userDTO.getLastName());
        user.setUsername(userDTO.getFirstName());
        user.setEmail(userDTO.getEmail());
        user.setPhone(userDTO.getPhone());

        return ResponseEntity.status(HttpStatus.OK).body("user created");
    }
}
