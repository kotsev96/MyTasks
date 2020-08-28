package com;

import java.util.Scanner;

public class Solution7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        do{
            System.out.println("Введи число: ");
            value = scanner.nextInt();
        }while (value !=5);
        System.out.println("Правильно");
    }
}
