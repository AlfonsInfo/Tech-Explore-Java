package com.example.demo.database.legacypattern.controller;

import com.example.demo.database.legacypattern.connection.DbConnection;
import com.example.demo.database.legacypattern.dao.UserDao;
import com.example.demo.database.legacypattern.model.User;

public class UserController {
    private final UserDao userDao = new UserDao();

    public void createData(User user){
        userDao.createUser(user);
    }


    //another endpoints
}
