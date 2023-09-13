package com.example.demo.structural.adapter;

public class Adapter implements Target {

    private Adaptee adaptee ;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void neededFunctionality() {
        adaptee.operation();
    }

    public void neededFunctionality2()
    {
        adaptee.operationWithField();
    }

}
