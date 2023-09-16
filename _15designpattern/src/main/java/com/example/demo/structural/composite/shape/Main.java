package com.example.demo.structural.composite.shape;

public class Main {

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Drawing drawing = new Drawing();

        drawing.addShape(circle1);
        drawing.addShape(circle2);

        drawing.draw();
    }
}
