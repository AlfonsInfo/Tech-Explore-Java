package com.example.demo.structural.bridge;

public class Square extends Shape{

    public Square(Renderer renderer) {
        super(renderer);
    }

    @Override
    public void draw() {
        //key of bridge
        renderer.renderShape("Square");
    }
}
