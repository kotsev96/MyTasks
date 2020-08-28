package JavaRush16;



import java.util.ArrayList;
import java.util.List;

interface Message {
    void showWarning();
}

public class Hard21 {
    public static List<Thread> threads = new ArrayList<>(5);
    static {
        threads.add(new MyThread1());
        threads.add(new MyThread2());
        threads.add(new MyThread3());
        threads.add(new MyThread4());
        threads.add(new MyThread5());
    }

    public static void main(String[] args) {

    }
    public static class MyThread1 extends Thread {
        @Override
        public void run() {
            while (true){

            }
        }
    }
    public static class MyThread2 extends Thread {
        @Override
        public void run() {
            try {
                while (Thread.currentThread().isInterrupted() ) {
                    Thread.sleep(0);
                }
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }
    public static class MyThread3 extends Thread {
        @Override
        public void run() {
            try {
                while(true){
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
    public static class MyThread4 extends Thread implements Message   {
        @Override
        public void run() {

        }

        @Override
        public void showWarning() {
            MyThread4.interrupted();
        }
    }
    public static class MyThread5 extends Thread {
        @Override
        public void run() {

        }
    }


}
