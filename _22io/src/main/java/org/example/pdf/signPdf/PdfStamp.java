package org.example.pdf.signPdf;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PdfStamp {
    public static void main(String[] args) {
        String inputPdf = "example.pdf";
        String outputPdf = "output.pdf";
        String watermarkImage = "qrcode.png";

        try (PDDocument document = PDDocument.load(new File(inputPdf))) {
            // Load the watermark image
            BufferedImage bufferedImage = ImageIO.read(new File(watermarkImage));
            PDPageContentStream contentStream = null;

            // Iterate over all pages and add the watermark image
            for (PDPage page : document.getPages()) {
                contentStream = new PDPageContentStream(document, page, PDPageContentStream.AppendMode.APPEND, true);
                contentStream.drawImage(PDImageXObject.createFromFile(watermarkImage, document),
                        0, 0, 100, 100); // Position and size of the watermark
                // Menambahkan teks di atas barcode
                contentStream.beginText();
                contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);
                contentStream.newLineAtOffset(150, 750); // Posisi teks di atas (x, y)
                contentStream.showText("Teks di atas barcode");
                contentStream.endText();

                // Menambahkan teks di samping barcode
                contentStream.beginText();
                contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);
                contentStream.newLineAtOffset(100, 150); // Posisi teks di samping (x, y)
                contentStream.showText("Teks di samping barcode");
                contentStream.endText();
                contentStream.close();
            }

            // Save the updated document
            document.save(outputPdf);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
