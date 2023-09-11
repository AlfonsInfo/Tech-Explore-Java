package com.example.demo.dip;

public class TextFormatter {
    public String format(Message message)
    {
        return message.getTimeStamp() + ":" + message.getMsg();
    }
}
