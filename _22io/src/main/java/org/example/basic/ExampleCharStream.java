package org.example.basic;

import java.io.*;

public class ExampleCharStream {
    private ExampleCharStream() {
    }

    public static void writeAndReadInputStream() throws IOException {
        fileWriterStream();
        fileReaderStream();
    }

    public static void fileReaderStream() throws IOException {
        FileReader fileReader = new FileReader("char_stream.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader); //temporary storage we use when one component feeds data to the other, but their speeds aren't the same
        System.out.println(fileReader.getEncoding()); // ASCII / UTF-8 / ? : Encoding Teks, ASCII -> Log Sistem, UTF -> Aplikasi Web, Komunikasi Jaringan
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
    }
    public static void fileWriterStream() throws IOException {
        //Create File on Root Folder
        File file = new File("char_stream.txt");
        file.createNewFile();
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("Ini Stream Character 1");
        fileWriter.write("Ini Stream Character 2");
        fileWriter.write("Ini Stream Character 3");
        fileWriter.write("Ini Stream Character 4");
        fileWriter.flush(); // writing saat ini
        fileWriter.close();
    }
}
