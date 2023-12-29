package com.example.demo.generic.comparison;

public class GenericExample {


    /**
     * generic
     * conventional generic
     * E - Element
     * K - Key
     * N - Number
     * T - Type
     * V - Value
     * S,U,V 2nd, 3rd, 4 th types.
     */
    //
    public static void main(String[] args) {
        GenericClass<String> data = new GenericClass();
        data.setData("data");
        String value = data.getData();
        System.out.println(value);
    }

    public static class GenericClass<T>{
        private T data;

        public T getData(){
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
