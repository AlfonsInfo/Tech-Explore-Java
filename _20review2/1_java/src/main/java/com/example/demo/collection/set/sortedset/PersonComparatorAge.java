package com.example.demo.collection.set.sortedset;

import java.util.Comparator;

public class PersonComparatorAge implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getUmur().compareTo(o2.getUmur());
    }
}
