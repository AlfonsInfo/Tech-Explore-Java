package com.example.demo.database.legacypattern.utils;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

public class LogTemplate {

    private LogTemplate(){}

    private static String getCurrentTime(){
        Date date = new Date();
        int hours = date.getHours();
        int minute = date.getMinutes();
        int seconds = date.getSeconds();
        return "[" + hours + ":"+minute+":"+seconds + "] ";
    }
    public static void openingDb(){
        System.out.println(getCurrentTime() + "[Opening DB]");
    }

    public static void closingDb(){
        System.out.println(getCurrentTime() + "[Closing Database]");
    }


    public static void successMessage(){
        System.out.println(getCurrentTime() + "Success");
    }

    public static void errorMessage(String error, String errorContext){
        System.out.println(getCurrentTime() + "Error " + error + (Objects.nonNull(errorContext) ? "on " + errorContext : null ));
    }

    public static void daoLog (String nameAction, String result){
        System.out.println(getCurrentTime() + nameAction + (Objects.nonNull(result) ? " Result :" + result : null));
    }

    public static <T>  void  logData (T data){
        System.out.println(getCurrentTime() + data) ;
    }


}
