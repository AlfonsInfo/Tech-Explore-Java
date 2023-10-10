package belajar.thread;

import org.junit.Test;

public class DeadLockTest {

    @Test
    public void transfer() throws InterruptedException {
        Balance balance1 = new Balance(1_000_000L);
        Balance balance2 = new Balance(1_000_000L);

        Thread thread1 = new Thread(()->{
            try {
                Balance.transfer(balance1,balance2,5000_000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread thread2 = new Thread(()->{
            try {
                Balance.transfer(balance2,balance1,5000_000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(balance1.getValue());
        System.out.println(balance2.getValue());
    }

    @Test
    public void deadLockDemo() throws InterruptedException {
        Balance balance1 = new Balance(1_000_000L);
        Balance balance2 = new Balance(1_000_000L);

        Thread thread1 = new Thread(()->{
            try {
                Balance.deadLockTransfer(balance1,balance2,5000_000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread thread2 = new Thread(()->{
            try {
                Balance.deadLockTransfer(balance2,balance1,5000_000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(balance1.getValue());
        System.out.println(balance2.getValue());
    }


}
