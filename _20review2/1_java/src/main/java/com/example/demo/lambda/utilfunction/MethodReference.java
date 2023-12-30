package com.example.demo.lambda.utilfunction;

import java.util.List;
import java.util.function.Predicate;

public class MethodReference {

    public class StringUtils{
        public static boolean isLowerCase(String value){
            for(char c : value.toCharArray()){
                if(!Character.isLowerCase(c)){
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        Predicate<String> predicate = StringUtils::isLowerCase;
        System.out.println(predicate.test("yoo"));

        List<String> data = List.of("data1","data2");
        data.forEach(System.out::println);
    }
}
