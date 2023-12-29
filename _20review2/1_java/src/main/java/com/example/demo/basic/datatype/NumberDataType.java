package com.example.demo.basic.datatype;

public class NumberDataType {

    public static void main(String[] args) {

        /*
         * primitive data type, karena primitive tidak ada "variable.method()"
         *  untuk konversi / operasi membutuhkan bantuan dair kelas lain
         */
        byte dataByte = 1;
        short dataShort = -32768;
        int dataInt = 32678;
        long dataLong = 100;

        System.out.println(dataByte);
        System.out.println(dataShort);
        System.out.println(dataInt);
        System.out.println(dataLong);


        Byte dataObjectByte = 1;
        Short dataObjectShort = 1;
        Integer dataObjectInteger = 1;
        Double dataObjectDouble = 100.0D;

        System.out.println(dataObjectByte);
        System.out.println(dataObjectShort);
        System.out.println(dataObjectInteger);
        System.out.println(dataObjectDouble);
        //* contoh method yang disediakan wrapper
        System.out.println(dataObjectDouble.equals(100));

    }
}
