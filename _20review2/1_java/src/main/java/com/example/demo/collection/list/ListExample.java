package com.example.demo.collection.list;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicReference;


/**
 *  1. Strukdat data bisa duplikat
 *  2. data di list berurut
 *  3. list memiliki index
 */
public class ListExample {

    /**
     * Implementasi ArrayList, default size 10,
     * jika sampai ukuran maksium, otomatis membuat array baru,dengan kapasitas baru
     */
    //
    public static void implyArrayList(){
        ArrayList<String> arrayList = new ArrayList<>();

        Long startTime =  System.currentTimeMillis();
        addingList(10, arrayList);
        Long endTime = System.currentTimeMillis();
        long time = endTime-startTime;
        System.out.println("time consumsion " + time);
        System.out.println(arrayList);
    }


    //implementasi dari double linked list
    public static void implyLinkedList(){
        LinkedList<String> linkedList = new LinkedList<>();

        Long startTime =  System.currentTimeMillis();
        addingList(100, linkedList);
        Long endTime = System.currentTimeMillis();
        long time = endTime-startTime;
        System.out.println("time consumsion " + time);
        System.out.println(linkedList);
    }


    public static void get(){
        ArrayList<String> dataArrayList = new ArrayList<>();
        LinkedList<String> dataLinkedList = new LinkedList<>();

        addingList(10000, dataArrayList);
        addingList(10000, dataLinkedList);


        Long startTime = System.currentTimeMillis();
        getData(10000, dataArrayList);
        Long endTime = System.currentTimeMillis();
        long time = endTime-startTime;
        System.out.println("time consumsion  get array list" + time);



        Long startTime2 = System.currentTimeMillis();
        getData( 10000,dataLinkedList);
        Long endTime2 = System.currentTimeMillis();
        long time2 = endTime2-startTime2;
        System.out.println("time consumsion  get linked list" + time2);





    }

    private static void addingList(int x, AbstractList<String> dataArrayList) {
        for (int i = 0; i < x; i++) {
            dataArrayList.add("data " + i);
        }
    }

    private static void getData(int x, AbstractList<String> dataArrayList)
    {
        AtomicReference<String> data =  new AtomicReference<>();
        for(int i = 0 ; i < x ; i++){
            data.set(dataArrayList.get(i));
        }
        System.out.println(data);
    }



    public static void main(String[] args) {
        implyArrayList();
        implyLinkedList();
        get();
    }

    //Perbandingan ArrayList vs LinkedList (operasi - array - linked)
    // add - cepat jika kapasitas cukup (penuh - recreate array ) - cepat karena hanya menambah node terakhir
    // get - cepat karena menggunakan index - lambat karena telusuri node
    // set - cepat karena index - lambat karena telusuri node
    // remove - lambat karena menggeser data - cepat karena tinggal ubah prev next di node
}
