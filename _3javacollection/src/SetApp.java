import data.Person;
import data.PersonComparator;

import java.util.*;

public class SetApp {
    public static void main(String[] args) {
        //Hash Set

        HashSet<String> hashSet = new HashSet<>();
//        hashSet.add("Alfons");
//        hashSet.add("Mantap");
//        hashSet.add("Yoo");
//        hashSet.add("Alfons");
//        hashSet.add("Mantap");
//        hashSet.add("Yoo");
        //hashSet.add("Alfons"); //ga ikut tersimpan

        for (var e : hashSet)
        {
            System.out.println(e);
        }

        // Linked Hash Set

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> linkedHashSet2 = new LinkedHashSet<>();


        Set<String> immutable = Collections.unmodifiableSet(linkedHashSet);
        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("Alfons");


        //SORTED SET

        SortedSet<String> stringSortedSet = new TreeSet<>();
        stringSortedSet.add("Mantap");
        stringSortedSet.add("Alfons");
        stringSortedSet.add("Woy");

        for (String e : stringSortedSet) {
            System.out.println(e);
        }

        SortedSet<Integer> integerSortedSet = new TreeSet<>();
        integerSortedSet.addAll(List.of(3,4,32,2));
        for (Integer e : integerSortedSet) {
            System.out.println(e);
        }

        //Tanpa params personComparator akan error, karena java tidak tahu cara mengurutannya
        SortedSet<Person> personSortedSet = new TreeSet<>(new PersonComparator());
        personSortedSet.addAll(Arrays.asList(
                new Person("Deeee"),
                new Person("Asseee"),
                new Person("Wee"),
                new Person("Xee")
                ));

        /** NavigableSet */

        NavigableSet<Integer> navigableSet = new TreeSet<>();
        navigableSet.addAll(Set.of(3,4,2,32,12,13,500,2213,5,111));
        NavigableSet<Integer> navigableSetReverse =  navigableSet.descendingSet();

        for (Integer e : navigableSetReverse) {
            System.out.println(e);
        }


    }
}
