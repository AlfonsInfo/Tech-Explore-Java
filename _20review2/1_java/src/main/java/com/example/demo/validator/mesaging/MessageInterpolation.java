package com.example.demo.validator.mesaging;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Set;

@Data
class Order{
    @NotBlank(message = "{order.id.notblank}")
    @Size(min = 1 , max = 3, message = "order id must between {min} and {max} char")
    private String id;
}

public class MessageInterpolation {

    private static ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
    private static Validator validator = validatorFactory.getValidator();

    public static void main(String[] args) {
        Order order = new Order();
        order.setId("1234");

        Set<ConstraintViolation<Order>> violations =  validator.validate(order);
        violations.forEach(s -> System.out.println(s.getMessage()));


        Order order2 = new Order();
        Set<ConstraintViolation<Order>> violations2 =  validator.validate(order2);
        violations2.forEach(s -> System.out.println(s.getMessage()));

    }
}
