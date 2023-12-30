package com.example.demo.database.part.pbopattern.dao;

import com.example.demo.database.part.pbopattern.connection.DbConnection;
import com.example.demo.database.part.pbopattern.helper.LoggingUtil;
import com.example.demo.database.part.pbopattern.model.Dosen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

//sql
public class UserDao {

    public void createDosen(Dosen input){
        Connection con = DbConnection.makeConnection();

        String sql = "INSERT INTO dosen(nip, nama, email, no_handphone) " +
                "VALUES (' ? , ? , ? , ? )";
        System.out.println("Adding Data");

        try{

            String[] values = new String[]{input.getNip(), input.getNamaDosen(), input.getEmail()};
            PreparedStatement statement = con.prepareStatement(sql,values);
            int result = statement.executeUpdate();
        }catch (Exception e){
            LoggingUtil.errorDb(e.getMessage());
        }
    }
}
