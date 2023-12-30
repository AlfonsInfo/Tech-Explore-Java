package com.example.demo.generic.comparable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparableExample {

    public static class ComparableObject implements Comparable<ComparableObject>{
        private Integer id;
        private String nameObject;

        public ComparableObject(Integer id, String nameObject) {
            this.id = id;
            this.nameObject = nameObject;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getNameObject() {
            return nameObject;
        }

        public void setNameObject(String nameObject) {
            this.nameObject = nameObject;
        }

        @Override
        public String toString() {
            return "ComparableObject{" +
                    "id=" + id +
                    ", nameObject='" + nameObject + '\'' +
                    '}';
        }

        @Override
        public int compareTo(ComparableObject o) {
            return  this.id.compareTo(o.id);
        }
    }

    public static void main(String[] args) {
        List<ComparableObject> data = List.of(
                new ComparableObject(1,"test"),
                new ComparableObject(3,"data 2"),
                new ComparableObject(2,"data 3")
        );

        ComparableObject[] objects = data.toArray(new ComparableObject[3]);

        Arrays.sort(objects);

        iterateAndPrint("Short By id", objects);

        Comparator<ComparableObject> comparator = new Comparator<ComparableObject>() {
            @Override
            public int compare(ComparableObject o1, ComparableObject o2) {
                return o1.getNameObject().compareTo(o2.getNameObject());
            }
        };

        Arrays.sort(objects, comparator);

        iterateAndPrint("Short by name", objects);
    }

    private static void iterateAndPrint(String shortBy, ComparableObject[] objects) {
        System.out.println(shortBy);
        for (ComparableObject object : objects) {
            System.out.println(object.toString());
        }
    }
}
