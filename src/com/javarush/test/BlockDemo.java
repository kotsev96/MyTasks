package com.javarush.test;

public class BlockDemo {
    public static void main(String[] args) {
        double i, j, d;

        i = 5;
        j = 10;

        if (i != 0) {
            System.out.println("i not equal 0");
            d = j/i;
            System.out.println("j / i  equal " + d);
        }
    }
}
