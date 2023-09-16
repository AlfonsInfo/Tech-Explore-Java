package com.example.demo.structural.composite.shape;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {
    List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }
    @Override
    public void draw() {
        System.out.println("Menggambar gambar");
        shapes.forEach(System.out::println);
    }
}
