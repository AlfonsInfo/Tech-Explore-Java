package com.example.demo.database.part;
import org.postgresql.Driver;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseDriver {

    //Driver adalah jembatan penghubung antara JDBC dan DBMS
    // Driver berisikan kelas implementasi dari interface JDBC (Kontrak)
    // DRIVER Direpresentasikan oleh kelas java.sql.Driver
    public void driverTest(){
        Driver postgreDriver = new Driver();
        try {
            DriverManager.registerDriver(postgreDriver);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
