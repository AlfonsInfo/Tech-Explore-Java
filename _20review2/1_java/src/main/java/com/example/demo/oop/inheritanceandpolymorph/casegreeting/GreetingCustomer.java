package com.example.demo.oop.inheritanceandpolymorph.casegreeting;

public class GreetingCustomer extends Greeting{
    @Override
    public void greetingUser(String nama) {
        System.out.println("Hello our beloved customer :" + nama);
    }
}
