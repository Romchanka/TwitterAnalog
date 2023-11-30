package com.example.shop.Models;

public enum Role {
    USER("user"), ADMIN("admin"),MANAGER("manager");

    private final String role;
    Role(String role) {
        this.role = role;
    }
    public String getRole () {
        return role;
    }
}
