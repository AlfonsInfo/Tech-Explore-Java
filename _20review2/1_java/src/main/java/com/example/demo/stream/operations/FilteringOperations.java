package com.example.demo.stream.operations;

import java.util.List;
import java.util.stream.Stream;

public class FilteringOperations {
    public static List<String> data = List.of("Data 1", "Data 2" , "Data 3", "Data 4", "Test 1", "Test 2", "Test 3","Data 3", "Data 4", "Test 1", "Test 2", "Test 32");
    public static List<Integer> dataInteger = List.of(1,2,123,12,32,324,2,51,23,13,213,12431);


    public static void distinctImply(){
        Stream<String>  streamData = data.stream();
        streamData.distinct().forEach(System.out::println);
    }

    public static void filterImply(){
        Stream<Integer>  streamData = dataInteger.stream();
        List<Integer> hasilFilter =  streamData.filter(s -> s % 2 == 0 ).toList();
        System.out.println(hasilFilter);
    }
    public static void main(String[] args) {
        distinctImply();
        filterImply();
    }
}
