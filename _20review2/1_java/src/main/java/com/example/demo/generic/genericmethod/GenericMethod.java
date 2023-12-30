package com.example.demo.generic.genericmethod;

public class GenericMethod {

    public static <T> int count(T[] array){
        return array.length;
    }

    public static void main(String[] args) {
        String[] names = {"alfons", "beembeng", "yoyo"};
        Integer[] numbers = {1,3,4,56};
        System.out.println(count(names));
        System.out.println(GenericMethod.<Integer>count(numbers));
    }
}
