package com.java.test2;

class ThrowDemo {
    public static void main(String args[]) {
        try {
            System.out.println("Дo оператора throw");
            throw new ArithmeticException();
        } catch (ArithmeticException ехс) {
            System.out.println("Иcключeниe перехвачено");
            System.out.println("Пocлe блока try/catch");
        }
    }
}