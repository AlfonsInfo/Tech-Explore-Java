package com.example.demo.generic.boundedtypeparams;

public class BoundedTypeParamsExample {

    //generic class type dibatasin untuk turunan dari number
    public static class NumberData<T extends Number> {
        private T data;

        public NumberData(T data) {
            this.data = data;
        }

        public void setByArrayOfNumber(T[] arrayOfData){
            double sum = 0.0;
            for(T value : arrayOfData){
                sum += value.doubleValue();
            }
            data = (T) Double.valueOf(sum);
        }
    }

    public static void main(String[] args) {
        //NumberData<String> data = new NumberData<String>();
        NumberData<Double> data = new NumberData<>(100.0);
        System.out.println(data);
    }
}
