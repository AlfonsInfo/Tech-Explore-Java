package com.example.demo.collection.set;

import java.util.*;

public class SetExample {

    /**
     *  collection berisi elemen unik
     *  tidak memiliki index
     *  implementasi dari collection dan iterable
     *  kelas konkritnya HashSet dan LinkedHashSet (data disimpan disuatu hashTable dengan mengkalkulasi hashCode)
     *  LinkedHashSet -> data terurut.. // butuh terurut atau tidak ?
     */


    public static void main(String[] args) {
        implyHashSet();
        implyLinkedHashSet();
        implyEnumHashSet();

    }

    private static void emptySet(){
        Set<String> immutableSet1 = Collections.emptySet();
        Set<String> immutableSet2 = Collections.singleton("TEST");
        Set<String> immutableSet3 = Collections.unmodifiableSet(new HashSet<>());
        Set<String> immutablSet4 = Set.of("data","test");

        System.out.println(immutableSet1);
        System.out.println(immutableSet2);
        System.out.println(immutableSet3);
        System.out.println(immutablSet4);
    }
    private static void implyHashSet() {
        Set<String> token = new HashSet<>();
        token.add("satu");
        token.add("dua");
        token.add("tiga");
        token.add("empat");
        token.add("lima");

        System.out.println(token);
    }

    private static void implyLinkedHashSet() {
        Set<String> token = new LinkedHashSet<>();
        token.add("satu");
        token.add("dua");
        token.add("tiga");
        token.add("empat");
        token.add("lima");

        System.out.println(token);
    }

    enum Level{
       EASY,
        MEDIUM,
       HARD
    }

    private static void implyEnumHashSet(){
        EnumSet<Level> enumSet = EnumSet.allOf(Level.class);
        System.out.println(enumSet);

    }
}
