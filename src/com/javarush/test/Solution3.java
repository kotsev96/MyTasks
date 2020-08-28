package com.javarush.test;

import java.util.Scanner;

public class Solution3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%-10s%03d", s1, x);
        }
        System.out.println("================================");

    }
}
