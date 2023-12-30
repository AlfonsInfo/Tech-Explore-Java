package com.example.demo.collection.set.sortedset;

import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        compareByAgeAsc();
        System.out.println("Descending height");
        compareByHeightDsc();
    }

    private static void compareByAgeAsc() {
        SortedSet<Person> people = new TreeSet<>(new PersonComparatorAge());
        people.add( new Person("Alfons", 21, 160));
        people.add( new Person("dodo", 11, 150));
        people.add( new Person("ucup", 15, 167));

        people.forEach(System.out::println);
    }

    private static void compareByHeightDsc() {
        SortedSet<Person> people = new TreeSet<>(new PersonComparatorHeight());
        people.add( new Person("Alfons", 21, 160));
        people.add( new Person("dodo", 11, 150));
        people.add( new Person("ucup", 15, 167));

        people.forEach(System.out::println);
    }
}
