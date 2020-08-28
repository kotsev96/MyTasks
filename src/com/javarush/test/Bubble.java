package com.javarush.test;

public class Bubble {
    public static void main(String[] args) {
        int nums[] = {99,-123,1243,43234,-21232,231,-453,34,2};
        int a,b,t;
        int size;

        size = 9;

        System.out.println("Исходный массив: ");
        for(int i=0; i < size; i++)
        System.out.println(" " + nums[i]);
        System.out.println();

        for(a = 1; a < size; a++)
            for(b=size-1; b>=a; b--) {
                if(nums[b-1] > nums[b]) {

                    t = nums [b-1];
                    nums [b-1] = nums [b];
                    nums [b] = t;
                }
            }

        System.out.print("Отсортированный массив:");
            for(int i = 0; i<size; i++)
                System.out.print(" " + nums[i]);
        System.out.println();
    }

        }
