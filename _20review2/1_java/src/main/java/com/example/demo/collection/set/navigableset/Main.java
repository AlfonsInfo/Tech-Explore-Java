package com.example.demo.collection.set.navigableset;

import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //navigable menyediakan method-method navigasi
        NavigableSet<String> navigableSet = new TreeSet<>();
        navigableSet.addAll(List.of("bambang", "tono", "yodit"));

        NavigableSet<String> nameDesc = navigableSet.descendingSet();
        NavigableSet<String> headSet = navigableSet.headSet( "yodit",true);
    }
}
