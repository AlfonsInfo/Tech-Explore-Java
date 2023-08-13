package comparatorimpl;

import comparableimpl.Person;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Budi",""),
                new Person("Alfons", ""),
                new Person("Joko", "")
        };


        //Implementasi Compare nya langsung di sini
        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Arrays.sort(people, comparator);
        System.out.println(Arrays.toString(people));

    }
}
