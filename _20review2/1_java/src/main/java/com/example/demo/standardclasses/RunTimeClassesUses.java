package com.example.demo.standardclasses;

public class RunTimeClassesUses {
    public static void main(String[] args) {
        //runtime getRuntime a singleton
        Runtime runtime = Runtime.getRuntime();
        Runtime runtime1 = Runtime.getRuntime();
        System.out.println(runtime == runtime1);

    }
}
