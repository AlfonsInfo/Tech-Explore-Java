package com.example.demo.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class MapExample {
    //Map mirip dengan array, pembedanyq index pada map tidak harus 0,1,2,3 tp bisa string atau lainnya
    //implementasi : HashMap, WeakHashMap,IdentityHashMap, LinkedHashMap, EnumHashMap
    public static void main(String[] args) {
        implyHashMap();
        weakHashMap();

    }

    private static void implyHashMap() {
        HashMap<String, String> hashMap = new HashMap<>(); // menggunakan implementasi hashCode
        hashMap.put("key1","value1");
        hashMap.put("key2","value2");
        hashMap.put("key3","value3");
        hashMap.put("key4","value4");
        hashMap.put("key5","value5");

        System.out.println(hashMap);
    }

    private static void weakHashMap() {
        Map<String, String> hashMap = new WeakHashMap<>(); // menggunakan implementasi hashCode
        hashMap.put("key1","value1");
        hashMap.put("key2","value2");
        hashMap.put("key3","value3");
        hashMap.put("key4","value4");
        hashMap.put("key5","value5");

        System.out.println(hashMap);
    }

    //IdentifyHashMap -> pengecekan kesamaan data berdasarkan memory penyimpanan
    }
