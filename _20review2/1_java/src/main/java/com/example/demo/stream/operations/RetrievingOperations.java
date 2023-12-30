package com.example.demo.stream.operations;

import java.util.List;
import java.util.Objects;

import static java.lang.String.valueOf;

public class RetrievingOperations {
    public static void main(String[] args) {
        takeWhile();
        filter();
        limit();
        //skip
        //findAny & findFirst

    }

    private static void limit() {
        //take first data with match condition
        List<Object> dataKotor = List.of(
                "Alfonsus Setiawan Jacub",
                20,
                true,
                "Jamaludin",
                "aksdoaksoasdkoadskoadskoadskoaskaokasoksao",
                "woyyy",
                "alfons@gmail.com",
                "bambang@example.com",
                "tono@example.com"
        );

        dataKotor
                .stream()
                .takeWhile(o -> o instanceof String)
                .limit(1)
                .forEach(System.out::println);
    }


    private static void takeWhile() {
        //take first data with match condition
        List<Object> dataKotor = List.of(
                "Alfonsus Setiawan Jacub",
                20,
                true,
                "Jamaludin",
                "aksdoaksoasdkoadskoadskoadskoaskaokasoksao",
                "woyyy",
                "alfons@gmail.com",
                "bambang@example.com",
                "tono@example.com"
                );

        dataKotor
                .stream()
                .takeWhile(o -> o instanceof String)
//                .takeWhile(o -> ("" + o).contains("@"))
                //.takeWhile(o -> o.toString().contains("."))
                .forEach(System.out::println);
    }

    private static void filter() {
        //take first data with match condition
        List<Object> dataKotor = List.of(
                "Alfonsus Setiawan Jacub",
                20,
                true,
                "Jamaludin",
                "aksdoaksoasdkoadskoadskoadskoaskaokasoksao",
                "woyyy",
                "alfons@gmail.com",
                "bambang@example.com",
                "tono@example.com"
        );

        dataKotor
                .stream()
                .filter(o -> o instanceof String)
                .filter(o -> ("" + o).contains("@"))
                .filter(o -> o.toString().contains("."))
                .forEach(System.out::println);
    }
}
