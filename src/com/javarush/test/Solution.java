package com.javarush.test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Solution {
    public static void main(String[] args) {
        Man man = new Man("Smit", 16, "Weson");
        Man man1 = new Man("Kolt",16,"Piton");
        Woman woman = new Woman("Sara", 11,"Parker");
        Woman woman1 = new Woman("Nora", 12,"Grey");
        System.out.println(man.name+" "+man.age+" "+man.adress);
        System.out.println(man1.name+" "+man1.age+" "+man1.adress);
        System.out.println(woman.name+" "+woman.age+" "+woman.adress);
        System.out.println(woman1.name+" "+woman1.age+" "+woman1.adress);


        //напишите тут ваш код
    }

    public static class Man {
        String name;
        int age;
        String adress;

        public Man(String name, int age, String adress) {
            this.name = name;
            this.age = age;
            this.adress = adress;
        }
    }
    public static class Woman {
        String name;
        int age;
        String adress;

        public Woman(String name, int age, String adress) {
            this.name = name;
            this.age = age;
            this.adress = adress;
        }
    }


    //напишите тут ваш код
}
