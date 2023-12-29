package com.example.demo.standardclasses;

import java.util.Base64;

public class Base64Uses {

    public static void  encodeForIamge(){
        System.out.println("Kapan kapan imply");
    }

    public static void main(String[] args) {
        String test = "yoo";
        String encode = Base64.getEncoder().encodeToString(test.getBytes());
        System.out.println(encode);
        String decode = new String(Base64.getDecoder().decode(encode));
        System.out.println(decode);
        encodeForIamge();
    }
}
