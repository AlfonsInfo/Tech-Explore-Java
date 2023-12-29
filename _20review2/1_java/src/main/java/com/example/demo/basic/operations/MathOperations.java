package com.example.demo.basic.operations;

import com.example.demo.basic.Constants;

public class MathOperations {

    public static void main(String[] args) {
        int a = 100;
        int b = 10;
        int randomNumber = Constants.random.nextInt(10) + 1;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % randomNumber);
    }
}
