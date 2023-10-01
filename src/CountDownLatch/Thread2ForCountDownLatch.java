package CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class Thread2ForCountDownLatch extends Thread {
    CountDownLatch countDownLatch;
    public Thread2ForCountDownLatch (CountDownLatch countDownLatch){
        this.countDownLatch = countDownLatch;
    }

    void do2() throws InterruptedException {
        sleep(6000);
        System.out.println("I did do 2");
    }

    @Override
    public void run() {
        try {
            do2();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        countDownLatch.countDown();
    }
}
