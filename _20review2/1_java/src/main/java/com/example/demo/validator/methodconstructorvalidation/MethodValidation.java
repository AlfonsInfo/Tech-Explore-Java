package com.example.demo.validator.methodconstructorvalidation;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.executable.ExecutableValidator;

import java.lang.reflect.Method;
import java.util.Set;

public class MethodValidation {
    private static ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
    private static Validator validator = validatorFactory.getValidator();
    private static ExecutableValidator executableValidator = validator.forExecutables();
    public static void sayHello(@NotBlank(message = "name must not blank")String name){
        System.out.println("Hi " + name);
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Method method =  MethodValidation.class.getMethod("sayHello", String.class);
        String name = "";
        Set<ConstraintViolation<MethodValidation>> violations = executableValidator.validateParameters(new MethodValidation(),method,new Object[]{name});

        for(ConstraintViolation<MethodValidation> violation : violations){
            System.out.println(violation);
        }
    }
}
