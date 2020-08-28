package FileOut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Set;

class File {
    public static void main(String[] args){
        Set<String> set = new HashSet<>();

        set.add("odsnvkjd");
        set.add("odsnvkjd");
        set.add("odsnvkjd1");

        for (String s : set) {
            System.out.println(s);
        }
    }
}
