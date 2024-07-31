//package org.example.pdf.signPdf;
//
//import com.itextpdf.io.image.ImageDataFactory;
//import com.itextpdf.text.Image;
//import com.itextpdf.text.pdf.PdfDocument;
//import com.itextpdf.text.pdf.PdfReader;
//
//
//import java.net.MalformedURLException;
//
//public class PDFImageStampExample {
//    public static void main(String[] args) {
//        try {
//            // Muat dokumen PDF yang ada
//            PdfDocument pdfDoc = new PdfDocument(new PdfReader("input.pdf"), new PdfWriter("output.pdf"));
//
//            // Buat objek Image
//            Image img = new iText.Layout.Element.Image(data)(ImageDataFactory.create("watermark.png"));
//            img.setAbsolutePosition(100, 100); // Posisi horizontal dan vertikal
//            img.scaleToFit(200, 100); // Lebar dan tinggi gambar
//
//            // Tambahkan gambar ke semua halaman
//            for (int i = 1; i <= pdfDoc.getNumberOfPages(); i++) {
//                pdfDoc.getPage(i).addImage(img.getImage());
//            }
//
//            // Simpan dokumen hasil modifikasi
//            pdfDoc.close();
//        } catch (IOException | MalformedURLException e) {
//            e.printStackTrace();
//        }
//    }
//}
