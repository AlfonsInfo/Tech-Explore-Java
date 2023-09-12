package com.example.demo.builder.builderex1;


import com.example.demo.builder.builderex1.builder.ConcreteProductBuilder;
import com.example.demo.builder.builderex1.builder.Director;
import com.example.demo.builder.builderex1.builder.ProductBuilder;
import com.example.demo.builder.builderex1.chainbuilder.ConcreteFluentProductBuilder;
import com.example.demo.builder.builderex1.chainbuilder.FluentProductBuilder;

public class BuilderMainExample {

    public static void createUsingBuilderWithoutDirector(){
        ProductBuilder productBuilder = new ConcreteProductBuilder();
        productBuilder.buildPart1("part1");
        productBuilder.buildPart2("part2");
        productBuilder.buildPart3("part3");
        Product product = productBuilder.build();
        System.out.println(product);
    }

    public static void createUsingBuilderAndDirector()
    {
        Director director = new Director();
        ProductBuilder builder = new ConcreteProductBuilder();

        Product product = director.constructProduct(builder);
        System.out.println(product);
    }

    public static void chainingBuilder()
    {
        FluentProductBuilder productBuilder = new ConcreteFluentProductBuilder();
        Product product =  productBuilder.buildPart1("mantap").buildPart2("mantap").buildPart3("mantap lagi").build();
        System.out.println(product);
    }
    public static void main(String[] args) {
//        createUsingBuilderAndDirector();
    chainingBuilder();
    }
}
