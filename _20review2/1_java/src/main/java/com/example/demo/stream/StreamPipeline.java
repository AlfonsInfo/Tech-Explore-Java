package com.example.demo.stream;

import java.util.List;

public class StreamPipeline {
    public static void main(String[] args) {
        List.of("Alfons", "Ucup", "Dustin", "Edo", "Angga", "Toni", "Yono", "Ucup")
                .stream()
                .map(String::toUpperCase)
                .map(upper -> "MR. " + upper)
                .forEach(System.out::println);
    }
}
