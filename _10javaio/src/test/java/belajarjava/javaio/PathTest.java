package belajarjava.javaio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class PathTest {

    @Test
    void createPath()
    {
        Path path = Path.of("files.txt");

        Assertions.assertEquals("files.txt" ,path.toString());
        Assertions.assertFalse(path.isAbsolute());
    }


    @Test
    void usingFiles()
    {
        Path path  = Path.of("pom.xml");

        System.out.println(path.toString());
        Assertions.assertEquals("pom.xml", path.toString());
        Assertions.assertFalse(path.isAbsolute());
        Assertions.assertTrue(Files.exists(path));
    }

    @Test
    void fileManipulation() throws IOException{
        Path path = Path.of("files.txt");
        Files.createFile(path);

        Assertions.assertTrue(Files.exists(path));

        Files.delete(path);
        Assertions.assertFalse(Files.exists(path));

    }

    @Test
    void directoryManipulation() throws IOException{
        Path path = Path.of("contoh");
        Files.createDirectory(path);
        Assertions.assertTrue(Files.isDirectory(path));
        Assertions.assertTrue(Files.exists(path));

        Files.delete(path);
        Assertions.assertFalse(Files.exists(path));

    }

}
