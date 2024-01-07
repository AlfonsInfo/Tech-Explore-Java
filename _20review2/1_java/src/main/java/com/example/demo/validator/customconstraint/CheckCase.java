package com.example.demo.validator.customconstraint;

import jakarta.validation.Constraint;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.FIELD;

@Documented
@Constraint(validatedBy = {CheckCaseValidator.class})
@Target({ElementType.ANNOTATION_TYPE, FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CheckCase {

    CaseMode mode();

    String message() default "value is invalid";

    Class<?>[] groups() default {};

}
