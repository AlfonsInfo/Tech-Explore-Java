package com.example.demo.database.legacypattern.connection;

import com.example.demo.database.legacypattern.Constant;
import com.example.demo.database.legacypattern.utils.LogTemplate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection{

    public static Connection con;
    public static void makeConnection(){
        LogTemplate.openingDb();
        try {
            con = DriverManager.getConnection(
                    Constant.DbConstant.URL,
                    Constant.DbConstant.DB_USERNAME,
                    Constant.DbConstant.DB_PASSWORD
            );
        } catch (SQLException e) {
            LogTemplate.errorMessage(e.getMessage() ," on Method makeConnection");
        }
    }

    public static void closeConnection(){
        LogTemplate.closingDb();
        try{
            con.close();
            LogTemplate.successMessage();
        }catch (Exception e){
            LogTemplate.errorMessage(e.getMessage(),"on Method closeConnection");
        }
    }
}
