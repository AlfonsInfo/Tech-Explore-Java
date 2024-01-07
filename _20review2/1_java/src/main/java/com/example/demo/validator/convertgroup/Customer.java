package com.example.demo.validator.convertgroup;

import jakarta.validation.constraints.NotBlank;

public class Customer {
    @NotBlank
    private String email;
    @NotBlank
    private String name;
}
