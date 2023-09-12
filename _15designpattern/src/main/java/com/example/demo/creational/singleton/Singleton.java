package com.example.demo.creational.singleton;

public class Singleton {

    //Static instance variable
    private static Singleton instance;

    // Private Constructor
    private Singleton()
    {

    }

    public static Singleton getInstance(){
        if(instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }
}
