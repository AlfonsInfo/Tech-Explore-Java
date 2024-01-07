package com.example.demo.validator.payload;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Payload;

public class EmailErrorPayLoad implements Payload {
    public void sendEmail(ConstraintViolation<?> constraintViolation){
        System.out.println("Send email because error : " + constraintViolation.getMessage());
    }
}
