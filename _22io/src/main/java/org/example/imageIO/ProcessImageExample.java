package org.example.imageIO;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;

public class ProcessImageExample {


    public static String convertImageToBase64(String imagePath) throws IOException {

        //Read Gambar dari Resources
        InputStream inputStream = ProcessImageExample.class.getClassLoader().getResourceAsStream(imagePath);
        if (inputStream == null) {throw new IllegalArgumentException("File not found: " + imagePath);}


        //Konversi InputStream Jadi Byte Arrays
        byte[] imageBytes = inputStreamToByteArray(inputStream);

        // Mengonversi byte array ke string base64
        return Base64.getEncoder().encodeToString(imageBytes);
    }

    private static byte[] inputStreamToByteArray(InputStream inputStream) throws IOException {
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                byteArrayOutputStream.write(buffer, 0, bytesRead);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        try {
            String base64Image = convertImageToBase64("image/Picture1.png");
            System.out.println(base64Image);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
