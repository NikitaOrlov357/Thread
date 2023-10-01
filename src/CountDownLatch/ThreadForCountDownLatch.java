package CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class ThreadForCountDownLatch extends Thread {
    CountDownLatch countDownLatch;
    public ThreadForCountDownLatch (CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }

    void do1() throws InterruptedException {
        sleep(4000);
        System.out.println("I did do 1");
    }

    @Override
    public void run() {
        try {
            do1();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        countDownLatch.countDown();
    }
}
