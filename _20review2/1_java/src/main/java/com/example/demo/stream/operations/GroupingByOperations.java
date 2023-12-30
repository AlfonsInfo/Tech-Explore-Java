package com.example.demo.stream.operations;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByOperations {
    public static void main(String[] args) {
        List<Integer> data = List.of(1,2,3,4,5,6,7,8,9,10);

        Map<String, List<Integer>> map = data.stream().collect(Collectors.groupingBy(integer -> integer > 5 ? "Besar" : "Kecil"));

        System.out.println(map);

        Map<Boolean, List<Integer>> map2 =  data.stream().collect(Collectors.partitioningBy(integer -> integer > 3));
        System.out.println(map2);

    }
}
