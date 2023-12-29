package com.example.demo.oop.additional.imply;

import com.example.demo.oop.additional.AnRecord;

public class UseRecord {
    static final AnRecord anRecord = new AnRecord("test","password");

    public static void main(String[] args) {
        System.out.println(anRecord.username());
    }
}
