package com.example.shop.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Table(name = "app_user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String email;
    @Column
    @ElementCollection (targetClass = Role.class, fetch = FetchType.EAGER)
    @CollectionTable (name = "user_role", joinColumns = @JoinColumn(name = "user_id"))
    @Enumerated (EnumType.STRING)
    private Set <Role> role;
    @Column
    private String phone;
    @Column
    private String image;

}
