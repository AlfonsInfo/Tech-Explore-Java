package com.example.demo.creational.factory;

import com.example.demo.creational.factory.entity.Shape;
import com.example.demo.creational.factory.factory.CircleFactory;
import com.example.demo.creational.factory.factory.RectangleFactory;
import com.example.demo.creational.factory.factory.ShapeFactory;

public class Main {

    public static void drawCircle()
    {
        ShapeFactory circleFactory = new CircleFactory();
        Shape circle = circleFactory.createShape();
        circle.draw();
    }

    public static void drawRectangle()
    {
        ShapeFactory rectangleFactory = new RectangleFactory();
        Shape rectangle = rectangleFactory.createShape();
        rectangle.draw();
    }
    public static void main(String[] args) {
        drawCircle();
        drawRectangle();
    }

}
