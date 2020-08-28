package Enumeration;

enum Transprt4 {CAR, TRUCK, AIRPLANE, TRAIN, В0АТ}

public class EnumDemo4 {
    public static void main(String[] args) {
        Transport ts, ts2, tsЗ;
        // Получить порядковые значения с помощью метода ordinal()
        System.out.println("Koнcтaнты перечисления Transport и их порядковые значения: ");
        for(Transport t : Transport.values())
            System.out.println(t +" "+ t.ordinal());

        ts = Transport.AIRPLANE;
        ts2 = Transport.TRAIN;
        tsЗ = Transport.AIRPLANE;

        System.out.println();

        // Демонстрация использования метода compareTo()
        if(ts.compareTo(ts2) < 0)
            System.out.println(ts + " идет перед " + ts2);
        if(ts.compareTo(ts2) > 0)
            System.out.println(ts2 + " идет перед " + ts);
        if(ts.compareTo(tsЗ) == 0)
            System.out.println(ts +" совпадает с"+ tsЗ);
    }
}
