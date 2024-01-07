package com.example.demo.validator.basicvalidation.nestedvalidations;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

import java.util.Objects;
import java.util.Set;

public class ValidatorExample {
    public static void main(String[] args) {
        //createValidator();
//        useValidation();
        demoNestedValidation();
    }

    private static void createValidator() {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        assert (Objects.nonNull(validator));
        validatorFactory.close();
    }


    private static void useValidation() {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();


        Person person = new Person();
        Set<ConstraintViolation<Person>> constraintViolations = validator.validate(person);

        for(ConstraintViolation<Person> constraintViolation : constraintViolations){
            System.out.println(constraintViolation);
        }

        validatorFactory.close();
    }


    private static void demoNestedValidation() {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();


        Car car = new Car();

        Set<ConstraintViolation<Car>> constraintViolations = validator.validate(car);

        for(ConstraintViolation<Car> constraintViolation : constraintViolations){
            System.out.println(constraintViolation);
        }

        validatorFactory.close();
    }
}
