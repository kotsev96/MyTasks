package JavaRush11_12_13_14;

import java.awt.*;

class Easy8 {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();
    }

    public static abstract class Fox implements Animal {
        public abstract Color getColor();


        public String getName() {
            return "Fox";
        }
    }
}
