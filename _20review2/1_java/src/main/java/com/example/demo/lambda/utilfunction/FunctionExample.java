package com.example.demo.lambda.utilfunction;


import java.util.function.Function;

//Java.util.function package utilty membuat lambda
public class FunctionExample {

    //menerima argument, mengembalikan nilai
    public static void main(String[] args) {
        Function<String, Integer> function = value -> value.length();

        Integer length = function.apply("Alfonsus Setiawan Jacub");
        System.out.println(length);

    }
}
