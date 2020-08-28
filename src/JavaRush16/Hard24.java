package JavaRush16;

import com.javarush.test.Solution;

public class Hard24 {
    static int count = 15;
    static volatile int createdThreadCount;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread {
        @Override
        public String toString() {
            return getName() + " created";
        }

        public GenerateThread() {
            super(String.valueOf(++createdThreadCount));
            start();
        }

        @Override
        public void run(){
            if(createdThreadCount < count){
                System.out.println(new GenerateThread());
            }
        }
    }
}
