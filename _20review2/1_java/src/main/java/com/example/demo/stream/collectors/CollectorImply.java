package com.example.demo.stream.collectors;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorImply {
    public static void main(String[] args) {

        List<String> dataEmail = limit();

        System.out.println(dataEmail);

    }

    private static List<String> limit() {
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

        return dataKotor
                .stream()
                .filter(String.class::isInstance)
                .filter(o -> ((String) o).contains("@"))
                .filter(o -> ((String) o).contains("."))
                .map(Object::toString)
                .collect(Collectors.toList());
    }

}
