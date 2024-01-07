package com.example.demo.validator.customconstraint;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;


public class CheckCaseValidator implements ConstraintValidator<CheckCase, String> {

    private CaseMode caseMode;

    @Override
    public void initialize(CheckCase constraintAnnotation) {
        this.caseMode = constraintAnnotation.mode();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(s == null) return true; //skip validations

        return switch (caseMode) {
            case UPPER -> s.equals(s.toUpperCase());
            case LOWER -> s.equals(s.toLowerCase());
        };
    }
}
