package com.example.demo.structural.facade.email;


import com.example.demo.structural.facade.email.HallowenStationary;
public class StationaryFactory {

    public static Stationary createStationary() {
        return new HallowenStationary();
    }
}
