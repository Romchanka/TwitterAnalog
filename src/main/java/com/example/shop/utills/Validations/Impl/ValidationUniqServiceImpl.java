package com.example.shop.utills.Validations.Impl;

import com.example.shop.Repositories.UserRepo;
import com.example.shop.utills.Validations.ValidationUniqService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ValidationUniqServiceImpl implements ValidationUniqService {
    private final UserRepo userRepo;

    @Override
    public boolean uniqValidateUsername(String username){
        return userRepo.findByAdminNameIgnoreCase(username).isEmpty();
    }

    @Override
    public boolean uniqValidationEmail(String userEmail) {
        return userRepo.findUserByEmail(userEmail).isEmpty();
    }

    @Override
    public boolean uniqValidationPhone(String userPhone) {
        return userRepo.findByPhone(userPhone).isEmpty();
    }

}
