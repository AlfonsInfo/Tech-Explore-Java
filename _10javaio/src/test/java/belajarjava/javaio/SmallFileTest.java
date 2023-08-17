package belajarjava.javaio;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SmallFileTest {

    @Test
    void writeSmallFile() throws IOException{
        Path path1= Path.of("small1.txt");
        byte[] bytes = "Hello World".getBytes();
        Files.write(path1,bytes);

        Path path2= Path.of("small2.txt");
        String string = "Hello World";
        Files.writeString(path2,string);
    }

    @Test
    void readSmallFile() throws IOException{
        Path path1= Path.of("small1.txt");
        byte[] bytes = Files.readAllBytes(path1);
        System.out.println(new String(bytes));
        System.out.println(bytes.toString());

        Path path2= Path.of("small2.txt");
        String content = Files.readString(path2);
        System.out.println(content);
    }
}
