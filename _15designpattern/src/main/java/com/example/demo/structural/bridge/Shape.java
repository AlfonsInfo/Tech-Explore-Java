package com.example.demo.structural.bridge;

abstract class Shape {

    //Key of bridge
    protected Renderer renderer;

    public Shape(Renderer renderer){
        this.renderer = renderer;
    }

    public abstract void draw();
}
