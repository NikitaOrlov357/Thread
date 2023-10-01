package lambda;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int []a = {0, 0,0 ,0 ,0,0,0};

        ReentrantLock reentrantLock = new ReentrantLock();
        Thread watcher = new ThreadWatcherAndWriter(a, reentrantLock);
        Thread withIf = new ThreadWithIf(a, reentrantLock);

        watcher.start();
        withIf.start();

    }



}
