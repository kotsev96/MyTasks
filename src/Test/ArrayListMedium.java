package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

class ArrayListMedium {
    public static void main(String[] args) throws IOException {

        int[] list = getInts();
        Arrays.sort(list);
        int maximum=list[19];
        int minimum=list[0];


        System.out.print(maximum + " " + minimum);
    }

    public static int[] getInts() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[20];
        for(int i=0;i<20;i++)
            list[i]=Integer.parseInt(reader.readLine());
        reader.close();
        return list;
    }
}
