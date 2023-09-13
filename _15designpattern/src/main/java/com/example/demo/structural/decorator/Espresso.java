package com.example.demo.structural.decorator;

public class Espresso implements Coffee{
    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double Cost() {
        return 1.99;
    }
}
