package com.example.demo.basic.datatype;

import com.example.demo.basic.Constants;

import java.util.Random;

public class BooleanDataType {
    //primitive boolean

    public static boolean randomCondition(){
        int randomValue =  Constants.random.nextInt(10) + 1;
        return randomValue > 5;
    }
    public static void main(String[] args) {
        boolean truePrimitive = randomCondition();
        boolean falsePrimitive =  randomCondition();

        //class wrapper of boolean
        Boolean trueObject  = randomCondition();
        Boolean falseObject = randomCondition();

        System.out.println(trueObject.equals(randomCondition()));
        System.out.println(Boolean.FALSE.equals(falseObject));
    }

}
