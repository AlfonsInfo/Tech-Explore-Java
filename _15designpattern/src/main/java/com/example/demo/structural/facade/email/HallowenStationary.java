package com.example.demo.structural.facade.email;

public class HallowenStationary implements Stationary{

    @Override
    public String getHeader() {
        return "It's Halloween!!";
    }

    @Override
    public String getFooter() {
        return "BUY MORE STUFF! It's Halloween, c'mon!!";
    }
}
