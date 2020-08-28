package JavaRush7;

import java.util.ArrayList;

public class Array4Hard {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код
        ArrayList<String> newString = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++)
        {
           if(strings.get(i).contains("р") && strings.get(i).contains("л")){
            newString.add(strings.get(i));
        }
           if(strings.get(i).contains("р")){
               continue;
           }
            if(strings.get(i).contains("л") && !strings.get(i).contains("р")){
                newString.add(strings.get(i));
                newString.add(strings.get(i));
            }
            else{
                newString.add(strings.get(i));
            }

        }
        return newString;
    }
}
