package com.example.demo.database.part.pbopattern.model;

import lombok.Data;


import java.util.ArrayList;


@Data
public class Dosen {
    private String nip;
    private String namaDosen;
    private String email;
    private ArrayList<String> dosenMatkul;
}
