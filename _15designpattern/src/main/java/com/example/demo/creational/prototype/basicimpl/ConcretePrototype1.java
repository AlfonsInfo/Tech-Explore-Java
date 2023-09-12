package com.example.demo.creational.prototype.basicimpl;

public class ConcretePrototype1 implements Prototype{
    private String field1;


    public ConcretePrototype1(String field1) {
        this.field1 = field1;
    }

    @Override
    public Prototype clone() {
        // not return this, if return this you return same object not a clone of an object
        return new ConcretePrototype1(this.field1);
    }

    @Override
    public String toString() {
        return "ConcretePrototype1{" +
                "field1='" + field1 + '\'' +
                '}';
    }
}
