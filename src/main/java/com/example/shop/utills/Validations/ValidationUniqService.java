package com.example.shop.utills.Validations;

public interface ValidationUniqService {
    boolean uniqValidateUsername(String username);
    boolean uniqValidationEmail(String userEmail);
    boolean uniqValidationPhone(String userPhone);
}
