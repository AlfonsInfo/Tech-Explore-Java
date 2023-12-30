package com.example.demo.basic.nullpointer;

public class NullPointerExample {

    public static void main(String[] args) {
        String data = null;
        String data2 = "test";

        System.out.println(data.equalsIgnoreCase(data2));
    }
}
