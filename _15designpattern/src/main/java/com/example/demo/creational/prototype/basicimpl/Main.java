package com.example.demo.creational.prototype.basicimpl;

public class Main {
    public static void main(String[] args) {
        Prototype prototype1 = new ConcretePrototype1("field1");
        Prototype prototype2 = new ConcretePrototype2();

        // Create new objects by cloning the prototypes
        Prototype clone1 = prototype1.clone();
        Prototype clone2 = prototype2.clone();

        System.out.println(prototype1);
        System.out.println(clone1);
    }
}
