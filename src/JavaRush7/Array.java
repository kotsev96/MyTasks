package JavaRush7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Array {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i<5; i++)
        {
            list.add(reader.readLine());

        }
        for (int i=0;i<13;i++){
            list.add(0, list.remove(list.size()-1));
        }
        for (int i=0;i<5;i++)
        {
            System.out.println(list.get(i));
        }
    }

}
