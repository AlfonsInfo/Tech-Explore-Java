package com.example.demo.dip;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class Message {
    private String msg;

    private LocalDateTime timeStamp;

    public Message(String msg)
    {
        this.msg = msg;
        this.timeStamp = LocalDateTime.now(ZoneId.of("UTC"));
    }


    public String getMsg() {
        return msg;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }
}
