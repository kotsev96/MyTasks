package JavaRush7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Array2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        int min = list.get(0).length();
        int max = 0;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).length() < min)  {
                min = list.get(i).length();     // поиск минимума
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > max)  {
                max = list.get(i).length();     // поиск максимума
            }
        }


        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == min) {
                System.out.println(list.get(i));
                break;
            }
            if (list.get(i).length() == max) {
                System.out.println(list.get(i));
                break;
            }
        }
    }
}

