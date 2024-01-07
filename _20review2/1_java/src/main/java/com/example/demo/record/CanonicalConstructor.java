package com.example.demo.record;

public record CanonicalConstructor(String id, String name){

    public CanonicalConstructor(String id, String name){
        System.out.println("Create....");
        this.id = id.toLowerCase();
        this.name = name.toUpperCase();
    }
}

class Main1{
    public static void main(String[] args) {
        CanonicalConstructor canonicalConstructor = new CanonicalConstructor("1" , "Alfons");
    }
}
