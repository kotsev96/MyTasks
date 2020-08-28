package com.javarush.test;

public class Cat {
    String name;
    int weight;
    int age;
    String color;
    String adress;
    public Cat(String name) {
        this.name = "Barsik";
    }
    public Cat(String name, int weight, int age) {
        this.name = null;
        this.weight = 14;
        this.age = age;
    }
    public Cat(String name,int age) {
        this.name = null;
        this.age = age;
    }
    public Cat(int weight, String color) {
        this.weight = 14;
        this.color = "yellow";
    }
    public Cat(int weight, String color, String adress) {
        this.weight = 14;
        this.color = "yellow";
        this.adress = null;
    }
    //напишите тут ваш код


    public static void main(String[] args) {

    }
}
