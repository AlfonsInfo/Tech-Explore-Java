package com.example.demo.oop.pbo_class.kelasdanobject;


// docs access_modifier class class_name
public class Mahasiswa {

    //access_modifier dataType variableName;
    //visibility dataType variableName;
    private String nama;
    private String npm;
    private Integer umur;


    //empty constructor
    public Mahasiswa() {}


    //constructor
    public Mahasiswa(String nama, String npm, Integer umur) {
        this.nama = nama;
        this.npm = npm;
        this.umur = umur;
    }

    //Method : Function in a class

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public Integer getUmur() {
        return umur;
    }

    public void setUmur(Integer umur) {
        this.umur = umur;
    }


    //Object override
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
