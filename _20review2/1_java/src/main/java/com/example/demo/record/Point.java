package com.example.demo.record;

public record Point(Integer x, Integer y, Integer z) {

    //custom constructor wajib calling constructor utama
    public Point(Integer x, Integer y){
        this(x,y,null);
    }
}

class Main{
    public static void main(String[] args) {
        //constructor
        Point point = new Point(1,2,3);
        System.out.println(point);

        //getter
        System.out.println(point.x());
        System.out.println(point.y());
        System.out.println(point.z());

        Point point1 = new Point(1,2);
        System.out.println(point1);

    }
}
