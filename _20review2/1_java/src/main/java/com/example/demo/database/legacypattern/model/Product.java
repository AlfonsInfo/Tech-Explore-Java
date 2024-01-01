package com.example.demo.database.legacypattern.model;

import lombok.Data;


@Data
public class Product {
    private String idProduct;
    private String name;
    private String price;
    private String stock;
}
