package Multithreading;

// Усовершенствованная версия
class MyThread extends Thread{


    // Создать новый поток
    public MyThread(String name) {
        super(name);
        start(); // запустить поток
    }

    // Начать выполнение нового потока
    @Override
    public void run() {
        System.out.println(getName() +" - запуск");
        try{
            for(int count = 0; count < 10; count++){
                Thread.sleep(400);
                System.out.println("B " + getName() + ", счетчик:" + count);
            }
        }
        catch (InterruptedException ехс) {
            System.out.println(getName() +" - прерван");
        }
        System.out.println(getName() + " завершение");
    }
}

public class ExtendThread {
    public static void main(String[] args) {
        System.out.println("Запуск основного потока");
        MyThread mt = new MyThread("Child #1");

        for(int i=0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException ехс) {
                System.out.println("Пpepывaниe основного потока");
            }
        }
        System.out.println("Зaвepшeниe основного потока");
    }
}

