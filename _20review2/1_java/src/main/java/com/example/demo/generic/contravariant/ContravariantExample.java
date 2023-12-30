package com.example.demo.generic.contravariant;

public class ContravariantExample {

    public static class ContravariantClass<T>{
        T data;

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        ContravariantClass<Object> data = new ContravariantClass<>();
        ContravariantClass<? super String> data2 = data;
        System.out.println(data2.getData());
    }
}
