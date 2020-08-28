package com.java.test2;

import com.javarush.test.TwoD;

public class TwoDShape {
    private double width;
    private double height;

    // Конструктор по умолчанию

    public TwoDShape() {
        width = height = 0.0;
    }

    // Параметризированный конструктор
    public TwoDShape(double w, double h){
        width = w;
        height = h;
    }

    // Конструирование объекта с одинаковыми значениями переменных экземляра width и height
    public TwoDShape(double x){
        width = height = x;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double h) {
        height = h;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double w) {
        width = w;
    }
    void ShowDim(){
        System.out.println("Ширина и высота - " + width + " и " + height);
    }
}
    // Подкласс для представления треугольников, производный от класса TwoDShape
    class Triangle extends TwoDShape{
    private String style;

    // Конструктор по умолчанию
        public Triangle(){
            super(); // Вызвать конструтор суперкласса по умолчанию
            style = "none";
        }

    // Конструктор
    public Triangle(String s, double w, double h){
            super(w, h); // Вызвать конструктор суперкласса с двумя параметрами
        style = s;
    }
    // Конструктор с одним аргументов
    public Triangle(double x){
            super(x); // Вызвать конструктор суперкласса с одним аргументом
        style = "закрашенный";
    }
    double area(){
            return getWidth() * getHeight() / 2;
    }
    void ShowStyle(){
        System.out.println("Треугольник" + style);
    }
    }
    class Shapes4{
        public static void main(String[] args) {
            Triangle t1 = new Triangle(" закрашенный", 4.0, 4.0);
            Triangle t2 = new Triangle(" контурный", 8.0, 12.0);

            System.out.println("Информация о t1: ");
            t1.ShowStyle();
            t1.ShowDim();
            System.out.println("Площадь - " + t1.area());

            System.out.println();

            System.out.println("Информация о t2: ");
            t2.ShowStyle();
            t2.ShowDim();
            System.out.println("Площадь - " + t2.area());

        }
    }
