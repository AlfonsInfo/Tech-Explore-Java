package com.example.demo.oop.inheritanceandpolymorph.casegreeting;

public class Main {
    public static void main(String[] args) {
        Greeting greetings = new Greeting();
        greetings.greetingUser("alfons");
        Greeting greetCust = new GreetingCustomer();
        greetCust.greetingUser("bambang");
        Greeting greetingInternal = new GreetingInternal();
        greetingInternal.greetingUser("tono");
    }
}
