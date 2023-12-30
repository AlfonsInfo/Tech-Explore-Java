package com.example.demo.stream;

import java.util.stream.Stream;

public class StreamBuilder {
    public static void main(String[] args) {
        Stream.Builder<String> builder = Stream.builder();
        builder.accept("Alfons");
        builder.add("Bambang");
        builder.add("Yono");
        builder.add("Yono");

        Stream<String> stream = builder.build();
        stream.forEach(System.out::println);
    }
}
