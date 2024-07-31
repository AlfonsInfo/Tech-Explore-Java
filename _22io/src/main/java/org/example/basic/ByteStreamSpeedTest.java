package org.example.basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamSpeedTest {
    public static void main(String[] args) {
        String inputFilePath = "largeBinaryFile.bin";
        String outputFilePath = "outputBinaryFile.bin";

        // Mengukur waktu membaca dan menulis dengan stream byte
        long startTime = System.currentTimeMillis();
        try (FileInputStream fis = new FileInputStream(inputFilePath);
             FileOutputStream fos = new FileOutputStream(outputFilePath)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Stream Byte time: " + (endTime - startTime) + " ms");
    }
}