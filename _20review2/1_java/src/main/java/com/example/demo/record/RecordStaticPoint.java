package com.example.demo.record;

public record RecordStaticPoint(int x , int y) implements AnInterface{

    public static Point ZERO = new Point(0,0);

    @Override
    public String sayHello(String data) {
        return "data " + data;
    }
}


interface AnInterface{
    String sayHello(String data);

    default String sayHello(){
        return sayHello("Data : defaults" ) ;
    }
}