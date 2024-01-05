package com.example.demo.internationalization.i18n_datetime;

import org.springframework.format.annotation.DateTimeFormat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Pattern;

public class DateFormatExample {
    public static void main(String[] args) {
        String pattern = "EEEE dd MMMM yyyy";
        Locale indonesia = new Locale("id","ID");
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat(pattern,indonesia);
        System.out.println(format.format(date));

    }
}
