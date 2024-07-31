package com.example.demo.solid.liskov;

import com.example.demo.solid.liskov.pewarisan.Child1;

public class Main {


    public static void main(String[] args) {
        Parent parent = new Child1();
        //Child1 c1 = new Parent();
        //Child2 c2 = new Parent();
        parent.parentMethod();

        Child1 child1 = new Child1();
        child1.child1Method();
        child1.parentMethod();


    }

}
