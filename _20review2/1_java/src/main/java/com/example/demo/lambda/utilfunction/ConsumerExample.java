package com.example.demo.lambda.utilfunction;


import java.util.function.Consumer;
import java.util.function.Function;

//Java.util.function package utilty membuat lambda
public class ConsumerExample {

    //menerima argument, tidak mengembalikan nilai
    public static void main(String[] args) {
        Consumer<String> consumer = value -> System.out.println(value);

        consumer.accept("alfons");


    }
}
