package com.example.demo.stream.operations;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrderingOperations {

    public static class DataPerson{
        private String name;
        private Integer age;

        public String getName() {
            return name;
        }

        public DataPerson(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }


        @Override
        public String toString() {
            return "DataPerson{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static class ComparePersonByName implements Comparator<DataPerson>{
        @Override
        public int compare(DataPerson o1, DataPerson o2) {
            return o1.getName().compareTo(o2.name);
        }
    }

    public static class ComparePersonByAge implements Comparator<DataPerson>{
        @Override
        public int compare(DataPerson o1, DataPerson o2) {
            return o1.getAge().compareTo(o2.age);
        }
    }
    public static void main(String[] args) {
        List<DataPerson> names = new ArrayList<>();
        names.add(new DataPerson("alfons",21));
        names.add(new DataPerson("budi",22));
        names.add(new DataPerson("bambang",10));
        names.add(new DataPerson("zaki",13));
        names.add(new DataPerson("ucup",13));
        names.add(new DataPerson("dani",13));
        names.add(new DataPerson("mamat",13));
        names.stream().sorted(new ComparePersonByName().reversed()).forEach(System.out::println);
    }
}
