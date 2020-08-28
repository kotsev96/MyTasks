package JavaRush11_12_13_14;

public class Med17 {
    public static void main(String[] args) {
        getDeliciousDrink().taste();
        System.out.println(getWine().getHolidayName());
        System.out.println(getBubblyWine().getHolidayName());
        System.out.println(getWine().getHolidayName());
    }

    public static Drink getDeliciousDrink() {
        Wine wine = new Wine();
        wine.getHolidayName();
        return wine;
    }

    public static Wine getWine() {
        Wine wine = new Wine();
        wine.getHolidayName();
        return wine;
    }

    public static Wine getBubblyWine() {
        BubblyWine wine2 = new BubblyWine();
        wine2.getHolidayName();
        return wine2;
    }
}
abstract class Drink{
    public void taste(){
        System.out.println("Вкусно");
    }
}

class Wine extends Drink{
    public String getHolidayName(){
        return "День рождения";
    }
}

class BubblyWine extends Wine{
    public String getHolidayName(){
        return "Новый год";
    }
}
