package Generics;

// В этой версии класса NumericFns аргументом типа,
// заменяющим параметр типа Т, должен стать класс NurnЬer
// или производный от него подкласс, как показано ниже.

public class NumericFns<T extends Number> {
    T num;

    // Передать конструктору ссылку на числовой объект
    public NumericFns(T n) {
        num = n;
    }

    // Вернуть обратную величину
    double reciprocal() {
        return 1 / num.doubleValue();
    }

    // Вернуть дробную часть
    double fraction() {
        return num.doubleValue() - num.intValue();
    }

    // Проверить равенство абсолютных значений двух объектов
    boolean absEqual(NumericFns<?> ob) {
        if (Math.abs(num.doubleValue()) ==
                Math.abs(ob.num.doubleValue())) return true;
        return false;
    }
    //...
}
    // Демонстрация класса NumericFns
    class BoundsDemo{
        public static void main(String[] args) {
            NumericFns<Integer> iOb = new NumericFns<Integer>(5);
            NumericFns<Double> dOb = new NumericFns<Double>(-6.0);
            NumericFns<Long> lOb = new NumericFns<Long>(5L);

            System.out.println("Cpaвнeниe iOb и dOb");
            if(iOb. absEqual (dOb))
                System.out.println("Aбcoлютныe значения совпадают.");
            else
                System.out.println("Aбcoлютныe значения отличаются.");

            System.out.println();

            System.out.println("Cpaвнeниe iOb и lOb.");
            if(iOb.absEqual(lOb))
                System.out.println("Aбcoлютныe значения совпадают.");
            else
                System.out.println("Aбcoлютныe значения отличаются.");
        }
    }
