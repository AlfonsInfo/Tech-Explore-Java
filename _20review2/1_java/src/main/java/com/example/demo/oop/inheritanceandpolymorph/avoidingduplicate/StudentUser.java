package com.example.demo.oop.inheritanceandpolymorph.avoidingduplicate;

public class StudentUser extends  BaseUserInformation{
    private String tingkatanKelas;
    private String edukasiTerakhir;
    private String rerataNilaiTerakhir;
    private String namaSekolah;


    public String getTingkatanKelas() {
        return tingkatanKelas;
    }

    public void setTingkatanKelas(String tingkatanKelas) {
        this.tingkatanKelas = tingkatanKelas;
    }

    public String getEdukasiTerakhir() {
        return edukasiTerakhir;
    }

    public void setEdukasiTerakhir(String edukasiTerakhir) {
        this.edukasiTerakhir = edukasiTerakhir;
    }

    public String getRerataNilaiTerakhir() {
        return rerataNilaiTerakhir;
    }

    public void setRerataNilaiTerakhir(String rerataNilaiTerakhir) {
        this.rerataNilaiTerakhir = rerataNilaiTerakhir;
    }

    public String getNamaSekolah() {
        return namaSekolah;
    }

    public void setNamaSekolah(String namaSekolah) {
        this.namaSekolah = namaSekolah;
    }
}
