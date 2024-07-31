package org.example.imageIO;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageToAsciiArtExample {
    // Daftar karakter ASCII untuk representasi intensitas
    private static final String ASCII_CHARS = "@%#*+=-:. ";

    public static void main(String[] args) {
        File inputFile = new File("input.jpg");
        int width = 100;  // Lebar output ASCII
        int height = 50;  // Tinggi output ASCII

        try {
            BufferedImage image = ImageIO.read(inputFile);
            BufferedImage resizedImage = resizeImage(image, width, height);
            String asciiArt = convertToAscii(resizedImage);
            System.out.println(asciiArt);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static BufferedImage resizeImage(BufferedImage originalImage, int width, int height) {
        BufferedImage resizedImage = new BufferedImage(width, height, BufferedImage.TYPE_BYTE_GRAY);
        java.awt.Graphics2D g = resizedImage.createGraphics();
        g.drawImage(originalImage, 0, 0, width, height, null);
        g.dispose();
        return resizedImage;
    }

    private static String convertToAscii(BufferedImage image) {
        StringBuilder asciiArt = new StringBuilder();
        for (int y = 0; y < image.getHeight(); y++) {
            for (int x = 0; x < image.getWidth(); x++) {
                int pixel = image.getRGB(x, y);
                Color color = new Color(pixel, true);
                int grayValue = (int) (color.getRed() * 0.3 + color.getGreen() * 0.59 + color.getBlue() * 0.11);
                char asciiChar = ASCII_CHARS.charAt(grayValue * (ASCII_CHARS.length() - 1) / 255);
                asciiArt.append(asciiChar);
            }
            asciiArt.append('\n');
        }
        return asciiArt.toString();
    }
}
