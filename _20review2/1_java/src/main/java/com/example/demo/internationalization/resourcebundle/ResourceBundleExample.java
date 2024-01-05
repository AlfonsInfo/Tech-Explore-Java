package com.example.demo.internationalization.resourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleExample {

    public static void basicUsingResourceBundle(){
        //message will become fallback
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message");
        System.out.println(resourceBundle.getString("hello"));
    }

    public static void usingResourceBundleWithLocale(){
        Locale indonesia = new Locale("id","ID");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message",indonesia);
        System.out.println(resourceBundle.getString("hello"));
    }

    public static void main(String[] args) {
        usingResourceBundleWithLocale();
    }
}
