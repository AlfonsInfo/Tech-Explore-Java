package com.example.demo.validator.customconstraint;

public class Order {

    @CheckCase(mode = CaseMode.UPPER, message = "ga urup besar bang")
    private String id;
}
