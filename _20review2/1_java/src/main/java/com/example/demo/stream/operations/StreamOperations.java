package com.example.demo.stream.operations;

import java.util.List;
import java.util.stream.Stream;

//Stream operations :
//intermediate operations : lazy - mengembalikan stream lagi
//Terminal Operation : trigger stream

public class StreamOperations {
    public static void main(String[] args) {
        List<String> names = List.of("alfons", "bambang", "ucup", "dustin");
        Stream<String> namesStream = names.stream();
        Stream<String> upperNamesStream = namesStream.map(String::toUpperCase);
        upperNamesStream.forEach(System.out::println);

    }
}
