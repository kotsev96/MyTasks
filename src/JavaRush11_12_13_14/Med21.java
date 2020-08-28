package JavaRush11_12_13_14;

import java.util.ArrayList;
import java.util.List;

public class Med21 {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код

        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
        Exception e1 = new ArrayIndexOutOfBoundsException("e1");
        exceptions.add(e1);
        Exception e2 = new ArrayStoreException("e2");
        exceptions.add(e2);
        Exception e3 = new ClassCastException("e3");
        exceptions.add(e3);
        Exception e4 = new NegativeArraySizeException ("e4");
        exceptions.add(e4);
        Exception e5 = new IllegalArgumentException("e5");
        exceptions.add(e5);
        Exception e6 = new IllegalMonitorStateException("e6");
        exceptions.add(e6);
        Exception e7 = new IllegalStateException("e7");
        exceptions.add(e7);
        Exception e8 = new IllegalThreadStateException("e8");
        exceptions.add(e8);
        Exception e9 = new ClassNotFoundException("e9");
        exceptions.add(e9);

    }
}
