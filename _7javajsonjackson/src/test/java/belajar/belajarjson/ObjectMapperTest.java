package belajar.belajarjson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

public class ObjectMapperTest {

    @Test
    void createObjectMapper()
    {
        ObjectMapper objectMapper= new ObjectMapper();

        Assertions.assertNotNull(objectMapper);
    }


    @Test
    void createJson() throws JsonProcessingException{
        Map<String, Object> person = Map.of(
                "firstname", "Alfons",
                "lastname", "Jacub",
                "age", 30,
                "married" ,false,
                "address",Map.of(
                        "street","Jl. Belum",
                        "city","Padang",
                        "country","Indonesia"
                )
        );


        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(person);
        System.out.println(json);
    }

    @Test
    void readJson () throws JsonProcessingException {
        String json =
                """
                {
                "nama" : "alfons",
                "umur": 21
                }    
                """;
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> person  = objectMapper.readValue(json, new TypeReference<Map<String, Object>>(){});

        System.out.println(person.get("nama"));
        System.out.println(person.get("umur"));

    }


    @Test
    void createJsonArray() throws JsonProcessingException{
        ObjectMapper objectMapper = new ObjectMapper();
        List<String> hobbies = List.of("Coding","Reading","Traveling");
        String json = objectMapper.writeValueAsString(hobbies);
        System.out.println(json);
    }

    @Test
    void readJsonArray() throws  JsonProcessingException{
        String json= """
                ["Coding","Reading","Traveling"]
                """;
        ObjectMapper objectMapper = new ObjectMapper();
        List<String> hobbies = objectMapper.readValue(json, new TypeReference<List<String>>() {});
        System.out.println(hobbies.get(0));
        System.out.println(hobbies.get(1));
        System.out.println(hobbies.get(2));
    }

    @Test
    void createJsonFromObject() throws  JsonProcessingException{
        Person person = new Person();
        Address address = new Address();
        List<String> hobbies = List.of("Tidur","Makan");
        address.setStreet("Jondul");
        address.setCity("Pdg");
        address.setCountry("Indo");

        person.setId("13710122102012");
//        person.setName("Alfonsus Setiawan");
        person.setHobbies(hobbies);
        person.setAddress(address);

        ObjectMapper objectMapper = new ObjectMapper();
        System.out.println(objectMapper.writeValueAsString(person));

    }

    @Test
    void convertFromJsonToObject() throws JsonProcessingException
    {
        String json = """
                {"id":"13710122102012","name":"Alfonsus Setiawan","hobbies":["Tidur","Makan"],"address":{"street":"Jondul","city":"Pdg","country":"Indo"}}
                """;
        ObjectMapper objectMapper = new ObjectMapper();
        Person person = objectMapper.readValue(json, Person.class);
        System.out.println(person);
    }

    @Test
    void convertFromJsonToObjectMapperBuilder() throws JsonProcessingException
    {
        String json = """
                {"id":"13710122102012","name":"Alfonsus Setiawan","hobbies":["Tidur","Makan"],"address":{"street":"Jondul","city":"Pdg","country":"Indo"}}
                """;
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Person person = objectMapper.readValue(json, Person.class);
        System.out.println(person);
    }
}
