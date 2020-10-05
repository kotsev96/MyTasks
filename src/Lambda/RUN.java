package Lambda;


import JavaRush7.Array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RUN {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("dvfdv");
        list.add("dvfdwwv");
        list.add("dvfdsvfdvdv");
        list.add("dvffdvdfvdvfdvfddv");

        list.sort((o1, o2) -> {
            if(o1.length() > o2.length()){
                return 1;
            } else if (o1.length() < o2.length()){
                return -1;
            } else{
                return 0;
            }
        });
        list.forEach(System.out::println);


    }

}
