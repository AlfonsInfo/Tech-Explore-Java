package belajarjava.javaio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.xmlunit.builder.Input;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileTest {

    @Test
    void createFile()
    {
        File file = new File("file.txt");

        Assertions.assertEquals("file.txt", file.getName());
        Assertions.assertFalse(file.exists());

    }

    @Test
    void createFileExist()
    {
        File file = new File("src/main/resources/application.properties");

        Assertions.assertEquals("application.properties", file.getName());
        Assertions.assertTrue(file.exists());
    }


    //Saat membuka stream io
    @Test
    void closeID()
    {

        Path path = Path.of("pom.xml");
        InputStream inputStream = null;

        try{
            inputStream = Files.newInputStream(path);
        } catch (IOException exception)
        {
            Assertions.fail(exception);
        } finally {
            if(inputStream != null)
            {
                try{
                    inputStream.close();
                } catch (IOException exception){
                    Assertions.fail(exception);
                }
            }

        }
    }

    //Java OOP Try With Resource

    @Test
    void closeIOWithResource()
    {
        Path path = Path.of("pom.xml");

        try(InputStream inputStream = Files.newInputStream(path)){ //try with resource

        } catch (IOException exception)
        {
            Assertions.fail(exception);
        }
    }


}


