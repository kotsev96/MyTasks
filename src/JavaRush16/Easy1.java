package JavaRush16;

public class Easy1 {
    public static void main(String[] args) {
        TestThread task = new TestThread();
        new Thread(task).start();
    }
    public static class TestThread implements Runnable{
        public void run()
        {
            System.out.println("My first thread");
        }
    }
}


