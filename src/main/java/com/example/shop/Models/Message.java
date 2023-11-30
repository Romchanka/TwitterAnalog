package com.example.shop.Models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Message {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column (nullable = false)
    private Long id;
    @Column (nullable = false)
    private String message;
    @Column (nullable = false)
    private LocalDateTime createdDate;
    @Column
    private LocalDateTime updatedDate;


}
