package com.example.demo.oop.basic;

import java.util.Hashtable;
import java.util.Map;

public class CreateObject {
    public static void main(String[] args) {
        BluePrintObject object1 = new BluePrintObject();
        object1.setId("1");
        object1.setNamaObject("OBJECT 1");

        System.out.println(object1.toString());


        //Object2
        Map<String, String> attributeObject2 = new Hashtable<>();
        attributeObject2.put("attribut1","value1");
        attributeObject2.put("attribut2","value2");
        BluePrintObject object2 = new BluePrintObject("2", "OBJECT 2",attributeObject2);
        System.out.println(object2);
    }
}
