package Collection;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        // Создать древовидное множество типа TreeSet
        TreeSet<String> ts = new TreeSet<>();

        // Ввести элементы в древовидное множество типа TreeSet
        ts.add("C") ;
        ts.add("A") ;
        ts.add("B") ;
        ts.add("E");
        ts.add("F");
        ts.add("D");

        System.out.println(ts);
    }
}

/*
Как пояснялось ранее, класс TreeSet сохраняет элементы в древовидной структуре.
Они автоматически располагаются в отсортированном порядке, что и подтверждает
 выводимый программой результат. А поскольку класс TreeSet реализует интерфейс
 NavigaЬleSet, то для извлечения элементов из древовидного
множества типа TreeSet становятся доступными методы, определенные винтерфейсе NavigaЬleSet.
 */
