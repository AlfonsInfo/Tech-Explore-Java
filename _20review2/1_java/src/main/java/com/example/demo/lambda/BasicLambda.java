package com.example.demo.lambda;

public class BasicLambda {
    //Lambda berasal dr lambda calculus, mengacu pada anonymous function
    // praktik lambda di java berbeda dr bahasa lain
    // java memiliki anonymous class -> lambda simplifikasi dr anonymous class

    //syarat lambda
    //interfaces
    //1 method abstract
    //@FunctionalInterface
    @FunctionalInterface
    public interface SimpleAction{
        String action(String name);
    }

    public static void main(String[] args) {
        SimpleAction simpleAction = (String name) -> "Hello " + name;
        SimpleAction simpleAction2 = (String name) -> "Yoo bro " + name;
        System.out.println(simpleAction.action("alfons"));
        System.out.println(simpleAction2.action("broo"));

    }
}
