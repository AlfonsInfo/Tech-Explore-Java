package org.example.pdf.pdfbox;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

public class PdfToText {
    public static void main(String[] args) {
        try (PDDocument document = PDDocument.load(new File("example.pdf"))) {
            PDFTextStripper pdfStripper = new PDFTextStripper();
            String text = pdfStripper.getText(document);
            System.out.println(text);
            // Kamu bisa memproses teks ini lebih lanjut untuk membangun HTML
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
