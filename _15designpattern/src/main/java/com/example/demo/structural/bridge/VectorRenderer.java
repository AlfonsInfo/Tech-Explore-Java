package com.example.demo.structural.bridge;

public class VectorRenderer implements  Renderer{


    @Override
    public void renderShape(String shape) {
        System.out.println("Drawing "  + shape + " in vector format");
    }
}
