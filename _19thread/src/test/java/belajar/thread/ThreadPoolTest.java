package belajar.thread;

import org.junit.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest {


    @Test
    public void createThreadPoolTest()
    {
        int minThread = 10;
        int maxThread = 100;
        int alive = 1;
        TimeUnit time = TimeUnit.MINUTES;

        ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(100);

        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                minThread,
                maxThread,
                alive,
                time,
                queue
        );
    }

    @Test
    public void executeThreadPool() throws InterruptedException {
        int minThread = 10;
        int maxThread = 100;
        int alive = 1;
        TimeUnit time = TimeUnit.MINUTES;

        ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(100);

        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                minThread,
                maxThread,
                alive,
                time,
                queue
        );

        Runnable runnable = () -> {
            try {
                Thread.sleep(2000);
                System.out.println("Hello from Threadpool" + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        executor.execute(runnable);
        Thread.sleep(3000);
    }

    @Test
    public void shutdownThreadPool() throws InterruptedException {
        int minThread = 10;
        int maxThread = 100;
        int alive = 1;
        TimeUnit time = TimeUnit.MINUTES;

        ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(1000);

        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                minThread,
                maxThread,
                alive,
                time,
                queue
        );

        for(int i = 0 ; i<1000;i++)
        {
            final int task = i;

            Runnable runnable =  ()->{
                try {
                    Thread.sleep(1000); // bisa mendeteksi interrupted
                    System.out.println("Task " + task + " from threadpool " +  Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            };

            executor.execute(runnable);
        }

        //executor.shutdown();
        //executor.shutdownNow();
        executor.awaitTermination(1, TimeUnit.DAYS);
    }


    @Test
    public void rejectedExecution() throws InterruptedException {
        //Butuh dibatasin akses memory dari thread, takutnya -> numpuk di memory -> outofmemory
        int minThread = 10;
        int maxThread = 100;
        int alive = 1;
        TimeUnit time = TimeUnit.MINUTES;
        RejectedExecutionHandler r = new LogRejectedExecutionHandler();

        ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(100);

        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                minThread,
                maxThread,
                alive,
                time,
                queue,
                r
        );

        for(int i = 0 ; i<1000;i++)
        {
            final int task = i;

            Runnable runnable =  ()->{
                try {
                    Thread.sleep(1000); // bisa mendeteksi interrupted
                    System.out.println("Task " + task + " from threadpool " +  Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            };

            executor.execute(runnable);
        }

        //executor.shutdown();
        //executor.shutdownNow();
        executor.awaitTermination(1, TimeUnit.DAYS);
    }

    public static class LogRejectedExecutionHandler implements RejectedExecutionHandler
    {

        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            System.out.println("Task " + r + " is rejected");
        }
    }

}

