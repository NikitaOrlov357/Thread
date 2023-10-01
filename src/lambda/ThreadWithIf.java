package lambda;

import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadWithIf extends Thread{
    int []array;
    ReentrantLock reentrantLock;
    public ThreadWithIf(int []a, ReentrantLock reentrantLock) {
        array = a;
        this.reentrantLock = reentrantLock;
    }

    @Override
    public void run() {
        reentrantLock.lock();
        if (array[0] == 0) {
            try {
                do1();
                do2();
                do3();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            save(array);
        }
        reentrantLock.unlock();
    }

    void do1() throws InterruptedException {
        sleep(1000);
        System.out.println("I did do 1");
    }

    void do2() throws InterruptedException {
        sleep(1000);
        System.out.println("I did do 2");
    }

    void do3() throws InterruptedException {
        sleep(1000);
        System.out.println("I did do 3");
    }

    void save(int []a) {
        System.out.println("I will save an array with a[0] = 0" + Arrays.toString(a));
    }

}
