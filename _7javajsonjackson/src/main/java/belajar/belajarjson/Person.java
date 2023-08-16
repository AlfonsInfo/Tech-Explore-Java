package belajar.belajarjson;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private String id;

    private String name;

    private List<String> hobbies;

    private Address address;
}
