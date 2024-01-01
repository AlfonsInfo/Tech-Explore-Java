package com.example.demo.database.legacypattern.model;

import lombok.Data;


@Data
public class Transaction {
    private String idTransaction;
    private String idProduct;
    private String idUser;
    private String stock;
    private String totalTransaction;
}
