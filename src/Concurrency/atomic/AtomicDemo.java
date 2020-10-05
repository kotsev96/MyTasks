package Concurrency.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo {
    public static void main(String[] args) {
        //int value = 5;
        AtomicInteger atomicInteger = new AtomicInteger();
        int value = atomicInteger.incrementAndGet();
        System.out.println(value);

        int i = atomicInteger.addAndGet(8765);
        System.out.println(i);
    }
}
