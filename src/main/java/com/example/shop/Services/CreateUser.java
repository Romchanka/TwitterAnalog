package com.example.shop.Services;

import com.example.shop.Models.DTO.UserDTO;
import org.springframework.http.ResponseEntity;

public interface CreateUser {
    ResponseEntity<String>create(UserDTO userDTO);

}
