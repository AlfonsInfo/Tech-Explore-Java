package com.example.demo.validator.mesaging;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Locale;
import java.util.Set;

@Data
class AnClass{
    @NotBlank
    @Size(min = 1 , max = 3)
    private String id;
}

public class MessageInternationalizations {


    public static void main(String[] args) {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        System.out.println("Default Locale Before: " + Locale.getDefault());
        //Locale.setDefault(new Locale("zn", "CN"));
//        Locale.setDefault(new Locale.Builder().setLanguage("id").build());
        Locale.setDefault(Locale.CHINA);
        System.out.println("Default Locale After: " + Locale.getDefault());
        Set<ConstraintViolation<AnClass>> violationSet = validator.validate(new AnClass());
        violationSet.forEach(s -> System.out.println(s.getMessage()));

    }

}
