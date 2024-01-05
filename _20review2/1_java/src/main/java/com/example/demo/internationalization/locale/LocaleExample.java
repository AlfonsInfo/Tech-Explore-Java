package com.example.demo.internationalization.locale;

import java.util.Locale;

public class LocaleExample {


    public static void usingLocale(){
        String languageId = "id";
        String countryId = "ID";

        Locale locale = new Locale(languageId,countryId);

        System.out.println(locale.getCountry());
        System.out.println(locale.getLanguage());
        System.out.println(locale.getDisplayCountry());
        System.out.println(locale.getDisplayLanguage());
    }

    public static void main(String[] args) {
        System.out.println("Using Locale");
        usingLocale();
    }
}
