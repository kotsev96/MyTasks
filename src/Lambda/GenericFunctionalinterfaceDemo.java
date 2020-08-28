package Lambda;
/* Вместо двух функциональных
интерфейсов, методы которых отличаются лишь используемыми типами данных, можно
объявить один обобщенный интерфейс, пригодный для использования в обоих случаях.
Продемонстрируем этот подход на примере приведенной ниже программы. */

// Использование обобщенного функционального интерфейса.
// Обобщенный функциональный интерфейс с двумя параметрами,
// который возвращает результат типа boolean

interface SomeTest<T> {
    boolean test(T n, T m); // Обобщенный функциональный интерфейс
}

public class GenericFunctionalinterfaceDemo {
        public static void main(String[] args) {
            // Данное лямбда-выражение определяет, является ли
            // одно целое число делителем другого
            SomeTest<Integer> isFactor = (n, d) -> (n % d) == 0;

            if(isFactor.test(10, 2))
                System.out.println("2 является делителем 10");
                System.out.println();

            // Данное лямбда-выражение определяет, является ли
            // одно число типа DouЫe делителем другого
            SomeTest<Double> isFactorD = (n, d) -> (n % d) == 0;

            if(isFactorD.test(212.0, 4.0))
                System.out.println("4.0 является делителем 212.0");
            System.out.println();

            // Данное лямбда-выражение определяет, является ли
            // одна строка частью другой
            SomeTest<String> isin = (a, b) -> a.indexOf(b) != -1;

            String str = "Обобщенный функциональный интерфейс";
            System.out.println("Tecтиpyeмaя строка: "+ str);
            if(isin.test(str, "face"))
                System.out.println("'face' найдено");
            else
                System.out.println("'face' не найдено");
        }
}

/*Обобщенный функциональный интерфейс SomeTest объявлен в программе следующим образом.
interface SomeTest<T>{
boolean test(T n, Т m);
}
Здесь T определяет тип обоих параметров метода test ( ) . Это означает, что данный
интерфейс совместим с любым лямбда-выражением, принимающим два параметра того
же типа и возвращающим результат типа boolean.
Интерфейс SomeTes t используется для предоставления ссылок на три типа
лямбда-выражений. В первом из них используется тип Integer, во втором - тип
DouЫe, в третьем - тип String.
Это позволило использовать один и тот же функциональный интерфейс дЛЯ ссылок на
лямбда-выражения isFactor, isFactorD и isin.
Различаются эти три случая лишь типом аргумента, передаваемого экземпляру SomeTest.
 */
