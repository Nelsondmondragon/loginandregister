package com.codingdojo.registerlogin.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "¡Se requiere Username!")
    @Size(min = 3, max = 30, message = "Username debe tener entre 3 y 30 caracteres")
    private String userName;

    @NotEmpty(message = "¡Se requiere Email!")
    @Email(message = "¡Ingrese un Email válido!")
    private String email;

    @NotEmpty(message = "¡Se requiere contraseña!")
    @Size(min = 8, max = 128, message = "La contraseña debe tener entre 8 y 128 caracteres")
    private String password;

    @Transient
    @NotEmpty(message = "Confirm Password is required!")
    @Size(min = 8, max = 128, message = "Confirm Password must be between 8 and 128 characters")
    private String confirm;
}
