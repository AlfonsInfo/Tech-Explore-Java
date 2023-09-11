package com.example.demo.singleresp;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.fasterxml.jackson.databind.ObjectMapper;

//Handles incoming JSON requests that work on User resource/entity
public class UserController {

    private UserPersistenceServices persistenceServices = new UserPersistenceServices();

    //Create a new user
    public String createUser(String userJson) throws IOException {
        MapperUtils mapperUtils = new MapperUtils();
        UserValidator userValidator = new UserValidator();

        User user = mapperUtils.mapperJsonToObject(userJson);

        boolean isValidUser = userValidator.isValidUser(user);


        if(!isValidUser) {
            return "ERROR";
        }
        persistenceServices.saveUser(user);
        return "SUCCESS";
    }


}