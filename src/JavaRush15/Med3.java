package JavaRush15;

import JavaRush15.Med3;

public class Med3 {
    public static void main(String[] args) {
        new Med3.LuxuriousCar().printlnDesire();
        new Med3.CheapCar().printlnDesire();
        new Med3.Ferrari().printlnDesire();
        new Med3.Lanos().printlnDesire();
    }

    public static class Ferrari extends LuxuriousCar {
        public void printlnDesire() {
            //add your code here
            System.out.println(Constants.WANT_STRING + Constants.FERRARI_NAME);
        }
    }

    public static class Lanos extends CheapCar {
        public void printlnDesire() {
            //add your code here
            System.out.println(Constants.WANT_STRING + Constants.LANOS_NAME);
        }
    }

    public static class Constants {
        public static String WANT_STRING = "Я хочу ездить на ";
        public static String LUXURIOUS_CAR = "роскошной машине";
        public static String CHEAP_CAR = "дешевой машине";
        public static String FERRARI_NAME = "Феррари";
        public static String LANOS_NAME = "Ланосе";
    }
    public static class LuxuriousCar{
        private void printlnDesire() {
            //add your code here
            System.out.println(Constants.WANT_STRING + Constants.LUXURIOUS_CAR);
        }
    }
    public static class CheapCar{
        private void printlnDesire() {
            //add your code here
            System.out.println(Constants.WANT_STRING + Constants.CHEAP_CAR);
        }
    }
}
