package com.example.demo.builder.builderex1.builder;

import com.example.demo.builder.builderex1.Product;

// Director class : Bersifat Opsional
public class   Director {

    //If product is a complex, the direction of creating project define here
    public Product constructProduct(ProductBuilder builder) {
        builder.buildPart1("Part 1");
        builder.buildPart2("Part 2");
        builder.buildPart3("Part 3");
        return builder.build();
    }
}
