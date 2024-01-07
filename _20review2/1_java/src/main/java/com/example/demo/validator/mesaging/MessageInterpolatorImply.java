package com.example.demo.validator.mesaging;

import jakarta.validation.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.internal.engine.MessageInterpolatorContext;
import org.hibernate.validator.messageinterpolation.ExpressionLanguageFeatureLevel;
import org.springframework.cglib.core.Local;

import java.util.Locale;
import java.util.Set;

class TargetClass{
    @NotBlank
    @Size(min = 1 , max = 3, message = "order id must between {min} and {max} char")
    private String id;
}
public class MessageInterpolatorImply {
    private static final ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
    private static final Validator validator = validatorFactory.getValidator();
    private static final MessageInterpolator messageInterpolator = validatorFactory.getMessageInterpolator();

    public static void main(String[] args) {
        TargetClass targetClass = new TargetClass();
        Set< ConstraintViolation<TargetClass>> violationSet  = validator.validate(targetClass);
        violationSet.forEach( v ->{
            System.out.println(v.getMessageTemplate());
            MessageInterpolator.Context context = new MessageInterpolatorContext(
                    v.getConstraintDescriptor(), v.getInvalidValue(), v.getRootBeanClass(),
                    v.getPropertyPath(), v.getConstraintDescriptor().getAttributes(), v.getConstraintDescriptor().getAttributes(),
                    ExpressionLanguageFeatureLevel.VARIABLES, true);

            System.out.println(messageInterpolator.interpolate(v.getMessageTemplate()
            , context, new Locale("id", "ID")));
        });
    }
}
