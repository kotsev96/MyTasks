package com.javarush.test;

public class NoBreak {
    public static void main(String[] args) {
        int i;
        for (i=0; i<=5; i++){
            switch (i) {
                case 0:
                case 1:
                case 2:
                    System.out.println("<3");
                    break;
                case 4:
                    System.out.println("<4");
                    break;

            }
            System.out.println();

            }
        }
    }

