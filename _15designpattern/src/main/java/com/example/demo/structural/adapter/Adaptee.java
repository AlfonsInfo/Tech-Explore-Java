package com.example.demo.structural.adapter;

public class Adaptee {

    private String field1;
    private String field2;

    public Adaptee() {}

    public Adaptee(String field1, String field2)
    {
        this.field1 = field1;
        this.field2 = field2;
    }

    public void operation(){
        System.out.println(" The Functionality that needed");
    }

    public void operationWithField()
    {
        System.out.println("Print Field " + field1 +" " +  field2);
    }


}
