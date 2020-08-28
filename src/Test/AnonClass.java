package Test;

interface AbleToEat{
    public void eat();
}

public class AnonClass {
    public static void main(String[] args) {
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("BIPPSPA");
            }
        };
        ableToEat.eat();
    }
}
