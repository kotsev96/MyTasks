package com.java.test2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution6 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = new String[10];
        int[] numbers = new int[10];
        for(int i = 0; i<strings.length;i++) {
            strings[i] = reader.readLine();
        }
        for(int j=0;j<strings.length; j++){
            numbers[j] = strings[j].length();
        }
        for(int e =0;e<strings.length;e++){
            System.out.println(numbers[e]);
        }



    }
}
