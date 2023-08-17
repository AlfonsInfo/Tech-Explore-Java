package iterasi.review1._1basic;

import javax.xml.crypto.Data;

public class DataType {
    private static final String sayHello = "Woy Hallo";
    public static void main(String[] args) {
        //Primitif
        int angka = 1;
        float angkaFloat = 3.0F;
        double angkaDouble = 3.0;

        char character = '3';

        //Setiap primitif memiliki representasi non primitif
        //Non Primitif
        Integer angkaLagi = 30;
        Float angkaFloatLagi = 300.0F;
        String text = "Ini string kumpulan dari char";


        //Static dapat diakses dari konteks statik
        System.out.println(DataType.sayHello);
    }
}
