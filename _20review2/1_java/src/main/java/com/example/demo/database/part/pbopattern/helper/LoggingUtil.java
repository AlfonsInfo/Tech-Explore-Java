package com.example.demo.database.part.pbopattern.helper;

public class LoggingUtil {

    private LoggingUtil(){}

    public static void openingDbMessage(){
        System.out.println("Openning Database");
    }

    public static void closingDbMessage(){
        System.out.println("Closing Database");
    }

    public static void errorDb(String error){
        System.out.println("Error " + error);
    }

    public static void successMessage(){
        System.out.println("Success");
    }
}
