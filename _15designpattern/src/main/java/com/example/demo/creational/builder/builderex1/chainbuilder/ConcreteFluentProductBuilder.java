package com.example.demo.creational.builder.builderex1.chainbuilder;

import com.example.demo.creational.builder.builderex1.Product;

public class ConcreteFluentProductBuilder implements FluentProductBuilder {
    // return this product :)


    private Product product = new Product();
    @Override
    public FluentProductBuilder buildPart1(String part1) {
        product.setPart1(part1);
        return this;
    }

    @Override
    public FluentProductBuilder buildPart2(String part2) {
        product.setPart2(part2);
        return this;
    }

    @Override
    public FluentProductBuilder buildPart3(String part3) {
        product.setPart3(part3);
        return this;
    }

    @Override
    public Product build() {
        return product;
    }
}
