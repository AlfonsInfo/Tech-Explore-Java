package com.example.demo.standardclasses;

import java.util.StringJoiner;
import java.util.StringTokenizer;

//String is an immutable object
public class StringUses {

    public static void demoStringBehaviour(){
        //1. When variable value same, it is save at same hashcode
        String string1 = "Hello";
        String string2 = "Hello";

        System.out.println(string1.hashCode());
        System.out.println(string2.hashCode());

        //but when the value changes, it saves on differences hashcode
        string1 += " " + "Alfons";
        System.out.println(string1);
        System.out.println(string1.hashCode());

        string1 += " " + "Alfons Ganti";
        System.out.println(string1);
        System.out.println(string1.hashCode());
    }


    public static void demoStringBuffer(){
        StringBuffer stringBuffer = new StringBuffer();
        String hasil = stringBuffer.append("depannya nih").append(" ").append(": lanjut apalagi bro").toString();
        System.out.println(hasil);
    }

    public static void demoStringBuilder(){
        StringBuilder stringBuilder = new StringBuilder();
        String hasil = stringBuilder.append("depannya nih").append(" ").append(": lanjut apalagi bro").toString();
        System.out.println(hasil);
    }

    public static void demoStringJoiner(){
        String[] programmingLanguages = {"JAVA", "PHP", "PYTHON"};

        StringJoiner joiner = new StringJoiner(",", "{", "}");
        for(String programmingLanguage : programmingLanguages){
            joiner.add(programmingLanguage);
        }
        System.out.println(joiner);
    }

    public static void demoStringTokenizer(){
        String name = "Alfonsus Setiawan Jacub Ganteng";
        StringTokenizer tokenizer = new StringTokenizer(name , " ");
        while(tokenizer.hasMoreTokens()){
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
    public static void main(String[] args) {
        demoStringBehaviour();
        demoStringBuffer();
        demoStringBehaviour();
        demoStringJoiner();
        demoStringTokenizer();
    }
}
