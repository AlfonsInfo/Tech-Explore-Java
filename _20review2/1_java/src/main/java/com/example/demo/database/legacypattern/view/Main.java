package com.example.demo.database.legacypattern.view;

import com.example.demo.database.legacypattern.controller.UserController;
import com.example.demo.database.legacypattern.model.User;

public class Main {
    public static void main(String[] args) {
        UserController userController = new UserController();

        User user = new User();
        user.setId("1");
        user.setUsername("alfons");
        user.setPassword("bambang");
        userController.createData(user);

    }
}
