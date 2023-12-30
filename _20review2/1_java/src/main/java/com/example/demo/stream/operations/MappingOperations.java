package com.example.demo.stream.operations;

import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Stream;

public class MappingOperations {
    public static void main(String[] args) {
//        map();
        flatMap();
    }

    private static void map() {
        List.of("Alfons", "Ucup", "Dustin", "Edo", "Angga", "Toni", "Yono", "Ucup")
                .stream()
                .map(String::toUpperCase)
                .map(upper -> "MR. " + upper)
                .forEach(System.out::println);
    }

    private static void flatMap() {
        List.of("Alfons", "Ucup", "Dustin", "Edo", "Angga", "Toni", "Yono", "Ucup")
                .stream()
                .map(String::toUpperCase)
                .map(upper -> "MR. " + upper)
                .flatMap(s -> Stream.of(s, s.length()))
                .map(s -> {
                    StringJoiner stringJoiner = new StringJoiner("", "{", "}");
                    stringJoiner.add(s.toString());
                    return stringJoiner.toString();
                })
                .forEach(System.out::print);
    }
}
