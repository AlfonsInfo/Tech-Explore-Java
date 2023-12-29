package com.example.demo.basic.flowcontrol;

import com.example.demo.basic.Constants;

public class ConditionalFlow {
    public static void main(String[] args) {
        System.out.println("Pilih : ");
        System.out.println("1. if-else if");
        System.out.println("2. switch case");

        int randomValue = Constants.random.nextInt(100) + 1;

        if(randomValue == 10){
            System.out.println("perfecto");
        }

        String monthNumber = String.valueOf(randomValue);
        String result;
        switch (monthNumber){
            case "1", "01" -> result = "Januari";
            case "2", "02" -> result = "Febrauri";
            default -> result = "Bulan Apa bagus ?? ";
        }

        System.out.println(result);

    }
}
