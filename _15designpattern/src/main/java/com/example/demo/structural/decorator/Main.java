package com.example.demo.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Coffee espresso = new Espresso();
        System.out.println("Description: " + espresso.getDescription());
        System.out.println("Cost: $" + espresso.Cost());

        Coffee milkEspresso = new MilkDecorator(espresso);
        System.out.println("Description: " + milkEspresso.getDescription());
        System.out.println("Cost: $" + milkEspresso.Cost());
    }
}
