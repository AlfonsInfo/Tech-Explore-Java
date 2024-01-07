package com.example.demo.validator.customconstraint.constraintcomposition;

import com.example.demo.validator.customconstraint.CaseMode;
import com.example.demo.validator.customconstraint.CheckCase;
import com.example.demo.validator.customconstraint.CheckCaseValidator;
import jakarta.validation.Constraint;
import jakarta.validation.ReportAsSingleViolation;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;

@CheckCase(mode =  CaseMode.UPPER, message = "urup besar bang")
@NotBlank
@Size(min = 1 , max =  3)
@Documented
@Constraint(validatedBy = {CheckCaseValidator.class})
@Target({FIELD, ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@ReportAsSingleViolation
public @interface CheckOrderId {
}

class AnTarget{
    @CheckOrderId
    private String id;
}

class Main {
    public static void main(String[] args) {
        //implement here
    }
}