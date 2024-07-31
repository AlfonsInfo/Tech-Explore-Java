package org.example.imageIO;

import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CompressImageExample {

    public static void main(String[] args) {
        File inputFile = new File("input.jpg");
        File outputFile = new File("output.jpg");

        try {
            BufferedImage image = ImageIO.read(inputFile);

            // Mendapatkan ImageWriter untuk format JPEG
            ImageWriter writer = ImageIO.getImageWritersByFormatName("jpeg").next();
            ImageWriteParam param = writer.getDefaultWriteParam();

            // Mengatur kompresi kualitas
            param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
            param.setCompressionQuality(0.5f); // Kualitas 0.0 (terendah) sampai 1.0 (tertinggi)

            writer.setOutput(ImageIO.createImageOutputStream(outputFile));
            writer.write(null, new javax.imageio.IIOImage(image, null, null), param);

            writer.dispose();
            System.out.println("Image compressed and saved to " + outputFile.getAbsolutePath());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
