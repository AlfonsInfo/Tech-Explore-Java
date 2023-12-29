package com.example.demo.oop.additional.imply;

import com.example.demo.oop.additional.AbstractClass;

public class UseImply {
    public static void main(String[] args) {

        //abstract class can not have instantiated , but cna have anonymous class
        ImplyClass implyClass = new ImplyClass();
        implyClass.method1();
        implyClass.method2();

        implyClass.interfaceAMethod1();
        implyClass.interfaceAMethod2();

        // bisa akses method default, meskipun tidak di define ulang
        implyClass.interfaceMethod3();
    }
}
