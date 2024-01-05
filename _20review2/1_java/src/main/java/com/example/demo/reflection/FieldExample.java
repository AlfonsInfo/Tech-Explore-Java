package com.example.demo.reflection;

import java.lang.reflect.Field;

public class FieldExample {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        fields();


        getField();

        setField();

    }

    private static void getField() throws NoSuchFieldException, IllegalAccessException {
        Person person = new Person("alfons", "21");
        Field field = person.getClass().getDeclaredField("age");
        field.setAccessible(true);

        String result    = (String) field.get(person);
        System.out.println(result);
    }


    private static void setField() throws NoSuchFieldException, IllegalAccessException {
        Person person = new Person("alfons", "21");
        Field field = person.getClass().getDeclaredField("age");
        field.setAccessible(true);
        field.set(person, "30");
        String result    = (String) field.get(person);
        System.out.println(result);
    }
    private static void fields() {
        Field[] fields = Person.class.getFields();
        Field[] declaredFields = Person.class.getDeclaredFields();
        for (Field f:declaredFields) {
            System.out.println(f.getName());
        }
    }
}
