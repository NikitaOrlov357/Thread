public class MyThread2 extends Thread {

    @Override
    public void run (){
        while (true) {
            System.out.println(5 + 5);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

}
