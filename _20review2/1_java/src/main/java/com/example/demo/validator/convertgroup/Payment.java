package com.example.demo.validator.convertgroup;

import com.example.demo.validator.groupingvalidation.CreditCardPaymentGroup;
import jakarta.validation.Valid;
import jakarta.validation.groups.ConvertGroup;
import jakarta.validation.groups.Default;

public class Payment {

    @Valid // agar nested validations
    @ConvertGroup(from = CreditCardPaymentGroup.class , to = Default.class)
    private Customer customer;
}
