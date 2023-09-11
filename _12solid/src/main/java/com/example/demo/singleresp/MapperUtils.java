package com.example.demo.singleresp;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class MapperUtils {

    public User mapperJsonToObject(String userJson) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        User user = mapper.readValue(userJson, User.class);
        return user;
    }


}
