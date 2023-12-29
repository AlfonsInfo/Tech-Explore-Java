package com.example.demo.oop.additional;

public class DtoClass {
    public String response;
    public ErrorCode errorCode;

    enum ErrorCode {
        BAD_REQUEST,
        TOKEN_NOT_VALID,
        SUCCESS
    }
}
