package comparableimpl;

import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Budi",""),
                new Person("Alfons", ""),
                new Person("Joko", "")
        };

        Arrays.sort(people);

        //Comparable tidak diterapkan maka hal ini akan error
        System.out.println(Arrays.toString(people));
    }
}
