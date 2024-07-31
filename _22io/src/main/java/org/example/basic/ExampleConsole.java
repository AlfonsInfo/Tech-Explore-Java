package org.example.basic;

import java.io.*;

public class ExampleConsole {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ExampleConsole.main");
        System.err.println("Error");

        System.out.println("Input Data");
        in.readLine();
    }
}
