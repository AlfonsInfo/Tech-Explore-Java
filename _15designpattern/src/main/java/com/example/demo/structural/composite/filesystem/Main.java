package com.example.demo.structural.composite.filesystem;

import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("Root");
        Directory rootC = new Directory("File C(System)");
        Directory rootD = new Directory("File D(Data)");

        root.addLeaf(rootC);
        root.addLeaf(rootD);

        File jadwalMatkul = new File("jadwalMatkul.png");
        Directory foto = new Directory("File Foto");

        rootD.addLeaf(jadwalMatkul);
        rootD.addLeaf(foto);


        root.componentCommand();
    }
}
