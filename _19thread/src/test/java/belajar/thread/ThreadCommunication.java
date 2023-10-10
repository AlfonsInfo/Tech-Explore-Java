package belajar.thread;

import org.junit.Test;

import java.util.Objects;

public class ThreadCommunication
{
    private String message = null;

    //Manual
    @Test
    public void simpleThreadCommunication() throws InterruptedException {
        Thread threadPrint =  new Thread(() -> {
            while(Objects.isNull(message)){}
            System.out.println(message);
        });

        Thread threadDefine =  new Thread(() -> {
            try {
                Thread.sleep(1000L);
                message = "Alfons Ganteng";
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });

        threadDefine.start();
        threadDefine.join();
        threadPrint.join();
    }


    @Test
    public void waitNotify() throws InterruptedException {
        final Object lock = new Object();

        Thread thread1 = new Thread(() -> {
           synchronized (lock){
               try {
                   lock.wait();
                   System.out.println(message);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
        });

        Thread thread2 = new Thread(()->{
            synchronized (lock)
            {
                message = "Alfons ganteng";
                lock.notify();
            }
        });
        thread1.start(); // should wait first, and notify
        thread2.start(); // if not wait for nothing happens

        thread1.join();
        thread2.join();
    }


    @Test
    public void waitNotifyAll() throws InterruptedException {
        final Object lock = new Object();

        Thread thread1 = new Thread(() -> {
            synchronized (lock){
                try {
                    lock.wait();
                    System.out.println(message);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread3 = new Thread(() -> {
            synchronized (lock){
                try {
                    lock.wait();
                    System.out.println(message);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread2 = new Thread(()->{
            synchronized (lock)
            {
                message = "Alfons ganteng";
                lock.notifyAll();
            }
        });


        thread1.start(); // should wait first, and notify
        thread3.start();

        thread2.start(); // if not wait for nothing happens

        thread1.join();
        thread3.join();

        thread2.join();
    }

}
