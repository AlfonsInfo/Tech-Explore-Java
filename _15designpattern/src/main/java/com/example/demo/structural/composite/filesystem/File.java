package com.example.demo.structural.composite.filesystem;

import com.example.demo.structural.composite.filesystem.Composite;

public class File implements Composite {

    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void componentCommand(){
        System.out.println("Hello from leaf " + name);
    }




}
