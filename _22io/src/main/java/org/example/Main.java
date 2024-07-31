package org.example;

import org.example.basic.ExampleCharStream;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        System.out.println("START PROGRAM");

        try {
            //UseCaseFile.createFile();
            //UseCaseFile.deleteFile();
            ExampleCharStream.writeAndReadInputStream();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}