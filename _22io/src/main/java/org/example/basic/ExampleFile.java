package org.example.basic;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

//Kelas File digunakan untuk mengelola File dan Direktori
public class ExampleFile {

    public static void createFile() throws IOException {
        //Create File on Root Folder
        File file = new File("file.txt");
        file.createNewFile();
        System.out.println("Path : " + file.getPath());
        System.out.println("Path Absolute : " + file.getAbsolutePath());
        System.out.println("Is File Exist : " + file.exists());
    }


    public static void deleteFile(){
        File file = new File("file.txt");
        Boolean isDeleted = file.delete();
        System.out.println("Success Delete ? " + (isDeleted ? "Berhasil" : "Gagal"));
    }


    public static void writeFile() throws IOException {
        File file = new File("file1.txt");
        file.createNewFile();

    }

    public static void createDirectories() throws IOException{
        // Path relatif ke folder resources
        String relativePath = "src/main/resources/newDirectory/subDirectory";

        // Mengubah path relatif ke path absolut
        File directory = new File(relativePath);

        // Membuat direktori (termasuk direktori induk jika tidak ada)
        if (directory.mkdirs()) {
            System.out.println("Direktori berhasil dibuat: " + directory.getAbsolutePath());
        } else {
            System.out.println("Gagal membuat direktori atau direktori sudah ada: " + directory.getAbsolutePath());
        }
    }

    public static void main(String[] args) throws IOException {
        createDirectories();
    }
}
