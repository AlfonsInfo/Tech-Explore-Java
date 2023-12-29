package com.example.demo.oop.inheritanceandpolymorph.avoidingduplicate;

public class BaseUserInformation {
    private String id;
    private String nama;
    private String gender;
    private String umur;
    private String status;
    private String nomorKontak;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNomorKontak() {
        return nomorKontak;
    }

    public void setNomorKontak(String nomorKontak) {
        this.nomorKontak = nomorKontak;
    }

    ///.... a lot information
    // kalo informasi ini diulang-ulang dibikin dikelas lain ada potensi terkenak peringatan
    // banyak duplicate code.

}
