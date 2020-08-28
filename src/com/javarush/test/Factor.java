package com.javarush.test;

public class Factor {
    boolean isFactor(int a, int b) { //This method has two parameters. Так тоже можно int myMeth (int a, double b, float c)
        if( (b % a) == 0) return true;
        else return false;
    }
}
class isFact {
    public static void main(String[] args) {
        Factor x = new Factor();

        if (x.isFactor(2,20)) System.out.println("2 - делитель");
        if (x.isFactor(3,20)) System.out.println("Эта строка не будет выведена");
    }
}
