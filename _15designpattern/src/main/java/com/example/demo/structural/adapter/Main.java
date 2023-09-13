package com.example.demo.structural.adapter;

public class Main {

    public static void aOperation(Target target){
        target.neededFunctionality();
    }

    public static void exampleOne()
    {
        Adaptee adaptee = new Adaptee();
        Adapter adapter = new Adapter(adaptee);
        aOperation(adapter);
    }

    public static void exampleTwo()
    {
        Adaptee adaptee = new Adaptee("Test", "Mantap");
        Adapter adapter = new Adapter(adaptee);
        adapter.neededFunctionality2();
    }

    public static void main(String[] args) {
        exampleTwo();
    }
}
