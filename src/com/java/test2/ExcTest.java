package com.java.test2;

public class ExcTest {
    // Генерация исключений
    static void genException(){
        int nums[] = new int[4];
        System.out.println("До генерации исключений");
        // Сгенерировать исключения в связи с выходом массива за границы
        nums[7] = 10;
        System.out.println("Эта строка не будет отображаться");
    }
}
    class ExcDemo2{
    public static void main(String[]args){
        try{
        ExcTest.genException();
        }
        catch (ArrayIndexOutOfBoundsException ехс) {
            System.out.println("Bыxoд за границы массива!");
        }
        System.out.println("Пocлe оператора catch");
        }
        }
