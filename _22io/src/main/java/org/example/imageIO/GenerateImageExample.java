package org.example.imageIO;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GenerateImageExample {
    public static void main(String[] args) {
        // Ukuran gambar
        int width = 400;
        int height = 200;

        // Membuat objek BufferedImage
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        // Mendapatkan objek Graphics2D
        Graphics2D g2d = bufferedImage.createGraphics();

        // Mengatur background color
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, width, height);

        // Menggambar teks
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Serif", Font.BOLD, 24));
        g2d.drawString("Hello, Java Image!", 50, 100);

        // Menggambar bentuk sederhana
        g2d.setColor(Color.RED);
        g2d.fillRect(50, 120, 100, 50);

        // Menyelesaikan gambar
        g2d.dispose();

        // Menyimpan gambar ke file
        try {
            File file = new File("generated-image.png");
            ImageIO.write(bufferedImage, "png", file);
            System.out.println("Image saved to " + file.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
