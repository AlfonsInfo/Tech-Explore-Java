package com.example.demo.lambda.utilfunction;


import java.util.function.Supplier;

//Java.util.function package utilty membuat lambda
public class SupplierExample {

    //menerima argument, tetapi mengembalikan nilai
    public static void main(String[] args) {
        Supplier<String> supplier =() -> "alfonsus setiawan jacub";
        System.out.println(supplier.get());

    }
}
