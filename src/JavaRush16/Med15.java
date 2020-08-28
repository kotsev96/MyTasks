package JavaRush16;

public class Med15 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
        TestThread c = new TestThread();
        c.cancel();
    }

    public static class TestThread implements Runnable {
        public static volatile boolean isCancel = false;
        public void cancel()
        {
            this.isCancel = true;
        }
        public void run() {
            while (!isCancel) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
