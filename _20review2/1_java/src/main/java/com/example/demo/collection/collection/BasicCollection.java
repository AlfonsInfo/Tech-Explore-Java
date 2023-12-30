package com.example.demo.collection.collection;

import java.util.Collection;
import java.util.Iterator;

//collection / container -> implementasi dari struktur data
public class BasicCollection {


    public static void main(String[] args) {

    }


    /**
     *  kontrak jika ingin membuat collection
     *  iterable kontrak agar sebuah objek dapat melakukan forEach.
     *  semua collection turunan dari iterable, sehingga bisa dilakukan perulangan foreach
     */
    public static void collectionImplementation(){

        Collection<String> collection = new Collection<String>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(String s) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };
    }
}
