package com.example.demo.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableListExample {

    public static void main(String[] args) {
        problemWithMutableList();
        imutableList();
    }

    public static class Person{
        private String nama;

        private List<String> hobbies;

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public List<String> getHobbies() {
            return hobbies;
        }

        public void addHobbies(String hobbies){
            this.hobbies.add(hobbies);
        }

        public void setHobbies(List<String> hobbies) {
            this.hobbies = hobbies;
        }
    }
    public static void problemWithMutableList(){
        Person person = new Person();
        person.setNama("alfons");
        person.setHobbies(new ArrayList<>());
        person.addHobbies("badminton");
        person.addHobbies("tidur");
        doSomethingWithHobbies(person.getHobbies());
        System.out.println(person.getHobbies());
    }

    public static void doSomethingWithHobbies(List<String> arrayList){
        arrayList.add("set hobi tidak ideal");

    }

    public static void imutableList(){
        List<String> mutableList1 = Collections.emptyList();
        List<String> singletonList = Collections.singletonList("TEST");
        List<String> unmodifiableList = Collections.unmodifiableList(new ArrayList<>());
        List<String> immutableList = List.of("data","test");

        System.out.println(mutableList1);
        System.out.println(singletonList);
        System.out.println(unmodifiableList);
        System.out.println(immutableList);


    }

}
