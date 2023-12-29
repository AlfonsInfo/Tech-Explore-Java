package com.example.demo.basic.flowcontrol;

public class IterativeFlow {
    public static void main(String[] args) {
        for(int i = 0; i<5;i++){
            System.out.println(i);
        }

        int i = 0;
        while (i<5){
            System.out.println(i);
            i++;
        }

        String[] arrayOfString = new String[]{"string 1", "string 2", "string 3"};

        for (String s : arrayOfString) {
            System.out.println(s);
        }
    }
}
