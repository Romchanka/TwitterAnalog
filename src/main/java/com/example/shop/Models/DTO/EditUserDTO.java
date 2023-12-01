package com.example.shop.Models.DTO;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EditUserDTO {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
}
