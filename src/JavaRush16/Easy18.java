package JavaRush16;

public class Easy18 {
    public volatile static int COUNT = 4;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < COUNT; i++) {
            new SleepingThread();
            Thread t1 = new Thread(new SleepingThread());
            Thread t2 = new Thread(new SleepingThread());
            Thread t3 = new Thread(new SleepingThread());
            Thread t4 = new Thread(new SleepingThread());
            //напишите тут ваш код
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        }
    }

    public static class SleepingThread extends Thread {
        private static volatile int threadCount = 0;
        private volatile int countdownIndex = COUNT;

        public SleepingThread() {
            super(String.valueOf(++threadCount));
            start();
        }

        public void run() {
            while (true) {
                System.out.println(this);
                if (--countdownIndex == 0) return;
                //напишите тут ваш код
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println("Нить прервана");;
                }
            }
        }

        public String toString() {
            return "#" + getName() + ": " + countdownIndex;
        }
    }
}
