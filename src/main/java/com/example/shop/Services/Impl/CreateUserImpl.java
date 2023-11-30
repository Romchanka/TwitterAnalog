package com.example.shop.Services.Impl;

import com.example.shop.Models.DTO.UserDTO;
import com.example.shop.Models.User;
import com.example.shop.Services.CreateUser;
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
