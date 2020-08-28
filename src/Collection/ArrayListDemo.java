package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        // Создать списочный массив
        List<String> a1 = new ArrayList<>();
        System.out.println("Начальный размер списочного массива" +
                "a1: " + a1.size());

        // Ввести элементы в списочный массив
        a1.add("C");
        a1.add("A");
        a1.add("E");
        a1.add("B");
        a1.add("D");
        a1.add("F");
        a1.add(1, "A2");
        System.out.println("Размер списочного массива a1" +
                "после ввода элементов: " + a1.size() );

        // Вывести списочный массив
        System.out.println("Содержимое списочного массива a1: "
        + a1);

        // Удалить элементы из списочного массива
        a1.remove("F");
        a1.remove(2);

        System.out.println("Размер списочного массива a1 " +
                "после удаления элементов: " +
                a1.size());
        System.out.println("Содержимое списочного массива a1: " +
                + a1.size());
    }
}
