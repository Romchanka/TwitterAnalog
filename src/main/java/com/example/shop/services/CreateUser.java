package com.example.shop.services;

import com.example.shop.Model.DTO.UserDTO;
import org.springframework.http.ResponseEntity;

public interface CreateUser {
    ResponseEntity<String>create(UserDTO userDTO);

}
