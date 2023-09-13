package com.example.demo.structural.bridge;

public class ResterRenderer implements  Renderer{

    @Override
    public void renderShape(String shape) {
        System.out.println("Drawing "  + shape + " in raster format");
    }
}
