package org.example.zip;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipExample {

    public static void zipFile(String filePath, String zipFilePath) throws IOException {
        File fileToZip = new File(filePath);
        try (FileOutputStream fos = new FileOutputStream(zipFilePath);
             ZipOutputStream zos = new ZipOutputStream(fos)) {

            // Menambahkan file ke dalam ZIP
            try (FileInputStream fis = new FileInputStream(fileToZip)) {
                ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
                zos.putNextEntry(zipEntry);

                byte[] buffer = new byte[1024];
                int length;
                while ((length = fis.read(buffer)) > 0) {
                    zos.write(buffer, 0, length);
                }
                zos.closeEntry();
            }
        }
    }

    public static void main(String[] args) {
        try {
            zipFile("generated-image.png", "output-zip.zip");
            System.out.println("File successfully zipped!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
