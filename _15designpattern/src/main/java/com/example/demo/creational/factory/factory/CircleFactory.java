package com.example.demo.creational.factory.factory;

import com.example.demo.creational.factory.entity.Circle;
import com.example.demo.creational.factory.entity.Shape;

public class CircleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
