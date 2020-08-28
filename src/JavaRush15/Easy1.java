package JavaRush15;

public class Easy1 {
    public static void main(String[] args) {

    }

    public interface Movable {
        boolean isMovable();
    }

    public interface Sellable {
        Object getAllowedAction(String name);
    }

    public interface Discountable {
        Object getAllowedAction();
    }

    public static class Clothes implements Movable, Sellable, Discountable{
        public boolean isMovable(){
            return true;
        }

        public Object getAllowedAction(){
            return null;
        }

        public Object getAllowedAction(String name){
            return null;
        }
    }
}
