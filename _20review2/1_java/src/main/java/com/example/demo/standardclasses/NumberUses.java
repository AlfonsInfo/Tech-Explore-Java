package com.example.demo.standardclasses;

public class NumberUses {

    public static void conversionToNumber(){
        String sebuahAngka = "100";
        String sebuahAngka2 = "200";
        // parse int -> primitive ,value of -> boxing
        int sebuahAngkaInt = Integer.parseInt(sebuahAngka) + Integer.parseInt(sebuahAngka2);
        System.out.println(sebuahAngkaInt);
    }
    public static void main(String[] args) {
        conversionToNumber();
    }
}
