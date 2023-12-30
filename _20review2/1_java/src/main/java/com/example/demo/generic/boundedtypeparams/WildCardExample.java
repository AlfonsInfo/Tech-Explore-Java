package com.example.demo.generic.boundedtypeparams;

public class WildCardExample {

    public static class WildObject<T>{
        T data;
    }
     public static void print(WildObject<?> data){
        System.out.println(data.data);
    }
    public static void main(String[] args) {
        WildObject<String> data = new WildObject<>();
        data.data = "test";
        print(data);

    }
}
