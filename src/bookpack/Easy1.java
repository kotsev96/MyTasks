package bookpack;

public class Easy1 {
        final Object lock1 = new Object();
        final Object lock2 = new Object();



    Thread e1 = new Thread(new Runnable() {
        @Override
        public void run() {
            synchronized (lock1){
                synchronized (lock2){
                    System.out.println("1");
                }
            }
        }
    });

    Thread e2 = new Thread(new Runnable() {
        @Override
        public void run() {
            synchronized (lock2){
                synchronized (lock1){
                    System.out.println("2");
                }
            }
        }
    });


    public static void main(String[] args) {
        Easy1 e = new Easy1();
        e.e1.start();
        e.e2.start();
    }

    }



