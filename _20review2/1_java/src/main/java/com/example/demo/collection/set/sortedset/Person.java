package com.example.demo.collection.set.sortedset;

public class Person {
    private String nama;
    private Integer umur;
    private Integer tinggi;

    public Person(String nama, int umur, int tinggi) {
        this.nama = nama;
        this.umur = umur;
        this.tinggi = tinggi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(Integer umur) {
        this.umur = umur;
    }

    public Integer getTinggi() {
        return tinggi;
    }

    public void setTinggi(Integer tinggi) {
        this.tinggi = tinggi;
    }

    public Integer getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nama='" + nama + '\'' +
                ", umur=" + umur +
                ", tinggi=" + tinggi +
                '}';
    }
}
