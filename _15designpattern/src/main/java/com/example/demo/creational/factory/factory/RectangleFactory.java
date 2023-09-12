package com.example.demo.creational.factory.factory;

import com.example.demo.creational.factory.entity.Rectangle;
import com.example.demo.creational.factory.entity.Shape;

public class RectangleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}
