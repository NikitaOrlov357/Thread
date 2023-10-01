package semaphore;

import java.util.concurrent.Semaphore;

public class Printer {
    Semaphore semaphore = new Semaphore(2);

    public void printer (long id) throws InterruptedException {
        semaphore.acquire();
        for (int a = 0; a < 5; a++){
            System.out.println("ID = " + id);
            Thread.sleep(1000);
        }
        semaphore.release();

    }
}