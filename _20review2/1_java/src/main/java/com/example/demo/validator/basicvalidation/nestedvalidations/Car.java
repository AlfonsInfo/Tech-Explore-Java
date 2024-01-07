package com.example.demo.validator.basicvalidation.nestedvalidations;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Car {


    @NotBlank(message = "ga boleh kosong")
    private String licensePlate;

    @NotBlank(message = "ga boleh kosong")
    private String Colors;


    @NotNull(message = "ga boleh kosong")
    @Valid
    private Owner owner;
}
