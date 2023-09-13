package com.example.demo.structural.bridge;


//Main as a client
public class Main {
    public static void main(String[] args) {
        Renderer vectorRenderer = new VectorRenderer();
        Renderer rasterRenderer = new ResterRenderer();

        Shape circle = new Circle(vectorRenderer);
        Shape square = new Square(rasterRenderer);

        circle.draw();  // Output: Drawing Circle in vector format
        square.draw();  // Output: Drawing Square in raster format

    }
}
