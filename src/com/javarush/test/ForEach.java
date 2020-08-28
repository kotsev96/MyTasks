package com.javarush.test;

public class ForEach {
    public static void main(String args[]) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
// Использовать разновидность for-each цикла for
// для суммирования и отображения значений
        for (int x : nums) {
            System.out.println("Знaчeниe: " + x);
            sum += x;
            if(x==7) break;
        }

        System.out.println("Cyммa: " + sum);
    }
}
