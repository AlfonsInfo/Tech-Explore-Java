package com.example.demo.validator.basicvalidation.nestedvalidations;

import jakarta.validation.constraints.NotBlank;

public class Owner {
    @NotBlank(message = "ga boleh kosong")
    private String name;
}
