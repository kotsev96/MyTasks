package JavaRush10;

import JavaRush7.Array;

import java.util.ArrayList;

class Med6 {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        ArrayList<String> l [] = new ArrayList[3];
        l [0] = list;
        l [1] = list;
        l [2] = list;



        return l;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
