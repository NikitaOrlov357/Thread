package CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class FinalThread {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(2);
        ThreadForCountDownLatch threadForCountDownLatch = new ThreadForCountDownLatch(countDownLatch);
        Thread2ForCountDownLatch thread2ForCountDownLatch = new Thread2ForCountDownLatch(countDownLatch);

        threadForCountDownLatch.start();
        thread2ForCountDownLatch.start();

        countDownLatch.await();

        System.out.println("стройка завершена");
    }
}
