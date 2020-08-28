package JavaRush9;

import JavaRush7.Array;

import java.util.ArrayList;
import java.util.Collections;

public class Med11 {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int []> l = new ArrayList<>();
        int[] t1 = new int[5];
        int[] t2 = new int[2];
        int[] t3 = new int[4];
        int[] t4 = new int[7];
        int[] t5 = new int[0];
        l.add(t1);
        l.add(t2);
        l.add(t3);
        l.add(t4);
        l.add(t5);

        return l;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
/*
Создать список, элементами которого будут массивы чисел.
Добавить в список пять объектов-массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.
 */
