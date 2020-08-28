package AutoBox;

public class Quadratic {
    public static void main(String[] args) {
        // а, Ь и с представляют коэффициенты
        // квадратного уравнения ах2 + Ьх + с О
        double а, b, с, x;

        // Решить квадратное уравнение 4х2 + х - 3 О
        а= 4;
        b = 1;
        с= -3;

        // Найти первый корень
        x = (-b + Math.sqrt(Math.pow(b, 2) - 4 * а * с)) / (2 * а);
        System.out.println("Первый корень: " + x);

        // Найти второй корень
        x = (-b - Math.sqrt(Math.pow(b,2) - 4 * а * с)) / (2 * а);
        System.out.println("Второй корень: " + x);
    }
}
