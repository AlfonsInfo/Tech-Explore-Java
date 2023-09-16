package com.example.demo.structural.composite.filesystem;


import com.example.demo.structural.composite.filesystem.Composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Composite {

    private String name;
    private List<Composite> file = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public void componentCommand(){
        System.out.println("Hello from dirctory " + name);
        file.forEach(Composite::componentCommand);
    }


    public void addLeaf(Composite composite){
        file.add(composite);
    }


}
