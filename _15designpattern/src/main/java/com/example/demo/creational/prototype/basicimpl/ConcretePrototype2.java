package com.example.demo.creational.prototype.basicimpl;

public class ConcretePrototype2 implements Prototype{

    @Override
    public Prototype clone() {
        return new ConcretePrototype2();
    }
}
