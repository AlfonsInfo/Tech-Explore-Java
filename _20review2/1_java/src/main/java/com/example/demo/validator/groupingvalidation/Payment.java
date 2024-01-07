package com.example.demo.validator.groupingvalidation;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.LuhnCheck;
import org.hibernate.validator.constraints.Range;

@Data
public class Payment {
    @NotBlank
    private String orderId;

    @NotNull(message = "amount must not null", groups = {CreditCardPaymentGroup.class} )
    @Range( min = 1000, max = 100_000_000 ,message = "amount must between 100 100000000")
    private Long amount;

    @NotBlank(message = "credit card must not blank")
    @LuhnCheck(message = "credit carad must valid number")
    private String creditCard;
}
