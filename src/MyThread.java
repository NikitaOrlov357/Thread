public class MyThread extends Thread {

    @Override
    public void run (){
        while (true) {
            System.out.println("я работаю");
        }
    }

}
