package com.example.demo.validator.methodconstructorvalidation;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.executable.ExecutableValidator;

import java.lang.reflect.Constructor;
import java.util.Set;

class Person{
    private String name;
    private String address;
    public Person() {
    }

    public Person(
            @NotBlank String name,
            @NotBlank String address) {
        this.name = name;
        this.address = address;
    }
}
public class ConstructorValidations {
    private static ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
    private static Validator validator = validatorFactory.getValidator();
    private static ExecutableValidator executableValidator = validator.forExecutables();
    public static void main(String[] args) throws NoSuchMethodException {
        Class<Person> personClass = Person.class;
        Constructor<Person> constructor = personClass.getConstructor(String.class,String.class);

        Person p  = new Person("","");

        Set< ConstraintViolation<Person>> violationSet =  executableValidator.validateConstructorParameters(constructor,new Object[]{"",""});

        for(ConstraintViolation<Person> violation : violationSet){
            System.out.println(violation);
        }
    }
        }

