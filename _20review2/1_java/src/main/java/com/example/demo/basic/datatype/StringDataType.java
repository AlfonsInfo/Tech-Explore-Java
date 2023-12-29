package com.example.demo.basic.datatype;

import com.example.demo.basic.Constants;
import org.yaml.snakeyaml.scanner.Constant;

public class StringDataType {
    public static void main(String[] args) {
        String message = "Hello World";
        String aRandomString;

        int randomFactor = Constants.random.nextInt(10) + 1;

        if(randomFactor<5){
            aRandomString = null;
        }else {
            aRandomString = "Hello World";
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.equalsIgnoreCase(aRandomString));
        System.out.println(aRandomString.equalsIgnoreCase(message));
        // =* == tidak ngebandingin value, tapi referensi objek pada konteks string jika tidak implementasi equals

    }
}
