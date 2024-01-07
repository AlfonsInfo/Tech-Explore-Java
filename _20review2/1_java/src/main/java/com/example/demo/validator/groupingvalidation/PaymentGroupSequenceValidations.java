package com.example.demo.validator.groupingvalidation;

import jakarta.validation.GroupSequence;
import lombok.Builder;

@GroupSequence(
        value = {Builder.Default.class,
        CreditCardPaymentGroup.class,
        VirtualAccountPaymentGroup.class
        }

)
public interface PaymentGroupSequenceValidations {
}
