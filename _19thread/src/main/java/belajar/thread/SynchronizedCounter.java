package belajar.thread;

public class SynchronizedCounter{
    private Long value = 0L;

    //can access by 1 thread on a same time !!
    public synchronized void increment()
    {
        value++;
    }
    //intrinsic lock
    //monitor lock
    public synchronized void incrementSyncStatement()
    {

        //synchronized part of method
        synchronized (this){
            value++;
        }
    }
    public Long getValue(){
        return value;
    }
}
