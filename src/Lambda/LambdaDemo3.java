package Lambda;

interface StringTest {
    boolean test(String aStr, String bStr);

    class LambdaDemoЗ {
        public static void main(String args[]) {
// Данное лямбда-выражение определяет, является ли
// одна строка частью другой
            StringTest isin = (a, b) -> a.indexOf(b) != -1;
            String str = "Это тест";
            System.out.println("Tecтиpyeмaя строка: " + str);
            if (isin.test(str, "Это"))
                System.out.println("'Этo' найдено");
            else
                System.out.println("Этo не найдено");
            if (isin.test(str, "xyz"))
                System.out.println("'xyz' найдено");
            else
                System.out.println("'xyz' не найдено");
        }
    }
}
