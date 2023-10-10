package belajar.thread;

import org.junit.Test;

import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {
    @Test
    public void delayedJob() throws InterruptedException {
        TimerTask task = new TimerTask(){
            @Override
            public void run() {
                System.out.println("Timer Delayed Job Execution");
            }
        };

        Timer timer = new Timer();

        timer.schedule(task, 2000);

        //Agar J Unit nungguin proses
        Thread.sleep(3000);
    }

    @Test
    public void periodicJob() throws InterruptedException {
        TimerTask task = new TimerTask(){
            @Override
            public void run() {
                System.out.println("Timer Delayed Job Execution");
            }
        };

        Timer timer = new Timer();

        timer.schedule(task, 2000,2000);

        //Agar J Unit nungguin proses
        Thread.sleep(6000);
    }
}
