package com.example.shop.Services;

import com.example.shop.Models.DTO.EditUserDTO;
import org.springframework.http.ResponseEntity;

public interface EditUserService {
    ResponseEntity<?>editUser(EditUserDTO editUserDTO);
}
