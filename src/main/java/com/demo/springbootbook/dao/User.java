package com.demo.springbootbook.dao;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import lombok.Data;

import java.time.LocalDate;

@Data
public class User {
    @NotBlank(message="Name cannot be blank")
    private String name;
    @Min(value = 1, message="Age must be greater than 0")
    private int age;
    @Email(message="Email format is incorrect")
    private String email;
    @Past(message = "Birthday must be in the past")
    private LocalDate birthday;
}
