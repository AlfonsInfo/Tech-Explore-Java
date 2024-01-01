package com.example.demo.database.legacypattern.dao;

import com.example.demo.database.legacypattern.connection.DbConnection;
import com.example.demo.database.legacypattern.model.User;
import com.example.demo.database.legacypattern.utils.LogTemplate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.UUID;

//sql
public class UserDao {

    private static final String CREATE_QUERY = "INSERT INTO users (id, username, password) values ( ? , ? , ? )";

    private static final String UPDATE_QUERY = "UPDATE ...";
    private static final String READ_QUERY = "READ....";
    private static final String DELETE_QUERY = "DELETE...";

    public void createUser(User user){
        String activity = "CREATE USER";
        try{
            //open connection
            DbConnection.makeConnection();

            //query
            PreparedStatement statement = DbConnection.con.prepareStatement( CREATE_QUERY);
            statement.setString(1, UUID.randomUUID().toString());
            statement.setString(2, user.getUsername());
            statement.setString(3, user.getPassword());

            //check result
            int result = statement.executeUpdate();
            LogTemplate.daoLog(activity, " " + result);
        }catch (Exception e){
            // error
            LogTemplate.errorMessage(e.getMessage(), activity);
        }finally {
            //close connection
            DbConnection.closeConnection();
        }

    }

}
