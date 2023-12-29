package com.example.demo.oop.additional.imply;

import com.example.demo.oop.additional.AbstractClass;
import com.example.demo.oop.additional.AnInterface;

public class ImplyClass extends AbstractClass implements AnInterface {

    // Wajib implementasi method


    @Override
    protected void method1() {
        System.out.println("test");
    }

    @Override
    protected void method2() {
        super.method2();
    }


    // Imply an interfaces


    @Override
    public void interfaceAMethod1() {
        System.out.println("interfaces");
    }

    @Override
    public void interfaceAMethod2() {
        System.out.println("interfaces 2");
    }


}
