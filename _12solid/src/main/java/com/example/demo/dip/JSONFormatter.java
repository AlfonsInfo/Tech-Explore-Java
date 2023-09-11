package com.example.demo.dip;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.datatype.jdk8.

public class JSONFormatter implements Formatter{
    @Override
    public String format(Message message) throws FormatException {
        ObjectMapper mapper = new ObjectMapper();
//        mapper.registerModule(new JavaTimeModule());
        try{
            return mapper.writeValueAsString(message);
        } catch (JsonProcessingException e){
            e.printStackTrace();
            throw  new FormatException(e);
        }
    }
}
