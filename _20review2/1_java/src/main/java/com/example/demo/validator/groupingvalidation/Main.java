package com.example.demo.validator.groupingvalidation;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

import java.util.Set;

public class Main {
    private static ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
    private static Validator validator = validatorFactory.getValidator();
    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.setCreditCard("wrong");

        Set<ConstraintViolation<Payment>> constraintViolationSet = validator.validate(payment, CreditCardPaymentGroup.class);
        constraintViolationSet.forEach(paymentConstraintViolation -> {
            System.out.println(paymentConstraintViolation.getMessage());
        });
    }
}
