
public class Main {
    public static void main(String[] args) throws InterruptedException {

        MyThread myThread = new MyThread();
        MyThread myThread2 = new MyThread();

        MyThread2 myThreadMy = new MyThread2();

        myThreadMy.start();

        myThreadMy.join();

        System.out.println("main работает снова");

    }
}
