package com.javarush.test;

public class Ladder {
    public static void main(String[] args) {
        int x;
        for (x = 0; x < 9; x++) {
            if (x == 1)
                System.out.println(1);
            else if (x == 2)
                System.out.println(2);
            else if (x == 3)
                System.out.println(3);
            else if (x == 4)
                System.out.println(4);
            else
                System.out.println("not in area");
        }
    }
}
