package OOP;

import java.util.concurrent.ThreadLocalRandom;

public class StaticClass {
    private static int nextId;
    private int id;


    static {
        nextId = ThreadLocalRandom.current().nextInt(100);
    }

    {
        id = nextId;
        nextId++;
    }
}
