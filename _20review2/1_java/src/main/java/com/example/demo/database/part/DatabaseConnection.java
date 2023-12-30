package com.example.demo.database.part;

//Setelah melakukan registrasi Driver ke JDBC
// koneksi ke database bisa dilakukan
// untuk melakukan koneksi kita memberi tahu jenis database, host, port, username dan password
// koneksi database direpresentasikan java.sql.Connection

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public void databaseConnection(){
        String jdbcUrl = "";
        String username = "postgre";
        String password = "password";

            try {
                Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
                System.out.println("koneksi berhasil");
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
    }
}
