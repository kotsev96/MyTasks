package com.javarush.test;

public class Dog {

    int left;
    int top;
    int width;
    int height;

    public void initialize(int left) {
        this.left = left;
    }

    public void initialize(int left,int top) {
        this.left = left;
        this.top = top;
    }

    public void initialize(int left, int top, int width) {
        this.left = left;
        this.top = top;
        this.width = width;
    }

    public void initialize(int left, int top, int width, int height){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }
}
