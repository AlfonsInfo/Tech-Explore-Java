package com.example.demo.creational.objectpool;

import java.util.concurrent.ConcurrentLinkedDeque;

public class ObjectPool<T> {
    private final ConcurrentLinkedDeque<T> pool;

    public ObjectPool(int initialSize, ObjectFactory<T> factory) {
        pool = new ConcurrentLinkedDeque<>();
        for(int i = 0 ; i < initialSize ; i++){
            pool.add(factory.createObject());
        }
    }


    public T borrowObject() {
        T object = pool.poll();
        if (object == null) {
            throw new RuntimeException("Pool is empty, increase the pool size");
        }
        return object;
    }

    public void returnObject(T object) {
        if (object != null) {
            pool.add(object);
        }
    }

    public interface ObjectFactory<T> {
        T createObject();
    }
}