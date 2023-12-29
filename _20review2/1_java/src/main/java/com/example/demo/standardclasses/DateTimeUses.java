package com.example.demo.standardclasses;

import java.util.Calendar;
import java.util.Date;

public class DateTimeUses {

    public static void dateDemo(){
        Date date = new Date();
        long milliSecond = date.getTime();

        System.out.println(date);
        System.out.println(milliSecond);
        System.out.println(date.getMonth());
    }


    public static void calendarDemo(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2000);

        Date date = calendar.getTime();
        long milliSecond = date.getTime();
        System.out.println(milliSecond);
        System.out.println(date);
    }
    public static void main(String[] args) {
        dateDemo();
        calendarDemo();
    }
}
