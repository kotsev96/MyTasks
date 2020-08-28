package Collection;

import com.javarush.test.Sound;

import java.util.ArrayList;

class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i <100; i++){
            arrayList.add(i);
        }
        for(Integer x : arrayList)
            System.out.println(x);

    }
}
