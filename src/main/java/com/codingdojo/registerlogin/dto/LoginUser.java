package com.codingdojo.registerlogin.dto;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoginUser {

    @NotEmpty(message = "Email is required!")
    @Email(message = "Please enter a valid email!")
    private String email;

    @NotEmpty(message = "Password is required!")
    @Size(min = 8, max = 128, message = "Password must be between 8 and 128 characters")
    private String password;
}
