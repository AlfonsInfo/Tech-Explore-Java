package com.example.demo.generic.covariant;

public class InvariantExample {

    public static class CovariantClass<T extends Object>{
        T data;

        public CovariantClass(T data) {
            this.data = data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        CovariantClass<String> data = new CovariantClass<>("data");
        String aData = "data 2";
        data.setData(aData);
    }

    public static void doProcess(CovariantClass<? extends Object> data , String dataString, CovariantClass<String> iniBisa){
        //Tidak boleh dilakukan ( integer/ boolean ) juga turunan dari objek
        //data.setData(data);
        //data.setData(dataString);

        //class yang ingin dilakukan perubahan harus dipassing juga kedalam method.
        // dan tidak bisa menggunakan wild card
        //iniBisa.setData("sett");
    }
}
