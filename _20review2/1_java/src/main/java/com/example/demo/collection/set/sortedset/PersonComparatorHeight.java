package com.example.demo.collection.set.sortedset;

import java.util.Comparator;

public class PersonComparatorHeight implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o2.getTinggi().compareTo(o1.getTinggi());
    }
}
