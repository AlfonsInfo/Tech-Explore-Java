package belajar.thread;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        //simulasiAsynchronousProcess();
        //threadSleep();
        //threadJoin();
        //threadInterrupt();
        //threadName();
        //threadState();
        //threadDaemonUserDemo();
        //demoOfRaceCondition();
    }

    private static void demoOfRaceCondition() throws InterruptedException {
        Counter counter = new Counter();
        Runnable runnable = () -> {
          for(int i = 0 ;i <1_000_000L;i++){
              counter.increment();
          }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

        //Run sekuensial
        //runnable.run();
        //runnable.run();
        //runnable.run();

        //Run asynchronous & paralel
        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println(counter.getValue());
    }

    private static void threadDaemonUserDemo() {
        Thread thread = new Thread(() -> {
            //Daemon Thread vs User Thread
            try{
                Thread.sleep(3_000L);
                System.out.println("HELLO DAEMON");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        });

        thread.setDaemon(false);
        thread.start();
    }

    private static void threadState() throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println(Thread.currentThread().getState());
            System.out.println("Run in thread " + Thread.currentThread().getName());
        });

        thread.setName("Thread Progress:");
        System.out.println(thread.getState());

        thread.start();
        thread.join();
        System.out.println(thread.getState());
    }

    private static void threadName() {
        Thread thread = new Thread(() -> {
            System.out.println("Run in thread " + Thread.currentThread().getName());
        });
        thread.start();
        thread.setName("threadName");
        //thread.start();
    }

    private static void threadInterrupt() throws InterruptedException {
        Runnable runnable = () ->{
            for(int i = 0 ; i< 10 ;i ++){
                System.out.println("Iterasi ke " + i);
                try{
                    Thread.sleep(1_000L);
                }catch (InterruptedException e){
                    //if there a intterupt, exit from thread
                    //dont just print exception
                    return;
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        thread.sleep(5_000L);
        thread.interrupt();
        System.out.println("Iterasi berhenti/lanjut ke eksekusi berikutnya");
    }

    private static void threadJoin() throws InterruptedException {

        //instruksi ke code program utama, untuk menunggu proses di thread selesai
        Runnable runnable = () -> {
            try{
                Thread.sleep(2_000L);
                System.out.println("Hello From Thread " + Thread.currentThread().getName());
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        };

        Thread threadSatu = new Thread(runnable);

        threadSatu.start();
        System.out.println("Menunggu Selesai");
        threadSatu.join();
        System.out.println("Program Selesai");
    }

    private static void threadSleep() throws InterruptedException {

        Runnable runnable = () -> {
            try{
                Thread.sleep(2_000L);
                System.out.println("Hello From Thread " + Thread.currentThread().getName());
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        };

        Thread threadSatu = new Thread(runnable);

        threadSatu.start();

        Thread.sleep(3_000L);
        //Kita tidak tau thread butuh beberapa detik untuk selesai prosesnya

        System.out.println("Program Selesai");

        Thread.sleep(3_000L);
    }

    private static void simulasiAsynchronousProcess() {
        String currentThreadName = Thread.currentThread().getName();
        System.out.println(currentThreadName);

        Runnable runnable =  () -> {
            System.out.println("Hello From Thread " + Thread.currentThread().getName());
        };

        Runnable runnable1 = () -> {
            for(int i = 0 ; i<100;i++){
                System.out.println(i + Thread.currentThread().getName());
            }
        };

        Runnable runnable2 = () -> {
            for(int i = 0 ; i<100;i++){
                System.out.println(i + Thread.currentThread().getName());
            }
        };

        Thread thread = new Thread(runnable1);
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable2);


        //Kode ini dieksekusi secara asynchronous
        thread.start();
        thread1.start();
        thread2.start();
        System.out.println("Program Selesai");
        //Hasilnya akan berbeda-beda semua
    }
}
