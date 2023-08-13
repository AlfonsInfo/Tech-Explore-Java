package _1stringclasses;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {


        // STRING CLASSESS

//        System.out.println("String Classes");
//        StringImpl string = new StringImpl("Alfonsus Setiawan Jacub");
//        System.out.println("Implementasi to Lower Case");
//        System.out.println(string.toLowerCase());
//        System.out.println("Implementasi to Upper Case");
//        System.out.println(string.toUpperCase());
//        System.out.println("Length");
//        System.out.println(string.length());
//        System.out.println("Starts with ?");
//        System.out.println(string.startsWith("Alfons"));
//        System.out.println(string.endsWith("Jacub"));
//        String[] hasilSplit = string.split(" ");
//        System.out.println(hasilSplit[0]);
//        for (String hasil: hasilSplit
//             ) {
//            System.out.println(hasil);
//        }


        //STRING BUILDER DAN STRING BUFFER (Java Lang) THREAD SAFE & UNSAFE
        StringBuilder builder = new StringBuilder();
        //Bayangkan jika data dibawah ini mengalami perubahan dari Alfons,
        //builder.append("Alfons").append(" ").append(" ").append("Setiawan").append(1);
        builder.append("Alfons");
        builder.append(" ");
        builder.append("Setiawan");
        System.out.println(builder); //defaultnya udah toString


//        //STRING JOINER CLASS (Java Util)
//        String[] names = {"Alfons", "Bambang" , "Ucup", "Saprudin"};
//        StringJoiner  joiner = new StringJoiner(", ","[","]");
//        for(var name : names)
//        {
//            joiner.add(name);
//        }
//        System.out.println(joiner); //joiner.tostring
//


        //STRING TOKENIZER CLASS //INCASE STRING YANG MAU DIPOTONG BANYAK PULUHAN MEGA
        String tokenizerTarget = "Ini Tokenizer Class";
        StringTokenizer tokenizer = new StringTokenizer(tokenizerTarget, " ");
        while (tokenizer.hasMoreTokens()){
            String token = tokenizer.nextToken(); // Lazy System, ketika dibutuhkan baru dipotong.
            System.out.println(token);
        }
    }
}