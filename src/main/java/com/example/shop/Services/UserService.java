package com.example.shop.Services;

import com.example.shop.Models.DTO.UserDTO;
import com.example.shop.Models.User;
import org.springframework.http.ResponseEntity;

public interface UserService {
    ResponseEntity<String> saveUser(UserDTO userDTO);

}
