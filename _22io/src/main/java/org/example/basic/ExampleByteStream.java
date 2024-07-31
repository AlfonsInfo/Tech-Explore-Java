package org.example.basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExampleByteStream {
    public static void main(String[] args) {
        // Menulis file biner
        try (FileOutputStream fos = new FileOutputStream("binaryfile.dat")) {
            fos.write(new byte[]{65, 66, 67, 68}); // Menulis byte A, B, C, D
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Membaca file biner
        try (FileInputStream fis = new FileInputStream("binaryfile.dat")) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                System.out.print((char) byteData); // Mengonversi byte ke karakter untuk tampilan
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
