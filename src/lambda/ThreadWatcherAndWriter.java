package lambda;

import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadWatcherAndWriter extends Thread{
    int []array;
    ReentrantLock reentrantLock;
    public ThreadWatcherAndWriter(int []a, ReentrantLock reentrantLock) {
        array = a;
        this.reentrantLock = reentrantLock;
    }

    @Override
    public void run() {
        System.out.println(Arrays.toString(array));
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        reentrantLock.lock();
        array[0] = -10000;
        reentrantLock.unlock();

        while(true) {
            System.out.println(Arrays.toString(array));
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
