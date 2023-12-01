package com.example.shop.Services.Impl;

import com.example.shop.Configs.MapperConfig;
import com.example.shop.Models.DTO.EditUserDTO;
import com.example.shop.Models.User;
import com.example.shop.Repositories.UserRepo;
import com.example.shop.Services.EditUserService;
import com.example.shop.utills.Validations.ValidationUniqService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EditUserServiceImpl implements EditUserService {
    private final UserRepo userRepo;
    private final ValidationUniqService validationUniqService;
    private final MapperConfig mapper;

    @Override
    public ResponseEntity<?> editUser(EditUserDTO editUserDTO) {
        if(!validationUniqService.uniqValidationPhone(editUserDTO.getPhone())){
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("phone is already used");
        }
        if(!validationUniqService.uniqValidationEmail(editUserDTO.getEmail())){
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("email is already used");
        }
        User user =mapper.getMapper().map(editUserDTO, User.class);
        userRepo.save(user);

        return ResponseEntity.status(HttpStatus.OK).body("user edited success");
    }
}
