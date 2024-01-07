package com.example.demo.record.recordpattern;

public record CompactConstructor(String data){

    public CompactConstructor{
        System.out.println("Create");
    }

    public void sayData(){
        System.out.println("Data : " + this.data());
    }
}

class ImplyCompactConstructor{
    public static void main(String[] args) {
        CompactConstructor objectData = new CompactConstructor("data");
        objectData.sayData();
    }


}