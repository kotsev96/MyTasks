package JavaRush7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Array5Easy {
    public static void main(String[] args) throws IOException {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(str.readLine()));
        }
        for (int i = list.size()-1; i >= 0; i--){
            System.out.println(list.get(i));
        }

        //напишите тут ваш код
    }
}
