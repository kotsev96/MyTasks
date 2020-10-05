package Lambda;

import JavaRush7.Array;
import JavaRush7.ArrayList6Hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "fogmivogf", "fdvf", "dfvbfgb");
        String max = list.stream()
                .min(Comparator.comparingInt(String::length))
                .get();
        System.out.println(max);
        Stream2 stream2 = new Stream2();
        stream2.filter();

    }
}


