package com.example.demo.builder.builderex1.builder;

import com.example.demo.builder.builderex1.Product;

// Builder interface
public interface ProductBuilder {
    void buildPart1(String part1);
    void buildPart2(String part2);
    void buildPart3(String part3);
    abstract Product build();
}
