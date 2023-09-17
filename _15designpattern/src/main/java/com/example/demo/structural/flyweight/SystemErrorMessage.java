package com.example.demo.structural.flyweight;

public class SystemErrorMessage implements ErrorMessage{
    //some error message $errorCode
    private String messageTemplate;

    //http://somedomain.com/help?error=
    private String helpUrlBase;

    public SystemErrorMessage(String messageTemplate, String helpUrlBase) {
        this.messageTemplate = messageTemplate;
        this.helpUrlBase = helpUrlBase;
    }

    @Override
    public String getText(String code) {
        return messageTemplate.replace("$errorCode", code) + helpUrlBase+code;
    }
}
