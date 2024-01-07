package com.example.demo.validator.basicvalidation.nestedvalidations;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Person {
    @NotBlank(message = "first name can not blank")
    @Size(max = 20 , message = "first name length max must 20 characters")
    private String firstName;


    @NotBlank(message = "last name can not blank")
    @Size(max = 20 , message = "last name length max must 20 characters")
    private String lastName;
}
