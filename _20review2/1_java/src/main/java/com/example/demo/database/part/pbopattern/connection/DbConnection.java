package com.example.demo.database.part.pbopattern.connection;

import com.example.demo.database.part.pbopattern.helper.Constants;
import com.example.demo.database.part.pbopattern.helper.LoggingUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    public static Connection con;
    public static Connection makeConnection(){
        LoggingUtil.openingDbMessage();
        try {
            con = DriverManager.getConnection(
                Constants.DbConstant.URL+Constants.DbConstant.PATH+Constants.DbConstant.DATABASE_NAME,
                    Constants.DbConstant.DB_USERNAME,
                    Constants.DbConstant.DB_PASSWORD
            );
        } catch (SQLException e) {
            LoggingUtil.errorDb(e.getMessage());
        }
        return con;
    }

    public void closeConnection(){
        LoggingUtil.closingDbMessage();
        try{
            con.close();
            LoggingUtil.successMessage();
        }catch (Exception e){
            LoggingUtil.errorDb(e.getMessage());
        }
    }
}
