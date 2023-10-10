package belajar.thread;

import org.junit.Assert;
import org.junit.Test;

public class SynchronizationTest {

    @Test
    public void synchronizedTest() throws InterruptedException {
        SynchronizedCounter counter = new SynchronizedCounter();
        Runnable runnable = () -> {
            for(int i = 0 ; i < 1_000_000;i++)
            {
                counter.increment();
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();
        Assert.assertTrue(counter.getValue() == 3_000_000L );
    }
}
