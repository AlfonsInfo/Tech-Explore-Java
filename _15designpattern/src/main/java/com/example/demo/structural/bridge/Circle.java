package com.example.demo.structural.bridge;

public class Circle extends Shape{
    public Circle(Renderer renderer) {
        super(renderer);
    }

    @Override
    public void draw() {
        renderer.renderShape("circle");
    }
}
