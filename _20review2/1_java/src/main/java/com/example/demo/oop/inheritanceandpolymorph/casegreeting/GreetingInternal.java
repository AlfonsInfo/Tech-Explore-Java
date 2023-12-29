package com.example.demo.oop.inheritanceandpolymorph.casegreeting;

public class GreetingInternal extends Greeting{
    @Override
    public void greetingUser(String nama) {
        System.out.println("Hello comrades:" + nama);
    }
}
