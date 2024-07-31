package org.example.qrcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.common.BitMatrix;


import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class QRCodeGenerator {
    private static final int WIDTH = 300;
    private static final int HEIGHT = 300;

    public static void main(String[] args) {
        try {
            String text = "https://example.com";
            String filePath = "qrcode.png";

            generateQRCode(text, filePath, WIDTH, HEIGHT);
            System.out.println("QR Code generated and saved to " + filePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void generateQRCode(String text, String filePath, int width, int height) throws WriterException, IOException, WriterException {
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, width, height);

        Path path = Paths.get(filePath);
        MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);
    }
}
