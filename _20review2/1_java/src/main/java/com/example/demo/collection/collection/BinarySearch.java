package com.example.demo.collection.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0 ;i <100 ;i++){
            numbers.add(i);
        }
        //data harus berurutan
        int index = Collections.binarySearch(numbers, 500);
        System.out.println(index);
    }
}
