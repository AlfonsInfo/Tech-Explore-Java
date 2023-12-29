package com.example.demo.generic.comparison;

public class NonGeneric {

    public static void main(String[] args) {
        Data dataString = new Data();
        dataString.setData("Alfons"); // pass an object , spesifiknya sebuah String
        String value = (String) dataString.getData();


        Data dataInteger = new Data();
        dataString.setData(100);
        Integer valueInteger = (Integer) dataString.getData();
    }
    public static class Data{
        private Object data;

        public Object getData(){
            return data;
        }
        public void setData(Object data){
            this.data = data ;
        }
    }

}

