package com.example.shop.Config;

import java.util.regex.Pattern;

public class PatternConfig {
    public static final Pattern
    EMPLOYEE_NAME_PATTERN = Pattern.compile("^[A-Za-zA-Яа-я]{2,50}$"),
    PASSWORD_PATTERN=Pattern.compile("^(?=.*[A-Za-z\\d])(?=.*[^A-Za-z\\d]).{8,32}$"),
    PHONE_PATTERN= Pattern.compile("^\\+996\\d{9}$"),
    EMAIL_PATTERN= Pattern.compile("^[A-Za-z\\d+_.-]+@(.+)$"),
    DATE_PATTERN =Pattern.compile("^(|(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-(\\d{4}))$");
}