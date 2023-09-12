package com.example.demo.builder.builderex1.chainbuilder;

import com.example.demo.builder.builderex1.Product;

public interface FluentProductBuilder {
    FluentProductBuilder buildPart1(String part1);
    FluentProductBuilder buildPart2(String part2);
    FluentProductBuilder buildPart3(String part3);
    abstract Product build();
}
