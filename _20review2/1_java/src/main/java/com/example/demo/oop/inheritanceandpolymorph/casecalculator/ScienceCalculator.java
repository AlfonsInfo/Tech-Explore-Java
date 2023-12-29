package com.example.demo.oop.inheritanceandpolymorph.casecalculator;

public class ScienceCalculator extends Calculator{
    @Override
    public int add(int a, int b) {
        return super.add(a, b);
    }

    @Override
    public int sub(int a, int b) {
        return super.sub(a, b);
    }

    @Override
    public int mul(int a, int b) {
        return super.mul(a, b);
    }

    @Override
    public int div(int a, int b) {
        return super.div(a, b);
    }

    public int aScienceComputation(int a, int c){
        //a complex processing
        return 0;
    }
}
