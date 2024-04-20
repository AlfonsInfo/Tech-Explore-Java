package stringmanipulation;

import java.util.ArrayList;

public class StringManipulation {
    public static void main(String[] args) {
        String contohString = "ini string";
//        System.out.println(contohString.toLowerCase());
//        System.out.println(contohString.toUpperCase());

        getAngka();
    }

    public static void getAngka() {
        String input = "walawe 3 mantap woooo yoi brodii 2 1 mantap wkowkeo 22";
        int[] angka = new int[input.length()];
        int index = 0;
        StringBuilder currentNumber = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char a = input.charAt(i);
            if (Character.isDigit(a)) {
                currentNumber.append(a);
                // Memeriksa karakter selanjutnya
                if (i + 1 < input.length() && Character.isDigit(input.charAt(i + 1))) {
                    continue; // Jika karakter selanjutnya juga angka, lanjutkan ke iterasi berikutnya
                }
            } else if (currentNumber.length() > 0) {
                angka[index] = Integer.parseInt(currentNumber.toString());
                index++;
                currentNumber.setLength(0); // Mengosongkan currentNumber
            }
        }

        // Memeriksa apakah masih ada angka yang tersisa di akhir string
        if (currentNumber.length() > 0) {
            angka[index] = Integer.parseInt(currentNumber.toString());
            index++;
        }

        int[] newResult = java.util.Arrays.copyOf(angka, index);
        for (int a : newResult) {
            System.out.println(a);
        }
    }



}
