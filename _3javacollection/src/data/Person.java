package data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Person {
    private String nama;
    private List<String> hobbies = new ArrayList<>();

    public Person(String nama) {
        this.nama = nama;
    }

    public void addHobby(String hobby)
    {
        this.hobbies.add(hobby);
    }
    public List<String> getHobbies() {
        return hobbies;
    }

    public List<String> getHobbiesUnmodified() {
        return Collections.unmodifiableList(hobbies);
    }
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
