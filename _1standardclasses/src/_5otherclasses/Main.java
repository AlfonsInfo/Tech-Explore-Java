package _5otherclasses;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

public class Main {

    public static class Data{


        private String data;

        public Data(String data) {
            this.data = data;
        }

        private String getData() {
            return data;
        }

        private void setData(String data) {
            this.data = data;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Data data1 = (Data) o;
            return Objects.equals(data, data1.data);
        }

        @Override
        public int hashCode() {
            return Objects.hash(data);
        }

        @Override
        public String toString() {
            return "Data{" +
                    "data='" + data + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {
        //UUID Class

        for (int i = 0 ; i < 100 ; i++)
        {
            UUID uuid = UUID.randomUUID();
            System.out.println(uuid); // defaultnya udh to string
        }


        // Base 64
        String query = "Belajar() pemrograman() java";
        String encode = Base64.getEncoder().encodeToString(query.getBytes());
        System.out.println(encode);

        byte[] bytes = Base64.getDecoder().decode(encode);
        String decode = new String(bytes);
        System.out.println(decode);

        //Objects
        execute(null);
        execute(new Data("Mantap pak Eko"));


        //Random
        Random random = new Random();
        for(int i = 0; i<100; i++)
        {
            int value = random.nextInt(1000);
            System.out.println(value);
        }

        //Properties Class
        try{
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));
            //Load
            System.out.println(properties.getProperty("database.host"));
            System.out.println(properties.getProperty("database.username"));
            //Write
            properties.put("hobby", "sleep");
            properties.store(new FileOutputStream( "application.properties"), "koemntar");
        }catch (Exception e)
        {
            System.out.println(e);
        }

        //Not Aple To Aple si
        // Searching

        int[] angka = {3,2,1,3,15,123,27,55,12};
        int hasil = 0;
        long startTime = System.nanoTime();
        for(int element : angka){
            if(element == 27)
            {
                hasil = element;
                break;
            }
        }
        long endTime = System.nanoTime();
        long duration = endTime-startTime;
        System.out.println(hasil);
        System.out.println("Hasil ke 1 = " + duration);


        long startTime2 = System.nanoTime();
        Arrays.sort(angka);
        hasil = Arrays.binarySearch(angka, 27);
        long endTime2 = System.nanoTime();
        long duration2 = endTime2 - startTime2;
        System.out.println(hasil);
        System.out.println("Hasil ke 2 = " +  duration2);


        //Reguler Expression
    }

    public static void  execute(Data data)
    {
//        if(data != null)
//        {
            System.out.println(Objects.toString(data));
            System.out.println(Objects.hashCode(data));
//        }
    }


}


// Alt + Enter
// F2 -> Next Error
// Alt + 1 -> Project File
// ESC -> Focus
// Ctrl + E
// CTRL + B -> Go To Declaration
// Double Ctrl -> Run Command
// Ctrl w / ctrl swift w
// Ctrl Shift A -> Find Command
// Double Shift