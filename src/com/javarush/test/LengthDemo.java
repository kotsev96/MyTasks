package com.javarush.test;

public class LengthDemo {
    public static void main(String[] args) {
        int list[] = new int[10];
        int nums[] = { 1, 2, 3 };
        int table[][] = { //таблица со строками переменной длины
                {1,2,3},
                {4,5},
                {6,7,8,9},
        };
        System.out.println("Paзмep списка: "+ list.length);
        System.out.println("Paзмep nums: " + nums.length);
        System.out.println("Paзмep tаblе: "+ table.length);
        System.out.println("Paзмep tаblе[О]: " + table[0].length);
        System.out.println("Paзмep tаblе[1]: " + table[1].length);
        System.out.println("Paзмep tаblе[2]: " + table[2].length);
        System.out.println();

        //использовать переменную length для инициализации списка
        for(int i = 0;i<list.length;i++)
            list[i] = i*i;

        System.out.print("Содержимое списка: ");
        for(int i = 0;i<list.length;i++)
            System.out.print(list[i] + " ");
        System.out.println();
    }
}
