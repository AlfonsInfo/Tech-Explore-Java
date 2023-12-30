package com.example.demo.stream;

import java.util.stream.Stream;

public class BasicStream {
    //Stream : aliran data yang melewatkan operasi" tertentu
    public static void main(String[] args) {
        defineStream();
        simpleStream();


    }

    private static void simpleStream() {
        Stream<String> streamNames = Stream.of("Alfonsus", "Setiawan", "Jacub ");
        streamNames.map(String::trim)
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    private static void defineStream() {
        Stream<String> streamVar1 =Stream.of("alfons");
        Stream<String> streamVar2 =Stream.empty();
        Stream<String> streamVar3 =Stream.ofNullable(null);
    }
}
