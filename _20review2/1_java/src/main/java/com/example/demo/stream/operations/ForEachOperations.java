package com.example.demo.stream.operations;

import java.util.List;

public class ForEachOperations {



    public static void main(String[] args) {
        List<String> data =  List.of("data","test","bambang", "test", "yooo");

        data.stream().peek(System.out::println)
                .map(String::toUpperCase)
                .peek(System.out::println)
                .map(String::toLowerCase)
                .peek(System.out::print);
        //progress lanjutanyna
    }
}


