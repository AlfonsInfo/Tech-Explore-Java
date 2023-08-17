package iterasi.review1._2javaoop;

import iterasi.review1._2javaoop.exampleinheritance.character.Character;
import iterasi.review1._2javaoop.exampleinheritance.character.Enemy;

public class Main {
    public static void main(String[] args) {

        //Overloading
        _Overloading overloading1 = new _Overloading();
        _Overloading overloading2 = new _Overloading("test", "test");
        //Inheritance
        Character character = new Character("Assasin");
        Character enemy1 = new Enemy("Assasin","utara");
        Character enemy = new Enemy("kepolu");


        character = enemy1;
        //saat dari super class, hanya bisa akses method superclass
        // character.
        //sat dari sub class, bisa akses method super dan method sendiri
        System.out.println(character);


        //Subclass Akses Atribut dan Method SuperClass
        //character=enemy1 ( is a)
        //konstruktor tidak diwariskan
        //Pewarisan ganda tidak diperbolehkan


        //Polimorfisme
        //Abstract Class - Interface
        //Anonymous
        //Exception Handlig

    }
}
