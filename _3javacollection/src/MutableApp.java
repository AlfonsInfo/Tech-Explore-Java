import data.Person;

import java.util.ArrayList;
import java.util.List;

public class MutableApp {

    public static void main(String[] args) {

        Person person = new Person("Alfons");
        person.addHobby("Game");
        person.addHobby("Ngoding");
        //list yang diambil dari objek dimasukin sebagai params (returnkan list), dan pada list ini dilakukan operasi add
        //objeknya ikut terpengaruh // bisa diubah

        /** saat list dari objek sebagai return, bisa diubah sama orang lain*/
        doSomethingWithHobbies(person.getHobbies());

        //doSomethingWithHobbies(person.getHobbiesUnmodified());
        for (var hobby : person.getHobbies())
        {
            System.out.println(hobby);
        }

        //Cara mendefinisikan array imutable
        List<Integer> immutable = List.of(3,4,2,13);
        immutable.add(4);

        List<Integer> mutable = new ArrayList<>();
    }


    public static void doSomethingWithHobbies(List<String> hobbies){
        hobbies.add("Bukan Hobby");
    }
}
