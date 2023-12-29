package belajar.thread;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceTest {


    @Test
    public void testExecutorService() throws InterruptedException {
        ExecutorService executorService  = Executors.newSingleThreadExecutor();

        for(int i = 0 ; i < 100 ; i++)
        {
            executorService.execute(() -> {
                try{
                    Thread.sleep(1000);
                    System.out.println("Runnable in thread" + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
            executorService.awaitTermination(1, TimeUnit.DAYS);
    }

}
