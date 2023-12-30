package com.example.demo.collection.map;

import java.util.HashMap;
import java.util.Map;

public class EntryMap {
    //pair (key-value)
    public static void main(String[] args) {
        Map<Integer, String> data = new HashMap<>();
        for(int i = 0 ; i < 5 ;i++){
            data.put(i , "data" + i);
        }

        data.forEach((k, v) ->
                System.out.println("" + k + "   " + v)
        );
    }
}
