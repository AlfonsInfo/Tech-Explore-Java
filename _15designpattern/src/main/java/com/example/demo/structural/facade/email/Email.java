package com.example.demo.structural.facade.email;

public class Email {

    public static EmailBuilder getBuilder()
    {
        return new EmailBuilder();
    }
}
