package com.example.demo.oop.inheritanceandpolymorph.avoidingduplicate;

public class AdminUser extends BaseUserInformation{
    private String peran;
    private String[] daftarAkses;

    public String getPeran() {
        return peran;
    }

    public String[] getDaftarAkses() {
        return daftarAkses;
    }
}
