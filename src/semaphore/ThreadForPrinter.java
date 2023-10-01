package semaphore;

public class ThreadForPrinter extends Thread {
    Printer printer;
    public ThreadForPrinter (Printer printer) throws InterruptedException {
        this.printer = printer;
    }

    @Override
    public void run() {
        try {
            printer.printer(getId());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
