package com.example.demo.reflection;

import java.util.Arrays;

public class ClassExample {

    public static void main(String[] args) {
        Class<Person> personClass = Person.class;
        System.out.println(Person.class.getSuperclass());
        System.out.println(personClass.getSuperclass());
        System.out.println(Arrays.asList(personClass.getInterfaces()));
        System.out.println(Arrays.asList(personClass.getDeclaredMethods()));
        System.out.println(personClass.getSimpleName());
    }

    public static class Person{
        String name;
        String age;

        public Person(String name, String age) {
            this.name = name;
            this.age = age;
        }

        public Person() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }
    }
}
